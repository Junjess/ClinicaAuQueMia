package Telas;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class TelaHome extends javax.swing.JPanel {

    public TelaHome() {
        initComponents();
        BT_CadastrarPet.setBackground( new Color(0,0,0, 90));
        BT_CadastrarPet.setBorderPainted(false);
        BT_CadastrarPet.setContentAreaFilled(false);
        BT_CadastrarPet.setFocusPainted(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BT_CadastrarPet = new javax.swing.JButton();
        LB_PetShop = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaHome.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BT_CadastrarPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CadastrarPetActionPerformed
        Janela.TelaE = new TelaCadastroAnimais();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaC);
        janela.getContentPane().remove(Janela.TelaC);
        janela.add(Janela.TelaE, BorderLayout.CENTER);
        janela.pack();
        janela.setExtendedState(Janela.MAXIMIZED_BOTH);
        janela.setUndecorated(true);
    }//GEN-LAST:event_BT_CadastrarPetActionPerformed

    private void LB_PetShopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_PetShopMouseClicked
        Janela.TelaD = new TelaPetShop();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaC);
        janela.getContentPane().remove(Janela.TelaC);
        janela.add(Janela.TelaD, BorderLayout.CENTER);
        janela.pack();
        janela.setExtendedState(Janela.MAXIMIZED_BOTH);
        janela.setUndecorated(true);
    }//GEN-LAST:event_LB_PetShopMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_CadastrarPet;
    private javax.swing.JLabel LB_PetShop;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
