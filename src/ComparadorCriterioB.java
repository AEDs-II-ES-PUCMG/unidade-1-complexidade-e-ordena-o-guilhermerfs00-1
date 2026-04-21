import java.util.Comparator;

/**
 * Critério B - Volume Total de Itens (crescente).
 * Desempate 1: Data do Pedido.
 * Desempate 2: Código Identificador do pedido.
 */
public class ComparadorCriterioB implements Comparator<Pedido> {

    @Override
    public int compare(Pedido o1, Pedido o2) {
        int cmp = Integer.compare(o1.getTotalItens(), o2.getTotalItens());
        if (cmp != 0) return cmp;

        cmp = o1.getDataPedido().compareTo(o2.getDataPedido());
        if (cmp != 0) return cmp;

        return Integer.compare(o1.getIdPedido(), o2.getIdPedido());
    }
}
