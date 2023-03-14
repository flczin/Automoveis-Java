package aula;

public class Carro extends Veiculo {
    private boolean portaMalas = false;

    public Carro(double potencia, double peso, String placa, double valor) {
        super(potencia, peso, placa, valor);
    }

    public boolean getPortaMalas() {
        return portaMalas;
    }

    public void setPortaMalas(boolean portaMalas) {
        this.portaMalas = portaMalas;
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

    public void abrirPortaMalas() {
        if (this.acelerando == true) {
            System.out.println("Carro placa " + this.placa + " está em movimento e não pode abrir o porta malas!");
        } else{
            this.setPortaMalas(true);
            System.out.println("Porta malas foi aberto!");
        }
    }

    public void fecharPortaMalas() {
        if (this.acelerando || !this.getPortaMalas()) {
            System.out.println("Carro placa " + this.placa + " não pode fechar o porta malas!");
        } else {
            this.setPortaMalas(false);
            System.out.println("Porta malas foi fechado!");
        }
    }

}

