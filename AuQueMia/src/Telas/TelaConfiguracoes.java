package Telas;

import java.awt.BorderLayout;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class TelaConfiguracoes extends javax.swing.JPanel {
    DefaultTableModel model1;
    String url = "jdbc:mysql://localhost:3306";
    String user = "root";
    String password = "";
    
    public TelaConfiguracoes() {
        initComponents();
        setarTabelas();
        LB_SetaBaixoVeterinario.setVisible(false);
        LB_SetaBaixoSecretaria.setVisible(false);  
        inserirDadosNaTabela();
        TB_Info.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LB_CadastroSecretaria = new javax.swing.JLabel();
        LB_CadastroVeterinario = new javax.swing.JLabel();
        LB_SetaBaixoSecretaria = new javax.swing.JLabel();
        LB_SetaBaixoVeterinario = new javax.swing.JLabel();
        LB_SetaDireitaSecretaria = new javax.swing.JLabel();
        LB_SetaDireitaVeterinario = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB_Info = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LB_CadastroSecretaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_CadastroSecretariaMouseClicked(evt);
            }
        });
        add(LB_CadastroSecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 300, 30));

        LB_CadastroVeterinario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_CadastroVeterinarioMouseClicked(evt);
            }
        });
        add(LB_CadastroVeterinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 310, 30));

        LB_SetaBaixoSecretaria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/SetaPraBaixoConfiguracoes.png"))); // NOI18N
        add(LB_SetaBaixoSecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        LB_SetaBaixoVeterinario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/SetaPraBaixoConfiguracoes.png"))); // NOI18N
        add(LB_SetaBaixoVeterinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, 30));

        LB_SetaDireitaSecretaria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/SetaPraDireitaConfiguracoes.png"))); // NOI18N
        add(LB_SetaDireitaSecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        LB_SetaDireitaVeterinario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/SetaPraDireitaConfiguracoes.png"))); // NOI18N
        add(LB_SetaDireitaVeterinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, 30));

        jButton1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(115, 153, 250));
        jButton1.setText("Mudar Informações");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 640, -1, 60));

        TB_Info.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        TB_Info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Endereco", "Telefone", "Email", "Genero", "CRMV", "Data Nasc", "Senha", "CPF"
            }
        ));
        jScrollPane1.setViewportView(TB_Info);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 880, 290));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconeSair.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaConfiguracoes.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    
    private String formatarDataDeNascimento(String dataNasc){
        DateTimeFormatter formatoEntrada = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatoSaida = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dataNasc, formatoEntrada);
        String dataFormatada = data.format(formatoSaida);
        return dataFormatada;
    }
    
    private String formatarDataDeNascimentoBancoDeDados(String dataNasc){
        DateTimeFormatter formatoEntrada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoSaida = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate data = LocalDate.parse(dataNasc, formatoEntrada);
        String dataFormatada = data.format(formatoSaida);
        return dataFormatada;
    }
    
    private void inserirDadosNaTabela(){
        if (LB_SetaBaixoVeterinario.isVisible()) {
            for (int i = 0; i < model1.getRowCount(); i++) {
                model1.removeRow(i);
            }
            try {
                Connection connection = DriverManager.getConnection(url, user, password);

                Statement statement = connection.createStatement();
                statement.execute("USE mydb");

                String query = "SELECT nome, endereco, telefone, email, genero, crmv, dataNasc, senha, cpf FROM veterinario";

                PreparedStatement preparedStatement = connection.prepareStatement(query);

                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    String nome = resultSet.getString("nome");
                    String endereco = resultSet.getString("endereco");
                    String telefone = resultSet.getString("telefone");
                    String email = resultSet.getString("email");
                    String genero = resultSet.getString("genero");
                    String crmv = resultSet.getString("crmv");
                    String dataNasc = formatarDataDeNascimento(resultSet.getString("dataNasc"));
                    String senha = resultSet.getString("senha");
                    String cpf = resultSet.getString("cpf");
                    model1.addRow(new Object[]{nome, endereco, telefone, email, genero, crmv, dataNasc, senha, cpf});
                }

                // Fechando recursos
                resultSet.close();
                preparedStatement.close();
                statement.close();
                connection.close();

            } catch (Exception e) {
                e.printStackTrace();
            }        
        }else if(LB_SetaBaixoSecretaria.isVisible()){
            for (int i = 0; i < model1.getRowCount(); i++) {
                model1.removeRow(i);
            }
            try {
                Connection connection = DriverManager.getConnection(url, user, password);

                Statement statement = connection.createStatement();
                statement.execute("USE mydb");

                String query = "SELECT nome, endereco, telefone, email, genero, dataNasc, senha, cpf FROM secretaria";

                PreparedStatement preparedStatement = connection.prepareStatement(query);

                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    String nome = resultSet.getString("nome");
                    String endereco = resultSet.getString("endereco");
                    String telefone = resultSet.getString("telefone");
                    String email = resultSet.getString("email");
                    String genero = resultSet.getString("genero");
                    String dataNasc = formatarDataDeNascimento(resultSet.getString("dataNasc"));
                    String senha = resultSet.getString("senha");
                    String cpf = resultSet.getString("cpf");
                    model1.addRow(new Object[]{nome, endereco, telefone, email, genero, "", dataNasc, senha, cpf});
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
    }
    
    private void setarTabelas(){
        model1 = new DefaultTableModel();
        TB_Info.setModel(model1);
        model1.addColumn("Nome");
        model1.addColumn("Endereco");
        model1.addColumn("Telefone");
        model1.addColumn("Email");
        model1.addColumn("Genero");
        model1.addColumn("CRMV");
        model1.addColumn("Data Nasc");
        model1.addColumn("Senha");
        model1.addColumn("CPF");
     
    }
    
    private void LB_CadastroVeterinarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_CadastroVeterinarioMouseClicked
        LB_SetaBaixoVeterinario.setVisible(true);
        LB_SetaDireitaVeterinario.setVisible(false);
        LB_SetaDireitaSecretaria.setVisible(true);
        LB_SetaBaixoSecretaria.setVisible(false);
        inserirDadosNaTabela();
    }//GEN-LAST:event_LB_CadastroVeterinarioMouseClicked

    private void LB_CadastroSecretariaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_CadastroSecretariaMouseClicked
        LB_SetaBaixoVeterinario.setVisible(false);
        LB_SetaDireitaVeterinario.setVisible(true);
        LB_SetaDireitaSecretaria.setVisible(false);
        LB_SetaBaixoSecretaria.setVisible(true);
        inserirDadosNaTabela();
    }//GEN-LAST:event_LB_CadastroSecretariaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (LB_SetaBaixoSecretaria.isVisible()) {
            if (jButton1.getText().equals("Mudar Informações")) {
                TB_Info.setEnabled(true);
                jButton1.setText("Confirmar");
            }else{
                try {
                    Connection connection = DriverManager.getConnection(url, user, password);
                    Statement statement = connection.createStatement();
                    statement.execute("USE mydb");

                    for (int i = 0; i < model1.getRowCount(); i++) {
                        String nome = (String) model1.getValueAt(i, 0);
                        String endereco = (String) model1.getValueAt(i, 1);
                        String telefone = (String) model1.getValueAt(i, 2);
                        String email = (String) model1.getValueAt(i, 3);
                        String genero = (String) model1.getValueAt(i, 4);
                        String dataNasc = formatarDataDeNascimentoBancoDeDados((String) model1.getValueAt(i, 5));
                        String senha = (String) model1.getValueAt(i, 6);
                        String cpf = (String) model1.getValueAt(i, 7);

                        String query = "UPDATE secretaria SET nome=?, endereco=?, telefone=?,email=?, genero=?, dataNasc=?, senha=?, cpf=? WHERE nome=?";
                        PreparedStatement preparedStatement = connection.prepareStatement(query);
                        preparedStatement.setString(1, endereco);
                        preparedStatement.setString(2, telefone);
                        preparedStatement.setString(3, email);
                        preparedStatement.setString(4, genero);
                        preparedStatement.setString(5, dataNasc);
                        preparedStatement.setString(6, senha);
                        preparedStatement.setString(7, cpf);
                        preparedStatement.setString(8, nome);
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
        }else{
            if (jButton1.getText().equals("Mudar Informações")) {
                TB_Info.setEnabled(true);
                jButton1.setText("Confirmar");
            }else{
                try {
                    Connection connection = DriverManager.getConnection(url, user, password);
                    Statement statement = connection.createStatement();
                    statement.execute("USE mydb");

                    for (int i = 0; i < model1.getRowCount(); i++) {
                        String nome = (String) model1.getValueAt(i, 0);
                        String endereco = (String) model1.getValueAt(i, 1);
                        String telefone = (String) model1.getValueAt(i, 2);
                        String email = (String) model1.getValueAt(i, 3);
                        String genero = (String) model1.getValueAt(i, 4);
                        String crmv = (String) model1.getValueAt(i, 5);
                        String dataNasc = formatarDataDeNascimentoBancoDeDados((String) model1.getValueAt(i, 6));
                        String senha = (String) model1.getValueAt(i, 7);
                        String cpf = (String) model1.getValueAt(i, 8);

                        String query = "UPDATE veterinario SET endereco=?, telefone=?, email=?, genero=?, crmv=?, dataNasc=?, senha=?, cpf=? WHERE nome=?";
                        PreparedStatement preparedStatement = connection.prepareStatement(query);
                        preparedStatement.setString(1, endereco);
                        preparedStatement.setString(2, telefone);
                        preparedStatement.setString(3, email);
                        preparedStatement.setString(4, genero);
                        preparedStatement.setString(5, crmv);
                        preparedStatement.setString(6, dataNasc);
                        preparedStatement.setString(7, senha);
                        preparedStatement.setString(8, cpf);
                        preparedStatement.setString(9, nome);
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
        }        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Janela.TelaA= new TelaLogin();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaJ);
        janela.getContentPane().remove(Janela.TelaJ);
        janela.add(Janela.TelaA, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_jLabel4MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB_CadastroSecretaria;
    private javax.swing.JLabel LB_CadastroVeterinario;
    private javax.swing.JLabel LB_SetaBaixoSecretaria;
    private javax.swing.JLabel LB_SetaBaixoVeterinario;
    private javax.swing.JLabel LB_SetaDireitaSecretaria;
    private javax.swing.JLabel LB_SetaDireitaVeterinario;
    private javax.swing.JTable TB_Info;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
