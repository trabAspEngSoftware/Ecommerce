package Model;

import persistence.UsuarioDAO;

public class Compra {
    public static Compra instance = new Compra();

    public static Compra getInstance() {
        return instance;
    }
    
   private Carrinho carrinho = new Carrinho();
   private Usuario usuario = new Usuario();
   
   public void addProduto(Produto produto){

   }
}
