/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientehan;

import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author berto
 */
public class ClienteHan extends javax.swing.JFrame {

    /**
     * Creates new form ClienteHan
     */
    public ClienteHan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        verificarsaldo = new javax.swing.JButton();
        nomeusuario = new javax.swing.JTextField();
        senhausuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        valordeposito = new javax.swing.JTextField();
        nomeusuario1 = new javax.swing.JTextField();
        enviardeposito = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        valorsaque = new javax.swing.JTextField();
        nomeusuario2 = new javax.swing.JTextField();
        enviarsaque = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nomeusuario3 = new javax.swing.JTextField();
        senhausuario1 = new javax.swing.JTextField();
        enviarCadastro = new javax.swing.JButton();
        saldousuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nomeusuario4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        verificarsaldo.setText("Verificar");
        verificarsaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarsaldoActionPerformed(evt);
            }
        });

        nomeusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeusuarioActionPerformed(evt);
            }
        });

        senhausuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhausuarioActionPerformed(evt);
            }
        });

        jLabel1.setText("Saldo");

        jLabel2.setText("Deposito");

        enviardeposito.setText("Enviar");
        enviardeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviardepositoActionPerformed(evt);
            }
        });

        jLabel3.setText("Saque");

        enviarsaque.setText("Enviar");
        enviarsaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarsaqueActionPerformed(evt);
            }
        });

        jLabel4.setText("Cadastrar Novo Usuário");

        enviarCadastro.setText("Enviar");
        enviarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarCadastroActionPerformed(evt);
            }
        });

        jLabel5.setText("Alterar Cadastro");

        nomeusuario4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeusuario4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enviardeposito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nomeusuario1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(senhausuario)
                                        .addComponent(verificarsaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nomeusuario))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valordeposito))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(valorsaque))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nomeusuario2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(enviarsaque)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(saldousuario, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nomeusuario3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(senhausuario1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(enviarCadastro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(nomeusuario4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(167, 167, 167))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeusuario3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhausuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhausuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verificarsaldo)
                    .addComponent(saldousuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(enviarCadastro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(valordeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeusuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(enviardeposito)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorsaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nomeusuario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(enviarsaque))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeusuario4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(161, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeusuarioActionPerformed

    }//GEN-LAST:event_nomeusuarioActionPerformed

    private void senhausuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhausuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhausuarioActionPerformed

    private void verificarsaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificarsaldoActionPerformed
                double teste = 0;
                String nomeusuario, senhausuario;
                nomeusuario = this.nomeusuario.getText();
                senhausuario = this.senhausuario.getText();
                teste = saldoUser(nomeusuario, senhausuario);
        JOptionPane.showMessageDialog(null, "Saldo: R$ " + teste);
        System.out.println(saldoUser(nomeusuario,senhausuario));
    }//GEN-LAST:event_verificarsaldoActionPerformed

    private void enviardepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviardepositoActionPerformed
            boolean teste = false;
            double valorDeposito = Double.parseDouble(this.valordeposito.getText());
            teste = deposito(valorDeposito, this.nomeusuario1.getText());
            JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso");
    }//GEN-LAST:event_enviardepositoActionPerformed

    private void enviarsaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarsaqueActionPerformed
        boolean teste = false;
        double valorSaque = Double.parseDouble(this.valorsaque.getText());
        teste = saque(valorSaque, this.nomeusuario2.getText());
        JOptionPane.showMessageDialog(null, "Saque realizado com sucesso");
    }//GEN-LAST:event_enviarsaqueActionPerformed

    private void enviarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarCadastroActionPerformed
        boolean teste = false;
        teste = cadastrarUser(this.nomeusuario3.getText(), this.senhausuario1.getText(), this.saldousuario.getText());
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
    }//GEN-LAST:event_enviarCadastroActionPerformed

    private void nomeusuario4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeusuario4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeusuario4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClienteHan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteHan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteHan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteHan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteHan().setVisible(true);
            }
            

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enviarCadastro;
    private javax.swing.JButton enviardeposito;
    private javax.swing.JButton enviarsaque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nomeusuario;
    private javax.swing.JTextField nomeusuario1;
    private javax.swing.JTextField nomeusuario2;
    private javax.swing.JTextField nomeusuario3;
    private javax.swing.JTextField nomeusuario4;
    private javax.swing.JTextField saldousuario;
    private javax.swing.JTextField senhausuario;
    private javax.swing.JTextField senhausuario1;
    private javax.swing.JTextField valordeposito;
    private javax.swing.JTextField valorsaque;
    private javax.swing.JButton verificarsaldo;
    // End of variables declaration//GEN-END:variables

    private static boolean alterCadastro(java.lang.String oldNome, java.lang.String newNome, java.lang.String oldSenha, java.lang.String newSenha) {
        ws.BankWS_Service service = new ws.BankWS_Service();
        ws.BankWS port = service.getBankWSPort();
        return port.alterCadastro(oldNome, newNome, oldSenha, newSenha);
    }

    private static boolean cadastrarUser(java.lang.String nome, java.lang.String senha, java.lang.String saldo) {
        ws.BankWS_Service service = new ws.BankWS_Service();
        ws.BankWS port = service.getBankWSPort();
        return port.cadastrarUser(nome, senha, saldo);
    }

    private static String consultUser(java.lang.String nome, java.lang.String senha) {
        ws.BankWS_Service service = new ws.BankWS_Service();
        ws.BankWS port = service.getBankWSPort();
        return port.consultUser(nome, senha);
    }

    private static boolean deposito(double valor, java.lang.String nome) {
        ws.BankWS_Service service = new ws.BankWS_Service();
        ws.BankWS port = service.getBankWSPort();
        return port.deposito(valor, nome);
    }

    private static double saldoUser(java.lang.String nome, java.lang.String senha) {
        ws.BankWS_Service service = new ws.BankWS_Service();
        ws.BankWS port = service.getBankWSPort();
        return port.saldoUser(nome, senha);
    }

    private static boolean saque(double valor, java.lang.String nome) {
        ws.BankWS_Service service = new ws.BankWS_Service();
        ws.BankWS port = service.getBankWSPort();
        return port.saque(valor, nome);
    }
}
