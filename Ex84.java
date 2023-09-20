    import java.util.Scanner;
public class Ex84 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            // Leitura do tamanho do vetor
            System.out.print("Digite o tamanho dos vetores (N): ");
            int N = scanner.nextInt();
            
            // Declaração dos vetores A, B e Soma
            int[] A = new int[N];
            int[] B = new int[N];
            int[] Soma = new int[N];
            
            // Leitura dos elementos do vetor A
            System.out.println("Digite os elementos do vetor A:");
            for (int i = 0; i < N; i++) {
                System.out.print("A[" + i + "]: ");
                A[i] = scanner.nextInt();
            }
            
            // Leitura dos elementos do vetor B
            System.out.println("Digite os elementos do vetor B:");
            for (int i = 0; i < N; i++) {
                System.out.print("B[" + i + "]: ");
                B[i] = scanner.nextInt();
            }
            
            // Calcula a soma e armazena em Soma
            for (int i = 0; i < N; i++) {
                Soma[i] = A[i] + B[i];
            }
            
            // Exibe o vetor Soma
            System.out.println("Vetor Soma:");
            for (int i = 0; i < N; i++) {
                System.out.println("Soma[" + i + "] = " + Soma[i]);
            }
            
            scanner.close();
        }
    }
     
