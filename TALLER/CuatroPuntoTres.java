import java.util.Scanner;

public class CuatroPuntoTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int a = input.nextInt();

        System.out.print("Introduce el segundo número: ");
        int b = input.nextInt();

        System.out.print("Introduce el tercer número: ");
        int c = input.nextInt();

        if (a == b && b == c) {
            System.out.println("Los tres números son iguales.");
        }
        
        else if (a == b || a == c || b == c) {
            System.out.println("Hay al menos dos números iguales.");
        } else {
            int central;

            if ((a > b && a < c) || (a < b && a > c)) {
                central = a;
            } else if ((b > a && b < c) || (b < a && b > c)) {
                central = b;
            } else {
                central = c;
            }

            System.out.println("El número central es: " + central);
        }
    }
}