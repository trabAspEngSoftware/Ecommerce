package persistence;

import Model.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class UsuarioDAO {

    public static UsuarioDAO instance = new UsuarioDAO();

    public static UsuarioDAO getInstance() {
        return instance;
    }

    public Usuario read(String email, String senha) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getConnection();
            st = conn.createStatement();
            ResultSet result =  st.executeQuery("SELECT nome, email, senha FROM usuario WHERE email = " + email); 
            Usuario usuario = new Usuario();
            
            if(!senha.equals(result.getString("senha"))) return null;
            
            usuario.setId(Integer.valueOf(result.getString("id")));
            usuario.setNome(result.getString("nome"));
            usuario.setCpf(result.getString("cpf"));
            usuario.setEmail(result.getString("email"));
            
            return usuario;
            
        } catch (SQLException e) {
            throw e;
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
                if (conn != null) {
                    conn.close();
                }

            } catch (SQLException e) {

            }
        }
    }

}
