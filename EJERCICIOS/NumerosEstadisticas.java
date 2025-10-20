import java.util.Scanner;

public class NumerosEstadisticas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero;
        int suma = 0;
        int cantidad = 0;
        int menor = Integer.MAX_VALUE;
        int mayor = Integer.MIN_VALUE;
        int masCercano = 0;
        int diferenciaMinima = Integer.MAX_VALUE;
        
        System.out.println("Ingrese números enteros (9999 para finalizar):");
        
        while (true) {
            System.out.print("Número: ");
            numero = sc.nextInt();
            
            if (numero == 9999) {
                break;
            }
            
            // Acumular suma y contar
            suma += numero;
            cantidad++;
            
            // Verificar menor y mayor
            if (numero < menor) menor = numero;
            if (numero > mayor) mayor = numero;
            
            // Verificar número más cercano a 1000
            int diferencia = Math.abs(numero - 1000);
            if (diferencia < diferenciaMinima) {
                diferenciaMinima = diferencia;
                masCercano = numero;
            }
        }
        
        if (cantidad > 0) {
            System.out.println("\nResultados:");
            System.out.println("Sumatoria de los números: " + suma);
            System.out.println("Cantidad de números leídos: " + cantidad);
            System.out.println("Menor número leído: " + menor);
            System.out.println("Mayor número leído: " + mayor);
            System.out.println("Número más cercano a 1000: " + masCercano);
        } else {
            System.out.println("No se ingresaron números válidos.");
        }
        
        sc.close();
    }
}
