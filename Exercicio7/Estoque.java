import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
    int codigo;
    String nome;
    int quantidade;
    double preco;

    static ArrayList<Estoque> produtos = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public Estoque(int codigo, String nome, int quantidade, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void exibirProduto() {
        System.out.println("Código: " + codigo + " | Nome: " + nome +
                " | Quantidade: " + quantidade + " | Preço: R$ " + preco);
    }

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n=== GERENCIAMENTO DE ESTOQUE ===");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Atualizar Produto");
            System.out.println("3. Listar Produtos");
            System.out.println("4. Remover Produto");
            System.out.println("5. Relatório de Estoque");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    atualizarProduto();
                    break;
                case 3:
                    listarProdutos();
                    break;
                case 4:
                    removerProduto();
                    break;
                case 5:
                    relatorioEstoque();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }

    static void adicionarProduto() {
        System.out.print("Código: ");
        int codigo = input.nextInt();
        input.nextLine();

        System.out.print("Nome: ");
        String nome = input.nextLine();

        System.out.print("Quantidade: ");
        int quantidade = input.nextInt();

        System.out.print("Preço: ");
        double preco = input.nextDouble();

        produtos.add(new Estoque(codigo, nome, quantidade, preco));
        System.out.println("Produto adicionado com sucesso!");
    }

    static void atualizarProduto() {
        System.out.print("Digite o código do produto para atualizar: ");
        int codigo = input.nextInt();

        for (Estoque p : produtos) {
            if (p.codigo == codigo) {
                System.out.print("Novo nome: ");
                input.nextLine();
                p.nome = input.nextLine();

                System.out.print("Nova quantidade: ");
                p.quantidade = input.nextInt();

                System.out.print("Novo preço: ");
                p.preco = input.nextDouble();

                System.out.println("Produto atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    static void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Estoque vazio.");
        } else {
            System.out.println("\n--- Produtos no Estoque ---");
            for (Estoque p : produtos) {
                p.exibirProduto();
            }
        }
    }

    static void removerProduto() {
        System.out.print("Digite o código do produto para remover: ");
        int codigo = input.nextInt();

        for (Estoque p : produtos) {
            if (p.codigo == codigo) {
                produtos.remove(p);
                System.out.println("Produto removido com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    static void relatorioEstoque() {
        double valorTotal = 0;
        if (produtos.isEmpty()) {
            System.out.println("Estoque vazio.");
        } else {
            System.out.println("\n--- Relatório de Estoque ---");
            for (Estoque p : produtos) {
                p.exibirProduto();
                valorTotal += p.preco * p.quantidade;
            }
            System.out.println("\nValor total do estoque: R$ " + valorTotal);
        }
    }
}
