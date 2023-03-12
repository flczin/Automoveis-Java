package aula;

public abstract class Veiculo {
	protected double potencia;
	protected double peso;
	protected String placa;
	protected double valor;
	protected boolean ligado = false;
	protected boolean acelerando = false;

	public Veiculo(double potencia, double peso, String placa, double valor) {
		this.potencia = potencia;
		this.peso = peso;
		this.placa = placa;
		this.valor = valor;
	}

	public abstract void ligar();

	public abstract void desligar();

	public abstract void acelerar();

	public abstract void freiar();

}
