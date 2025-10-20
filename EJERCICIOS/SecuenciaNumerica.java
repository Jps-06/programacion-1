public class SecuenciaNumerica {
    public static void main(String[] args) {
        int numero = 1;
        for (int i = 1; i <= 9; i++) {
            int resultado = numero * numero;
            System.out.println(numero + " x " + numero + " = " + resultado);
            numero = numero * 10 + 1;  // Agrega otro "1" al final
        }
    }
}
