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

        LB_Configuracoes = new javax.swing.JLabel();
        LB_ClinicaMedica = new javax.swing.JLabel();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LB_Configuracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconeConfiguracoes.png"))); // NOI18N
        LB_Configuracoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_ConfiguracoesMouseClicked(evt);
            }
        });
        add(LB_Configuracoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 20, -1, -1));

        LB_ClinicaMedica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_ClinicaMedicaMouseClicked(evt);
            }
        });
        add(LB_ClinicaMedica, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 180, 40));

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
        LB_Banho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_BanhoMouseClicked(evt);
            }
        });
        add(LB_Banho, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 240, 350));

        LB_Tosa.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LB_TosaMouseMoved(evt);
            }
        });
        LB_Tosa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_TosaMouseClicked(evt);
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
        LB_BanhoeTosa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_BanhoeTosaMouseClicked(evt);
            }
        });
        add(LB_BanhoeTosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 240, 230, 350));

        LB_GifBanhoeTosa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/border.gif"))); // NOI18N
        add(LB_GifBanhoeTosa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 370, -1, -1));

        LB_GifBanhoeTosa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/border (1).gif"))); // NOI18N
        add(LB_GifBanhoeTosa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 370, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconeSair.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaPetShop.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, -1));
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

    private void LB_BanhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_BanhoMouseClicked
        Janela.TelaG = new TelaServicoPetShop("Banho");
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaD);
        janela.getContentPane().remove(Janela.TelaD);
        janela.add(Janela.TelaG, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_BanhoMouseClicked

    private void LB_TosaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_TosaMouseClicked
        Janela.TelaG = new TelaServicoPetShop("Tosa");
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaD);
        janela.getContentPane().remove(Janela.TelaD);
        janela.add(Janela.TelaG, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_TosaMouseClicked

    private void LB_BanhoeTosaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_BanhoeTosaMouseClicked
        Janela.TelaG = new TelaServicoPetShop("Banho e Tosa");
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaD);
        janela.getContentPane().remove(Janela.TelaD);
        janela.add(Janela.TelaG, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_BanhoeTosaMouseClicked

    private void LB_ClinicaMedicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_ClinicaMedicaMouseClicked
        Janela.TelaH = new TelaClinicaMedica();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaD);
        janela.getContentPane().remove(Janela.TelaD);
        janela.add(Janela.TelaH, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_ClinicaMedicaMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Janela.TelaA= new TelaLogin();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaG);
        janela.getContentPane().remove(Janela.TelaG);
        janela.add(Janela.TelaA, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void LB_ConfiguracoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_ConfiguracoesMouseClicked
        Janela.TelaJ= new TelaConfiguracoes();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaD);
        janela.getContentPane().remove(Janela.TelaD);
        janela.add(Janela.TelaJ, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_ConfiguracoesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB_Banho;
    private javax.swing.JLabel LB_BanhoeTosa;
    private javax.swing.JLabel LB_ClinicaMedica;
    private javax.swing.JLabel LB_Configuracoes;
    private javax.swing.JLabel LB_GifBanho1;
    private javax.swing.JLabel LB_GifBanho2;
    private javax.swing.JLabel LB_GifBanhoeTosa1;
    private javax.swing.JLabel LB_GifBanhoeTosa2;
    private javax.swing.JLabel LB_GifTosa1;
    private javax.swing.JLabel LB_GifTosa2;
    private javax.swing.JLabel LB_Home;
    private javax.swing.JLabel LB_Tosa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
