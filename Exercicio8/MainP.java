import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainP {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Pizza> cardapio = new ArrayList<>();
        List<Pedido> pedidos = new ArrayList<>();

        // Adicionando pizzas ao cardápio
        cardapio.add(new Pizza("Cinco queijos", 35.0, "Molho, Catupiry, Gorgonzola, Parmesão, Provolone, Cheddar e Orégano"));
        cardapio.add(new Pizza("Strogonoff de Carne", 45.5, "Molho, Strogonoff de carne, Batata palha e Orégano"));
        cardapio.add(new Pizza("Sedução", 30.0, "Leite condensado, Chocolate branco, Coco e Morango"));

        int opcao;
        do {
            System.out.println("\n---- MENU PIZZARIA ----");
            System.out.println("1. Fazer pedido ");
            System.out.println("2. Listar Pedidos ");
            System.out.println("3. Cancelar pedido");
            System.out.println("4. Visualizar relatório de pedidos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1: {
                    System.out.println("\nEscolha uma pizza:");
                    for (int i = 0; i < cardapio.size(); i++) {
                        System.out.println((i + 1) + ". " + cardapio.get(i));
                    }
                    System.out.print("Digite o número da pizza: ");
                    int escolha = scanner.nextInt();
                    scanner.nextLine();

                    if (escolha < 1 || escolha > cardapio.size()) {
                        System.out.println("Opção inválida. Tente outra vez...");
                        break;
                    }
                    Pizza pizzaEscolhida = cardapio.get(escolha - 1);

                    System.out.print("Informe o tamanho (Pequena - P, Média - M, Grande - G): ");
                    String tamanho = scanner.nextLine();

                    System.out.print("Informe o endereço para entrega: ");
                    String endereco = scanner.nextLine();

                    Pedido novoPedido = new Pedido(pizzaEscolhida, tamanho, endereco);
                    pedidos.add(novoPedido); // Adiciona o pedido à lista

                    System.out.println("\n*-* Pedido realizado com sucesso *-*\n" + novoPedido);
                    break;
                }
                case 2: {
                    System.out.println("\n--- Pedidos Registrados ---");
                    if (pedidos.isEmpty()) {
                        System.out.println("Nenhum pedido feito ainda...");
                    } else {
                        for (Pedido p : pedidos) {
                            System.out.println(p + "\n");
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.print("\nInforme o ID do pedido para cancelamento: ");
                    int idCancelamento = scanner.nextInt();
                    scanner.nextLine();

                    boolean removido = pedidos.removeIf(p -> p.getId() == idCancelamento);

                    if (removido) {
                        System.out.println("Pedido #" + idCancelamento + " cancelado com sucesso.");
                    } else {
                        System.out.println("Pedido não encontrado.");
                    }
                    break;
                }
                case 4: {
                    System.out.println("\n--- Relatório de Pedidos ---");
                    System.out.println("Total de pedidos realizados: " + pedidos.size());

                    if (!pedidos.isEmpty()) {
                        double somaValores = pedidos.stream().mapToDouble(Pedido::getValor).sum();
                        double mediaValores = somaValores / pedidos.size();
                        System.out.printf("Média de preço dos pedidos: R$ %.2f\n", mediaValores);
                    }
                    break;
                }
                case 5: {
                    System.out.print("\nInforme o nome da nova pizza: ");
                    String nome = scanner.nextLine();

                    System.out.print("Informe o preço da nova pizza: ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Informe os ingredientes da nova pizza: ");
                    String ingredientes = scanner.nextLine();

                    Pizza novaPizza = new Pizza(nome, valor, ingredientes);
                    cardapio.add(novaPizza);

                    System.out.println("\n*---* Nova pizza adicionada com sucesso! *---*");
                    break;
                }
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}

