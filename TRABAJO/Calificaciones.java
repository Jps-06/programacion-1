import java.util.Scanner;
 
public class Calificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Ingrese el número de estudiantes: ");
        int N = scanner.nextInt();
       
        int aprobados = 0;
       
        for (int i = 1; i <= N; i++) {
            System.out.print("Ingrese la calificación del estudiante " + i + " (0-10): ");
            double calificacion = scanner.nextDouble();
           
            if (calificacion >= 5) {
                System.out.println("El estudiante aprueba");
                aprobados++;
            } else {
                System.out.println("El estudiante reprueba");
            }
        }
       
        System.out.println("Número total de aprobados: " + aprobados);
       
        scanner.close();
    }
}
 