package controller;

import model.Moedas;
import model.Usuario;
import view.atualizar;
import view.menu;
import view.deposito;
import view.saque;
import view.autentica;
import view.compra;


public class ControllerMenu {
    private menu view;

    public ControllerMenu(menu view) {
        this.view = view;
    }
    
    public void saldo(Usuario user, Moedas moedas){        
        autentica viewAutentica = new view.autentica(user, moedas, 0);
        viewAutentica.setVisible(true);
        view.setVisible(false);
    }
    
    public void extrato(Usuario user, Moedas moedas){        
        autentica viewAutentica = new view.autentica(user, moedas, 1);
        viewAutentica.setVisible(true);
        view.setVisible(false);
    }
    
    public void compra(Usuario user, Moedas moedas){        
        autentica viewAutentica = new view.autentica(user, moedas, 2);
        viewAutentica.setVisible(true);
        view.setVisible(false);
    }
    
    public void venda(Usuario user, Moedas moedas){        
        autentica viewAutentica = new view.autentica(user, moedas, 3);
        viewAutentica.setVisible(true);
        view.setVisible(false);
    }
    
    public void deposito(Usuario user, Moedas moedas){        
        deposito viewDeposito = new view.deposito(user, moedas);
        viewDeposito.setVisible(true);
        view.setVisible(false);
    }
    
    public void saque(Usuario user, Moedas moedas){        
        saque viewSaque = new view.saque(user, moedas);
        viewSaque.setVisible(true);
        view.setVisible(false);
    }
    
    public void atualizar(Usuario user, Moedas moedas){     
        atualizar viewAtualizar = new view.atualizar(user, moedas);
        viewAtualizar.setVisible(true);
        view.setVisible(false);
    }
}
