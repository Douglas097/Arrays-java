import java.util.Scanner;

public class Array16 {
    public static void main(String[] args) {
        int diasNaSemana = 7;
        int[] vendasDiarias = new int[diasNaSemana];
        Scanner scanner = new Scanner(System.in);

        // Registrar as vendas diárias durante a semana
        for (int dia = 0; dia < diasNaSemana; dia++) {
            System.out.print("Digite as vendas do dia " + (dia + 1) + ": ");
            vendasDiarias[dia] = scanner.nextInt();
        }

        int totalVendas = 0;
        for (int vendas : vendasDiarias) {
            totalVendas += vendas;
        }
        double mediaVendas = (double) totalVendas / diasNaSemana;

        System.out.println("Média de vendas diárias da semana: " + mediaVendas);

        scanner.close();
    }
}
