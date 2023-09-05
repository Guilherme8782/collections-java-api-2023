package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhocompra; //Lista do tipo Item(Classe Item) - atributo

    public CarrinhoDeCompras() {
        this.carrinhocompra = new ArrayList<>(); //construtor onde vai criar a lista de Array
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhocompra.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome) {
        List<Item> removeItem = new ArrayList<>();
        for (Item item : carrinhocompra) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                removeItem.add(item);
            }
        }
        carrinhocompra.removeAll(removeItem);
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!carrinhocompra.isEmpty()) {
            for (Item item : carrinhocompra) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
        } else {
            System.out.println("Lista vazia");
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(carrinhocompra);
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "carrinhocompra=" + carrinhocompra +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Cavalo",14.21d,3);
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();
    }
}
