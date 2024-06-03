package telefone;

import java.util.Scanner;

public class AparelhoTelefonico {
    Scanner scanner = new Scanner(System.in);

    public void ligar(String numero){
        System.out.println("Ligando para o número: " + numero);
    }
    public void atender() {
        System.out.println("Atendendo chamada.");
    }
}

