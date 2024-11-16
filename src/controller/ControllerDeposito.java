package controller;

import DAO.Conexao;
import DAO.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import model.Moedas;
import model.Usuario;
import view.deposito;
import view.menu;
import view.saldo;


public class ControllerDeposito {
    private deposito view;

    public ControllerDeposito(deposito view) {
        this.view = view;
    }
    
    public void depositar(Usuario user, Moedas moedas){
        float valor = Float.parseFloat(view.getValor().getText());
        float reais = user.getReais();
        float novo = reais + valor;
        user.setReais(novo);
        Conexao conex = new Conexao();
        try{       
            Connection con = conex.getConnection();
            UsuarioDAO dao = new UsuarioDAO(con);
            dao.atualizar(user);
        } catch(SQLException e){
            System.out.println("ERRO");
        }
        saldo viewSaldo = new view.saldo(user, moedas);
        viewSaldo.setVisible(true);
        view.setVisible(false);
    }
    
    public void voltar(Usuario user, Moedas moedas){        
        menu viewMenu = new view.menu(user, moedas);
        viewMenu.setVisible(true);
        view.setVisible(false);
    }
    
}
