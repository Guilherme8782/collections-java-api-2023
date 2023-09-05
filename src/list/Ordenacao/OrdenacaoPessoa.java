package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome,idade,altura));
    }

    //Usando o Comparable para ordenação
    public List<Pessoa> ordernarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList); //duplicando a lista pois iremos usar o Comparable
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    //Usando o Comparator para ordenação
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }
}
