//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instanciando livros de Aventura
        Livro aventura1 = new Livro("Aventuras no Deserto", 39.90);
        Livro aventura2 = new Livro("O Tesouro Perdido", 45.00);
        Livro aventura3 = new Livro("Viagem ao Centro da Terra", 50.00);
        Livro aventura4 = new Livro("O Mistério da Ilha", 42.50);
        Livro aventura5 = new Livro("Exploradores do Tempo", 47.30);

        // Instanciando livros de Romance
        Livro romance1 = new Livro("Amor em Paris", 35.00);
        Livro romance2 = new Livro("Corações em Chamas", 38.90);
        Livro romance3 = new Livro("O Destino nos Uniu", 41.50);
        Livro romance4 = new Livro("Cartas para Julieta", 36.75);
        Livro romance5 = new Livro("Entre Dois Mundos", 40.00);

        // Instanciando livros de Mistério
        Livro misterio1 = new Livro("O Código Perdido", 55.00);
        Livro misterio2 = new Livro("Mistério na Biblioteca", 48.90);
        Livro misterio3 = new Livro("O Assassino Invisível", 52.30);
        Livro misterio4 = new Livro("Segredos do Passado", 46.00);
        Livro misterio5 = new Livro("A Última Pista", 49.99);

        // Instanciando livros de Ciência
        Livro ciencia1 = new Livro("Universo em Expansão", 60.00);
        Livro ciencia2 = new Livro("Buracos Negros e Estrelas", 58.50);
        Livro ciencia3 = new Livro("A Teoria de Tudo", 62.00);
        Livro ciencia4 = new Livro("Viagem Espacial", 59.90);
        Livro ciencia5 = new Livro("O Futuro da Ciência", 61.75);

        String carrinho = "";
        double total = 0;
        int opcaoGenero;

        do {
            System.out.println("\nEscolha um gênero:");
            System.out.println("1 - Aventura");
            System.out.println("2 - Romance");
            System.out.println("3 - Mistério");
            System.out.println("4 - Ciência");
            System.out.println("0 - Finalizar compra");

            opcaoGenero = scanner.nextInt();

            switch (opcaoGenero) {
                case 1:
                    System.out.println("\nLivros de Aventura:");
                    System.out.println("1 - " + aventura1.nome + " (R$ " + aventura1.preco + ")");
                    System.out.println("2 - " + aventura2.nome + " (R$ " + aventura2.preco + ")");
                    System.out.println("3 - " + aventura3.nome + " (R$ " + aventura3.preco + ")");
                    System.out.println("4 - " + aventura4.nome + " (R$ " + aventura4.preco + ")");
                    System.out.println("5 - " + aventura5.nome + " (R$ " + aventura5.preco + ")");
                    int escolhaAventura = scanner.nextInt();
                    switch (escolhaAventura) {
                        case 1: carrinho += aventura1.nome + "\n"; total += aventura1.preco; break;
                        case 2: carrinho += aventura2.nome + "\n"; total += aventura2.preco; break;
                        case 3: carrinho += aventura3.nome + "\n"; total += aventura3.preco; break;
                        case 4: carrinho += aventura4.nome + "\n"; total += aventura4.preco; break;
                        case 5: carrinho += aventura5.nome + "\n"; total += aventura5.preco; break;
                        default: System.out.println("Opção inválida!"); break;
                    }
                    break;

                case 2:
                    System.out.println("\nLivros de Romance:");
                    System.out.println("1 - " + romance1.nome + " (R$ " + romance1.preco + ")");
                    System.out.println("2 - " + romance2.nome + " (R$ " + romance2.preco + ")");
                    System.out.println("3 - " + romance3.nome + " (R$ " + romance3.preco + ")");
                    System.out.println("4 - " + romance4.nome + " (R$ " + romance4.preco + ")");
                    System.out.println("5 - " + romance5.nome + " (R$ " + romance5.preco + ")");
                    int escolhaRomance = scanner.nextInt();
                    switch (escolhaRomance) {
                        case 1: carrinho += romance1.nome + "\n"; total += romance1.preco; break;
                        case 2: carrinho += romance2.nome + "\n"; total += romance2.preco; break;
                        case 3: carrinho += romance3.nome + "\n"; total += romance3.preco; break;
                        case 4: carrinho += romance4.nome + "\n"; total += romance4.preco; break;
                        case 5: carrinho += romance5.nome + "\n"; total += romance5.preco; break;
                        default: System.out.println("Opção inválida!"); break;
                    }
                    break;

                case 3:
                    System.out.println("\nLivros de Mistério:");
                    System.out.println("1 - " + misterio1.nome + " (R$ " + misterio1.preco + ")");
                    System.out.println("2 - " + misterio2.nome + " (R$ " + misterio2.preco + ")");
                    System.out.println("3 - " + misterio3.nome + " (R$ " + misterio3.preco + ")");
                    System.out.println("4 - " + misterio4.nome + " (R$ " + misterio4.preco + ")");
                    System.out.println("5 - " + misterio5.nome + " (R$ " + misterio5.preco + ")");
                    int escolhaMisterio = scanner.nextInt();
                    switch (escolhaMisterio) {
                        case 1: carrinho += misterio1.nome + "\n"; total += misterio1.preco; break;
                        case 2: carrinho += misterio2.nome + "\n"; total += misterio2.preco; break;
                        case 3: carrinho += misterio3.nome + "\n"; total += misterio3.preco; break;
                        case 4: carrinho += misterio4.nome + "\n"; total += misterio4.preco; break;
                        case 5: carrinho += misterio5.nome + "\n"; total += misterio5.preco; break;
                        default: System.out.println("Opção inválida!"); break;
                    }
                    break;

                case 4:
                    System.out.println("\nLivros de Ciência:");
                    System.out.println("1 - " + ciencia1.nome + " (R$ " + ciencia1.preco + ")");
                    System.out.println("2 - " + ciencia2.nome + " (R$ " + ciencia2.preco + ")");
                    System.out.println("3 - " + ciencia3.nome + " (R$ " + ciencia3.preco + ")");
                    System.out.println("4 - " + ciencia4.nome + " (R$ " + ciencia4.preco + ")");
                    System.out.println("5 - " + ciencia5.nome + " (R$ " + ciencia5.preco + ")");
                    int escolhaCiencia = scanner.nextInt();
                    switch (escolhaCiencia) {
                        case 1: carrinho += ciencia1.nome + "\n"; total += ciencia1.preco; break;
                        case 2: carrinho += ciencia2.nome + "\n"; total += ciencia2.preco; break;
                        case 3: carrinho += ciencia3.nome + "\n"; total += ciencia3.preco; break;
                        case 4: carrinho += ciencia4.nome + "\n"; total += ciencia4.preco; break;
                        case 5: carrinho += ciencia5.nome + "\n"; total += ciencia5.preco; break;
                        default: System.out.println("Opção inválida!"); break;
                    }
                    break;

                case 0:
                    System.out.println("Finalizando compra...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcaoGenero != 0);

        System.out.println("\nLivros comprados:");
        System.out.println(carrinho);
        System.out.printf("Total da compra: R$ %.2f%n", total);
    }
}
