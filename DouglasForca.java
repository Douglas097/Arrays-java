import java.util.Scanner;
import java.util.Random;

public class DouglasForca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
      //variaveis e Array para definir a palavra aleatoriamente
        String[] palavras = {"JAVA", "PYTHON", "CPLUSPLUS", "HTML", "CSS"};
      //quantida de vidas  
        int vidas = 6;
      //variavel de pontuacao
        int pontuacao = 0;

        exibirMenu();

        while (true) {
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
            switch (opcao) {
                case 1:
                    String palavraEscolhida = palavras[random.nextInt(palavras.length)];
                    String palavraSecreta = "_".repeat(palavraEscolhida.length());
                    vidas = 6;

                    System.out.println("\nNovo Jogo Iniciado!");
                    System.out.println("Palavra: " + palavraSecreta);

                    while (vidas > 0 && palavraSecreta.contains("_")) {
                        System.out.print("Digite uma letra: ");
                        String entrada = scanner.nextLine().toUpperCase();

                        if (entrada.length() != 1 || !Character.isLetter(entrada.charAt(0))) {
                            System.out.println("Entrada inválida. Digite apenas uma letra.");
                            continue;
                        }

                        char letra = entrada.charAt(0);

                        if (palavraEscolhida.contains(String.valueOf(letra))) {
                            StringBuilder novaPalavraSecreta = new StringBuilder(palavraSecreta);

                            for (int i = 0; i < palavraEscolhida.length(); i++) {
                                if (palavraEscolhida.charAt(i) == letra) {
                                    novaPalavraSecreta.setCharAt(i, letra);
                                }
                            }

                            palavraSecreta = novaPalavraSecreta.toString();
                            System.out.println("Palavra: " + palavraSecreta);
                        } else {
                            vidas--;
                            System.out.println("Letra não encontrada. Vidas restantes: " + vidas);
                        }
                    }

                    if (!palavraSecreta.contains("_")) {
                        pontuacao += vidas + 1;
                        System.out.println("Parabéns! Você acertou a palavra. Pontuação atual: " + pontuacao);
                    } else {
                        System.out.println("Suas vidas acabaram. A palavra era: " + palavraEscolhida);
                    }

                    exibirMenu();
                    break;

                case 2:
                    System.out.println("\nPontuação atual: " + pontuacao);
                    exibirMenu();
                    break;

                case 3:
                    System.out.println("\nObrigado por jogar!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Escolha novamente.");
                    exibirMenu();
            }
        }
    }
//menu principal
    public static void exibirMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Iniciar novo jogo");
        System.out.println("2. Verificar pontuação");
        System.out.println("3. Sair do jogo");
        System.out.print("Escolha uma opção: ");
    }
}
