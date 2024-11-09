package controller;

import model.Moedas;
import model.Usuario;
import view.menu;
import view.saldo;
import view.extrato;
import view.compra;
import view.deposito;
import view.saque;
import view.venda;


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
    
    public void compra(Usuario user, Moedas moedas){        
        compra viewCompra = new view.compra(user, moedas);
        viewCompra.setVisible(true);
        view.setVisible(false);
    }
    
    public void venda(Usuario user, Moedas moedas){        
        venda viewVenda = new view.venda(user, moedas);
        viewVenda.setVisible(true);
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
}
