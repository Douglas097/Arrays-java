import java.util.Scanner;

public class Array14 {
    public static void main(String[] args) {
        int tarefas = 5;
        double[] horasGastas = new double[tarefas];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, Oppenheimer! Por favor, insira as horas gastas em cada tarefa:");

        for (int i = 0; i < tarefas; i++) {
            System.out.print("Tarefa " + (i + 1) + ": ");
            try {
                horasGastas[i] = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Valor inválido. Insira um número válido.");
                scanner.nextLine(); 
                i--; 
            }
        }

        double totalHoras = 0;
        for (double horas : horasGastas) {
            totalHoras += horas;
        }

        // Exibindo o total de horas trabalhadas
        System.out.println("Total de horas trabalhadas: " + totalHoras + " horas.");

        scanner.close();
    }
}
