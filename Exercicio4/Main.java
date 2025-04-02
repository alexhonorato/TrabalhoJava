import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Jogadores> jogadores = new ArrayList<>();

        while (true) {
            System.out.println("\n<<<< MENU >>>>");
            System.out.println("1. Cadastrar jogador");
            System.out.println("2. Listar jogadores");
            System.out.println("3. Aumentar pontuação");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do jogador: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a pontuação do jogador: ");
                    int pontuacao = scanner.nextInt();
                    scanner.nextLine();

                    Jogadores novoJogador = new Jogadores(nome, pontuacao);
                    jogadores.add(novoJogador);

                    System.out.println("Jogador cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("\nLista de jogadores cadastrados ...");
                    if (jogadores.isEmpty()) {
                        System.out.println("Nenhum jogador cadastrado ainda...Voltando ao MENU");
                    } else {
                        for (Jogadores jogador : jogadores) {
                            jogador.exibirInformacoes();
                            System.out.println("----------------------");
                        }
                    }
                    break;
                case 3:
                    if (jogadores.isEmpty()) {
                        System.out.println("Nenhum jogador cadastrado.");
                        break;
                    }
                    System.out.print("Digite o nome do jogador: ");
                    String nomeBusca = scanner.nextLine();
                    boolean encontrado = false;

                    for (Jogadores jogador : jogadores) {
                        if (jogador.toString().contains(nomeBusca)) {
                            System.out.print("Digite quantos pontos deseja adicionar: ");
                            int pontos = scanner.nextInt();
                            scanner.nextLine(); // Consumir quebra de linha

                            jogador.aumentarPontuacao( pontos);
                            System.out.println("Pontuação atualizada!");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Jogador não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}