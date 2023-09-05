package list.OperacoesBasicas;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    //construtor que obrigará antes de criar o objeto a ter esses campos
    public Item(String nome, double preco, int quantidade) {

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //To string serve para retornar o texto e não o espaço de memória onde está lcoalizado
    @Override
    public String toString() {
        return  nome +
                ", " + preco +
                ", " + quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
