package controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Moedas;
import model.Usuario;
import view.compra;
import view.menu;
import view.saldo;


public class ControllerCompra {
    private compra view;

    public ControllerCompra(compra view) {
        this.view = view;
    }
    
    public void bit(Usuario user, Moedas moedas){
        float valor = Float.parseFloat(view.getValor().getText());
        float reais = user.getReais();
        float novo = reais - valor;
        float taxado = valor - (valor/100)*2;
        if (novo>0){
            user.setReais(novo);
            LocalDateTime agora = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            String horarioAtual = agora.format(formatter);
            ArrayList<String> extrato = user.getExtrato();
            float v_bit = moedas.getValor_bit();
            float compra = 1/(v_bit/taxado);
            float bit = user.getBit() + compra;            
            extrato.add("Horário: " + horarioAtual + "   COMPRA  -R$" + valor + "    +" + compra + " BTC");
            user.setBit(bit);
            user.setExtrato(extrato);
            saldo viewSaldo = new view.saldo(user, moedas);
            viewSaldo.setVisible(true);
            view.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(view, "Compra não efetuada\nSaldo insuficiente", "Saldo insuficiente", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void eth(Usuario user, Moedas moedas){
        float valor = Float.parseFloat(view.getValor().getText());
        float reais = user.getReais();
        float novo = reais - valor;
        float taxado = valor - (valor/100);
        if (novo>0){
            user.setReais(novo);
            LocalDateTime agora = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            String horarioAtual = agora.format(formatter);
            ArrayList<String> extrato = user.getExtrato();
            float v_eth = moedas.getValor_eth();
            float compra = 1/(v_eth/taxado);
            float eth = user.getEth() + compra;
            extrato.add("Horário: " + horarioAtual + "   COMPRA  -R$" + valor + "    +" + compra + " ETH");
            user.setEth(eth);
            user.setExtrato(extrato);
            saldo viewSaldo = new view.saldo(user, moedas);
            viewSaldo.setVisible(true);
            view.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(view, "Compra não efetuada\nSaldo insuficiente", "Saldo insuficiente", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void rip(Usuario user, Moedas moedas){
        float valor = Float.parseFloat(view.getValor().getText());
        float reais = user.getReais();
        float novo = reais - valor;
        float taxado = valor - (valor/100);
        if (novo>0){
            user.setReais(novo);
            LocalDateTime agora = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            String horarioAtual = agora.format(formatter);
            ArrayList<String> extrato = user.getExtrato();
            float v_rip = moedas.getValor_rip();
            float compra = 1/(v_rip/taxado);
            float rip = user.getRip() + compra;
            extrato.add("Horário: " + horarioAtual + "   COMPRA  -R$" + valor + "    +" + compra + " XRP");
            user.setRip(rip);
            user.setExtrato(extrato);
            saldo viewSaldo = new view.saldo(user, moedas);
            viewSaldo.setVisible(true);
            view.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(view, "Compra não efetuada\nSaldo insuficiente", "Saldo insuficiente", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void voltar(Usuario user, Moedas moedas){        
        menu viewMenu = new view.menu(user, moedas);
        viewMenu.setVisible(true);
        view.setVisible(false);
    }
    
}
