package controller;

import model.Usuario;
import model.Moedas;
import view.autentica;
import javax.swing.JOptionPane;
import view.saldo;
import view.extrato;
import view.compra;
import view.menu;
import view.venda;

public class ControllerAutentica {
    private autentica view;

    public ControllerAutentica(autentica view) {
        this.view = view;
    }
    
    public void entrar(Usuario user, Moedas moedas,  int i){        
        if(Integer.parseInt(view.getSenha_login().getText()) == Integer.parseInt(user.getSenha())){
            if(i == 0){
                saldo viewSaldo = new view.saldo(user, moedas);
                viewSaldo.setVisible(true);
                view.setVisible(false);
            }
            if(i == 1){
                extrato viewExtrato = new view.extrato(user, moedas);
                viewExtrato.setVisible(true);
                view.setVisible(false);
            }
            if(i == 2){
                compra viewCompra = new view.compra(user, moedas);
                viewCompra.setVisible(true);
                view.setVisible(false);
            }
            if(i == 3){
                venda viewVenda = new view.venda(user, moedas);
                viewVenda.setVisible(true);
                view.setVisible(false);
            }
        }
        else{
            JOptionPane.showMessageDialog(view, "Senha incorreta", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void voltar(Usuario user, Moedas moedas){        
        menu viewMenu = new view.menu(user, moedas);
        viewMenu.setVisible(true);
        view.setVisible(false);
    }
    
}
