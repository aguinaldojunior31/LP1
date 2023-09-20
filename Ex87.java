import java.util.Scanner;
import java.util.Arrays;
public class Ex87 {
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
        
        // Leitura do novo número a ser inserido
        System.out.print("Digite um novo número: ");
        int novoNumero = scanner.nextInt();
        
        // Encontra a posição correta para inserir o novo número
        int posicaoInsercao = 0;
        while (posicaoInsercao < tamanho && novoNumero > vetor[posicaoInsercao]) {
            posicaoInsercao++;
        }
        
        // Desloca os elementos para a direita para abrir espaço para o novo número
        for (int i = tamanho - 1; i > posicaoInsercao; i--) {
            vetor[i] = vetor[i - 1];
        }
        
        // Insere o novo número na posição correta
        vetor[posicaoInsercao] = novoNumero;
        
        // Exibe o vetor com o novo número inserido na ordem crescente
        System.out.println("Vetor ordenado com o novo número inserido:");
        for (int i = 0; i < tamanho + 1; i++) {
            System.out.println("Número " + (i + 1) + ": " + vetor[i]);
        }
        
        scanner.close();
    }
}

