
import java.sql.SQLOutput;
import java.util.Scanner;


public class MainCalculadora {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("--- CALCULADORA ---");
            System.out.println("1. Adição;");
            System.out.println("2. Subtração;");
            System.out.println("3. Multiplicação;");
            System.out.println("4. Divisão;");
            System.out.println("0. Sair");

            System.out.printf("\nEscolha a operação desejada: ");
            int op = input.nextInt();

            if (op == 0) {
                System.out.printf("Saindo...");
                break;

            }

            System.out.printf("Digite o primeiro valor: ");
            double a = input.nextDouble();

            System.out.printf("Digite o segundo valor: ");
            double b = input.nextDouble();

            double resultado = 0;

            switch (op) {
                case 1:
                    resultado = Calculadora.adicao(a, b);
                    System.out.println("\nResultado: \n" + resultado);
                    break;
                case 2:
                    resultado = Calculadora.subtracao(a, b);
                    System.out.println("\nResultado: \n" + resultado);
                    break;
                case 3:
                    resultado = Calculadora.divisao(a, b);
                    System.out.println("\nResultado: \n" + resultado);
                    break;
                case 4:
                    resultado = Calculadora.multiplicacao(a, b);
                    System.out.println("\nResultado: \n" + resultado);
                    break;
                default:
                    resultado = 0;
            }


            System.out.println(">> Deseja continuar? (S/N)");
            input.nextLine();
            String continuar = input.nextLine();
            if ("N".equalsIgnoreCase(continuar)) {
                System.out.println("Saindo...");
                break;
            }

        }

        input.close();
    }

}

