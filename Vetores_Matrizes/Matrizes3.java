package matriz;
import java.util.Scanner;

public class Matrizes3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Definindo as dimensões da matriz (número de linhas e colunas)
        int linhas = 3, colunas = 3;

        // Declarando a matriz original e a matriz transposta
        int[][] matriz = new int[linhas][colunas];
        int[][] matrizTransposta = new int[colunas][linhas];

        // Leitura dos elementos da matriz original
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = s.nextInt();
            }
        }

        // Calculando a transposta da matriz
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizTransposta[j][i] = matriz[i][j];
            }
        }

        // Exibindo a matriz transposta
        System.out.println("Matriz transposta:");
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                System.out.print(matrizTransposta[i][j] + " ");
            }
            System.out.println();
        }

        s.close(); // Fecha o scanner para evitar vazamento de recursos
    }
}
