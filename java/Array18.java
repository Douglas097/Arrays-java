import java.util.Scanner;

public class Array18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MAX_DAYS = 10;
        double[] precos = new double[MAX_DAYS];
        
        for (int i = 0; i < MAX_DAYS; i++) {
            System.out.print("Digite o preço da ação no dia " + (i + 1) + ": ");
            precos[i] = scanner.nextDouble();
        }
        
        double maiorVariacao = 0.0;
        
        for (int i = 0; i < MAX_DAYS - 1; i++) {
            double variacao = Math.abs(precos[i + 1] - precos[i]);
            if (variacao > maiorVariacao) {
                maiorVariacao = variacao;
            }
        }
                         
        System.out.println("A maior variação de preço entre dois dias consecutivos é: " + maiorVariacao);
        
        scanner.close();
    }
}
