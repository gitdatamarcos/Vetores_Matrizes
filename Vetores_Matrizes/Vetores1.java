import java.util.Scanner;

public class Vetores1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        // Declara o vetor
        int[] vetor = new int[tamanho];

        // Lê os elementos do vetor
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        // Calcula a soma dos elementos do vetor
        int soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += vetor[i];
        }

        // Exibe a soma
        System.out.println("A soma dos elementos do vetor é: " + soma);
    }
}
