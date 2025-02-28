import java.util.ArrayList;
import java.util.List;

public class Lista {
    private ArrayList<Integer> lista;

    public Lista() {
        lista = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        lista.add(numero);
    }

    public boolean removerNumero(int numero) {
        return lista.remove(Integer.valueOf(numero));
    }

    public void exibirNumeros() {
        for (Integer numero : lista) {
            System.out.println(numero);
        }
    }

    public boolean existeNumero(int numero) {
        return lista.contains(numero);
    }
}
