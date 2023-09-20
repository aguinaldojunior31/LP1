    import java.util.Scanner;
    import java.util.Arrays;
public class Ex86 {

            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            // Tamanho do vetor
            int tamanho = 10;
            
            // Vetor para armazenar os números
            int[] vetor = new int[tamanho];
            
            // Leitura dos números para o vetor
            System.out.println("Digite os 10 números:");
            for (int i = 0; i < tamanho; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                vetor[i] = scanner.nextInt();
            }
            
            // Ordena o vetor em ordem crescente
            Arrays.sort(vetor);
            
            // Exibe o vetor ordenado
            System.out.println("Vetor ordenado em ordem crescente:");
            for (int i = 0; i < tamanho; i++) {
                System.out.println("Número " + (i + 1) + ": " + vetor[i]);
            }
            
            scanner.close();
        }
    }
    
