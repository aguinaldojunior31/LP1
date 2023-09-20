import java.util.Scanner;
public class Ex81 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Tamanho do vetor
        int tamanho = 20;
        
        // Vetor para armazenar os números
        double[] vetor = new double[tamanho];
        
        // Variável para armazenar o menor elemento
        double menor = Double.MAX_VALUE; // Inicializada com um valor alto para garantir que qualquer número seja menor
        
        // Variável para armazenar a posição do menor elemento
        int posicaoMenor = -1;
        
        // Leitura e validação dos números positivos
        for (int i = 0; i < tamanho; i++) {
            boolean valido = false;
            while (!valido) {
                System.out.print("Digite o número na posição " + (i + 1) + ": ");
                double numero = scanner.nextDouble();
                if (numero >= 0) {
                    vetor[i] = numero;
                    valido = true;
                } else {
                    System.out.println("Por favor, digite um número positivo.");
                }
            }
            
            // Verifica se é o menor elemento até agora
            if (vetor[i] < menor) {
                menor = vetor[i];
                posicaoMenor = i;
            }
        }
        
        // Exibe o menor elemento e sua posição
        System.out.println("O menor elemento é " + menor + " e está na posição " + (posicaoMenor + 1));
        
        scanner.close();
    }
}
