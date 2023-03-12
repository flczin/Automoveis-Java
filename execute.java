package aula;

public class execute {

	public static void main(String[] args) {
		Carro mercedes = new Carro(100, 1, "EZM-3542", 10000);
		
		mercedes.ligar();
		mercedes.acelerar();
		mercedes.abrirPortaMalas();
		mercedes.freiar();
		mercedes.abrirPortaMalas();
		mercedes.fecharPortaMalas();
	}

}
