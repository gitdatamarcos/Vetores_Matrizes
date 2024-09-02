package matriz;
import java.util.Scanner;

public class Matrizes8 {
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

        // Calculando a soma dos elementos acima da diagonal principal
        int soma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                soma += matriz[i][j];
            }
        }

        // Exibindo o resultado
        System.out.println("A soma dos elementos acima da diagonal principal é: " + soma);

        s.close(); // Fecha o scanner para evitar vazamento de recursos
    }
}
