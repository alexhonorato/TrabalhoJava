import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Jogadores {
    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogadores(String nome, int pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = calcularNivel();
    }

    private int calcularNivel() {
        if (pontuacao <= 100) return 1;
        if (pontuacao <= 300) return 2;
        if (pontuacao <= 500) return 3;
        if (pontuacao <= 700) return 4;
        if (pontuacao <= 900) return 5;
        return 6;
    }

    public void aumentarPontuacao(int pontos) {
    if (pontos > 0) {
        this.pontuacao += pontos;
        this.nivel = calcularNivel();
    }
}
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Nível: " + nivel);
    }

    public String getNome() {
    return nome;
}

    public int getPontuacao() {
    return pontuacao;
}

    public int getNivel() {
    return nivel;
}


//@Override
        public String toString() {
            return "Nome: " + nome + "\nPontuação: " + pontuacao + "\nNível: " + nivel;
        }
}