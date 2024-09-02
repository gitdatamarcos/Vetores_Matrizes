import java.util.Scanner;

public class Vetores2 {
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

        // Solicita o número a ser buscado
        System.out.print("Digite o número que deseja buscar: ");
        int numeroBusca = scanner.nextInt();

        // Busca o número no vetor
        int posicao = -1; // -1 indica que o número não foi encontrado
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == numeroBusca) {
                posicao = i; // Armazena a posição do número
                break; // Encerra a busca assim que o número for encontrado
            }
        }

        // Exibe o resultado da busca
        if (posicao != -1) {
            System.out.println("O número " + numeroBusca + " está na posição " + posicao + " do vetor.");
        } else {
            System.out.println("O número " + numeroBusca + " não foi encontrado no vetor.");
        }

        scanner.close(); // Fecha o scanner para evitar vazamento de recursos
    }
}
