import java.util.Scanner;
public class Ex91 {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Tamanho do vetor
            int tamanho = 50;
    
            // Vetor para armazenar os números
            int[] VET = new int[tamanho];
    
            // Leitura dos números para o vetor
            System.out.println("Digite os 50 números:");
            for (int i = 0; i < tamanho; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                VET[i] = scanner.nextInt();
            }
    
            // Variável para armazenar se números repetidos foram encontrados
            boolean repetidosEncontrados = false;
    
            // Verificação de números repetidos e suas posições
            for (int i = 0; i < tamanho; i++) {
                for (int j = i + 1; j < tamanho; j++) {
                    if (VET[i] == VET[j]) {
                        repetidosEncontrados = true;
                        System.out.println("Número repetido encontrado: " + VET[i]);
                        System.out.println("Posições: " + i + " e " + j);
                    }
                }
            }
    
            if (!repetidosEncontrados) {
                System.out.println("Não foram encontrados números repetidos no vetor.");
            }
    
            scanner.close();
        }
    }
