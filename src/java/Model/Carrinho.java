package Model;

import java.util.LinkedList;

/**
 * @author Igor, Mauricio, Victor
 */
public class Carrinho {
    
    private LinkedList<Produto> produtos;

    public LinkedList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(LinkedList<Produto> produtos) {
        this.produtos = produtos;
    }

    public Carrinho() {
    }
    
}
