package Telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class TelaCadastroAnimais extends javax.swing.JPanel {
    String url = "jdbc:mysql://localhost:3306";
    String user = "root";
    String password = "";
    int contAnimais = 0;
    int contClientes = 0;
    
    public TelaCadastroAnimais() {
        initComponents();
        acharQuantAnimal();
        acharQuantCliente();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LB_PetShop = new javax.swing.JLabel();
        LB_Home = new javax.swing.JLabel();
        TF_CPFDono = new javax.swing.JTextField();
        LB_Email = new javax.swing.JLabel();
        TF_Email = new javax.swing.JTextField();
        LB_Telefone = new javax.swing.JLabel();
        TF_Telefone = new javax.swing.JTextField();
        LB_Endereco = new javax.swing.JLabel();
        TF_Endereco = new javax.swing.JTextField();
        TF_NomeDono = new javax.swing.JTextField();
        LB_NomeDono = new javax.swing.JLabel();
        LB_Nome = new javax.swing.JLabel();
        TF_Nome = new javax.swing.JTextField();
        LB_Especie = new javax.swing.JLabel();
        TF_Especie = new javax.swing.JTextField();
        LB_Raca = new javax.swing.JLabel();
        TF_Raca = new javax.swing.JTextField();
        LB_Idade = new javax.swing.JLabel();
        TF_Idade = new javax.swing.JTextField();
        LB_Gênero = new javax.swing.JLabel();
        CB_Genero = new javax.swing.JComboBox<>();
        BT_Cadastrar = new javax.swing.JButton();
        LB_ClinicaMedica = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconeConfiguracoes.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 20, -1, -1));

        LB_PetShop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_PetShopMouseClicked(evt);
            }
        });
        add(LB_PetShop, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 120, 40));

        LB_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_HomeMouseClicked(evt);
            }
        });
        add(LB_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 100, 40));

        TF_CPFDono.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TF_CPFDono.setForeground(new java.awt.Color(102, 102, 255));
        TF_CPFDono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_CPFDonoKeyPressed(evt);
            }
        });
        add(TF_CPFDono, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 240, 260, -1));

        LB_Email.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        LB_Email.setForeground(new java.awt.Color(115, 153, 250));
        LB_Email.setText("Email:");
        add(LB_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 490, 100, 40));

        TF_Email.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TF_Email.setForeground(new java.awt.Color(102, 102, 255));
        TF_Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_EmailKeyPressed(evt);
            }
        });
        add(TF_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 490, 260, -1));

        LB_Telefone.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        LB_Telefone.setForeground(new java.awt.Color(115, 153, 250));
        LB_Telefone.setText("Telefone:");
        add(LB_Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 430, 140, 40));

        TF_Telefone.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TF_Telefone.setForeground(new java.awt.Color(102, 102, 255));
        TF_Telefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_TelefoneKeyPressed(evt);
            }
        });
        add(TF_Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 430, 260, -1));

        LB_Endereco.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        LB_Endereco.setForeground(new java.awt.Color(115, 153, 250));
        LB_Endereco.setText("Endereço:");
        add(LB_Endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 360, 140, 40));

        TF_Endereco.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TF_Endereco.setForeground(new java.awt.Color(102, 102, 255));
        TF_Endereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_EnderecoKeyPressed(evt);
            }
        });
        add(TF_Endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 360, 260, -1));

        TF_NomeDono.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TF_NomeDono.setForeground(new java.awt.Color(102, 102, 255));
        TF_NomeDono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_NomeDonoKeyPressed(evt);
            }
        });
        add(TF_NomeDono, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 300, 260, -1));

        LB_NomeDono.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        LB_NomeDono.setForeground(new java.awt.Color(115, 153, 250));
        LB_NomeDono.setText("Nome do Dono(a):");
        add(LB_NomeDono, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, 200, 40));

        LB_Nome.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        LB_Nome.setForeground(new java.awt.Color(115, 153, 250));
        LB_Nome.setText("Nome:");
        add(LB_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, 60));

        TF_Nome.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TF_Nome.setForeground(new java.awt.Color(102, 102, 255));
        TF_Nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_NomeKeyPressed(evt);
            }
        });
        add(TF_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 270, -1));

        LB_Especie.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        LB_Especie.setForeground(new java.awt.Color(115, 153, 250));
        LB_Especie.setText("Espécie:");
        add(LB_Especie, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, 60));

        TF_Especie.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TF_Especie.setForeground(new java.awt.Color(102, 102, 255));
        TF_Especie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_EspecieKeyPressed(evt);
            }
        });
        add(TF_Especie, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 270, -1));

        LB_Raca.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        LB_Raca.setForeground(new java.awt.Color(115, 153, 250));
        LB_Raca.setText("Raça:");
        add(LB_Raca, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, -1, 40));

        TF_Raca.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TF_Raca.setForeground(new java.awt.Color(102, 102, 255));
        TF_Raca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_RacaKeyPressed(evt);
            }
        });
        add(TF_Raca, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 270, -1));

        LB_Idade.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        LB_Idade.setForeground(new java.awt.Color(115, 153, 250));
        LB_Idade.setText("Idade:");
        add(LB_Idade, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 90, 40));

        TF_Idade.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TF_Idade.setForeground(new java.awt.Color(102, 102, 255));
        TF_Idade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_IdadeKeyPressed(evt);
            }
        });
        add(TF_Idade, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 270, -1));

        LB_Gênero.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        LB_Gênero.setForeground(new java.awt.Color(115, 153, 250));
        LB_Gênero.setText("Gênero:");
        add(LB_Gênero, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 100, 50));

        CB_Genero.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        CB_Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Macho", "Fêmea", " " }));
        add(CB_Genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 270, 30));

        BT_Cadastrar.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        BT_Cadastrar.setForeground(new java.awt.Color(115, 153, 250));
        BT_Cadastrar.setText("FINALIZAR CADASTRO");
        BT_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_CadastrarActionPerformed(evt);
            }
        });
        add(BT_Cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 550, 340, 70));

        LB_ClinicaMedica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_ClinicaMedicaMouseClicked(evt);
            }
        });
        add(LB_ClinicaMedica, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 200, 40));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(115, 153, 250));
        jLabel3.setText("CPF Dono:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 237, -1, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconeSair.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaCadastroPet.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    
    private void acharQuantAnimal(){
        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();
            statement.execute("USE mydb");
            
            String query = "SELECT idAnimal FROM animal";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                if (Integer.valueOf(resultSet.getString("idAnimal")) == null) {
                    contAnimais = 0;
                }else{
                    contAnimais = Integer.valueOf(resultSet.getString("idAnimal")) + 1;
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
    
    private void acharQuantCliente(){
        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();
            statement.execute("USE mydb");
            
            String query = "SELECT idVeterinario FROM veterinario";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                if (Integer.valueOf(resultSet.getString("idVeterinario")) == null) {
                    contAnimais = 0;
                }else{
                    contAnimais = Integer.valueOf(resultSet.getString("idVeterinario")) + 1;
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
        TF_CPFDono.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        TF_Email.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        CB_Genero.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        TF_Idade.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        TF_Endereco.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        TF_NomeDono.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        TF_Especie.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        TF_Raca.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        TF_Telefone.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
    
    public void cleanTF(){
        TF_CPFDono.setText("");
        TF_Email.setText("");
        TF_Endereco.setText("");
        TF_Especie.setText("");
        TF_Idade.setText("");
        TF_Nome.setText("");
        TF_NomeDono.setText("");
        TF_Raca.setText("");
        TF_Telefone.setText("");
        CB_Genero.setSelectedIndex(0);      
    }
    
    private void TF_NomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_NomeKeyPressed
        char c = evt.getKeyChar();
        int keyCode = evt.getKeyCode();
        if (Character.isLetter(c) || keyCode == KeyEvent.VK_SPACE || keyCode == KeyEvent.VK_BACK_SPACE) {
            TF_Nome.setEditable(true);
        } else {
            TF_Nome.setEditable(false);
        }
    }//GEN-LAST:event_TF_NomeKeyPressed

    private void TF_EspecieKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_EspecieKeyPressed
        char c = evt.getKeyChar();
        int keyCode = evt.getKeyCode();
        if (Character.isLetter(c) || keyCode == KeyEvent.VK_SPACE || keyCode == KeyEvent.VK_BACK_SPACE) {
            TF_Nome.setEditable(true);
        } else {
            TF_Nome.setEditable(false);
        }
    }//GEN-LAST:event_TF_EspecieKeyPressed

    private void TF_RacaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_RacaKeyPressed
        char c = evt.getKeyChar();
        int keyCode = evt.getKeyCode();
        if (Character.isLetter(c) || keyCode == KeyEvent.VK_SPACE || keyCode == KeyEvent.VK_BACK_SPACE) {
            TF_Nome.setEditable(true);
        } else {
            TF_Nome.setEditable(false);
        }
    }//GEN-LAST:event_TF_RacaKeyPressed

    private void TF_IdadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_IdadeKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            TF_Idade.setEditable(false);
        } else {
            TF_Idade.setEditable(true);
        }
    }//GEN-LAST:event_TF_IdadeKeyPressed

    private void TF_NomeDonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_NomeDonoKeyPressed
        char c = evt.getKeyChar();
        int keyCode = evt.getKeyCode();
        if (Character.isLetter(c) || keyCode == KeyEvent.VK_SPACE || keyCode == KeyEvent.VK_BACK_SPACE) {
            TF_Nome.setEditable(true);
        } else {
            TF_Nome.setEditable(false);
        }
    }//GEN-LAST:event_TF_NomeDonoKeyPressed

    private void TF_EnderecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_EnderecoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_EnderecoKeyPressed

    private void TF_TelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_TelefoneKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            TF_Telefone.setEditable(false);
        } else {
            TF_Telefone.setEditable(true);
        }
    }//GEN-LAST:event_TF_TelefoneKeyPressed

    private void TF_EmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_EmailKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_EmailKeyPressed

    private void BT_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CadastrarActionPerformed
        setarLayout();
        try {
            if (TF_Nome.getText().equals("")) {
                TF_Nome.setBorder(BorderFactory.createLineBorder(Color.RED));
            }if (TF_CPFDono.getText().equals("")) {
                TF_CPFDono.setBorder(BorderFactory.createLineBorder(Color.RED));
            }if (TF_Email.getText().equals("")) {
                TF_Email.setBorder(BorderFactory.createLineBorder(Color.RED));
            }if (CB_Genero.getSelectedIndex() == 0) {
                CB_Genero.setBorder(BorderFactory.createLineBorder(Color.RED));
            }if (TF_Idade.getText().equals("")) {
                TF_Idade.setBorder(BorderFactory.createLineBorder(Color.RED));
            }if (TF_Endereco.getText().equals("")) {
                TF_Endereco.setBorder(BorderFactory.createLineBorder(Color.RED));
            }if (TF_NomeDono.getText().equals("")) {
                TF_NomeDono.setBorder(BorderFactory.createLineBorder(Color.RED));
            }if (TF_Especie.getText().equals("")) {
                TF_Especie.setBorder(BorderFactory.createLineBorder(Color.RED));
            }if (TF_Telefone.getText().equals("")) {
                TF_Telefone.setBorder(BorderFactory.createLineBorder(Color.RED));
            }if (TF_Raca.getText().equals("")) {
                TF_Raca.setBorder(BorderFactory.createLineBorder(Color.RED));
            }if ((TF_CPFDono.getText().equals("")|| TF_Nome.getText().equals("") || TF_Email.getText().equals("") || 
                    TF_NomeDono.getText().equals("") || TF_Idade.getText().equals("") || CB_Genero.getSelectedIndex() == 0 || TF_Endereco.getText().equals("")
                    || TF_Especie.getText().equals("") || TF_Raca.getText().equals("") || TF_Telefone.getText().equals(""))) {
                throw new Exception("Preencha ou selecione os campos necessários");
            }
            
            try {
                Connection connection = DriverManager.getConnection(url, user, password);
                System.out.println("Conexao realizada com sucesso na base de dados: " + url);
                String query = "USE mydb";
                Statement statement = connection.createStatement();
                statement.execute(query);   
                
                
                query = "INSERT INTO Cliente VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement consulta = connection.prepareStatement(query);
                String idAnimais = String.valueOf(contAnimais);
                String idCliente = String.valueOf(contClientes);
                consulta.setString(1, idCliente);
                consulta.setString(2, TF_NomeDono.getText());
                consulta.setString(3, TF_Endereco.getText());
                consulta.setString(4, TF_Telefone.getText());
                consulta.setString(5, TF_Email.getText());
                consulta.setString(6, TF_CPFDono.getText());
                consulta.execute();
                
                query = "INSERT INTO Animal VALUES (?, ?, ?, ?, ?, ?, ?)";
                consulta = connection.prepareStatement(query);                
                consulta.setString(1, idAnimais);
                consulta.setString(2, TF_Nome.getText());
                consulta.setString(3, TF_Especie.getText());
                consulta.setString(4, TF_Raca.getText());
                consulta.setString(5, TF_Idade.getText());
                consulta.setString(6, (String) CB_Genero.getSelectedItem());
                consulta.setString(7, idCliente);
                consulta.execute();
                
                
                contAnimais++;
                contClientes++;
                JOptionPane.showMessageDialog(null, "Animal e Dono Cadastrado com Sucesso!");
                cleanTF();
                connection.close();  
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_BT_CadastrarActionPerformed

    private void LB_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_HomeMouseClicked
        Janela.TelaC = new TelaHome();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaE);
        janela.getContentPane().remove(Janela.TelaE);
        janela.add(Janela.TelaC, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_HomeMouseClicked

    private void TF_CPFDonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_CPFDonoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_CPFDonoKeyPressed

    private void LB_PetShopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_PetShopMouseClicked
        Janela.TelaD = new TelaPetShop();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaE);
        janela.getContentPane().remove(Janela.TelaE);
        janela.add(Janela.TelaD, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_PetShopMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Janela.TelaA= new TelaLogin();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaE);
        janela.getContentPane().remove(Janela.TelaE);
        janela.add(Janela.TelaA, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Janela.TelaJ= new TelaConfiguracoes();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaE);
        janela.getContentPane().remove(Janela.TelaE);
        janela.add(Janela.TelaJ, BorderLayout.CENTER);
        janela.pack(); 
    }//GEN-LAST:event_jLabel1MouseClicked

    private void LB_ClinicaMedicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_ClinicaMedicaMouseClicked
        Janela.TelaH = new TelaClinicaMedica();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaE);
        janela.getContentPane().remove(Janela.TelaE);
        janela.add(Janela.TelaH, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_ClinicaMedicaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Cadastrar;
    private javax.swing.JComboBox<String> CB_Genero;
    private javax.swing.JLabel LB_ClinicaMedica;
    private javax.swing.JLabel LB_Email;
    private javax.swing.JLabel LB_Endereco;
    private javax.swing.JLabel LB_Especie;
    private javax.swing.JLabel LB_Gênero;
    private javax.swing.JLabel LB_Home;
    private javax.swing.JLabel LB_Idade;
    private javax.swing.JLabel LB_Nome;
    private javax.swing.JLabel LB_NomeDono;
    private javax.swing.JLabel LB_PetShop;
    private javax.swing.JLabel LB_Raca;
    private javax.swing.JLabel LB_Telefone;
    private javax.swing.JTextField TF_CPFDono;
    private javax.swing.JTextField TF_Email;
    private javax.swing.JTextField TF_Endereco;
    private javax.swing.JTextField TF_Especie;
    private javax.swing.JTextField TF_Idade;
    private javax.swing.JTextField TF_Nome;
    private javax.swing.JTextField TF_NomeDono;
    private javax.swing.JTextField TF_Raca;
    private javax.swing.JTextField TF_Telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
