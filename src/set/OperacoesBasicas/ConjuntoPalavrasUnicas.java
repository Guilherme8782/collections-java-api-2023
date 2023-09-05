package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> conjuntoPalavras;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavras = new HashSet<>();
    }

    public Set<String> getConjuntoPalavras() {
        return conjuntoPalavras;
    }

    public void adicionarPalavra(String palavra) {
        conjuntoPalavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        String palavraRemover = null;
        for (String c : conjuntoPalavras) {
            if (Objects.equals(c, palavra)) {
                palavraRemover = c;
                break;
            }
        }
        conjuntoPalavras.remove(palavraRemover);
    }

    public void verificarPalavras(String palavra) {
        int arrayContador = 1;
        for (String c : conjuntoPalavras) {
            if (Objects.equals(c, palavra)) {
                System.out.println("Tudo certo");
                break;
            } else {
                if (conjuntoPalavras.size() == arrayContador) {
                    System.out.println("Não encontrou");
                } else {
                    System.out.println("Procurando");
                    ++arrayContador;
                }
            }
        }
    }

    public void verPalavras() {
        System.out.println(conjuntoPalavras);
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "conjuntoPalavras=" + conjuntoPalavras +
                '}';
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("Ola");
        conjuntoPalavrasUnicas.adicionarPalavra("OI");
        conjuntoPalavrasUnicas.verPalavras();
        conjuntoPalavrasUnicas.verPalavras();
        conjuntoPalavrasUnicas.verificarPalavras("SLa");
    }

}
