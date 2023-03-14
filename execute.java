package aula;

public class execute {

    public static void main(String[] args) {
        Carro mercedes = new Carro(100, 1, "EZM-3542", 10000);
        Caminhao actros = new Caminhao(530,23000,"ENZ-6969",500000);

       actros.acelerar();
       actros.freiar();
       actros.engatarCarreta();
       actros.desengatarCarreta();


    }

}
