package matriz;
import java.util.Scanner;

public class Matrizes6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Definindo as dimensões da matriz quadrada (n x n)
        int n = 3;
        int[][] matriz = new int[n][n];
        int[][] matrizRotacionada = new int[n][n];

        // Leitura dos elementos da matriz
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = s.nextInt();
            }
        }

        // Rotacionando a matriz 90 graus no sentido horário
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizRotacionada[j][n - 1 - i] = matriz[i][j];
            }
        }

        // Exibindo a matriz rotacionada
        System.out.println("Matriz rotacionada 90 graus no sentido horário:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrizRotacionada[i][j] + " ");
            }
            System.out.println();
        }

        s.close(); // Fecha o scanner para evitar vazamento de recursos
    }
}
