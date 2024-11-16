package DAO;
import java.sql.Connection;
import model.Moedas;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class MoedasDAO {
    private Connection conn;

    public MoedasDAO(Connection conn) {
        this.conn = conn;
    }
    
    public void atualizar(Moedas moedas) throws SQLException{
        String sql = "UPDATE moedas SET bit = ?, eth = ?, rip = ? WHERE ref = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, moedas.getValor_bit());
        statement.setDouble(2, moedas.getValor_eth());
        statement.setDouble(3, moedas.getValor_rip());
        statement.setString(4, "certo");
        statement.execute();
        conn.close();
    }
    
    public ResultSet buscar(Moedas moedas) throws SQLException{
        try (Connection con = conn) {
            String sql = "SELECT * FROM moedas WHERE ref = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, "certo");
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                moedas.setValor_bit(rs.getFloat("bit"));
                moedas.setValor_eth(rs.getFloat("eth"));
                moedas.setValor_rip(rs.getFloat("rip"));
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
