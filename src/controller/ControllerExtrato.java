package controller;

import model.Usuario;
import model.Moedas;
import view.menu;
import view.extrato;


public class ControllerExtrato {
    private extrato view;

    public ControllerExtrato(extrato view) {
        this.view = view;
    }
    
    public void voltar(Usuario user, Moedas moedas){        
        menu viewMenu = new view.menu(user, moedas);
        viewMenu.setVisible(true);
        view.setVisible(false);
    }
       
}
