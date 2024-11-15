package controller;

import DAO.Conexao;
import DAO.UsuarioDAO;
import model.Usuario;
import model.Moedas;
import view.login;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.JTextField;
import view.menu;

public class ControllerLogin {
    private login view;

    public ControllerLogin(login view) {
        this.view = view;
    }
    
    public void teste(){        
        if(Integer.parseInt(view.getCpf().getText()) == 12345678 && Integer.parseInt(view.getSenha_login().getText()) == 123456){
            menu viewMenu = new view.menu(new Usuario("Bassan", "12345678", "123456", 1000.12f, 2.56f, 3.78f, 10.90f), new Moedas());
            viewMenu.setVisible(true);
            view.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(view, "Login não efetuado", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void loginUsuario(){
        Usuario user = new Usuario(null,view.getCpf().getText(),view.getSenha_login().getText(), 0, 0, 0, 0);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            ResultSet res = dao.consultar(user);
            System.out.println("4");
            if(res.next()){
                String nome = res.getString("nome");
                String cpf = res.getString("usuario");
                String senha = res.getString("senha");
                float reais = res.getFloat("reais");
                float bit = res.getFloat("bit");
                float rip = res.getFloat("rip");
                float eth = res.getFloat("eth");
                JOptionPane.showMessageDialog(view, "Login Feito", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                menu viewMenu = new view.menu(new Usuario(nome, cpf, senha, reais, bit, rip, eth), new Moedas());
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
