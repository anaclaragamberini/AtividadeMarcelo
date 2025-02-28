import java.util.ArrayList;
import java.util.List;

public class Vetor<T> {
    private List<T> elementos;

    public Vetor() {
        this.elementos = new ArrayList<>();
    }

    public void adicionarElemento(T elemento) {
        this.elementos.add(elemento);
    }

    public int quantidadeElementos() {
        return this.elementos.size();
    }

    public void imprimirElementos() {
        for (T elemento : elementos) {
            System.out.println(elemento);
        }
    }

    public T obterElemento(int posicao) {
        if (posicao >= 0 && posicao < elementos.size()) {
            return elementos.get(posicao);
        }
        return null; 
    }

    public boolean existeElemento(T elemento) {
        return elementos.contains(elemento);
    }

    public void adicionarElementoEmPosicao(int posicao, T elemento) {
        if (posicao >= 0 && posicao <= elementos.size()) {
            elementos.add(posicao, elemento);
        }
    }

    public boolean removerElemento(T elemento) {
        return elementos.remove(elemento);
    }
}

