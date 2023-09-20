 import java.util.Scanner;
public class Ex85 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tamanho do vetor para as temperaturas (considerando 365 dias em um ano)
        int diasNoAno = 365;
        double[] temperaturas = new double[diasNoAno];

        // Leitura das temperaturas de cada dia do ano
        for (int i = 0; i < diasNoAno; i++) {
            System.out.print("Digite a temperatura média do dia " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
        }

        // Inicialização das variáveis para cálculo
        double menorTemperatura = temperaturas[0];
        double maiorTemperatura = temperaturas[0];
        double somaTemperaturas = temperaturas[0];

        // Encontrar a menor, a maior temperatura e calcular a soma das temperaturas
        for (int i = 1; i < diasNoAno; i++) {
            if (temperaturas[i] < menorTemperatura) {
                menorTemperatura = temperaturas[i];
            }
            if (temperaturas[i] > maiorTemperatura) {
                maiorTemperatura = temperaturas[i];
            }
            somaTemperaturas += temperaturas[i];
        }

        // Calcular a temperatura média anual
        double temperaturaMediaAnual = somaTemperaturas / diasNoAno;

        // Contar quantos dias a temperatura foi inferior à média anual
        int diasInferioresMediaAnual = 0;
        for (int i = 0; i < diasNoAno; i++) {
            if (temperaturas[i] < temperaturaMediaAnual) {
                diasInferioresMediaAnual++;
            }
        }

        // Exibir os resultados
        System.out.println("Menor temperatura do ano: " + menorTemperatura);
        System.out.println("Maior temperatura do ano: " + maiorTemperatura);
        System.out.println("Temperatura média anual: " + temperaturaMediaAnual);
        System.out.println("Número de dias com temperatura inferior à média anual: " + diasInferioresMediaAnual);

        scanner.close();
    }
}