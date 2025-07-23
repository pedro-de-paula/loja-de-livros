public class Livro {
    String nome;
    double preco;

    // Construtor
    public Livro(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Setter - nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter - nome
    public String getNome() {
        return nome;
    }

    // Setter - preco
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Getter - preco
    public double getPreco() {
        return preco;
    }
}
