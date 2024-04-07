package Telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class TelaClinicaMedica extends javax.swing.JPanel {
    String url = "jdbc:mysql://localhost:3306";
    String user = "root";
    String password = "";
    private int contConsulta = 0;
    private String idAnimal, idVet;
    
    public TelaClinicaMedica() {
        initComponents();
        CB_NomePet.addItem("...");
        CB_NomeVet.addItem("...");
        inserirNomesPet();
        inserirNomesVet();
        acharQuantConsulta();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LB_Configuracoes = new javax.swing.JLabel();
        LB_NomeAnimal = new javax.swing.JLabel();
        CB_NomePet = new javax.swing.JComboBox<>();
        LB_Medico = new javax.swing.JLabel();
        CB_NomeVet = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        LB_Home = new javax.swing.JLabel();
        LB_PetShop = new javax.swing.JLabel();
        LB_Tratamento = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA_Tratamento = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LB_Configuracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconeConfiguracoes.png"))); // NOI18N
        LB_Configuracoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_ConfiguracoesMouseClicked(evt);
            }
        });
        add(LB_Configuracoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 20, -1, -1));

        LB_NomeAnimal.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        LB_NomeAnimal.setForeground(new java.awt.Color(115, 153, 250));
        LB_NomeAnimal.setText("Nome do Animal:");
        add(LB_NomeAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 307, -1, 20));

        CB_NomePet.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        CB_NomePet.setForeground(new java.awt.Color(115, 153, 250));
        add(CB_NomePet, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 240, 30));

        LB_Medico.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        LB_Medico.setForeground(new java.awt.Color(115, 153, 250));
        LB_Medico.setText("Nome do Vet:");
        add(LB_Medico, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 300, -1, 30));

        CB_NomeVet.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        CB_NomeVet.setForeground(new java.awt.Color(115, 153, 250));
        add(CB_NomeVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 300, 240, 30));

        jButton1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(115, 153, 250));
        jButton1.setText("CONFIRMAR SERVIÇO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 530, 280, 60));

        LB_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_HomeMouseClicked(evt);
            }
        });
        add(LB_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 80, 40));

        LB_PetShop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_PetShopMouseClicked(evt);
            }
        });
        add(LB_PetShop, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 130, 40));

        LB_Tratamento.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        LB_Tratamento.setForeground(new java.awt.Color(115, 153, 250));
        LB_Tratamento.setText("Tratamento:");
        add(LB_Tratamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

        TA_Tratamento.setBackground(new java.awt.Color(115, 153, 250));
        TA_Tratamento.setColumns(20);
        TA_Tratamento.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        TA_Tratamento.setForeground(new java.awt.Color(255, 255, 255));
        TA_Tratamento.setRows(5);
        TA_Tratamento.setToolTipText("");
        jScrollPane1.setViewportView(TA_Tratamento);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 240, 120));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconeSair.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaClinicaMedica.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    
    private void acharQuantConsulta(){
        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();
            statement.execute("USE mydb");
            
            String query = "SELECT idConsulta FROM consulta";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                contConsulta = Integer.valueOf(resultSet.getString("idConsulta")) + 1;
            }

            // Fechando recursos
            resultSet.close();
            preparedStatement.close();
            statement.close();
            connection.close();
        }catch (Exception e) {
            e.printStackTrace();
        } 
    }
    
    private void inserirNomesPet(){
        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();
            statement.execute("USE mydb");

            String query = "SELECT nomeAnimal FROM animal";

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String nomeAnimal = resultSet.getString("nomeAnimal");
                CB_NomePet.addItem(nomeAnimal);
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
    
    private void inserirNomesVet(){
        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();
            statement.execute("USE mydb");

            String query = "SELECT nome FROM veterinario";

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String nomeVeterinario = resultSet.getString("nome");
                CB_NomeVet.addItem(nomeVeterinario);
            }

            resultSet.close();
            preparedStatement.close();
            statement.close();
            connection.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }
    
    public void acharIdPet(){
        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();
            statement.execute("USE mydb");

            String nomePet = (String)CB_NomePet.getSelectedItem();
            
            String query = "SELECT idAnimal FROM animal WHERE nomeAnimal = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, nomePet);
            
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                idAnimal = resultSet.getString("idAnimal");
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
    
    public void acharIdVet(){
        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();
            statement.execute("USE mydb");
            
            String nomeVet = (String)CB_NomeVet.getSelectedItem();
            
            String query = "SELECT idVeterinario FROM veterinario WHERE nome = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, nomeVet);
            
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                idVet = resultSet.getString("idVeterinario");
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
    
    public void cleanTF(){
        CB_NomePet.setSelectedIndex(0);
        CB_NomeVet.setSelectedIndex(0);
        TA_Tratamento.setText("");
    }
    
    public void setarLayout(){
        CB_NomePet.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        CB_NomeVet.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setarLayout();
        try {
            if (CB_NomePet.getSelectedIndex() == 0) {
                CB_NomePet.setBorder(BorderFactory.createLineBorder(Color.RED));
            }if (CB_NomeVet.getSelectedIndex() == 0) {
                CB_NomeVet.setBorder(BorderFactory.createLineBorder(Color.RED));
            }if (TA_Tratamento.getText().equals("")) {
                CB_NomeVet.setBorder(BorderFactory.createLineBorder(Color.RED));
            }if (CB_NomePet.getSelectedIndex() == 0 || CB_NomeVet.getSelectedIndex() == 0 || TA_Tratamento.getText().equals("")) {
                throw new Exception("Selecione os campos necessários");
            }
            try {
                Connection connection = DriverManager.getConnection(url, user, password);
                String query = "USE mydb";
                Statement statement = connection.createStatement();
                statement.execute(query);

                acharIdPet();
                acharIdVet();
                query = "INSERT INTO Consulta VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement consulta = connection.prepareStatement(query);
                String id = String.valueOf(contConsulta);
                consulta.setString(1, id);
                //Adicionar horario de emergencia, horario do cadastro + 1 hora
                LocalDateTime agora = LocalDateTime.now();            
                LocalDateTime horaAdicionada = agora.plusHours(1);
                consulta.setString(2, String.valueOf(horaAdicionada));
                consulta.setString(3, "Clinica Medica");
                consulta.setString(4, TA_Tratamento.getText());
                consulta.setString(5, "0");
                consulta.setString(6, idAnimal);
                consulta.setString(7, idVet);
                consulta.execute();
                JOptionPane.showMessageDialog(null, "Consulta cadastrada com Sucesso!");
                contConsulta++;
                cleanTF();
                connection.close();
                consulta.close();
                statement.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void LB_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_HomeMouseClicked
        Janela.TelaC = new TelaHome();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaH);
        janela.getContentPane().remove(Janela.TelaH);
        janela.add(Janela.TelaC, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_HomeMouseClicked

    private void LB_PetShopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_PetShopMouseClicked
        Janela.TelaD = new TelaPetShop();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaH);
        janela.getContentPane().remove(Janela.TelaH);
        janela.add(Janela.TelaD, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_PetShopMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Janela.TelaA= new TelaLogin();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaH);
        janela.getContentPane().remove(Janela.TelaH);
        janela.add(Janela.TelaA, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void LB_ConfiguracoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_ConfiguracoesMouseClicked
        Janela.TelaJ= new TelaConfiguracoes();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaH);
        janela.getContentPane().remove(Janela.TelaH);
        janela.add(Janela.TelaJ, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_ConfiguracoesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_NomePet;
    private javax.swing.JComboBox<String> CB_NomeVet;
    private javax.swing.JLabel LB_Configuracoes;
    private javax.swing.JLabel LB_Home;
    private javax.swing.JLabel LB_Medico;
    private javax.swing.JLabel LB_NomeAnimal;
    private javax.swing.JLabel LB_PetShop;
    private javax.swing.JLabel LB_Tratamento;
    private javax.swing.JTextArea TA_Tratamento;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
