// TAD para lista de inteiros usando Java ArrayList
public class ListaNumerosInteiros {
    private ArrayList<Integer> lista;

    public ListaNumerosInteiros() {
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
