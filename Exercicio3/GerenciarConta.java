import java.util.Scanner;

public class GerenciarConta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("*** SEJA BEM-VINDO ***");
        System.out.print("Digite o número da conta: ");
        int numeroConta = input.nextInt();
        input.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite o nome do titular: ");
        String nomeTitular = input.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = input.nextDouble();

        // Criando objeto ContaBancaria com saldo inicial
        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldoInicial);

        int opcao;
        do {
            System.out.print("--------------------\n");
            System.out.println("*** MENU ***");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Realizar Depósito");
            System.out.println("3. Realizar Saque");
            System.out.println("0. Encerrar");

            System.out.print("Digite uma opção: ");
            opcao = input.nextInt();

            System.out.print("--------------------\n");


            switch(opcao) {
                case 1:
                    System.out.println("Saldo atual: R$ " + conta.getSaldo());
                    break;
                case 2:
                    System.out.print("Digite o valor do depósito: ");
                    double deposito = input.nextDouble();
                    conta.deposito(deposito); // Agora o depósito realmente acontece
                    break;
                case 3:
                    System.out.print("Digite o valor do saque: ");
                    double saque = input.nextDouble();
                    conta.saque(saque); // Agora o saque realmente acontece
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...!");
                    System.out.println("Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        input.close(); // Fechar o scanner para evitar vazamento de recurso
    }
}
