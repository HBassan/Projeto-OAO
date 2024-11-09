package controller;

import model.Usuario;
import model.Moedas;
import view.menu;
import view.saldo;


public class ControllerSaldo {
    private saldo view;

    public ControllerSaldo(saldo view) {
        this.view = view;
    }
    
    public void voltar(Usuario user, Moedas moedas){        
        menu viewMenu = new view.menu(user, moedas);
        viewMenu.setVisible(true);
        view.setVisible(false);
    }
    
}
