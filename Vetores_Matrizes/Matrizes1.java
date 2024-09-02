package matriz;
import java.util.Scanner;

public class Matrizes1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] matrizSoma = new int[2][2];

        // Leitura dos elementos da primeira matriz
        System.out.println("Digite os elementos da primeira matriz:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz1[i][j] = s.nextInt();
            }
        }

        // Leitura dos elementos da segunda matriz
        System.out.println("Digite os elementos da segunda matriz:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz2[i][j] = s.nextInt();
            }
        }

        // Soma das matrizes
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Exibição da matriz resultante
        System.out.println("Matriz resultante da soma:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(matrizSoma[i][j]);
            }
        }

        s.close(); // Fecha o scanner para evitar vazamento de recursos
    }
}
