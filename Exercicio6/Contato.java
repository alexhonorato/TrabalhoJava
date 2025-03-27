

public class Contato {
    private String nome;
    private String telefone;

    // Construtor
    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    // Representação do contato
    @Override  //Sobrepor
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone;
    }
}