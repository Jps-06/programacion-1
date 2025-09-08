import java.util.Scanner;

public class CuatroPuntoOcho {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int num1 = input.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = input.nextInt();

        if (num1 % num2 == 0) {
            System.out.println(num2 + " es divisor de " + num1);
        } else if (num2 % num1 == 0) {
            System.out.println(num1 + " es divisor de " + num2);
        } else {
            System.out.println("Ninguno es divisor del otro");
        }
    }
    
}