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
    
    public void loginUsuario(){
        Usuario user = new Usuario(null,view.getCpf().getText(),view.getSenha_login().getText(), 0, 0, 0, 0);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            ResultSet res = dao.consultar(user);
            System.out.println("4");
            if(res != null){
                System.out.println("oi");
                String nome = user.getNome();
                System.out.println(nome);
                String cpf = user.getCpf();
                System.out.println(cpf);
                String senha = user.getSenha();
                System.out.println(senha);
                float reais = user.getReais();
                float bit = user.getBit();
                float rip = user.getRip();
                float eth = user.getEth();
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
