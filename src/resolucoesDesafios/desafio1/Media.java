package resolucoesDesafios.desafio1;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        String situacao;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if(media >= 7){
            situacao = "foi aprovado :)";
        }
        else if(media < 7  && media >= 4){
            situacao = "está na final :|";
            System.out.println("Digite a nota da final");
            double novaNota = sc.nextDouble();
            if (novaNota < 7){
                situacao = "foi reprovado :(";
            }
            else {
                situacao = "foi aprovado :)";
            }
        }
        else {
            situacao = "foi reprovado :(";
        }
        System.out.printf("Sua média é " + "%.2f" + " e você " + situacao,media );
    }
}
