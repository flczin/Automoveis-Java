public class Caminhao extends Veiculo {
    private boolean engate = false;
    public Caminhao(double potencia, double peso, String placa, double valor) {
        super(potencia, peso, placa, valor);

    }

    public boolean getEngate() {
        return engate;
    }

    public void setEngate(boolean engate) {
        this.engate = engate;
    }

    public void engatarCarreta(){
        if (this.acelerando) {
            System.out.println("Caminhão placa " + this.placa + " está em movimento e não pode engatar a carreta!");
        } else{
            this.setEngate(true);
            System.out.println("A carreta esta engatada!");
        }
    }

    public void desengatarCarreta(){
        if (!this.acelerando || this.engate) {
            System.out.println("Caminhão placa " + this.placa + " pode desengatar!");
            this.setEngate(false);
        } else {
            System.out.println("Não é possivel desengatar!");
        }
    }

    @Override
    public void ligar() {
        if (this.ligado == true) {
            System.out.println("Veículo placa " + this.placa + " já está ligado!");
        } else {
            System.out.println("Veículo placa " + this.placa + " foi ligado!");
            this.ligado = true;

        }

    }

    @Override
    public void desligar() {
        if (this.ligado == false) {
            System.out.println("Veículo placa " + this.placa + " já está desligado!");
        } else {
            System.out.println("Veículo placa " + this.placa + " foi desligado!");
            this.ligado = false;
        }

    }

    @Override
    public void acelerar() {
        if (this.ligado) {
            System.out.println("Veículo placa " + this.placa + " está acelerando!");
            this.acelerando = true;
        } else {
            this.ligar();
            this.acelerar();
        }

    }

    @Override
    public void freiar() {
        if (this.acelerando) {
            System.out.println("Veículo placa " + this.placa + " está freiando!");
            this.acelerando = false;
        } else if (!this.acelerando || !this.ligado) {
            System.out.println("Veículo placa " + this.placa + " está parado e não pode freiar");
        }
    }


}
