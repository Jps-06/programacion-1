import java.util.ArrayList;
import java.util.Scanner;

public class TorneoNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int opcion;
        int usosIngresar = 0, usosVer = 0, usosReiniciar = 0;

        do {
            System.out.println("\n=== MENÚ DEL TORNEO DE NÚMEROS ===");
            System.out.println("1. Ingresar número");
            System.out.println("2. Ver estadísticas");
            System.out.println("3. Reiniciar datos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    usosIngresar++;
                    System.out.print("Ingrese un número entero positivo: ");
                    int num = sc.nextInt();

                    // Validar número positivo
                    if (num > 0) {
                        numeros.add(num);
                        System.out.println("✅ Número agregado correctamente.");
                    } else {
                        System.out.println("❌ Error: el número debe ser positivo.");
                    }
                    break;

                case 2:
                    usosVer++;
                    if (numeros.isEmpty()) {
                        System.out.println("⚠️ No hay números ingresados aún.");
                    } else {
                        mostrarEstadisticas(numeros);
                    }
                    break;

                case 3:
                    usosReiniciar++;
                    numeros.clear();
                    System.out.println("🔄 Datos reiniciados correctamente.");
                    break;

                case 4:
                    System.out.println("👋 Saliendo del programa...");
                    break;

                default:
                    System.out.println("❌ Opción no válida. Intente nuevamente.");
                    break;
            }

        } while (opcion != 4);

        // Mostrar estadísticas extra (opcional)
        System.out.println("\n=== Resumen de uso del menú ===");
        System.out.println("Opción 1 (Ingresar): " + usosIngresar + " veces");
        System.out.println("Opción 2 (Ver estadísticas): " + usosVer + " veces");
        System.out.println("Opción 3 (Reiniciar): " + usosReiniciar + " veces");
        System.out.println("Programa finalizado. 👋");
        sc.close();
    }

    // Función que muestra las estadísticas
    public static void mostrarEstadisticas(ArrayList<Integer> numeros) {
        int total = numeros.size();
        int pares = 0, impares = 0, suma = 0, max = numeros.get(0), min = numeros.get(0), primos = 0;
        int ultimo = numeros.get(numeros.size() - 1);

        // Calcular estadísticas con un ciclo for
        for (int n : numeros) {
            suma += n;
            if (n % 2 == 0) pares++;
            else impares++;

            if (n > max) max = n;
            if (n < min) min = n;

            if (esPrimo(n)) primos++;
        }

        double promedio = (double) suma / total;
        int sumaDigitos = sumaDeDigitos(ultimo);

        System.out.println("\n📊 === ESTADÍSTICAS ===");
        System.out.println("Total de números: " + total);
        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);
        System.out.println("Número máximo: " + max);
        System.out.println("Número mínimo: " + min);
        System.out.println("Suma total: " + suma);
        System.out.printf("Promedio: %.2f\n", promedio);
        System.out.println("Cantidad de números primos: " + primos);
        System.out.println("Suma de dígitos del último número: " + sumaDigitos);
    }

    // Verificar si un número es primo
    public static boolean esPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Calcular la suma de los dígitos de un número
    public static int sumaDeDigitos(int n) {
        int suma = 0;
        while (n > 0) {
            suma += n % 10;
            n /= 10;
        }
        return suma;
    }
}
