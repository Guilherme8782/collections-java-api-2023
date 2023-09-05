package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> Listanumero;

    public SomaNumeros() {
        this.Listanumero = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        Listanumero.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        if (!Listanumero.isEmpty()) {
            for (int l : Listanumero) {
                soma += l;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maior = 0;
        if (!Listanumero.isEmpty()) {
            for (int l : Listanumero) {
                int primeiro = Listanumero.get(0);

                if (l > primeiro) {
                    maior = l;
                } else {
                    maior = primeiro;
                }
            }
        }
        return maior;
    }

    public int encontrarMenorNumero() {
        int menor = 0;
        if (!Listanumero.isEmpty()) {
            for (int l : Listanumero) {
                int primeiro = Listanumero.get(0);

                if (l < primeiro) {
                    menor = l;
                } else {
                    menor = primeiro;
                }
            }
        }
        return menor;
    }

    public void exibirNumeros() {
        System.out.println(Listanumero);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(6);
        somaNumeros.calcularSoma();
        somaNumeros.encontrarMaiorNumero();
        somaNumeros.encontrarMenorNumero();
        somaNumeros.exibirNumeros();
    }
}
