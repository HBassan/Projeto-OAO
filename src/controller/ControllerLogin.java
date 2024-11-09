package controller;

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
        System.out.println(view.getCpf().getText());
        System.out.println(view.getSenha_login().getText());
        if(Integer.parseInt(view.getCpf().getText()) == 12345678 && Integer.parseInt(view.getSenha_login().getText()) == 123456){
            menu viewMenu = new view.menu(new Usuario("Bassan", "12345678", "123456", 1000.12f, 2.56f, 3.78f, 10.90f), new Moedas());
            viewMenu.setVisible(true);
            view.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(view, "Login não efetuado", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
}
