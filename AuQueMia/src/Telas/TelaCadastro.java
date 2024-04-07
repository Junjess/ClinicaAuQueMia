package Telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class TelaCadastro extends javax.swing.JPanel {
    
    String url = "jdbc:mysql://localhost:3306";
    String user = "root";
    String password = "";
    
    int contVeterinario = 0;
    int contSecretaria = 0;
        
    public TelaCadastro() {
        initComponents();
        jComboBox1.addItem("...");
        jComboBox1.addItem("Masculino");
        jComboBox1.addItem("Feminino");
        jComboBox1.addItem("Outro");
        TF_CRMV.setEnabled(false);
        acharQuantSecreataria();
        acharQuantVeterinario();
    }
    
    private String formatarDataDeNascimento(String dataNasc){
        DateTimeFormatter formatoEntrada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoSaida = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate data = LocalDate.parse(dataNasc, formatoEntrada);
        String dataFormatada = data.format(formatoSaida);
        return dataFormatada;
    }
    
    public void acharQuantVeterinario(){
        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();
            statement.execute("USE mydb");
           
            String query = "SELECT idVeterinario FROM veterinario";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
           
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                if (Integer.valueOf(resultSet.getString("idVeterinario")) == null) {
                    contVeterinario = 1;
                }else{
                    contVeterinario = Integer.valueOf(resultSet.getString("idVeterinario")) + 1;
                }     
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
   
    public void acharQuantSecreataria(){
        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();
            statement.execute("USE mydb");
           
            String query = "SELECT idSecretaria FROM secretaria";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
           
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                if (Integer.valueOf(resultSet.getString("idSecretaria")) == null) {
                    contSecretaria = 1;
                }else{
                    contSecretaria = Integer.valueOf(resultSet.getString("idSecretaria")) + 1;
                }   
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
   
    
    public void setarLayout(){
        TF_Nome.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        TF_CPF.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        TF_Email.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jComboBox1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        TF_DataNasc.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        TF_Endereço.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        TF_CRMV.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        TF_Senha1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        TF_Senha.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
    
    public void cleanTF(){
        TF_CPF.setText("");
        TF_CRMV.setText("");
        TF_DataNasc.setText("");
        TF_Email.setText("");
        TF_Endereço.setText("");
        TF_Nome.setText("");
        TF_Senha.setText("");
        TF_Senha1.setText("");
        TF_Telefone.setText("");
        jComboBox1.setSelectedIndex(0);
        RB_Medico.setSelected(false);
        RB_Secretaria.setSelected(false);        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LB_DataNasc1 = new javax.swing.JLabel();
        TF_Nome = new javax.swing.JTextField();
        LB_Nome = new javax.swing.JLabel();
        TF_CPF = new javax.swing.JTextField();
        LB_CPF = new javax.swing.JLabel();
        TF_Senha = new javax.swing.JTextField();
        LB_Senha = new javax.swing.JLabel();
        TF_Email = new javax.swing.JTextField();
        LB_Email = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        LB_Genero = new javax.swing.JLabel();
        TF_DataNasc = new javax.swing.JTextField();
        LB_DataNasc = new javax.swing.JLabel();
        TF_Endereço = new javax.swing.JTextField();
        LB_Endereço = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LB_Usuário = new javax.swing.JLabel();
        RB_Medico = new javax.swing.JRadioButton();
        RB_Secretaria = new javax.swing.JRadioButton();
        TF_CRMV = new javax.swing.JTextField();
        LB_CRMV = new javax.swing.JLabel();
        TF_Senha1 = new javax.swing.JTextField();
        LB_Senha1 = new javax.swing.JLabel();
        LB_Telefone = new javax.swing.JLabel();
        TF_Telefone = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LB_DataNasc1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        LB_DataNasc1.setForeground(new java.awt.Color(255, 255, 255));
        LB_DataNasc1.setText("DD/MM/YYYY");
        add(LB_DataNasc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 90, 30));

        TF_Nome.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TF_Nome.setForeground(new java.awt.Color(102, 102, 255));
        TF_Nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_NomeKeyPressed(evt);
            }
        });
        add(TF_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 270, 30));

        LB_Nome.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        LB_Nome.setForeground(new java.awt.Color(255, 255, 255));
        LB_Nome.setText("Nome:");
        add(LB_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, 60));

        TF_CPF.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TF_CPF.setForeground(new java.awt.Color(102, 102, 255));
        TF_CPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_CPFKeyPressed(evt);
            }
        });
        add(TF_CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 270, 30));

        LB_CPF.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        LB_CPF.setForeground(new java.awt.Color(255, 255, 255));
        LB_CPF.setText("CPF:");
        add(LB_CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 70, 50));

        TF_Senha.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TF_Senha.setForeground(new java.awt.Color(102, 102, 255));
        add(TF_Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, 200, 30));

        LB_Senha.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        LB_Senha.setForeground(new java.awt.Color(255, 255, 255));
        LB_Senha.setText("Senha:");
        add(LB_Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 90, 50));

        TF_Email.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TF_Email.setForeground(new java.awt.Color(102, 102, 255));
        add(TF_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 270, 30));

        LB_Email.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        LB_Email.setForeground(new java.awt.Color(255, 255, 255));
        LB_Email.setText("Email:");
        add(LB_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, 50));

        jComboBox1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(102, 102, 255));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, 270, 30));

        LB_Genero.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        LB_Genero.setForeground(new java.awt.Color(255, 255, 255));
        LB_Genero.setText("Gênero:");
        add(LB_Genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 110, 30));

        TF_DataNasc.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TF_DataNasc.setForeground(new java.awt.Color(102, 102, 255));
        TF_DataNasc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_DataNascKeyPressed(evt);
            }
        });
        add(TF_DataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 270, 30));

        LB_DataNasc.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        LB_DataNasc.setForeground(new java.awt.Color(255, 255, 255));
        LB_DataNasc.setText("Data Nasc:");
        add(LB_DataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, 30));

        TF_Endereço.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TF_Endereço.setForeground(new java.awt.Color(102, 102, 255));
        add(TF_Endereço, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 270, 30));

        LB_Endereço.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        LB_Endereço.setForeground(new java.awt.Color(255, 255, 255));
        LB_Endereço.setText("Endereço:");
        add(LB_Endereço, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 130, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LB_Usuário.setBackground(new java.awt.Color(255, 255, 255));
        LB_Usuário.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        LB_Usuário.setForeground(new java.awt.Color(115, 153, 250));
        LB_Usuário.setText("SELECIONE O USUÁRIO:");
        jPanel1.add(LB_Usuário, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 230, 30));

        RB_Medico.setBackground(new java.awt.Color(255, 255, 255));
        RB_Medico.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        RB_Medico.setForeground(new java.awt.Color(115, 153, 250));
        RB_Medico.setText("Veterinário(a)");
        RB_Medico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB_MedicoMouseClicked(evt);
            }
        });
        RB_Medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_MedicoActionPerformed(evt);
            }
        });
        jPanel1.add(RB_Medico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 160, -1));

        RB_Secretaria.setBackground(new java.awt.Color(255, 255, 255));
        RB_Secretaria.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        RB_Secretaria.setForeground(new java.awt.Color(115, 153, 250));
        RB_Secretaria.setText("Secretária");
        RB_Secretaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB_SecretariaMouseClicked(evt);
            }
        });
        jPanel1.add(RB_Secretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 120, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 310, 90));

        TF_CRMV.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TF_CRMV.setForeground(new java.awt.Color(102, 102, 255));
        TF_CRMV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_CRMVKeyPressed(evt);
            }
        });
        add(TF_CRMV, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 270, 30));

        LB_CRMV.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        LB_CRMV.setForeground(new java.awt.Color(255, 255, 255));
        LB_CRMV.setText("CRMV:");
        add(LB_CRMV, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 70, 50));

        TF_Senha1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TF_Senha1.setForeground(new java.awt.Color(102, 102, 255));
        TF_Senha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_Senha1ActionPerformed(evt);
            }
        });
        add(TF_Senha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 520, 270, 30));

        LB_Senha1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        LB_Senha1.setForeground(new java.awt.Color(255, 255, 255));
        LB_Senha1.setText("Repita a Senha:");
        add(LB_Senha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, 170, 50));

        LB_Telefone.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        LB_Telefone.setForeground(new java.awt.Color(255, 255, 255));
        LB_Telefone.setText("Telefone:");
        add(LB_Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, -1, 30));

        TF_Telefone.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TF_Telefone.setForeground(new java.awt.Color(102, 102, 255));
        TF_Telefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_TelefoneKeyPressed(evt);
            }
        });
        add(TF_Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 270, 30));

        jButton1.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(115, 153, 250));
        jButton1.setText("FINALIZAR CADASTRO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 570, 210, 50));

        jButton3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(115, 153, 250));
        jButton3.setText("<<< VOLTAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 570, 210, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaCadastro.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void TF_NomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_NomeKeyPressed
        char c = evt.getKeyChar();
        int keyCode = evt.getKeyCode();
        if (Character.isLetter(c) || keyCode == KeyEvent.VK_SPACE || keyCode == KeyEvent.VK_BACK_SPACE) {
            TF_Nome.setEditable(true);
        } else {
            TF_Nome.setEditable(false);
        }
    }//GEN-LAST:event_TF_NomeKeyPressed

    private void TF_CPFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_CPFKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            TF_CPF.setEditable(false);
        } else {
            TF_CPF.setEditable(true);
        }
    }//GEN-LAST:event_TF_CPFKeyPressed

    private void TF_DataNascKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_DataNascKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            TF_DataNasc.setEditable(false);
        } else {
            TF_DataNasc.setEditable(true);
        }
    }//GEN-LAST:event_TF_DataNascKeyPressed

    private void TF_CRMVKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_CRMVKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            TF_CRMV.setEditable(false);
        } else {
            TF_CRMV.setEditable(true);
        }
    }//GEN-LAST:event_TF_CRMVKeyPressed

    private void RB_MedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB_MedicoMouseClicked
        if (RB_Medico.isSelected() == true) {
            RB_Medico.setEnabled(true);
            RB_Secretaria.setEnabled(false);
            TF_CRMV.setEnabled(true);
        }else{
            RB_Medico.setEnabled(true);
            RB_Secretaria.setEnabled(true);
            TF_CRMV.setEnabled(false);
        }
    }//GEN-LAST:event_RB_MedicoMouseClicked

    private void RB_SecretariaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB_SecretariaMouseClicked
        if (RB_Secretaria.isSelected() == true) {
            RB_Secretaria.setEnabled(true);
            RB_Medico.setEnabled(false);
            TF_CRMV.setEnabled(false);
        }else{
            RB_Secretaria.setEnabled(true);
            RB_Medico.setEnabled(true);
            TF_CRMV.setEnabled(true);
        }
    }//GEN-LAST:event_RB_SecretariaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setarLayout();
        try {
            if (TF_CPF.getText().length() > 14 || TF_CPF.getText().length() < 14) {
                throw new Exception("Informe um CPF verdadeiro");
            }if (TF_Nome.getText().equals("")) {
                TF_Nome.setBorder(BorderFactory.createLineBorder(Color.RED));
            }if (TF_CPF.getText().equals("")) {
                TF_CPF.setBorder(BorderFactory.createLineBorder(Color.RED));
            }if (TF_Email.getText().equals("")) {
                TF_Email.setBorder(BorderFactory.createLineBorder(Color.RED));
            }if (jComboBox1.getSelectedIndex() == 0) {
                jComboBox1.setBorder(BorderFactory.createLineBorder(Color.RED));
            }if (TF_DataNasc.getText().equals("")) {
                TF_DataNasc.setBorder(BorderFactory.createLineBorder(Color.RED));
            }if (TF_Endereço.getText().equals("")) {
                TF_Endereço.setBorder(BorderFactory.createLineBorder(Color.RED));
            }if (TF_Senha1.getText().equals("")) {
                TF_Senha1.setBorder(BorderFactory.createLineBorder(Color.RED));
            }if (TF_Senha.getText().equals("")) {
                TF_Senha.setBorder(BorderFactory.createLineBorder(Color.RED));
            }if (TF_Telefone.getText().equals("")) {
                TF_Telefone.setBorder(BorderFactory.createLineBorder(Color.RED));
            }if ((RB_Medico.isSelected() == false && RB_Secretaria.isSelected() == false) || TF_CPF.getText().equals("") || TF_Senha.getText().equals("") || 
                    TF_Nome.getText().equals("") || TF_Email.getText().equals("") || jComboBox1.getSelectedIndex() == 0 || TF_DataNasc.getText().equals("")
                    || TF_Endereço.getText().equals("") || TF_Senha1.getText().equals("") || TF_Telefone.getText().equals("")) {
                throw new Exception("Preencha ou selecione os campos necessários");
            }if (!TF_Senha1.getText().equals(TF_Senha.getText())) {
                throw new Exception("As senhas se divergem");
            }
            try {
                Connection connection = DriverManager.getConnection(url, user, password);
                String query = "USE mydb";
                Statement statement = connection.createStatement();
                statement.execute(query);                
                
                if (RB_Medico.isSelected()) {   
                    if (TF_CRMV.getText().equals("")) {
                        TF_CRMV.setBorder(BorderFactory.createLineBorder(Color.RED));
                        throw new Exception("Preencha ou selecione os campos necessários");
                    }
                    query = "INSERT INTO Veterinario VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement consulta = connection.prepareStatement(query);
                    String id = String.valueOf(contVeterinario);
                    consulta.setString(1, id);
                    consulta.setString(2, TF_Nome.getText());
                    consulta.setString(3, TF_Endereço.getText());
                    consulta.setString(4, TF_Telefone.getText());
                    consulta.setString(5, TF_Email.getText());
                    consulta.setString(6, (String) jComboBox1.getSelectedItem());
                    consulta.setString(7, TF_CRMV.getText());
                    consulta.setString(8, formatarDataDeNascimento(TF_DataNasc.getText()));
                    consulta.setString(9, TF_Senha.getText());
                    consulta.setString(10, TF_CPF.getText());
                    consulta.execute();
                    contVeterinario++;
                    JOptionPane.showMessageDialog(null, "Médico Cadastrado com Sucesso!");
                    cleanTF();
                }else{
                    query = "INSERT INTO Secretaria VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement consulta = connection.prepareStatement(query);
                    String id = String.valueOf(contSecretaria);
                    consulta.setString(1, id);
                    consulta.setString(2, TF_Nome.getText());
                    consulta.setString(3, TF_Endereço.getText());
                    consulta.setString(4, TF_Telefone.getText());
                    consulta.setString(5, TF_Email.getText());
                    consulta.setString(6, (String) jComboBox1.getSelectedItem());
                    consulta.setString(7, formatarDataDeNascimento(TF_DataNasc.getText()));
                    consulta.setString(8, TF_Senha.getText());
                    consulta.setString(9, TF_CPF.getText());
                    consulta.execute();
                    contSecretaria++;
                    JOptionPane.showMessageDialog(null, "Secretária Cadastrado com Sucesso!");
                    cleanTF();
                }
                connection.close();                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TF_TelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_TelefoneKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            TF_Telefone.setEditable(false);
        } else {
            TF_Telefone.setEditable(true);
        }
    }//GEN-LAST:event_TF_TelefoneKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Janela.TelaA = new TelaLogin();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaB);
        janela.getContentPane().remove(Janela.TelaB);
        janela.add(Janela.TelaA, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void RB_MedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_MedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RB_MedicoActionPerformed

    private void TF_Senha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_Senha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_Senha1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB_CPF;
    private javax.swing.JLabel LB_CRMV;
    private javax.swing.JLabel LB_DataNasc;
    private javax.swing.JLabel LB_DataNasc1;
    private javax.swing.JLabel LB_Email;
    private javax.swing.JLabel LB_Endereço;
    private javax.swing.JLabel LB_Genero;
    private javax.swing.JLabel LB_Nome;
    private javax.swing.JLabel LB_Senha;
    private javax.swing.JLabel LB_Senha1;
    private javax.swing.JLabel LB_Telefone;
    private javax.swing.JLabel LB_Usuário;
    private javax.swing.JRadioButton RB_Medico;
    private javax.swing.JRadioButton RB_Secretaria;
    private javax.swing.JTextField TF_CPF;
    private javax.swing.JTextField TF_CRMV;
    private javax.swing.JTextField TF_DataNasc;
    private javax.swing.JTextField TF_Email;
    private javax.swing.JTextField TF_Endereço;
    private javax.swing.JTextField TF_Nome;
    private javax.swing.JTextField TF_Senha;
    private javax.swing.JTextField TF_Senha1;
    private javax.swing.JTextField TF_Telefone;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
