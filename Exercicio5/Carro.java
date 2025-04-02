public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private double velocidadeAtual;


    public Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = 0;
    }

    public void acelerar(double aumento) {
        if (aumento > 0) {
            velocidadeAtual += aumento;
            System.out.println("O carro acelerou em " + aumento + " km/h. Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("O valor precisa ser positivo para acelerar.");
        }
    }

    public void frear(double reducao) {
        if (reducao > 0 && velocidadeAtual >= reducao) {
            velocidadeAtual -= reducao;
            System.out.println("O carro reduziu a velocidade em " + reducao + " km/h. Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("A redução é inválida ou maior que a velocidade atual.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("\n--- Informações do Carro ---");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + placa);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
    }
}




