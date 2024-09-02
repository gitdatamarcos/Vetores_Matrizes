package matriz;
import java.util.Scanner;

public class Matrizes7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Definindo as dimensões da matriz quadrada (n x n)
        int n = 3;
        int[][] matriz = new int[n][n];

        // Leitura dos elementos da matriz
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = s.nextInt();
            }
        }

        // Imprimindo a diagonal principal
        System.out.print("Diagonal principal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();

        // Imprimindo a diagonal secundária
        System.out.print("Diagonal secundária: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][n - 1 - i] + " ");
        }
        System.out.println();

        s.close(); // Fecha o scanner para evitar vazamento de recursos
    }
}
