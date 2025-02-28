public class Main {
    public static void main(String[] args) {
        Vetor<String> vetor = new Vetor<>();
        vetor.adicionarElemento("Elemento 1");
        vetor.adicionarElemento("Elemento 2");
        vetor.adicionarElemento("Elemento 3");
        
        System.out.println("Quantidade de elementos no vetor: " + vetor.quantidadeElementos());
        vetor.imprimirElementos();
        
        System.out.println("Elemento na posição 1: " + vetor.obterElemento(1));
        System.out.println("Existe 'Elemento 2' no vetor? " + vetor.existeElemento("Elemento 2"));
        
        vetor.adicionarElementoEmPosicao(1, "Elemento Adicionado");
        System.out.println("Após adicionar um elemento em uma posição:");
        vetor.imprimirElementos();
        
        vetor.removerElemento("Elemento 3");
        System.out.println("Após remover 'Elemento 3':");
        vetor.imprimirElementos();

        ListaNumerosInteiros lista = new ListaNumerosInteiros();
        lista.adicionarNumero(10);
        lista.adicionarNumero(20);
        lista.adicionarNumero(30);
        
        System.out.println("\nExibindo números na lista:");
        lista.exibirNumeros();
        
        System.out.println("Existe o número 20 na lista? " + lista.existeNumero(20));
        
        lista.removerNumero(20);
        System.out.println("Após remover o número 20:");
        lista.exibirNumeros();
    }
}
