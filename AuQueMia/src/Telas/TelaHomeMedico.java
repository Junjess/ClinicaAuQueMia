package Telas;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class TelaHomeMedico extends javax.swing.JPanel {
    DefaultTableModel model;
    String url = "jdbc:mysql://localhost:3306";
    String user = "root";
    String password = "";
    String nomeVeterinario = "";
    
    public TelaHomeMedico(String cpf) {
        initComponents();        
        model = new DefaultTableModel();
        jTable1.setModel(model);
        model.addColumn("Data/Hora");
        model.addColumn("Descrição");
        model.addColumn("Nome do Pet");
        acharMedico(cpf);
    }

    public void acharMedico(String cpf){
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            
            Statement statement = connection.createStatement();
            statement.execute("USE mydb");
            
            String query = "SELECT idVeterinario, nome FROM veterinario WHERE cpf = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, cpf);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String idMedico = resultSet.getString("idVeterinario");
                nomeVeterinario = resultSet.getString("nome");
                preencherTabela(idMedico);
            } 
            LB_NOME.setText(nomeVeterinario);
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void preencherTabela(String idVet){
    try {
            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();
            statement.execute("USE mydb");
            
            String query = "SELECT dataHora, tratamento, idPet FROM consulta WHERE idVet = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, idVet);
            
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String data = resultSet.getString("dataHora");
                String descricao = resultSet.getString("tratamento");
                String idPet = resultSet.getString("idPet");
                String nomePet = acharPet(idPet);
                model.addRow(new Object[]{data, descricao, nomePet});
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
    
    public String acharPet(String idPet){
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            
            Statement statement = connection.createStatement();
            statement.execute("USE mydb");
            
            String query = "SELECT nomeAnimal FROM animal WHERE idAnimal = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, idPet);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String nomeAnimal = resultSet.getString("nomeAnimal");
                return nomeAnimal;
            } 
            // Fechando recursos
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LB_NOME = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LB_NOME.setFont(new java.awt.Font("Monospaced", 1, 44)); // NOI18N
        LB_NOME.setForeground(new java.awt.Color(255, 255, 255));
        LB_NOME.setText("<NOME>");
        add(LB_NOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, -1, 70));

        jTable1.setBackground(new java.awt.Color(49, 47, 48));
        jTable1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(115, 153, 250));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Data ", "Descrição", "Nome do Pet"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 680, 200));

        jButton1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(115, 153, 250));
        jButton1.setText("<<< VOLTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, 190, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconeSair.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaHomeMedico.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Janela.TelaA= new TelaLogin();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaF);
        janela.getContentPane().remove(Janela.TelaF);
        janela.add(Janela.TelaA, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Janela.TelaA= new TelaLogin();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaF);
        janela.getContentPane().remove(Janela.TelaF);
        janela.add(Janela.TelaA, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB_NOME;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
