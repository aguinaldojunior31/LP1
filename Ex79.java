import java.util.Scanner;

public class Ex79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Tamanho da turma
        int tamanhoTurma = 20;
        
        // Vetor para armazenar as notas dos alunos
        double[] notas = new double[tamanhoTurma];
        
        // Variável para armazenar a soma das notas
        double soma = 0.0;
        
        // Leitura das notas dos alunos
        System.out.println("Digite as notas dos " + tamanhoTurma + " alunos:");
        for (int i = 0; i < tamanhoTurma; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }
        
        // Cálculo da média da turma
        double mediaTurma = soma / tamanhoTurma;
        
        // Contagem de alunos com notas acima da média
        int acimaDaMedia = 0;
        for (int i = 0; i < tamanhoTurma; i++) {
            if (notas[i] > mediaTurma) {
                acimaDaMedia++;
            }
        }
        
        // Exibição dos resultados
        System.out.println("Média da turma: " + mediaTurma);
        System.out.println("Alunos com notas acima da média: " + acimaDaMedia);
        
        scanner.close();
    }
}

