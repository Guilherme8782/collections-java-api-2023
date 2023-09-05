package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome,numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosNome.add(c);
            }
        }
        return contatosNome;
    }

    public Contato atualizarNumeroContato(String nome,int novoNumero) {
        Contato contatoatualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoatualizado = c;
                break;
            }
        }
        return contatoatualizado;
    }
}
