import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor insira o primeiro numero: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int total = num1 + num2;

        System.out.println(total);
        System.out.println("-------------");
        System.out.println(num1 + num2);


    }
    
}
