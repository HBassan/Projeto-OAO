package controller;

import DAO.Conexao;
import DAO.UsuarioDAO;
import DAO.MoedasDAO;
import model.Usuario;
import model.Moedas;
import view.cadastro;
import view.login;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import view.menu;

public class ControllerCadastro {
    private cadastro view;

    public ControllerCadastro(cadastro view) {
        this.view = view;
    }
    
    public void cadastro(){
        Moedas moedas = new Moedas();
        Usuario user = new Usuario(view.getNome().getText(),view.getCpf().getText(),view.getSenha().getText(), 0, 0, 0, 0);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            dao.inserir(user);
            Connection cone = conexao.getConnection();
            UsuarioDAO udao = new UsuarioDAO(cone);
            ResultSet res = udao.consultar(user);
            if(res != null){
                JOptionPane.showMessageDialog(view, "Cadastro Feito", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                Conexao conex = new Conexao();
                Connection con = conex.getConnection();
                MoedasDAO Mdao = new MoedasDAO(con);
                Mdao.buscar(moedas);
                menu viewMenu = new view.menu(user, moedas);
                viewMenu.setVisible(true);
                view.setVisible(false);
            } else{
                JOptionPane.showMessageDialog(view, "Cadastro não efetuado", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(view, "Erro de conexão", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void voltar(){        
        login viewLogin = new view.login();
        viewLogin.setVisible(true);
        view.setVisible(false);
    }
}
