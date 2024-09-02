import java.util.Scanner;

public class Vetores4 {

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

        // Calcula a média dos elementos
        double soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += vetor[i];
        }
        double media = soma / tamanho;

        // Calcula o desvio padrão
        double somaQuadrados = 0;
        for (int i = 0; i < tamanho; i++) {
            somaQuadrados += Math.pow(vetor[i] - media, 2);
        }
        double desvioPadrao = Math.sqrt(somaQuadrados / tamanho);

        // Exibe a média e o desvio padrão
        System.out.println("A média dos elementos é: " + media);
        System.out.println("O desvio padrão dos elementos é: " + desvioPadrao);

        scanner.close(); // Fecha o scanner para evitar vazamento de recursos
    }
}
