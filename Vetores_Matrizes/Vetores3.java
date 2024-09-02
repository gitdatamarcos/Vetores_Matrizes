import java.util.Scanner;

public class Vetores3 {
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

        // Inverte a ordem dos elementos do vetor
        for (int i = 0; i < tamanho / 2; i++) {
            int temp = vetor[i]; // Armazena temporariamente o valor do elemento
            vetor[i] = vetor[tamanho - 1 - i]; // Troca os elementos
            vetor[tamanho - 1 - i] = temp; // Coloca o valor temporário na posição correta
        }

        // Exibe o vetor invertido
        System.out.println("Vetor invertido:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close(); // Fecha o scanner para evitar vazamento de recursos
    }
}
