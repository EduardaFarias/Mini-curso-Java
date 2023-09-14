package codigosSlides;

import java.util.Scanner;

public class EntradasEspeciais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeMessage = "Digite seu primeiro nome: ";
        String sobrenomeMessage = "\nDigite seu segundo nome:";
        String idadeMessage = "\nDigite sua idade:";

        System.out.println(nomeMessage);
        String nome = sc.nextLine();

        System.out.println(sobrenomeMessage);
        String sobrenome = sc.nextLine();

        System.out.println(idadeMessage);
        int idade = sc.nextInt();

    }
}
