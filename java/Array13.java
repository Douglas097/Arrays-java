import java.util.Random;
import java.util.Scanner;


public class Array13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Random random = new Random();
        int Tentativa = 0;
        int Palpite;
        int numeroAleatorioInteiro = random.nextInt(100); 

        do { 
 System.out.println("Tente adivinhar o numero de 1 a 100: ");
 Palpite = scanner.nextInt();
 Tentativa ++;

 if (Palpite < numeroAleatorioInteiro){ 
    System.out.println("Digite um numero maior");
 } else if  (Palpite > numeroAleatorioInteiro) {
 System.out.println("Digite um numero menor");
 } else {
    System.out.println("Parabéns, você acertou o número em " + Tentativa + " tentativas!");
            }
        } while  (Palpite != numeroAleatorioInteiro );
        scanner.close();


        

        
       
    


}
}