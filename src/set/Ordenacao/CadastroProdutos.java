package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double preco, int quantidade) {
        produtoSet.add(new Produto(nome,codigo,preco,quantidade));
    }

    //Usando Comparable
    public Set<Produto> exibirProdutosNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet); //Apenas o TreeSet sabe organizar os objetos ao contrário do HashSet
        return produtosPorNome;
    }

    //Usando Comparator
    public Set<Produto> exibirPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco()); //Apenas o TreeSet sabe organizar os objetos ao contrário do HashSet
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }
}
