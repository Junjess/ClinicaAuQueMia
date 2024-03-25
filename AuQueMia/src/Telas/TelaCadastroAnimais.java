package Telas;

public class TelaCadastroAnimais extends javax.swing.JPanel {

    public TelaCadastroAnimais() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LB_Email.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        LB_Email.setForeground(new java.awt.Color(115, 153, 250));
        LB_Email.setText("Email:");
        add(LB_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 550, 100, 40));

        TF_Email.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        TF_Email.setForeground(new java.awt.Color(102, 102, 255));
        TF_Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_EmailKeyPressed(evt);
            }
        });
        add(TF_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 550, 340, 40));

        LB_Telefone.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        LB_Telefone.setForeground(new java.awt.Color(115, 153, 250));
        LB_Telefone.setText("Telefone:");
        add(LB_Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 480, 140, 40));

        TF_Telefone.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        TF_Telefone.setForeground(new java.awt.Color(102, 102, 255));
        TF_Telefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_TelefoneKeyPressed(evt);
            }
        });
        add(TF_Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 480, 340, 40));

        LB_Endereco.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        LB_Endereco.setForeground(new java.awt.Color(115, 153, 250));
        LB_Endereco.setText("Endereço:");
        add(LB_Endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 410, 140, 40));

        TF_Endereco.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        TF_Endereco.setForeground(new java.awt.Color(102, 102, 255));
        TF_Endereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_EnderecoKeyPressed(evt);
            }
        });
        add(TF_Endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 410, 340, 40));

        TF_NomeDono.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        TF_NomeDono.setForeground(new java.awt.Color(102, 102, 255));
        TF_NomeDono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_NomeDonoKeyPressed(evt);
            }
        });
        add(TF_NomeDono, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 340, 340, 40));

        LB_NomeDono.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        LB_NomeDono.setForeground(new java.awt.Color(115, 153, 250));
        LB_NomeDono.setText("Nome do Dono(a):");
        add(LB_NomeDono, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 340, 240, 40));

        LB_Nome.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        LB_Nome.setForeground(new java.awt.Color(115, 153, 250));
        LB_Nome.setText("Nome:");
        add(LB_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, 50));

        TF_Nome.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        TF_Nome.setForeground(new java.awt.Color(102, 102, 255));
        TF_Nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_NomeKeyPressed(evt);
            }
        });
        add(TF_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 340, 40));

        LB_Especie.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        LB_Especie.setForeground(new java.awt.Color(115, 153, 250));
        LB_Especie.setText("Espécie:");
        add(LB_Especie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, 60));

        TF_Especie.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        TF_Especie.setForeground(new java.awt.Color(102, 102, 255));
        TF_Especie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_EspecieKeyPressed(evt);
            }
        });
        add(TF_Especie, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 340, 40));

        LB_Raca.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        LB_Raca.setForeground(new java.awt.Color(115, 153, 250));
        LB_Raca.setText("Raça:");
        add(LB_Raca, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, -1, 50));

        TF_Raca.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        TF_Raca.setForeground(new java.awt.Color(102, 102, 255));
        TF_Raca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_RacaKeyPressed(evt);
            }
        });
        add(TF_Raca, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 340, 40));

        LB_Idade.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        LB_Idade.setForeground(new java.awt.Color(115, 153, 250));
        LB_Idade.setText("Idade:");
        add(LB_Idade, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 90, 50));

        TF_Idade.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        TF_Idade.setForeground(new java.awt.Color(102, 102, 255));
        TF_Idade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_IdadeKeyPressed(evt);
            }
        });
        add(TF_Idade, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 340, 40));

        LB_Gênero.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        LB_Gênero.setForeground(new java.awt.Color(115, 153, 250));
        LB_Gênero.setText("Gênero:");
        add(LB_Gênero, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 100, 50));

        CB_Genero.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        CB_Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Macho", "Fêmea", " " }));
        add(CB_Genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 480, 340, 40));

        BT_Cadastrar.setFont(new java.awt.Font("Monospaced", 1, 28)); // NOI18N
        BT_Cadastrar.setForeground(new java.awt.Color(115, 153, 250));
        BT_Cadastrar.setText("FINALIZAR CADASTRO");
        BT_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_CadastrarActionPerformed(evt);
            }
        });
        add(BT_Cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 660, 340, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaCadastroAnimais.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void TF_NomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_NomeKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            TF_Nome.setEditable(true);
        } else {
            TF_Nome.setEditable(false);
        }
    }//GEN-LAST:event_TF_NomeKeyPressed

    private void TF_EspecieKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_EspecieKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            TF_Especie.setEditable(true);
        } else {
            TF_Especie.setEditable(false);
        }
    }//GEN-LAST:event_TF_EspecieKeyPressed

    private void TF_RacaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_RacaKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            TF_Raca.setEditable(true);
        } else {
            TF_Raca.setEditable(false);
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
        if (Character.isLetter(c)) {
            TF_NomeDono.setEditable(true);
        } else {
            TF_NomeDono.setEditable(false);
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
        
    }//GEN-LAST:event_BT_CadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Cadastrar;
    private javax.swing.JComboBox<String> CB_Genero;
    private javax.swing.JLabel LB_Email;
    private javax.swing.JLabel LB_Endereco;
    private javax.swing.JLabel LB_Especie;
    private javax.swing.JLabel LB_Gênero;
    private javax.swing.JLabel LB_Idade;
    private javax.swing.JLabel LB_Nome;
    private javax.swing.JLabel LB_NomeDono;
    private javax.swing.JLabel LB_Raca;
    private javax.swing.JLabel LB_Telefone;
    private javax.swing.JTextField TF_Email;
    private javax.swing.JTextField TF_Endereco;
    private javax.swing.JTextField TF_Especie;
    private javax.swing.JTextField TF_Idade;
    private javax.swing.JTextField TF_Nome;
    private javax.swing.JTextField TF_NomeDono;
    private javax.swing.JTextField TF_Raca;
    private javax.swing.JTextField TF_Telefone;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
