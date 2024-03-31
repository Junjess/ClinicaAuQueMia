package Telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class TelaServicoPetShop extends javax.swing.JPanel {
    private DefaultListModel model;
    String url = "jdbc:mysql://localhost:3306";
    String user = "root";
    String password = "";
    private int contConsulta = 0;
    private String servico, idAnimal, idVet;
    private List<String> listaHorariosUsados;
    
    public TelaServicoPetShop(String servico) {
        initComponents();
        listaHorariosUsados = new ArrayList<>();         
        this.servico = servico;
        verificarServico(servico);
        model = new DefaultListModel();
        jList1.setModel(model);
        inserirHorarioTabela();  
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
        LB_PetShop = new javax.swing.JLabel();
        LB_Home = new javax.swing.JLabel();
        LB_Banho = new javax.swing.JLabel();
        LB_Tosa = new javax.swing.JLabel();
        LB_BanhoTosa = new javax.swing.JLabel();
        LB_Medico = new javax.swing.JLabel();
        LB_NomeAnimal = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        CB_NomeVet = new javax.swing.JComboBox<>();
        CB_NomePet = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        LB_ClinicaMedica1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LB_Configuracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconeConfiguracoes.png"))); // NOI18N
        LB_Configuracoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_ConfiguracoesMouseClicked(evt);
            }
        });
        add(LB_Configuracoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 20, -1, -1));

        LB_PetShop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_PetShopMouseClicked(evt);
            }
        });
        add(LB_PetShop, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 120, 40));

        LB_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_HomeMouseClicked(evt);
            }
        });
        add(LB_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 80, 40));

        LB_Banho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LogoBanho.png"))); // NOI18N
        add(LB_Banho, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, -1, -1));

        LB_Tosa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LogoTosa.png"))); // NOI18N
        add(LB_Tosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, -1, -1));

        LB_BanhoTosa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LogoBanhoTosa.png"))); // NOI18N
        add(LB_BanhoTosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, -1, -1));

        LB_Medico.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        LB_Medico.setForeground(new java.awt.Color(115, 153, 250));
        LB_Medico.setText("Nome do Vet:");
        add(LB_Medico, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 300, -1, 30));

        LB_NomeAnimal.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        LB_NomeAnimal.setForeground(new java.awt.Color(115, 153, 250));
        LB_NomeAnimal.setText("Nome do Animal:");
        add(LB_NomeAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 307, -1, 20));

        jButton1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(115, 153, 250));
        jButton1.setText("CONFIRMAR SERVIÇO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 530, 280, 60));

        CB_NomeVet.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        CB_NomeVet.setForeground(new java.awt.Color(115, 153, 250));
        CB_NomeVet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CB_NomeVetMouseClicked(evt);
            }
        });
        add(CB_NomeVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 300, 240, 30));

        CB_NomePet.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        CB_NomePet.setForeground(new java.awt.Color(115, 153, 250));
        add(CB_NomePet, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 240, 30));

        jList1.setBackground(new java.awt.Color(115, 153, 250));
        jList1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jList1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 400, 120));

        LB_ClinicaMedica1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_ClinicaMedica1MouseClicked(evt);
            }
        });
        add(LB_ClinicaMedica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 200, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconeSair.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaServicoPetShop.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    public void verificarHorario(String horario){
        LocalDate data = LocalDate.now();
        if (listaHorariosUsados.size() > 0) {
            for (int i = 0; i < listaHorariosUsados.size(); i++) {
                if (!(data.toString() + horario).equals(listaHorariosUsados.get(i))) {
                    model.addElement(data.toString() + horario);
                }
            }
        }else{
            model.addElement(data.toString() + horario);
        }
        
    }
    public void inserirHorarioTabela(){                
        verificarHorario(" 09:00:00");
        verificarHorario(" 10:00:00");
        verificarHorario(" 11:00:00");
        verificarHorario(" 14:00:00");
        verificarHorario(" 15:00:00");
        verificarHorario(" 16:00:00");                                        
    }
    
    public void acharQuantConsulta(){
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
    
    public void inserirNomesPet(){
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
    
    public void inserirNomesVet(){
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
        model.removeAllElements();
    }
    
    public void setarLayout(){
        CB_NomePet.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        CB_NomeVet.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
    
    public void verificarServico(String servico){
        if (servico.equals("Banho")) {
            LB_Banho.setVisible(true);
            LB_Tosa.setVisible(false);
            LB_BanhoTosa.setVisible(false);
        }else if(servico.equals("Tosa")){
            LB_Banho.setVisible(false);
            LB_Tosa.setVisible(true);
            LB_BanhoTosa.setVisible(false);
        }else{
            LB_Banho.setVisible(false);
            LB_Tosa.setVisible(false);
            LB_BanhoTosa.setVisible(true);
        }
    }
    
    private void LB_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_HomeMouseClicked
        Janela.TelaC = new TelaHome();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaG);
        janela.getContentPane().remove(Janela.TelaG);
        janela.add(Janela.TelaC, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_HomeMouseClicked

    private void LB_PetShopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_PetShopMouseClicked
        Janela.TelaD = new TelaPetShop();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaG);
        janela.getContentPane().remove(Janela.TelaG);
        janela.add(Janela.TelaD, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_PetShopMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setarLayout();
        try {
            if (CB_NomePet.getSelectedIndex() == 0) {
                CB_NomePet.setBorder(BorderFactory.createLineBorder(Color.RED));
            }if (CB_NomeVet.getSelectedIndex() == 0) {
                CB_NomeVet.setBorder(BorderFactory.createLineBorder(Color.RED));
            }if (CB_NomePet.getSelectedIndex() == 0 || CB_NomeVet.getSelectedIndex() == 0) {
                throw new Exception("Selecione os campos necessários");
            }
            try {
                Connection connection = DriverManager.getConnection(url, user, password);
                System.out.println("Conexao realizada com sucesso na base de dados: " + url);
                String query = "USE mydb";
                Statement statement = connection.createStatement();
                statement.execute(query);
                
                acharIdPet();
                acharIdVet();
                query = "INSERT INTO Consulta VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement consulta = connection.prepareStatement(query);
                String id = String.valueOf(contConsulta);
                consulta.setString(1, id);
                consulta.setString(2, String.valueOf(jList1.getSelectedValue()));
                listaHorariosUsados.add(jList1.getSelectedValue());
                consulta.setString(3, "Pet Shop");
                consulta.setString(4, servico);
                consulta.setString(5, "60");                    
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

    private void CB_NomeVetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CB_NomeVetMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_NomeVetMouseClicked

    private void LB_ClinicaMedica1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_ClinicaMedica1MouseClicked
        Janela.TelaH = new TelaClinicaMedica();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaG);
        janela.getContentPane().remove(Janela.TelaG);
        janela.add(Janela.TelaH, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_ClinicaMedica1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Janela.TelaA= new TelaLogin();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaG);
        janela.getContentPane().remove(Janela.TelaG);
        janela.add(Janela.TelaA, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void LB_ConfiguracoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_ConfiguracoesMouseClicked
        Janela.TelaJ= new TelaConfiguracoes();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaG);
        janela.getContentPane().remove(Janela.TelaG);
        janela.add(Janela.TelaJ, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_ConfiguracoesMouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_NomePet;
    private javax.swing.JComboBox<String> CB_NomeVet;
    private javax.swing.JLabel LB_Banho;
    private javax.swing.JLabel LB_BanhoTosa;
    private javax.swing.JLabel LB_ClinicaMedica1;
    private javax.swing.JLabel LB_Configuracoes;
    private javax.swing.JLabel LB_Home;
    private javax.swing.JLabel LB_Medico;
    private javax.swing.JLabel LB_NomeAnimal;
    private javax.swing.JLabel LB_PetShop;
    private javax.swing.JLabel LB_Tosa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}