package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List <Tarefa> tarefasRemover = new ArrayList<>();
        for(Tarefa T : tarefaList) {
            if (T.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasRemover.add(T);
            }
        }
        tarefaList.removeAll(tarefasRemover);
    }

    public int obterNumeroTotalTarefa() {
        return tarefaList.size();
    }

    public void obterDescricaoTarefa() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número total é: " + listaTarefa.obterNumeroTotalTarefa());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O número total é: " + listaTarefa.obterNumeroTotalTarefa());

        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("O número total é: " + listaTarefa.obterNumeroTotalTarefa());

        listaTarefa.obterDescricaoTarefa();
    }
}
