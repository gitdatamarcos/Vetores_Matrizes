package matriz;
import java.util.Scanner;

public class Matrizes5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Definindo a matriz 3x3
        int[][] matriz = new int[3][3];

        // Leitura dos elementos da matriz 3x3
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = s.nextInt();
            }
        }

        // Cálculo do determinante de uma matriz 3x3
        int determinante = matriz[0][0] * (matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1])
                - matriz[0][1] * (matriz[1][0] * matriz[2][2] - matriz[1][2] * matriz[2][0])
                + matriz[0][2] * (matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0]);

        // Exibição do determinante
        System.out.println("O determinante da matriz é: " + determinante);

        s.close(); // Fecha o scanner para evitar vazamento de recursos
    }
}
