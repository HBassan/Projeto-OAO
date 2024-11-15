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
        String sql = "select * from usuario where cpf = ? AND senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        System.out.println("oi");
        statement.setString(1, usuario.getCpf());
        statement.setString(2, usuario.getSenha());
        ResultSet rs = statement.executeQuery();
        System.out.println("teste");
        System.out.println(rs.getString("nome"));
        ResultSet res = statement.getResultSet();
        System.out.println(res);
        String nome = res.getString("nome");
        System.out.println("nome");
        String cpf = res.getString("usuario");
        System.out.println("cpf");
        String senha = res.getString("senha");
        System.out.println("senha");
        float reais = res.getFloat("reais");
        System.out.println("r");
        float bit = res.getFloat("bit");
        System.out.println("b");
        float rip = res.getFloat("rip");
        System.out.println("r");
        float eth = res.getFloat("eth");
        System.out.println("e");
        conn.close();
        return res;
    }
}
