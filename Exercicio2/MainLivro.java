// Para ajudar nessa organização, você decide criar um sistema simples em Java que permitirá
//registrar cada livro com detalhes cruciais: o título, o autor e o ano de publicação. Além de
//armazenar esses dados, você quer uma maneira fácil de exibir as informações de qualquer livro
//da sua coleção, para quando quiser relembrar um título ou sugerir uma leitura a um amigo

import java.util.ArrayList;
import java.util.Scanner;


public class MainLivro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();

        while (true) {
            System.out.println("\n---- BIBLIOTECA ----");
            System.out.println("1. Cadastrar livro");
            System.out.println("2. Exibir livros cadastrados");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Digite o nome do livro: ");
                String titulo = scanner.nextLine();
                System.out.print("Digite o autor do livro: ");
                String autor = scanner.nextLine();
                System.out.print("Digite o ano de publicação: ");

                if (scanner.hasNextInt()) {
                    int ano = scanner.nextInt();
                    scanner.nextLine();
                    livros.add(new Livro(titulo, autor, ano));
                    System.out.println("Livro cadastrado com sucesso! ");
                }
            } else if (opcao == 2) {
                if (livros.isEmpty()) {
                    System.out.println("Nenhum livro cadastrado.");
                } else {
                    System.out.println("\n-- Livros cadastrados --");
                    for (Livro livro : livros) {
                        livro.exibirInfo();
                    }
                }
                System.out.println("Digite ENTER para voltar ao menu ...");
                scanner.nextLine();
            } else if (opcao == 3) {
                System.out.println("Saindo da biblioteca...");
                break;

            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}

