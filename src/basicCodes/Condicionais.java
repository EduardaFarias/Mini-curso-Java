public class Condicionais {
    public static void main(String[] args) {
    int numero = 5;
    String message = "";
    if (numero > 0) {
        message = "O número é positivo";
    } else if (numero < 0) {
        message = "O número é negativo.";
    } else {
        message = "O número é zero.";
    }

    System.out.println(message);
}    

}
