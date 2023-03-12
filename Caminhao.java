package aula;

public class Caminhao extends Veiculo {

	public Caminhao(double potencia, double peso, String placa, double valor) {
		super(potencia, peso, placa, valor);
		
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
		if (this.ligado == true) {
			System.out.println("Veículo placa " + this.placa + " está acelerando!");
		} else if(this.ligado == false) {
			System.out.println("Veículo placa " + this.placa + " está desligado e não pode acelerar!");
			this.ligar();
		}

	}

	@Override
	public void freiar() {
		if (this.ligado == true && this.acelerando == true) {
			System.out.println("Veículo placa " + this.placa + " está freiando!");
			this.acelerando = false;
		}else if (this.ligado == false){
			System.out.println("Veículo placa " + this.placa + " está desligado e não pode freiar");
		}
	}


}
