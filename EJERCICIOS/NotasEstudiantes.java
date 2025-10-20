import java.util.Scanner;

public class NotasEstudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidadEstudiantes;
        double nota1, nota2, nota3, notaFinal;

        System.out.print("Ingrese la cantidad de estudiantes: ");
        cantidadEstudiantes = sc.nextInt();

        for (int i = 1; i <= cantidadEstudiantes; i++) {
            System.out.println("\nEstudiante " + i + ":");

            System.out.print("Ingrese la primera nota: ");
            nota1 = sc.nextDouble();

            System.out.print("Ingrese la segunda nota: ");
            nota2 = sc.nextDouble();

            System.out.print("Ingrese la tercera nota: ");
            nota3 = sc.nextDouble();

            if (nota1 < 0 || nota2 < 0 || nota3 < 0) {
                System.out.println("No se puede realizar la operación (hay notas negativas).");
            } else {
                notaFinal = (nota1 * 0.3) + (nota2 * 0.3) + (nota3 * 0.4);
                System.out.println("La nota final del estudiante " + i + " es: " + notaFinal);
            }
        }

        sc.close();
    }
}
