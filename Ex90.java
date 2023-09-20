    import java.util.Scanner;
    public class Ex90 {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Tamanho do vetor
        int tamanho = 30;
        
        // Vetor para armazenar os números
        int[] vetor = new int[tamanho];
        
        // Leitura dos números para o vetor
        System.out.println("Digite os 30 números:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        // Leitura do número a ser contado
        System.out.print("Digite o número a ser contado: ");
        int numeroParaContar = scanner.nextInt();
        
        // Contagem do número no vetor
        int contador = 0;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == numeroParaContar) {
                contador++;
            }
        }
        
        // Exibe a quantidade de vezes que o número aparece no vetor
        System.out.println("O número " + numeroParaContar + " aparece " + contador + " vezes no vetor.");
        
        scanner.close();
    }
}