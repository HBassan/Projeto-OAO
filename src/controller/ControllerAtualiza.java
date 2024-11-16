package controller;

import DAO.Conexao;
import DAO.MoedasDAO;
import java.sql.Connection;
import java.sql.SQLException;
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
        Conexao conex = new Conexao();
            try{       
                Connection con = conex.getConnection();
                MoedasDAO dao = new MoedasDAO(con);
                dao.atualizar(moedas);
            } catch(SQLException e){
                System.out.println("ERRO");
            }
        menu viewMenu = new view.menu(user, moedas);
        viewMenu.setVisible(true);
        view.setVisible(false);
    }
    
    public void atualiza(Moedas moedas){        
        
    }
    
}
