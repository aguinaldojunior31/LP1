import java.util.Scanner;
public class Ex80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Tamanho do vetor
        int tamanho = 20;
        
        // Vetor para armazenar os números
        double[] vetor = new double[tamanho];
        
        // Variável para armazenar o maior elemento
        double maior = 0.0;
        
        // Variável para armazenar a posição do maior elemento
        int posicaoMaior = -1;
        
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
            
            // Verifica se é o maior elemento até agora
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicaoMaior = i;
            }
        }
        
        // Exibe o maior elemento e sua posição
        System.out.println("O maior elemento é " + maior + " e está na posição " + (posicaoMaior + 1));
        
        scanner.close();
    }
}
