package Telas;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class TelaHome extends javax.swing.JPanel {

    public TelaHome() {
        initComponents();
        setarBotoes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LB_Configuracoes = new javax.swing.JLabel();
        LB_ClinicaMedica = new javax.swing.JLabel();
        BT_VisualizarPets = new javax.swing.JButton();
        BT_CadastrarPet = new javax.swing.JButton();
        LB_PetShop = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LB_Configuracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconeConfiguracoes.png"))); // NOI18N
        LB_Configuracoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_ConfiguracoesMouseClicked(evt);
            }
        });
        add(LB_Configuracoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 20, -1, -1));

        LB_ClinicaMedica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_ClinicaMedicaMouseClicked(evt);
            }
        });
        add(LB_ClinicaMedica, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 200, 40));

        BT_VisualizarPets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_VisualizarPetsActionPerformed(evt);
            }
        });
        add(BT_VisualizarPets, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 440, 340, 140));

        BT_CadastrarPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_CadastrarPetActionPerformed(evt);
            }
        });
        add(BT_CadastrarPet, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 340, 140));

        LB_PetShop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_PetShopMouseClicked(evt);
            }
        });
        add(LB_PetShop, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 130, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconeSair.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaHome.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void setarBotoes(){
        BT_CadastrarPet.setBackground( new Color(0,0,0, 90));
        BT_CadastrarPet.setBorderPainted(false);
        BT_CadastrarPet.setContentAreaFilled(false);
        BT_CadastrarPet.setFocusPainted(false);        
        BT_VisualizarPets.setBackground( new Color(0,0,0, 90));
        BT_VisualizarPets.setBorderPainted(false);
        BT_VisualizarPets.setContentAreaFilled(false);
        BT_VisualizarPets.setFocusPainted(false);
    }
    
    private void BT_CadastrarPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CadastrarPetActionPerformed
        Janela.TelaE = new TelaCadastroAnimais();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaC);
        janela.getContentPane().remove(Janela.TelaC);
        janela.add(Janela.TelaE, BorderLayout.CENTER);
        janela.pack();
        janela.setExtendedState(Janela.MAXIMIZED_BOTH);
    }//GEN-LAST:event_BT_CadastrarPetActionPerformed

    private void LB_PetShopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_PetShopMouseClicked
        Janela.TelaD = new TelaPetShop();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaC);
        janela.getContentPane().remove(Janela.TelaC);
        janela.add(Janela.TelaD, BorderLayout.CENTER);
        janela.pack();
        janela.setExtendedState(Janela.MAXIMIZED_BOTH);
    }//GEN-LAST:event_LB_PetShopMouseClicked

    private void LB_ClinicaMedicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_ClinicaMedicaMouseClicked
        Janela.TelaH = new TelaClinicaMedica();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaC);
        janela.getContentPane().remove(Janela.TelaC);
        janela.add(Janela.TelaH, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_ClinicaMedicaMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Janela.TelaA= new TelaLogin();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaC);
        janela.getContentPane().remove(Janela.TelaC);
        janela.add(Janela.TelaA, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void BT_VisualizarPetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_VisualizarPetsActionPerformed
        Janela.TelaI = new TelaVisualizarPet();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaC);
        janela.getContentPane().remove(Janela.TelaC);
        janela.add(Janela.TelaI, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_BT_VisualizarPetsActionPerformed

    private void LB_ConfiguracoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_ConfiguracoesMouseClicked
        Janela.TelaJ= new TelaConfiguracoes();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaC);
        janela.getContentPane().remove(Janela.TelaC);
        janela.add(Janela.TelaJ, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_ConfiguracoesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_CadastrarPet;
    private javax.swing.JButton BT_VisualizarPets;
    private javax.swing.JLabel LB_ClinicaMedica;
    private javax.swing.JLabel LB_Configuracoes;
    private javax.swing.JLabel LB_PetShop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
