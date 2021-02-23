/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OutrasInterfaces;

import InterfacesLogin.LoginSecundario;
import IntefacesRelatorio.RelatorioPagamento;
import InterfacesCadastro.CadastroDependente;
import InterfacesCadastro.CadastroTitular;
import InterfacesCadastro.CadastroUsuario;
import javax.swing.JOptionPane;

/**
 *
 * @author TURUGO
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPrivada
     */
    public JanelaPrincipal() {
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

        btnCadAsso = new javax.swing.JButton();
        btnControlarPagamentos = new javax.swing.JButton();
        btnDependente = new javax.swing.JButton();
        menubarPrincipal = new javax.swing.JMenuBar();
        menuCadastrar = new javax.swing.JMenu();
        menuitemCadUsu = new javax.swing.JMenuItem();
        menuitemCadAsso = new javax.swing.JMenuItem();
        menuitemDependente = new javax.swing.JMenuItem();
        menuControlarPagamento = new javax.swing.JMenu();
        menuRelatorio = new javax.swing.JMenu();
        menuConfig = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Data Club");
        setExtendedState(6);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        btnCadAsso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ClientesAdicionar.png"))); // NOI18N
        btnCadAsso.setText("Cadastrar Associado");
        btnCadAsso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadAssoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadAsso);
        btnCadAsso.setBounds(10, 10, 160, 30);

        btnControlarPagamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Dinheiro.png"))); // NOI18N
        btnControlarPagamentos.setText("Controlar pagamentos");
        btnControlarPagamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnControlarPagamentosActionPerformed(evt);
            }
        });
        getContentPane().add(btnControlarPagamentos);
        btnControlarPagamentos.setBounds(10, 90, 160, 30);

        btnDependente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ClientesAdicionar.png"))); // NOI18N
        btnDependente.setText("Cadastrar Dependente");
        btnDependente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDependenteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDependente);
        btnDependente.setBounds(10, 50, 160, 30);

        menuCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pencil.png"))); // NOI18N
        menuCadastrar.setText("Cadastrar");

        menuitemCadUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_add.png"))); // NOI18N
        menuitemCadUsu.setText("Usuário");
        menuitemCadUsu.setName("menu_usuario"); // NOI18N
        menuitemCadUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemCadUsuActionPerformed(evt);
            }
        });
        menuCadastrar.add(menuitemCadUsu);

        menuitemCadAsso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ClientesAdicionar.png"))); // NOI18N
        menuitemCadAsso.setText("Associado");
        menuitemCadAsso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemCadAssoActionPerformed(evt);
            }
        });
        menuCadastrar.add(menuitemCadAsso);

        menuitemDependente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ClientesAdicionar.png"))); // NOI18N
        menuitemDependente.setText("Dependente");
        menuitemDependente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemDependenteActionPerformed(evt);
            }
        });
        menuCadastrar.add(menuitemDependente);

        menubarPrincipal.add(menuCadastrar);

        menuControlarPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Dinheiro.png"))); // NOI18N
        menuControlarPagamento.setText("Controlar pagamentos");
        menuControlarPagamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuControlarPagamentoMouseClicked(evt);
            }
        });
        menubarPrincipal.add(menuControlarPagamento);

        menuRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/printer.png"))); // NOI18N
        menuRelatorio.setText("Relatório");
        menuRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuRelatorioMouseClicked(evt);
            }
        });
        menubarPrincipal.add(menuRelatorio);

        menuConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Configuração.png"))); // NOI18N
        menuConfig.setText("Configurações");
        menuConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuConfigMouseClicked(evt);
            }
        });
        menubarPrincipal.add(menuConfig);

        menuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Saida.png"))); // NOI18N
        menuSair.setText("Fazer logoff");
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        menubarPrincipal.add(menuSair);

        setJMenuBar(menubarPrincipal);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        LoginSecundario loginSecundario = new LoginSecundario();
        loginSecundario.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void menuitemCadAssoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemCadAssoActionPerformed
        CadastroTitular cadastroTitular = new CadastroTitular();
        cadastroTitular.setVisible(true);
    }//GEN-LAST:event_menuitemCadAssoActionPerformed

    private void menuitemCadUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemCadUsuActionPerformed
        CadastroUsuario cadastroUsuario = new CadastroUsuario();
        cadastroUsuario.setVisible(true);
    }//GEN-LAST:event_menuitemCadUsuActionPerformed

    private void btnCadAssoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadAssoActionPerformed
        menuitemCadAssoActionPerformed(evt);
    }//GEN-LAST:event_btnCadAssoActionPerformed

    private void menuitemDependenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemDependenteActionPerformed
        CadastroDependente cadastroDependente = new CadastroDependente();
        cadastroDependente.setVisible(true);
    }//GEN-LAST:event_menuitemDependenteActionPerformed

    private void btnControlarPagamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnControlarPagamentosActionPerformed
        menuControlarPagamentoMouseClicked(null);
    }//GEN-LAST:event_btnControlarPagamentosActionPerformed

    private void btnDependenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDependenteActionPerformed
        menuitemDependenteActionPerformed(evt);
    }//GEN-LAST:event_btnDependenteActionPerformed

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        dispose();
    }//GEN-LAST:event_menuSairMouseClicked

    private void menuConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuConfigMouseClicked
        Configurações configuracoes = new Configurações();
        configuracoes.setVisible(true);
    }//GEN-LAST:event_menuConfigMouseClicked

    private void menuRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRelatorioMouseClicked
        RelatorioPagamento relatorioPagamento = new RelatorioPagamento();
        relatorioPagamento.setVisible(true);
    }//GEN-LAST:event_menuRelatorioMouseClicked

    private void menuControlarPagamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuControlarPagamentoMouseClicked
        ControlePagamento controlePagamento = new ControlePagamento();
        controlePagamento.setVisible(true);
    }//GEN-LAST:event_menuControlarPagamentoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadAsso;
    private javax.swing.JButton btnControlarPagamentos;
    private javax.swing.JButton btnDependente;
    private javax.swing.JMenu menuCadastrar;
    private javax.swing.JMenu menuConfig;
    private javax.swing.JMenu menuControlarPagamento;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenuBar menubarPrincipal;
    private javax.swing.JMenuItem menuitemCadAsso;
    private javax.swing.JMenuItem menuitemCadUsu;
    private javax.swing.JMenuItem menuitemDependente;
    // End of variables declaration//GEN-END:variables
}