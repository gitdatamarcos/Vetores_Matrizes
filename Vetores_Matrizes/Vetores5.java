import java.util.Scanner;
public class Vetores5 {
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

        // Conta quantos números são primos
        int contadorPrimos = 0;
        for (int i = 0; i < tamanho; i++) {
            if (ehPrimo(vetor[i])) {
                contadorPrimos++;
            }
        }

        // Exibe a quantidade de números primos
        System.out.println("Quantidade de números primos no vetor: " + contadorPrimos);

        scanner.close(); // Fecha o scanner para evitar vazamento de recursos
    }

    // Função para verificar se um número é primo
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}