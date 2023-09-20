import java.util.Scanner;
public class Ex89 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Tamanho dos vetores
        int tamanho = 15;
        
        // Vetores para armazenar os números
        int[] V1 = new int[tamanho];
        int[] V2 = new int[tamanho];
        
        // Leitura dos números para o vetor V1
        System.out.println("Digite os números para o vetor V1:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("V1[" + i + "]: ");
            V1[i] = scanner.nextInt();
        }
        
        // Leitura dos números para o vetor V2
        System.out.println("Digite os números para o vetor V2:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("V2[" + i + "]: ");
            V2[i] = scanner.nextInt();
        }
        
        // Contagem de números iguais nas mesmas posições
        int contador = 0;
        for (int i = 0; i < tamanho; i++) {
            if (V1[i] == V2[i]) {
                contador++;
            }
        }
        
        // Exibe a quantidade de números iguais nas mesmas posições
        System.out.println("Quantidade de números iguais nas mesmas posições: " + contador);
        
        scanner.close();
    }
}