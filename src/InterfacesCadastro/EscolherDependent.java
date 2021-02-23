/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesCadastro;

import Classes.Dependente;
import Classes.Titular;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TURUGO
 */
public class EscolherDependent extends javax.swing.JFrame {

    private CadastroTitular frame1;
    
    public EscolherDependent() {
        initComponents();
        
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        
        boolean achou;
            
        for(int i = 0; i < Dependente.listaDep.size(); i++){
            achou= false;
            
            for(int j = 0; j < Titular.titular.size(); j++){
                for(int k = 0; k < Titular.titular.get(j).codDependente.size(); k++)
                    if(Dependente.listaDep.get(i).getCodDependente()==Titular.titular.get(j).codDependente.get(k)){
                        achou = true;
                    }
            }
            
            if(achou == false){
                dtm.addRow(new Object[]{Dependente.listaDep.get(i).getCodDependente() ,Dependente.listaDep.get(i).getNome(),
                Dependente.listaDep.get(i).getCpf()});
            }
        }
        
        
    }

    public void enviaFrame(CadastroTitular fRame1){
        this.frame1 = fRame1;

        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        ((DefaultTableModel) table.getModel()).setRowCount(0);
        
        boolean achou;
            
        for(int i = 0; i < Dependente.listaDep.size(); i++){
            achou= false;
            
            for(int j = 0; j < Titular.titular.size(); j++){
                for(int k = 0; k < Titular.titular.get(j).codDependente.size(); k++)
                    if(Dependente.listaDep.get(i).getCodDependente()==Titular.titular.get(j).codDependente.get(k)){
                        achou = true;
                    }
            }
            
            if(achou == false){
                dtm.addRow(new Object[]{Dependente.listaDep.get(i).getCodDependente() ,Dependente.listaDep.get(i).getNome(),
                Dependente.listaDep.get(i).getCpf()});
            }
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtBuscaNome = new javax.swing.JTextField();
        txtBuscaCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        txtBuscaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaNomeActionPerformed(evt);
            }
        });

        txtBuscaCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaCodigoActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar por nome:");

        jLabel2.setText("Buscar Por Código:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("*A busca diferencia letras maiúsculas de minúsculas");
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBuscaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGap(0, 96, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        
    }//GEN-LAST:event_tableMouseClicked

    private void tableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseReleased
        Object obj = table.getModel().getValueAt(table.getSelectedRow() ,0);
        String str = String.valueOf(obj);
        int id = Integer.parseInt(str);
        boolean achoU; 
        
        for(int i = 0; i < Dependente.listaDep.size(); i++){
            
                if(Dependente.listaDep.get(i).getCodDependente()==id){
                    if(frame1 !=null){
                        frame1.adicionaDependente(i);
                        
                        this.dispose();
                        
                    }
                }
        }

    }//GEN-LAST:event_tableMouseReleased

    private void txtBuscaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaNomeActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        
        ((DefaultTableModel) table.getModel()).setRowCount(0);
        
        boolean achou;
        String txt = txtBuscaNome.getText();
        
        for(int i = 0; i < Dependente.listaDep.size(); i++){
            achou= false;
            
            for(int j = 0; j < Titular.titular.size(); j++){
                for(int k = 0; k < Titular.titular.get(j).codDependente.size(); k++)
                    if(Dependente.listaDep.get(i).getCodDependente()==Titular.titular.get(j).codDependente.get(k)){
                        achou = true;
                    }
            }
            
            if(achou == false){
                if(Dependente.listaDep.get(i).getNome().contains(txt)==true){
                    dtm.addRow(new Object[]{Dependente.listaDep.get(i).getCodDependente() ,Dependente.listaDep.get(i).getNome(),
                    Dependente.listaDep.get(i).getCpf()});
                }
                }
        }
    }//GEN-LAST:event_txtBuscaNomeActionPerformed

    private void txtBuscaCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaCodigoActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        
        ((DefaultTableModel) table.getModel()).setRowCount(0);
        
        boolean achou;
        String txt = txtBuscaCodigo.getText();
        
        for(int i = 0; i < Dependente.listaDep.size(); i++){
            achou= false;
            
            for(int j = 0; j < Titular.titular.size(); j++){
                for(int k = 0; k < Titular.titular.get(j).codDependente.size(); k++)
                    if(Dependente.listaDep.get(i).getCodDependente()==Titular.titular.get(j).codDependente.get(k)){
                        achou = true;
                    }
            }
            
            if(achou == false){
                if(Dependente.listaDep.get(i).getCpf().contains(txt)==true){
                    dtm.addRow(new Object[]{Dependente.listaDep.get(i).getCodDependente() ,Dependente.listaDep.get(i).getNome(),
                    Dependente.listaDep.get(i).getCpf()});
                }
                }
        }
    }//GEN-LAST:event_txtBuscaCodigoActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EscolherDependent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscolherDependent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscolherDependent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscolherDependent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscolherDependent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtBuscaCodigo;
    private javax.swing.JTextField txtBuscaNome;
    // End of variables declaration//GEN-END:variables
}
