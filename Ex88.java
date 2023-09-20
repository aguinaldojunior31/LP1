import java.util.Scanner;
public class Ex88 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Tamanho do vetor
        int tamanho = 20;
        
        // Vetor para armazenar os números
        int[] vetor = new int[tamanho];
        
        // Leitura dos números para o vetor
        System.out.println("Digite os 20 números (sem repetições):");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        // Leitura do número a ser verificado e removido
        System.out.print("Digite um número para verificar e possivelmente remover: ");
        int numeroParaVerificar = scanner.nextInt();
        
        // Verifica se o número existe no vetor
        boolean encontrado = false;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == numeroParaVerificar) {
                encontrado = true;
                break;
            }
        }
        
        // Se o número existe no vetor, cria um novo vetor sem ele
        if (encontrado) {
            int[] novoVetor = new int[tamanho - 1];
            int indiceNovoVetor = 0;
            for (int i = 0; i < tamanho; i++) {
                if (vetor[i] != numeroParaVerificar) {
                    novoVetor[indiceNovoVetor] = vetor[i];
                    indiceNovoVetor++;
                }
            }
            
            // Atualiza o vetor original com o novo vetor
            vetor = novoVetor;
            tamanho = tamanho - 1;
        }
        
        // Exibe o vetor após a remoção (se ocorreu)
        System.out.println("Vetor após a possível remoção:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Número " + (i + 1) + ": " + vetor[i]);
        }
        
        scanner.close();
    }
}

