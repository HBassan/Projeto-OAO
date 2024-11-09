package controller;

import model.Usuario;
import model.Moedas;
import view.menu;
import view.atualizar;


public class ControllerAtualiza {
    private atualizar view;

    public ControllerAtualiza(atualizar view) {
        this.view = view;
    }
    
    public void voltar(Usuario user, Moedas moedas){        
        menu viewMenu = new view.menu(user, moedas);
        viewMenu.setVisible(true);
        view.setVisible(false);
    }
    
    public void atualiza(Moedas moedas){        
        
    }
    
}
