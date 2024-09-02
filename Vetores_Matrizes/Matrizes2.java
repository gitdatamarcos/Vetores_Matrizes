package matriz;
import java.util.Scanner;

public class Matrizes2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Definindo as dimensões das matrizes (número de linhas e colunas)
        int linhas1 = 2, colunas1 = 2;
        int linhas2 = 2, colunas2 = 2;

        // Matrizes de entrada e a matriz resultante
        int[][] matriz1 = new int[linhas1][colunas1];
        int[][] matriz2 = new int[linhas2][colunas2];
        int[][] matrizProduto = new int[linhas1][colunas2];

        // Leitura dos elementos da primeira matriz
        System.out.println("Digite os elementos da primeira matriz:");
        for (int i = 0; i < linhas1; i++) {
            for (int j = 0; j < colunas1; j++) {
                matriz1[i][j] = s.nextInt();
            }
        }

        // Leitura dos elementos da segunda matriz
        System.out.println("Digite os elementos da segunda matriz:");
        for (int i = 0; i < linhas2; i++) {
            for (int j = 0; j < colunas2; j++) {
                matriz2[i][j] = s.nextInt();
            }
        }

        // Cálculo do produto das matrizes
        for (int i = 0; i < linhas1; i++) {
            for (int j = 0; j < colunas2; j++) {
                matrizProduto[i][j] = 0; // Inicializa o valor da posição (i,j)
                for (int k = 0; k < colunas1; k++) { // ou linhas2 (pois colunas1 == linhas2)
                    matrizProduto[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        // Exibição da matriz resultante do produto
        System.out.println("Matriz resultante do produto:");
        for (int i = 0; i < linhas1; i++) {
            for (int j = 0; j < colunas2; j++) {
                System.out.println(matrizProduto[i][j]);
            }
        }

        s.close(); // Fecha o scanner para evitar vazamento de recursos
    }
}
