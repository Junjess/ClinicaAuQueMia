package Telas;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TelaPetShop extends javax.swing.JPanel {

    public TelaPetShop() {
        initComponents();
        setarGifs();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LB_Home = new javax.swing.JLabel();
        LB_GifBanho1 = new javax.swing.JLabel();
        LB_GifBanho2 = new javax.swing.JLabel();
        LB_Banho = new javax.swing.JLabel();
        LB_Tosa = new javax.swing.JLabel();
        LB_GifTosa2 = new javax.swing.JLabel();
        LB_GifTosa1 = new javax.swing.JLabel();
        LB_BanhoeTosa = new javax.swing.JLabel();
        LB_GifBanhoeTosa1 = new javax.swing.JLabel();
        LB_GifBanhoeTosa2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LB_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_HomeMouseClicked(evt);
            }
        });
        add(LB_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 80, 40));

        LB_GifBanho1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/border.gif"))); // NOI18N
        add(LB_GifBanho1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        LB_GifBanho2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/border (1).gif"))); // NOI18N
        add(LB_GifBanho2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, -1, -1));

        LB_Banho.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LB_BanhoMouseMoved(evt);
            }
        });
        add(LB_Banho, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 240, 350));

        LB_Tosa.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LB_TosaMouseMoved(evt);
            }
        });
        add(LB_Tosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 230, 350));

        LB_GifTosa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/border (1).gif"))); // NOI18N
        add(LB_GifTosa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 370, -1, -1));

        LB_GifTosa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/border.gif"))); // NOI18N
        add(LB_GifTosa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, -1, -1));

        LB_BanhoeTosa.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LB_BanhoeTosaMouseMoved(evt);
            }
        });
        add(LB_BanhoeTosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 240, 230, 350));

        LB_GifBanhoeTosa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/border.gif"))); // NOI18N
        add(LB_GifBanhoeTosa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 370, -1, -1));

        LB_GifBanhoeTosa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/border (1).gif"))); // NOI18N
        add(LB_GifBanhoeTosa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 370, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaPetShop.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    public void setarGifs(){
        LB_GifBanho1.setVisible(false);
        LB_GifBanho2.setVisible(false);
        LB_GifTosa1.setVisible(false);
        LB_GifTosa2.setVisible(false);
        LB_GifBanhoeTosa1.setVisible(false);
        LB_GifBanhoeTosa2.setVisible(false);
    }
    private void LB_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_HomeMouseClicked
        Janela.TelaC = new TelaHome();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaD);
        janela.getContentPane().remove(Janela.TelaD);
        janela.add(Janela.TelaC, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_HomeMouseClicked

    private void LB_BanhoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_BanhoMouseMoved
        LB_GifBanho1.setVisible(true);
        LB_GifBanho2.setVisible(true);
        LB_GifTosa1.setVisible(false);
        LB_GifTosa2.setVisible(false);
        LB_GifBanhoeTosa1.setVisible(false);
        LB_GifBanhoeTosa2.setVisible(false);
    }//GEN-LAST:event_LB_BanhoMouseMoved

    private void LB_TosaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_TosaMouseMoved
        LB_GifBanho1.setVisible(false);
        LB_GifBanho2.setVisible(false);
        LB_GifTosa1.setVisible(true);
        LB_GifTosa2.setVisible(true);
        LB_GifBanhoeTosa1.setVisible(false);
        LB_GifBanhoeTosa2.setVisible(false);
    }//GEN-LAST:event_LB_TosaMouseMoved

    private void LB_BanhoeTosaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_BanhoeTosaMouseMoved
        LB_GifBanho1.setVisible(false);
        LB_GifBanho2.setVisible(false);
        LB_GifTosa1.setVisible(false);
        LB_GifTosa2.setVisible(false);
        LB_GifBanhoeTosa1.setVisible(true);
        LB_GifBanhoeTosa2.setVisible(true);
    }//GEN-LAST:event_LB_BanhoeTosaMouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB_Banho;
    private javax.swing.JLabel LB_BanhoeTosa;
    private javax.swing.JLabel LB_GifBanho1;
    private javax.swing.JLabel LB_GifBanho2;
    private javax.swing.JLabel LB_GifBanhoeTosa1;
    private javax.swing.JLabel LB_GifBanhoeTosa2;
    private javax.swing.JLabel LB_GifTosa1;
    private javax.swing.JLabel LB_GifTosa2;
    private javax.swing.JLabel LB_Home;
    private javax.swing.JLabel LB_Tosa;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
