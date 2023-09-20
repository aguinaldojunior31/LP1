import java.util.Scanner;
public class Ex83 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Tamanho do vetor
        int tamanho = 20;
        
        // Vetor para armazenar os números
        int[] numeros = new int[tamanho];
        
        // Leitura dos números
        System.out.println("Digite os 20 números:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        // Exibição dos números na ordem inversa
        System.out.println("Números na ordem inversa:");
        for (int i = tamanho - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
        
        scanner.close();
    }
}


