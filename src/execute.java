import java.util.Scanner;

public class execute {
    static Scanner e = new Scanner(System.in);

    public static void main(String[] args) {
        int opt;

        System.out.print("1- Carro\n2- Caminhão\nEscolha: ");
        opt = e.nextInt();

        if (opt == 1){
            opcCarro();
        } else if (opt == 2) {
            opcCaminhao();
        }else {
            System.out.println("Opção inválida");
        }
        
    }

    public static void opcCaminhao() {
        String acao;
        Caminhao actros = new Caminhao(530, 23000, "FAD-0019", 500000);
        System.out.print("O que você quer fazer: ");
        acao = e.next().toLowerCase();
        do {
            switch (acao) {
                case "ligar" -> actros.ligar();
                case "desligar" -> actros.desligar();
                case "acelerar" -> actros.acelerar();
                case "freiar" -> actros.freiar();
                case "engatar" -> actros.engatarCarreta();
                case "desengatar" -> actros.desengatarCarreta();
            }
            System.out.print("O que você quer fazer: ");
            acao = e.next().toLowerCase();
        }while(!acao.equals("desligar"));



    }

    public static void opcCarro() {
        String acao;
        Carro classec = new Carro(156, 1495, "EZM-3542", 365000);
        System.out.print("O que você quer fazer: ");
        acao = e.next().toLowerCase();

        do {
            switch (acao) {
                case "ligar" -> classec.ligar();
                case "desligar" -> classec.desligar();
                case "acelerar" -> classec.acelerar();
                case "freiar" -> classec.freiar();
                case "abrir" -> classec.abrirPortaMalas();
                case "fechar" -> classec.fecharPortaMalas();
            }
            System.out.print("O que você quer fazer: ");
            acao = e.next().toLowerCase();
        }while(!acao.equals("desligar"));


    }

}

