import java.util.Scanner;


public class CuatroPuntoCuatro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número");
        double number = input.nextDouble();

        if (number < 0) {
            System.out.println("No se puede calcular la raíz cuadrada de un número negativo en los números reales.");
        } else {
            double raiz = Math.sqrt(number);
            System.out.println("La raíz cuadrada de " + number + " es: " + raiz);
        }
    }
}