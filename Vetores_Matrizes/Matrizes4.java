package matriz;
import java.util.Scanner;

public class Matrizes4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Definindo as dimensões da matriz (número de linhas e colunas)
        int linhas = 3, colunas = 3;

        // Declarando a matriz
        int[][] matriz = new int[linhas][colunas];

        // Leitura dos elementos da matriz
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = s.nextInt();
            }
        }

        // Solicita o número a ser procurado na matriz
        System.out.print("Digite o número a ser procurado na matriz: ");
        int numero = s.nextInt();

        // Variáveis para armazenar a posição do número
        int linhaPosicao = -1;
        int colunaPosicao = -1;

        // Procurando o número na matriz
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] == numero) {
                    linhaPosicao = i;
                    colunaPosicao = j;
                    break; // Sai do loop assim que encontrar o número
                }
            }
            if (linhaPosicao != -1) {
                break; // Sai do loop externo se o número foi encontrado
            }
        }

        // Exibindo a posição do número, se encontrado
        if (linhaPosicao != -1) {
            System.out.println("Número encontrado na posição: (" + linhaPosicao + ", " + colunaPosicao + ")");
        } else {
            System.out.println("Número não encontrado na matriz.");
        }

        s.close(); // Fecha o scanner para evitar vazamento de recursos
    }
}
