//Para ajudar nessa organização, você decide criar um sistema simples em Java que permitirá
//registrar cada livro com detalhes cruciais: o título, o autor e o ano de publicação. Além de
//armazenar esses dados, você quer uma maneira fácil de exibir as informações de qualquer livro
//da sua coleção, para quando quiser relembrar um título ou sugerir uma leitura a um amigo

import java.util.ArrayList;
import java.util.Scanner;

class Livro {
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + ano);
        System.out.println("----------------------");
    }
}
