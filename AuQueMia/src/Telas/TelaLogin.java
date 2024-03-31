
package Telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.sql.ResultSet;


public class TelaLogin extends javax.swing.JPanel {
    String url = "jdbc:mysql://localhost:3306";
    String user = "root";
    String password = "";
    
    public TelaLogin() {
        initComponents();
        
    }
    
    public void setarLayout(){
        TF_CPF.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        TF_Senha.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LB_CriarConta2 = new javax.swing.JLabel();
        LB_CriarConta1 = new javax.swing.JLabel();
        LB_Usuario = new javax.swing.JLabel();
        RB_Secretaria = new javax.swing.JRadioButton();
        RB_Medico = new javax.swing.JRadioButton();
        TF_Senha = new javax.swing.JTextField();
        LB_Senha = new javax.swing.JLabel();
        TF_CPF = new javax.swing.JTextField();
        LB_CPF = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LB_CriarConta2.setFont(new java.awt.Font("Monospaced", 2, 18)); // NOI18N
        LB_CriarConta2.setForeground(new java.awt.Color(115, 153, 250));
        LB_CriarConta2.setText("aqui");
        LB_CriarConta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_CriarConta2MouseClicked(evt);
            }
        });
        add(LB_CriarConta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 530, -1, 20));

        LB_CriarConta1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        LB_CriarConta1.setForeground(new java.awt.Color(102, 102, 102));
        LB_CriarConta1.setText("Criar conta?");
        add(LB_CriarConta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 530, -1, 20));

        LB_Usuario.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        LB_Usuario.setForeground(new java.awt.Color(115, 153, 250));
        LB_Usuario.setText("Usuário:");
        add(LB_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 360, 140, 60));

        RB_Secretaria.setBackground(new java.awt.Color(255, 255, 255));
        RB_Secretaria.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        RB_Secretaria.setForeground(new java.awt.Color(115, 153, 250));
        RB_Secretaria.setText("Secretária");
        RB_Secretaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB_SecretariaMouseClicked(evt);
            }
        });
        add(RB_Secretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 420, -1, -1));

        RB_Medico.setBackground(new java.awt.Color(255, 255, 255));
        RB_Medico.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        RB_Medico.setForeground(new java.awt.Color(115, 153, 250));
        RB_Medico.setText("Veterinário(a)");
        RB_Medico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB_MedicoMouseClicked(evt);
            }
        });
        add(RB_Medico, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, -1, -1));

        TF_Senha.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        TF_Senha.setForeground(new java.awt.Color(102, 102, 255));
        add(TF_Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, 310, 40));

        LB_Senha.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        LB_Senha.setForeground(new java.awt.Color(115, 153, 250));
        LB_Senha.setText("Senha:");
        add(LB_Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 90, 60));

        TF_CPF.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        TF_CPF.setForeground(new java.awt.Color(102, 102, 255));
        TF_CPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_CPFKeyPressed(evt);
            }
        });
        add(TF_CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 250, 310, 40));

        LB_CPF.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        LB_CPF.setForeground(new java.awt.Color(115, 153, 250));
        LB_CPF.setText("CPF:");
        add(LB_CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 70, 50));

        jButton1.setBackground(new java.awt.Color(115, 153, 250));
        jButton1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ENTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, 240, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaLogin.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void LB_CriarConta2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_CriarConta2MouseClicked
        Janela.TelaB = new TelaCadastro();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaA);
        janela.getContentPane().remove(Janela.TelaA);
        janela.add(Janela.TelaB, BorderLayout.CENTER);
        janela.pack();
        janela.setExtendedState(Janela.MAXIMIZED_BOTH);
        janela.setUndecorated(true);
    }//GEN-LAST:event_LB_CriarConta2MouseClicked

    private void TF_CPFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_CPFKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            TF_CPF.setEditable(false);
        } else {
            TF_CPF.setEditable(true);
        }
    }//GEN-LAST:event_TF_CPFKeyPressed

    private void RB_MedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB_MedicoMouseClicked
        if (RB_Medico.isSelected() == true) {
            RB_Medico.setEnabled(true);
            RB_Secretaria.setEnabled(false);
        }else{
            RB_Medico.setEnabled(true);
            RB_Secretaria.setEnabled(true);
        }
    }//GEN-LAST:event_RB_MedicoMouseClicked

    private void RB_SecretariaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB_SecretariaMouseClicked
        if (RB_Secretaria.isSelected() == true) {
            RB_Secretaria.setEnabled(true);
            RB_Medico.setEnabled(false);
        }else{
            RB_Secretaria.setEnabled(true);
            RB_Medico.setEnabled(true);
        }
    }//GEN-LAST:event_RB_SecretariaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setarLayout();
        try {
            if (TF_CPF.getText().equals("")) {
                TF_CPF.setBorder(BorderFactory.createLineBorder(Color.RED));
            }if (TF_Senha.getText().equals("")) {
                TF_Senha.setBorder(BorderFactory.createLineBorder(Color.RED));
            }if ((RB_Medico.isSelected() == false && RB_Secretaria.isSelected() == false) || TF_CPF.getText().equals("") || TF_Senha.getText().equals("")) {
                throw new Exception("Preencha ou selecione os campos necessários");
            }
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexao realizada com sucesso na base de dados: " + url);
            String query = "USE mydb";
            Statement statement = connection.createStatement();
            statement.execute(query); 
            ResultSet result;
            if (RB_Medico.isSelected()) {
                query = "SELECT * FROM Veterinario WHERE cpf = ? AND senha = ?";
                    PreparedStatement preparedStatement = connection.prepareStatement(query);
                    preparedStatement.setString(1, TF_CPF.getText());
                    preparedStatement.setString(2, TF_Senha.getText());
                    result = preparedStatement.executeQuery();
            }else{
                query = "SELECT * FROM Secretaria WHERE cpf = ? AND senha = ?";
                    PreparedStatement preparedStatement = connection.prepareStatement(query);
                    preparedStatement.setString(1, TF_CPF.getText());
                    preparedStatement.setString(2, TF_Senha.getText());
                    result = preparedStatement.executeQuery();
            }
            if (result.next()) {
                if (RB_Medico.isSelected()) {
                    Janela.TelaF = new TelaHomeMedico(TF_CPF.getText());
                    JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaA);
                    janela.getContentPane().remove(Janela.TelaA);
                    janela.add(Janela.TelaF, BorderLayout.CENTER);
                    janela.pack();
                }else{
                    Janela.TelaC = new TelaHome();
                    JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaA);
                    janela.getContentPane().remove(Janela.TelaA);
                    janela.add(Janela.TelaC, BorderLayout.CENTER);
                    janela.pack();
                }
            }else{
                JOptionPane.showMessageDialog(null, "CPF ou senha inválidos", "Error", JOptionPane.ERROR_MESSAGE);
            }
          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB_CPF;
    private javax.swing.JLabel LB_CriarConta1;
    private javax.swing.JLabel LB_CriarConta2;
    private javax.swing.JLabel LB_Senha;
    private javax.swing.JLabel LB_Usuario;
    private javax.swing.JRadioButton RB_Medico;
    private javax.swing.JRadioButton RB_Secretaria;
    private javax.swing.JTextField TF_CPF;
    private javax.swing.JTextField TF_Senha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
