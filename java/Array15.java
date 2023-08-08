import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Array15 {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
         Scanner scanner = new Scanner(System.in);

         System.out.println("Olá! Digite os nomes das pessoas que participara do sorteio. Para finalizar, digite 'fim'.");

         while (true) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;                                 
            }

     nomes.add(nome);
}

        Collections.shuffle(nomes);
        System.out.println("\nPessoas sorteadas:");
        for (int i = 0; i < 3 && i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        scanner.close();
    }
}