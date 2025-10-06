import java.util.Scanner;
public class LeerNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Ingrese el número de notas : ");
    int main() {
    int n;
    printf("¿Cuántas notas quieres introducir? ");
    scanf("%d", &n);

    float notas[n];
    for (int i = 0; i < n; i++) {
        printf("Introduce la nota %d: ", i + 1);
        scanf("%f", &notas[i]);
    }

    printf("Notas notables (>=7 y <9):\n");
    for (int i = 0; i < n; i++) {
        if (notas[i] >= 7 && notas[i] < 9) {
            printf("%.2f\n", notas[i]);
        }
    }

    return 0;
}