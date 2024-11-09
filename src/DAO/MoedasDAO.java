package DAO;
import java.sql.Connection;
import model.Usuario;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MoedasDAO {
    private Connection conn;

    public MoedasDAO(Connection conn) {
        this.conn = conn;
    }
    
    
}
