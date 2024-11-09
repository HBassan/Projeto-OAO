package controller;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import model.Moedas;
import model.Usuario;
import view.venda;
import view.menu;
import view.saldo;


public class ControllerVenda {
    private venda view;

    public ControllerVenda(venda view) {
        this.view = view;
    }
    
    public void bit(Usuario user, Moedas moedas){
        float valor = Float.parseFloat(view.getValor().getText());
        float bit = user.getBit();
        float novo = bit - valor;
        float taxado = valor - (valor/100)*3;
        System.out.println(taxado);
        if (novo>0){
            user.setBit(novo);
            LocalDateTime agora = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            String horarioAtual = agora.format(formatter);
            ArrayList<String> extrato = user.getExtrato();
            float v_bit = moedas.getValor_bit();
            float venda = v_bit*taxado;
            float reais = user.getReais() + venda;
            extrato.add("Horário: " + horarioAtual + "   VENDA  +R$" + venda + "    -" + valor + " BTC");
            user.setReais(reais);
            user.setExtrato(extrato);
            saldo viewSaldo = new view.saldo(user, moedas);
            viewSaldo.setVisible(true);
            view.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(view, "Venda não efetuada\nSaldo insuficiente", "Saldo insuficiente", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void eth(Usuario user, Moedas moedas){
        float valor = Float.parseFloat(view.getValor().getText());
        float eth = user.getEth();
        float novo = eth - valor;
        float taxado = valor - (valor/100)*2;
        System.out.println(taxado);
        if (novo>0){
            user.setEth(novo);
            LocalDateTime agora = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            String horarioAtual = agora.format(formatter);
            ArrayList<String> extrato = user.getExtrato();
            float v_eth = moedas.getValor_eth();
            float venda = v_eth*taxado;
            float reais = user.getReais() + venda;
            extrato.add("Horário: " + horarioAtual + "   VENDA  +R$" + venda + "    -" + valor + " ETH");
            user.setReais(reais);
            user.setExtrato(extrato);
            saldo viewSaldo = new view.saldo(user, moedas);
            viewSaldo.setVisible(true);
            view.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(view, "Venda não efetuada\nSaldo insuficiente", "Saldo insuficiente", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void rip(Usuario user, Moedas moedas){
        float valor = Float.parseFloat(view.getValor().getText());
        float rip = user.getRip();
        float novo = rip - valor;
        float taxado = valor - (valor/100);
        System.out.println(taxado);
        if (novo>0){
            user.setRip(novo);
            LocalDateTime agora = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            String horarioAtual = agora.format(formatter);
            ArrayList<String> extrato = user.getExtrato();
            float v_rip = moedas.getValor_rip();
            float venda = v_rip/taxado;
            float reais = user.getReais() + venda;
            extrato.add("Horário: " + horarioAtual + "   VENDA  +R$" + venda + "    -" + valor + " XRP");
            user.setReais(reais);
            user.setExtrato(extrato);
            saldo viewSaldo = new view.saldo(user, moedas);
            viewSaldo.setVisible(true);
            view.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(view, "Venda não efetuada\nSaldo insuficiente", "Saldo insuficiente", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void voltar(Usuario user, Moedas moedas){        
        menu viewMenu = new view.menu(user, moedas);
        viewMenu.setVisible(true);
        view.setVisible(false);
    }
    
}
