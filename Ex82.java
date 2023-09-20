import java.util.Scanner;

public class Ex82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Tamanho do vetor A
        int tamanho = 10;
        
        // Vetor A para armazenar os números
        double[] vetorA = new double[tamanho];
        
        // Vetor M para armazenar o resultado da multiplicação
        double[] vetorM = new double[tamanho];
        
        // Leitura dos números para o vetor A
        System.out.println("Digite os " + tamanho + " números para o vetor A:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetorA[i] = scanner.nextDouble();
        }
        
        // Leitura do número X
        System.out.print("Digite o valor de X: ");
        double X = scanner.nextDouble();
        
        // Calcula a multiplicação e armazena em vetor M
        for (int i = 0; i < tamanho; i++) {
            vetorM[i] = vetorA[i] * X;
        }
        
        // Exibe o vetor M
        System.out.println("O vetor M, resultado da multiplicação de A por X, é:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("M[" + i + "] = " + vetorM[i]);
        }
        
        scanner.close();
    }
}
