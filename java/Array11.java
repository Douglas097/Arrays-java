import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Array11 {
    public static void main(String[] args) {
        int tamanhoDaLista = 5; // Defina o tamanho inicial desejado
        List<String> lista =  new ArrayList<>(tamanhoDaLista);

        Scanner scanner = new Scanner(System.in);
for (int i = 0; i < tamanhoDaLista; i++){
        System.out.print("Adicione um item a lista de compra da Barbie: ");
        String palavra = scanner.next();
        lista.add(palavra); // Adiciona a palavra à lista
        System.out.println("Você adcionou: " + palavra);
}
        scanner.close();
        System.out.println("Itens na lista de compras:");
        for (String item : lista) {
            System.out.println(item);
    }
}


        

     