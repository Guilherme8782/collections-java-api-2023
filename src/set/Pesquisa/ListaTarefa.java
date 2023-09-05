package set.Pesquisa;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
    private Set<Tarefa> listaTarefa;

    public ListaTarefa() {
        this.listaTarefa = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefa.add(new Tarefa(descricao));
    }

    public Tarefa removerTarefa(String descricao) {
        Tarefa tarefaRemover = null;
        for (Tarefa c: listaTarefa) {
            if (c.getDescricao().equalsIgnoreCase(descricao)) {
                listaTarefa.remove(c);
                tarefaRemover = c;
                break;
            }
        }
        return tarefaRemover;
    }

    public void exibirTarefas() {
        System.out.println(listaTarefa);
    }

    public void contarTarefas() {
        System.out.println(listaTarefa.size());
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> obterTarefasCon = new HashSet<>();
        for (Tarefa t : listaTarefa) {
            if (t.isConcluidoOuNao()) {
                obterTarefasCon.add(t);
            }
        }
        System.out.println(obterTarefasCon);
        return obterTarefasCon;
    }

    public Set<Tarefa> obterTarefasNaoConc() {
        Set<Tarefa> obterTarefasNaoConc = new HashSet<>();
        for (Tarefa t : listaTarefa) {
            if (!t.isConcluidoOuNao()) {
                obterTarefasNaoConc.add(t);
            }
        }
        System.out.println(obterTarefasNaoConc);
        return obterTarefasNaoConc;
    }

    public Tarefa marcarTarefaConcluida(String descricao) {
        Tarefa tarefaParaConc = null;
        for (Tarefa t : listaTarefa) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluidoOuNao(true);
                tarefaParaConc = t;
            }
        }
        return tarefaParaConc;
    }

    public Tarefa marcarTarefaNaoConcluida(String descricao) {
        Tarefa tarefaNaoConcluida = null;
        for (Tarefa t : listaTarefa) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluidoOuNao(false);
                tarefaNaoConcluida = t;
            }
        }
        return tarefaNaoConcluida;
    }

    public void limparListaTarefa() {
        listaTarefa.removeAll(listaTarefa);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Dormir");
        listaTarefa.adicionarTarefa("Escovar os dentes");
        listaTarefa.adicionarTarefa("Ir trabalhar");

        listaTarefa.limparListaTarefa();
        listaTarefa.adicionarTarefa("Olá Mundo");
        listaTarefa.exibirTarefas();
    }
}
