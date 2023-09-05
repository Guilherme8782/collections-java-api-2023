package set.Pesquisa;

public class Tarefa {
    private String descricao;
    private boolean concluidoOuNao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluidoOuNao() {
        return concluidoOuNao;
    }

    public void setConcluidoOuNao(boolean concluidoOuNao) {
        this.concluidoOuNao = concluidoOuNao;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", concluidoOuNao=" + concluidoOuNao +
                '}';
    }
}
