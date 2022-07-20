package br.com.dio;


import br.com.dio.model.Gato;

public class Primeiroprograma {
    public static void main(String[] args) {
     Gato gato = new Gato();
     System.out.println(gato);

        Livro Livro1 = new Livro("TCD-Aonde dorme o amor", 300);
        System.out.println(Livro1);
       /* int a = 5;
        int b = 3;

        System.out.println("Hello world" + (a+b) );*/

    }
}

class Livro{
    private String nome;
    private String npag;

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", npag='" + npag + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNpag() {
        return npag;
    }

    public void setNpag(String npag) {
        this.npag = npag;
    }

    public Livro(String nome, int npag) {
        this.nome = nome;
        this.npag = String.valueOf(npag);
    }
}