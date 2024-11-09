package controller;

import model.Moedas;
import model.Usuario;
import view.menu;
import view.saldo;
import view.extrato;


public class ControllerMenu {
    private menu view;

    public ControllerMenu(menu view) {
        this.view = view;
    }
    
    public void saldo(Usuario user, Moedas moedas){        
        saldo viewSaldo = new view.saldo(user, moedas);
        viewSaldo.setVisible(true);
        view.setVisible(false);
    }
    
    public void extrato(Usuario user, Moedas moedas){        
        extrato viewExtrato = new view.extrato(user, moedas);
        viewExtrato.setVisible(true);
        view.setVisible(false);
    }
}
