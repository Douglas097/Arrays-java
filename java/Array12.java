import java.util.Scanner;

public class Array12 {
    public static void main(String[] args) {
        int diasSemana = 7;
        double[] temperaturas = new double[diasSemana];

        Scanner scanner = new Scanner(System.in);

        // Registro das temperaturas diárias
        for (int i = 0; i < diasSemana; i++) {
            System.out.print("Digite a temperatura média do dia " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
        }
        scanner.close();

        // Cálculo da média
        double soma = 0;
        for (int i = 0; i < diasSemana; i++) {
            soma += temperaturas[i];
        }
        double media = soma / diasSemana;

        // Exibição da média da semana
        System.out.println("A temperatura média da semana é: " + media);
    }
}
