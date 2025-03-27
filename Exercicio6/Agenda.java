import java.util.ArrayList;
import java.util.List;

class Agenda {
    private List<Contato> contatos;

    // Construtor
    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    //Adicionar contato
    public void adicionarContato(String nome, String telefone) {
        Contato contato = new Contato(nome, telefone);
        contatos.add(contato);
//        if(buscarContato(nome) != null){
//            System.out.println("Contato já cadastrado");
//            return;
//        }

        Contato novoContato = buscarContato(nome);
        new Contato(nome, telefone);
        contatos.add(novoContato);

        System.out.println("Contato adicionado com sucesso!");
    }

    // buscar contato
    public Contato buscarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null;
    }

    // listar contato
    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Agenda vazia.");
        } else {
            for (Contato contato : contatos) {
                System.out.println(contato);
            }
        }
    }
    // REMOVE
    public void removerContato(String nomeRemover) {
        Contato contato = buscarContato(nomeRemover);
        if (contato != null) {
            contatos.remove(contato);
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("Contato não encontrado!");
        }
    }
}