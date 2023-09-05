package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    private String produto;
    private long codigo;
    private double preco;
    private int quantidade;

    public Produto(String produto, long codigo, double preco, int quantidade) {
        this.produto = produto;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Aqui é como a ordenação do Comparable vai funcionar, no caso abaixo por Nome
    @Override
    public int compareTo(Produto p) {
        return produto.compareToIgnoreCase(p.getProduto());
    }

    public String getProduto() {
        return produto;
    }

    public long getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    //Aqui ficará implementado a Não Repetição de elemento, que no caso abaixo é o Código
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return getCodigo() == produto.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }

    @Override
    public String toString() {
        return "Produto{" +
                "produto='" + produto + '\'' +
                ", codigo=" + codigo +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

}

class ComparatorPorPreco implements Comparator<Produto> {

    //Aqui como será feita a Ordenação do Comparator, que no caso será pelo Preço
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
