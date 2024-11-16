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
        String sql = "UPDATE usuario SET reais = ?, bit = ?, eth = ?, rip = ? WHERE cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, usuario.getReais());
        statement.setDouble(2, usuario.getBit());
        statement.setDouble(3, usuario.getEth());
        statement.setDouble(4, usuario.getRip());
        statement.setString(5, usuario.getCpf());
        statement.execute();
        conn.close();
    }
    
    public ResultSet consultar(Usuario usuario) throws SQLException{
        try (Connection con = conn) {
            String sql = "SELECT * FROM usuario WHERE cpf = ? AND senha = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, usuario.getCpf());
            pstmt.setString(2, usuario.getSenha());
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                usuario.setNome(rs.getString("nome"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setReais(rs.getFloat("reais"));
                usuario.setBit(rs.getFloat("bit"));
                usuario.setEth(rs.getFloat("eth"));
                usuario.setRip(rs.getFloat("rip"));
                return rs;
            }
            else{
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}