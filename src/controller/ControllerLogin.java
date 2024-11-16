package controller;

import DAO.Conexao;
import DAO.UsuarioDAO;
import DAO.MoedasDAO;
import model.Usuario;
import model.Moedas;
import view.login;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import view.menu;

public class ControllerLogin {
    private login view;

    public ControllerLogin(login view) {
        this.view = view;
    }
    
    public void loginUsuario(){
        Moedas moedas = new Moedas();
        Usuario user = new Usuario(null,view.getCpf().getText(),view.getSenha_login().getText(), 0, 0, 0, 0);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            ResultSet res = dao.consultar(user);
            if(res != null){
                JOptionPane.showMessageDialog(view, "Login Feito", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                Conexao conex = new Conexao();
                Connection con = conex.getConnection();
                MoedasDAO Mdao = new MoedasDAO(con);
                Mdao.buscar(moedas);
                menu viewMenu = new view.menu(user, moedas);
                viewMenu.setVisible(true);
                view.setVisible(false);
            } else{
                JOptionPane.showMessageDialog(view, "Login não efetuado", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(view, "Erro de conexão", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
