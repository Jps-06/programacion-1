import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int CLAVE = 1234;
        int SALDOINICIAL = 800000;
        int claveUsuario, retiro, nuevoSaldo;

        System.out.print("Ingrese su clave: ");
        claveUsuario = sc.nextInt();

        if (claveUsuario == CLAVE) {
            System.out.println("Bienvenido al cajero de la Uniajc");
            System.out.print("Digite la cantidad a retirar: ");
            retiro = sc.nextInt();

            if (retiro > 200000) {
                retiro = retiro + 2000; // se cobra un costo adicional
                if (retiro <= SALDOINICIAL) {
                    nuevoSaldo = SALDOINICIAL - retiro;
                    System.out.println("Su saldo actual es: " + nuevoSaldo + " Muchas Gracias!!!!");
                } else {
                    System.out.println("El valor solicitado más el costo de la transacción es mayor al saldo.");
                }
            } else {
                if (retiro <= SALDOINICIAL) {
                    nuevoSaldo = SALDOINICIAL - retiro;
                    System.out.println("Su saldo actual es: " + nuevoSaldo + " Muchas Gracias!!!!");
                } else {
                    System.out.println("El valor solicitado es mayor al saldo actual....");
                }
            }
        } else {
            System.out.println("Su clave no es correcta... intente nuevamente....");
        }

        sc.close();
    }
}