import java.util.Comparator;

/**
 * Critério A - Valor Final do Pedido (crescente).
 * Desempate 1: Volume Total de Itens (quantProdutos).
 * Desempate 2: Código Identificador do primeiro item do pedido.
 */
public class ComparadorCriterioA implements Comparator<Pedido> {

    @Override
    public int compare(Pedido o1, Pedido o2) {
        // Critério principal: valor final crescente
        int cmp = Double.compare(o1.valorFinal(), o2.valorFinal());
        if (cmp != 0) return cmp;

        // Desempate 1: volume total de itens
        cmp = Integer.compare(o1.getTotalItens(), o2.getTotalItens());
        if (cmp != 0) return cmp;

        // Desempate 2: código identificador do primeiro produto
        return Integer.compare(o1.getIdPrimeiroProduto(), o2.getIdPrimeiroProduto());
    }
}
