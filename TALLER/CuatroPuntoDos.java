import java.util.Scanner;

public class CuatroPuntoDos {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = input.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("El primer número es mayor que el segundo.");
        } else if (num1 < num2) {
            System.out.println("El primer número es el más pequeño.");
        } else {
            System.out.println("Los números son iguales.");
        }
        
    }
}