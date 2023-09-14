package resolucoesDesafios.desafio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdLidos = 0;
        int qtdPares = 0;
        int qtdImpares = 0;

        while (true){
            System.out.println("Informe um número: ");
            int numero = sc.nextInt();
            if (numero == 0){
                break;
            }
            qtdLidos++;
            if (numero % 2 == 0){
                qtdPares++;
            }else {
                qtdImpares++;
            }

        }

        System.out.println("A quantiddade de números lidos foi: " + qtdLidos);
        System.out.println("A quantiddade de números pares foi: " + qtdPares);
        System.out.println("A quantiddade de números ímpares foi: " + qtdImpares);


    }
}
