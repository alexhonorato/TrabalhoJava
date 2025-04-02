import java.util.Scanner;

public class EventoCarros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** REGISTRO DE CARRO ***");
        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Placa: ");
        String placa = scanner.nextLine();


        Carro carro = new Carro(marca, modelo, ano, placa);
        carro.exibirInformacoes();

        int opcao;
        do {
            System.out.println("\n1 - Acelerar\n2 - Frear\n3 - Exibir Informações\n0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a velocidade para acelerar (km/h): ");
                    double aceleracao = scanner.nextDouble();
                    carro.acelerar(aceleracao);
                    break;
                case 2:
                    System.out.print("Digite a velocidade para frear (km/h): ");
                    double reducao = scanner.nextDouble();
                    carro.frear(reducao);
                    break;
                case 3:
                    carro.exibirInformacoes();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}


