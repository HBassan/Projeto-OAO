package DAO;
import java.sql.Connection;
import model.Usuario;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {
    private Connection conn;

    public UsuarioDAO(Connection conn) {
        this.conn = conn;
    }
    
    public void inserir(Usuario usuario) throws SQLException{
        String sql = "insert into usuario (nome, cpf, senha) values ('"+usuario.getNome()+"', '"+usuario.getCpf()+"', '" +usuario.getSenha()+"')";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
    }
    
    public void atualizar(Usuario usuario) throws SQLException{
        String sql = "update usuario set senha =  ? where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, usuario.getSenha());
        statement.setString(2, usuario.getCpf());
        statement.execute();
        conn.close();
    }
    
    public ResultSet consultar(Usuario usuario) throws SQLException{
        String sql = "select * from usuario where cpf = '"+usuario.getCpf()+"' AND senha = '"+usuario.getSenha()+"'";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, usuario.getCpf());
        statement.setString(2, usuario.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        conn.close();
        return resultado;
    }
}
