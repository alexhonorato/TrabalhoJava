import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcao;

        do {
            System.out.println("\n---- MENU ---- ");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Buscar contato (nome)");
            System.out.println("3. Listar contatos");
            System.out.println("4. Remover contato");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); //quebra linha
            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    agenda.adicionarContato(nome, telefone);
                    break;

                case 2:
                    System.out.print("Nome do contato: ");
                    String buscaNome = scanner.nextLine();
                    Contato contato = agenda.buscarContato(buscaNome);
                    if (contato != null) {
                        System.out.println("Contato encontrado: " + contato);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 3:
                    agenda.listarContatos();
                    break;

                case 4:
                    System.out.print("Nome do contato a remover: ");
                    String nomeRemover = scanner.nextLine();
                    agenda.removerContato(nomeRemover);
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}