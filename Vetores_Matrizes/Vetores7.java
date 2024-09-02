
import java.util.ArrayList;
import java.util.Scanner;

    public class Vetores7 {
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

            // Lista para armazenar os elementos únicos
            ArrayList<Integer> elementosUnicos = new ArrayList<>();

            // Adiciona apenas os elementos únicos à lista
            for (int i = 0; i < tamanho; i++) {
                if (!elementosUnicos.contains(vetor[i])) {
                    elementosUnicos.add(vetor[i]);
                }
            }

            // Converte a lista de elementos únicos de volta para um vetor
            int[] vetorSemDuplicados = new int[elementosUnicos.size()];
            for (int i = 0; i < elementosUnicos.size(); i++) {
                vetorSemDuplicados[i] = elementosUnicos.get(i);
            }

            // Exibe o vetor sem duplicados
            System.out.println("Vetor sem elementos duplicados:");
            for (int i = 0; i < vetorSemDuplicados.length; i++) {
                System.out.print(vetorSemDuplicados[i] + " ");
            }

            scanner.close(); // Fecha o scanner para evitar vazamento de recursos
        }
    }

