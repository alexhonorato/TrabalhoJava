
import java.util.List;

class Pedido {
    private static int contadorId = 1;
    private int id;
    private Pizza pizza;
    private String tamanho;
    private String endereco;

    public Pedido(Pizza pizza, String tamanho, String endereco) {
        this.id = contadorId++;
        this.pizza = pizza;
        this.tamanho = tamanho;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return pizza.getValor();
    }


    @Override
    public String toString() {
        return "Pedido #" + id + "\n" + pizza + "\nTamanho: " + tamanho + "\nEndereço: " + endereco;
    }

    public static void add(List<Pedido> pedidos, Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido adicionado com sucesso!\n" + pedido);
    }
}
