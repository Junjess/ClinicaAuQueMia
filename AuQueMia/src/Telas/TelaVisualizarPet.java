package Telas;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class TelaVisualizarPet extends javax.swing.JPanel {
    DefaultTableModel model;
    String url = "jdbc:mysql://localhost:3306";
    String user = "root";
    String password = "";
    
    public TelaVisualizarPet() {
        initComponents();
        model = new DefaultTableModel();
        jTable1.setModel(model);
        model.addColumn("Nome");
        model.addColumn("Espécie");
        model.addColumn("Raça");
        model.addColumn("Idade");
        model.addColumn("Genero");
        inserirDadosNaTabela();
        jTable1.setEnabled(false);
    }
    
    private void inserirDadosNaTabela(){
        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();
            statement.execute("USE mydb");
            
            String query = "SELECT nomeAnimal, especie, raca, idade, genero FROM animal";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String nome = resultSet.getString("nomeAnimal");
                String especie = resultSet.getString("especie");
                String raca = resultSet.getString("raca");
                String idade = resultSet.getString("idade");
                String genero = resultSet.getString("genero");
                model.addRow(new Object[]{nome, especie, raca, idade, genero});
            }

            // Fechando recursos
            resultSet.close();
            preparedStatement.close();
            statement.close();
            connection.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LB_Configuracoes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        LB_PetShop = new javax.swing.JLabel();
        LB_ClinicaMedica = new javax.swing.JLabel();
        LB_Home2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LB_Configuracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconeConfiguracoes.png"))); // NOI18N
        LB_Configuracoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_ConfiguracoesMouseClicked(evt);
            }
        });
        add(LB_Configuracoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 20, -1, -1));

        jTable1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Especie", "Raça", "Idade", "Genero"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 760, 290));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconeSair.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 20, -1, -1));

        LB_PetShop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_PetShopMouseClicked(evt);
            }
        });
        add(LB_PetShop, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 130, 40));

        LB_ClinicaMedica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_ClinicaMedicaMouseClicked(evt);
            }
        });
        add(LB_ClinicaMedica, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, 200, 40));

        LB_Home2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_Home2MouseClicked(evt);
            }
        });
        add(LB_Home2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 80, 40));

        jButton1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(115, 153, 250));
        jButton1.setText("Mudar Informações");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 420, -1, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaVisualizarPets.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Janela.TelaA= new TelaLogin();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaI);
        janela.getContentPane().remove(Janela.TelaI);
        janela.add(Janela.TelaA, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void LB_PetShopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_PetShopMouseClicked
        Janela.TelaD = new TelaPetShop();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaI);
        janela.getContentPane().remove(Janela.TelaI);
        janela.add(Janela.TelaD, BorderLayout.CENTER);
        janela.pack();
        janela.setExtendedState(Janela.MAXIMIZED_BOTH);
    }//GEN-LAST:event_LB_PetShopMouseClicked

    private void LB_ClinicaMedicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_ClinicaMedicaMouseClicked
        Janela.TelaH = new TelaClinicaMedica();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaI);
        janela.getContentPane().remove(Janela.TelaI);
        janela.add(Janela.TelaH, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_ClinicaMedicaMouseClicked

    private void LB_Home2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_Home2MouseClicked
        Janela.TelaC = new TelaHome();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaI);
        janela.getContentPane().remove(Janela.TelaI);
        janela.add(Janela.TelaC, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_Home2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jButton1.getText().equals("Mudar Informações")) {
            jTable1.setEnabled(true);
            jButton1.setText("Confirmar");
        }else{
            try {
                Connection connection = DriverManager.getConnection(url, user, password);
                Statement statement = connection.createStatement();
                statement.execute("USE mydb");

                for (int i = 0; i < model.getRowCount(); i++) {
                    String nome = (String) model.getValueAt(i, 0);
                    String especie = (String) model.getValueAt(i, 1);
                    String raca = (String) model.getValueAt(i, 2);
                    String idade = (String) model.getValueAt(i, 3);
                    String genero = (String) model.getValueAt(i, 4);

                    String query = "UPDATE animal SET especie=?, raca=?, idade=?, genero=? WHERE nomeAnimal=?";
                    PreparedStatement preparedStatement = connection.prepareStatement(query);
                    preparedStatement.setString(1, especie);
                    preparedStatement.setString(2, raca);
                    preparedStatement.setString(3, idade);
                    preparedStatement.setString(4, genero);
                    preparedStatement.setString(5, nome);
                    preparedStatement.executeUpdate();

                    preparedStatement.close();
                }

                statement.close();
                connection.close();
            
                JOptionPane.showMessageDialog(this, "Dados atualizados com sucesso!");
                jButton1.setText("Mudar Informações");
            }catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Erro ao atualizar os dados.");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void LB_ConfiguracoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_ConfiguracoesMouseClicked
        Janela.TelaJ= new TelaConfiguracoes();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaI);
        janela.getContentPane().remove(Janela.TelaI);
        janela.add(Janela.TelaJ, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_ConfiguracoesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB_ClinicaMedica;
    private javax.swing.JLabel LB_Configuracoes;
    private javax.swing.JLabel LB_Home2;
    private javax.swing.JLabel LB_PetShop;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
