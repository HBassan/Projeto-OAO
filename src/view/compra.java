package view;

import controller.ControllerCompra;
import javax.swing.JTextField;
import model.Usuario;
import model.Moedas;

public class compra extends javax.swing.JFrame {

    Usuario usuario = new Usuario();
    Moedas moedas = new Moedas();
    
    public compra(Usuario user, Moedas moeda) {
        initComponents();
        controller = new ControllerCompra(this);
        usuario = user;
        moedas = moeda;
        vBit.setText(Float.toString(moeda.getValor_bit()));
        vEth.setText(Float.toString(moeda.getValor_eth()));
        vRip.setText(Float.toString(moeda.getValor_rip()));
        System.out.println(usuario);
        Cpf.setText(user.getCpf());
        Nome.setText(user.getNome());
    }

    public JTextField getValor() {
        return Valor;
    }

    public void setValor(JTextField Senha) {
        this.Valor = Valor;
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        Cpf = new javax.swing.JLabel();
        Valor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Bit = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Eth = new javax.swing.JButton();
        Rip = new javax.swing.JButton();
        vBit = new javax.swing.JLabel();
        vEth = new javax.swing.JLabel();
        vRip = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Compra");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel3.setText("Cripto Exchange");

        Nome.setText("jLabel2");

        Cpf.setText("jLabel4");

        Valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorActionPerformed(evt);
            }
        });

        jLabel2.setText("Digite a quantia de reais que deseja investir");

        Bit.setText("Bitcoin");
        Bit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BitActionPerformed(evt);
            }
        });

        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Escolha qual moeda deseja comprar");

        Eth.setText("Ethereum");
        Eth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EthActionPerformed(evt);
            }
        });

        Rip.setText("Ripple");
        Rip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RipActionPerformed(evt);
            }
        });

        vBit.setText("jLabel5");

        vEth.setText("jLabel6");

        vRip.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(54, 54, 54)
                        .addComponent(Cpf)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Bit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Voltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Eth))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Rip))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(96, 96, 96)
                                    .addComponent(jLabel1))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(108, 108, 108))))
                        .addGap(46, 46, 46))))
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(vBit)
                .addGap(47, 47, 47)
                .addComponent(vEth)
                .addGap(51, 51, 51)
                .addComponent(vRip)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cpf)
                            .addComponent(Nome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)))
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vBit)
                    .addComponent(vEth)
                    .addComponent(vRip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bit)
                    .addComponent(Eth)
                    .addComponent(Rip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Voltar)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BitActionPerformed
        controller.bit(usuario, moedas);
    }//GEN-LAST:event_BitActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        controller.voltar(usuario, moedas);
    }//GEN-LAST:event_VoltarActionPerformed

    private void ValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorActionPerformed

    private void EthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EthActionPerformed
        controller.eth(usuario, moedas);
    }//GEN-LAST:event_EthActionPerformed

    private void RipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RipActionPerformed
        controller.rip(usuario, moedas);
    }//GEN-LAST:event_RipActionPerformed

    private ControllerCompra controller;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bit;
    private javax.swing.JLabel Cpf;
    private javax.swing.JButton Eth;
    private javax.swing.JLabel Nome;
    private javax.swing.JButton Rip;
    private javax.swing.JTextField Valor;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel vBit;
    private javax.swing.JLabel vEth;
    private javax.swing.JLabel vRip;
    // End of variables declaration//GEN-END:variables
}
