public class TablaMultiplicar {
    public static void main(String[] args) {
        // Imprimir la cabecera
        System.out.print("    "); // Espacio para alineación
        for (int j = 1; j <= 15; j++) {
            System.out.printf("%4d", j);
        }
        System.out.println();

        // Imprimir las filas de la tabla
        for (int i = 1; i <= 15; i++) {
            System.out.printf("%2d* ", i);
            for (int j = 1; j <= 15; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}