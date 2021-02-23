/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesCadastro;

import Classes.Dependente;
import Classes.Sonumeros;
import Classes.Titular;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TURUGO
 */
public class CadastroTitular extends javax.swing.JFrame {
    private boolean editar;
    private boolean novo;
    /**
     * Creates new form CadastroAssociado
     */
    public CadastroTitular() {
        initComponents();
        txtNumero.setDocument(new Sonumeros());
        txtCPF.setDocument(new Sonumeros());
        txtTelefone.setDocument(new Sonumeros());
        tableTitulares.isCellEditable(1, 0);
    
        DefaultTableModel dtm = (DefaultTableModel) tableTitulares.getModel();
        String status;
        
        for (int i = 0; i < Titular.titular.size(); i++) {
            status = "Ativo";
            
            if(Titular.titular.get(i).isSituacao()==false){
                status= "Inativo";
            }
            
            dtm.addRow(new Object[]{Titular.titular.get(i).getCodAssociado(), Titular.titular.get(i).getNome(),Titular.titular.get(i).getCpf(),
            Titular.titular.get(i).getTelefone(), Titular.titular.get(i).getEstado(), Titular.titular.get(i).getCidade(), Titular.titular.get(i).getBairro(),
            Titular.titular.get(i).getRua(), Titular.titular.get(i).getNumero(), Titular.titular.get(i).getComplemento(), status
            });
            
        }

    }
    
    EscolherDependent escolherDependent = new EscolherDependent();
    
    public void adicionaDependente(int id){
        JOptionPane.showMessageDialog(null, "Dependente adicionado com sucesso!");
            
        DefaultTableModel dtm = (DefaultTableModel) tableDependentes.getModel();
            
        dtm.addRow(new Object[]{Dependente.listaDep.get(id).getCodDependente(),
                                Dependente.listaDep.get(id).getNome(),
                                Dependente.listaDep.get(id).getCpf()});
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAtivarDesativar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTitulares = new javax.swing.JTable();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        lblRua = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblComplemento = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        lblDependentes = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDependentes = new javax.swing.JTable();
        btnAdicionarDependente = new javax.swing.JToggleButton();
        btnExcluirDependenteSelecionado = new javax.swing.JToggleButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Titular");
        setResizable(false);

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovoMouseClicked(evt);
            }
        });
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pencil.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/disk.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAtivarDesativar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Eliminar.png"))); // NOI18N
        btnAtivarDesativar.setText("Ativar/Desativar Cadastro");
        btnAtivarDesativar.setEnabled(false);
        btnAtivarDesativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtivarDesativarActionPerformed(evt);
            }
        });

        tableTitulares.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "Telefone", "Estado", "Cidade", "Bairro", "Rua", "Numero", "Complemento", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableTitulares.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableTitularesMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableTitulares);

        txtNome.setEnabled(false);

        lblNome.setText("Nome*");

        lblEstado.setText("Estado*");

        txtEstado.setEnabled(false);

        lblRua.setText("Rua*");

        txtRua.setEnabled(false);

        txtCPF.setEnabled(false);

        txtCidade.setEnabled(false);

        lblCPF.setText("CPF*");

        lblCidade.setText("Cidade*");

        txtBairro.setEnabled(false);
        txtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroActionPerformed(evt);
            }
        });

        lblBairro.setText("Bairro*");

        lblNumero.setText("Numero*");

        txtNumero.setEnabled(false);

        lblComplemento.setText("Complemento*");

        txtComplemento.setEnabled(false);

        lblDependentes.setText("Dependentes:");

        txtTelefone.setEnabled(false);

        jScrollPane2.setEnabled(false);

        tableDependentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDependentes.setEnabled(false);
        tableDependentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableDependentesMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tableDependentes);

        btnAdicionarDependente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ClientesAdicionar.png"))); // NOI18N
        btnAdicionarDependente.setText("Adicionar Dependente");
        btnAdicionarDependente.setEnabled(false);
        btnAdicionarDependente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarDependenteActionPerformed(evt);
            }
        });

        btnExcluirDependenteSelecionado.setText("Remover dependente selecionado");
        btnExcluirDependenteSelecionado.setEnabled(false);
        btnExcluirDependenteSelecionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirDependenteSelecionadoActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Telefone*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(lblNome)
                                .addGap(193, 193, 193)
                                .addComponent(lblCPF))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(lblEstado)
                                .addGap(55, 55, 55)
                                .addComponent(lblCidade)
                                .addGap(46, 46, 46)
                                .addComponent(lblBairro)
                                .addGap(89, 89, 89)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 291, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblRua)
                                    .addComponent(txtRua, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                    .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNumero)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtNumero))))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtComplemento)
                                        .addGap(78, 78, 78))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblComplemento)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnCancelar)))
                                        .addGap(2, 2, 2)))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDependentes)
                                        .addGap(24, 24, 24)
                                        .addComponent(btnAdicionarDependente)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAtivarDesativar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExcluirDependenteSelecionado)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblCPF)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblEstado))
                    .addComponent(lblCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRua)
                        .addGap(6, 6, 6)
                        .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnNovo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNumero)
                        .addGap(6, 6, 6)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblComplemento)
                        .addGap(6, 6, 6)
                        .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditar)
                            .addComponent(btnCancelar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAdicionarDependente)
                            .addComponent(lblDependentes))
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtivarDesativar)
                    .addComponent(btnExcluirDependenteSelecionado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        novo=true;
        ((DefaultTableModel) tableDependentes.getModel()).setRowCount(0);
        tableTitulares.setVisible(false);
        tableTitulares.setEnabled(false);
        txtBairro.setText("");
        txtCPF.setText("");
        txtCidade.setText("");
        txtComplemento.setText("");
        txtEstado.setText("");
        txtNome.setText("");
        txtNumero.setText("");
        txtRua.setText("");
        txtTelefone.setText("");
        btnNovo.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnEditar.setEnabled(false);
        btnAtivarDesativar.setEnabled(false);
        btnAdicionarDependente.setEnabled(true);
        btnCancelar.setEnabled(true);
        txtBairro.setEnabled(true);
        txtCPF.setEnabled(true);
        txtCidade.setEnabled(true);
        txtComplemento.setEnabled(true);
        txtEstado.setEnabled(true);
        txtNome.setEnabled(true);
        txtNumero.setEnabled(true);
        txtRua.setEnabled(true);
        txtTelefone.setEnabled(true);
        tableDependentes.setEnabled(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseClicked
        
    }//GEN-LAST:event_btnNovoMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        tableTitulares.setVisible(false);
        tableTitulares.setEnabled(false);
        editar =true;
        btnCancelar.setEnabled(true);
        btnNovo.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnAdicionarDependente.setEnabled(true);
        btnAtivarDesativar.setEnabled(false);
        txtBairro.setEnabled(true);
        txtCPF.setEnabled(true);
        txtCidade.setEnabled(true);
        txtComplemento.setEnabled(true);
        txtEstado.setEnabled(true);
        txtNome.setEnabled(true);
        txtNumero.setEnabled(true);
        txtRua.setEnabled(true);
        txtTelefone.setEnabled(true);
        tableDependentes.setEnabled(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        boolean cpfIgual = false; 
        boolean telefoneIgual = false;
        int id = -1;
        int posicao = -1;
        String telefoneV = "-1";
        String cpfV = "-1";
                
        if(editar==true){
            Object obj = tableTitulares.getModel().getValueAt(tableTitulares.getSelectedRow() ,0);
            String str = String.valueOf(obj);
            id = Integer.parseInt(str);
             posicao = 0;
        
        
        for(int i = 0; i < Titular.titular.size(); i++){
                if(Titular.titular.get(i).getCodAssociado()==id){
                        posicao = i;
                    }
                }
        cpfV = Titular.titular.get(posicao).getCpf();
        telefoneV = Titular.titular.get(posicao).getTelefone();
        
        }
        
        if((txtBairro.getText().equals(""))||(txtCPF.getText().equals(""))||(txtCidade.getText().equals(""))||
          (txtComplemento.getText().equals(""))||(txtEstado.getText().equals("")||(txtNome.getText().equals(""))
           ||(txtNumero.getText().equals(""))||(txtRua.getText().equals(""))||(txtTelefone.getText().equals("")))){
                JOptionPane.showMessageDialog(this, "Verificar campo em branco!");  
            
        }else{
            
            for(int i=0; i<Titular.titular.size(); i++){
                if(Titular.titular.get(i).getCpf().equals(txtCPF.getText())){
                    cpfIgual = true;
                }
            }
            
            for(int i=0; i<Dependente.listaDep.size(); i++){
                if(Dependente.listaDep.get(i).getCpf().equals(txtCPF.getText())){
                    cpfIgual = true;
                }
            }
        
            for(int i=0; i<Titular.titular.size(); i++){
                if(Titular.titular.get(i).getTelefone().equals(txtTelefone.getText())){
                    telefoneIgual = true;
                }
            }
            
            if((cpfIgual==false && telefoneIgual==false)||
               ((((((editar==true) && (cpfV.equals(txtCPF.getText())))==true)&&
                (telefoneV.equals(txtTelefone.getText()))==true))==true)||
               (((editar==true) && (cpfV.equals(txtCPF.getText())) && telefoneIgual==false)==true)||
               (((editar==true) && (telefoneV.equals(txtTelefone.getText()))&& cpfIgual==false)==true)){
                
                btnCancelar.setEnabled(false);
                btnNovo.setEnabled(true);
                btnEditar.setEnabled(false);
                btnSalvar.setEnabled(false);
                btnAdicionarDependente.setEnabled(false);
                txtBairro.setEnabled(false);
                txtCPF.setEnabled(false);
                txtCidade.setEnabled(false);
                txtComplemento.setEnabled(false);
                txtEstado.setEnabled(false);
                txtNome.setEnabled(false);
                txtNumero.setEnabled(false);
                txtRua.setEnabled(false);
                txtTelefone.setEnabled(false);
                tableDependentes.setEnabled(false);
        
                if(editar ==true){
                    String nome = txtNome.getText();
                    String cpf = txtCPF.getText();
                    String estado = txtEstado.getText();
                    String cidade = txtCidade.getText();
                    String bairro = txtBairro.getText();
                    String rua = txtRua.getText();
                    int numero = Integer.parseInt(txtNumero.getText()); 
                    String complemento = txtComplemento.getText();
                    String telefone = txtTelefone.getText();
                    tableTitulares.setVisible(true);
                    tableTitulares.setEnabled(true);

                    Object obj = tableTitulares.getModel().getValueAt(tableTitulares.getSelectedRow() ,0);
                    String str = String.valueOf(obj);
                    id = Integer.parseInt(str);

                    ArrayList<Integer> codDependente;
                    codDependente = new ArrayList<>();
                    int ID;

                    for(int k=0; k<tableDependentes.getModel().getRowCount(); k++){
                        Object obje = tableDependentes.getModel().getValueAt(k ,0);
                        String stR = String.valueOf(obje);
                        ID = Integer.parseInt(stR);

                        codDependente.add(ID);
                    }

                    for(int i = 0; i < Titular.titular.size(); i++){
                        if(Titular.titular.get(i).getCodAssociado()==id){
                            
                            Titular.titular.get(i).setCidade(cidade);
                            Titular.titular.get(i).setBairro(bairro);
                            Titular.titular.get(i).setNome(nome);
                            Titular.titular.get(i).setEstado(estado);
                            Titular.titular.get(i).setRua(rua);
                            Titular.titular.get(i).setNumero(numero);
                            Titular.titular.get(i).setComplemento(complemento);
                            Titular.titular.get(i).setTelefone(telefone);
                            Titular.titular.get(i).setCpf(cpf);
                            Titular.titular.get(i).setCodDependente(codDependente);
                            }
                        }

                        tableTitulares.setValueAt(nome, tableTitulares.getSelectedRow(), 1);
                        tableTitulares.setValueAt(cpf, tableTitulares.getSelectedRow(), 2);
                        tableTitulares.setValueAt(telefone, tableTitulares.getSelectedRow(), 3);
                        tableTitulares.setValueAt(estado, tableTitulares.getSelectedRow(), 4);
                        tableTitulares.setValueAt(cidade, tableTitulares.getSelectedRow(), 5);
                        tableTitulares.setValueAt(bairro, tableTitulares.getSelectedRow(), 6);
                        tableTitulares.setValueAt(rua, tableTitulares.getSelectedRow(), 7);
                        tableTitulares.setValueAt(numero, tableTitulares.getSelectedRow(), 8);
                        tableTitulares.setValueAt(complemento, tableTitulares.getSelectedRow(), 9);

                        JOptionPane.showMessageDialog(null,"Dados alterados com sucesso!");

                        editar = false;

                }else{
                    Titular titular = new Titular();
                    id = Titular.getContadorAssociado();
                    String nome = txtNome.getText();
                    String cpf = txtCPF.getText();
                    String estado = txtEstado.getText();
                    String cidade = txtCidade.getText();
                    String bairro = txtBairro.getText();
                    String rua = txtRua.getText();
                    int numero = Integer.parseInt(txtNumero.getText()); 
                    String complemento = txtComplemento.getText();
                    String telefone = txtTelefone.getText();

                    ArrayList<Integer> codDependente;
                    codDependente = new ArrayList<>();
                    int ID;

                    for(int k=0; k<tableDependentes.getModel().getRowCount(); k++){
                        Object obj = tableDependentes.getModel().getValueAt(k ,0);
                        String str = String.valueOf(obj);
                        ID = Integer.parseInt(str);

                        codDependente.add(ID);
                    }

                    titular.cadastrar(nome, estado, cidade, bairro, rua, numero, complemento, telefone, cpf, codDependente);
                    Titular.titular.add(titular);
                    DefaultTableModel dtm = (DefaultTableModel) tableTitulares.getModel();

                    dtm.addRow(new Object[]{id, nome, cpf, telefone, estado, cidade, bairro, rua, numero, complemento, "Ativo"});

                    JOptionPane.showMessageDialog(null,"Dados cadastrados com sucesso!");
                    txtBairro.setText("");
                    txtCPF.setText("");
                    txtCidade.setText("");
                    txtComplemento.setText("");
                    txtEstado.setText("");
                    txtNome.setText("");
                    txtNumero.setText("");
                    txtRua.setText("");
                    txtTelefone.setText("");
                    tableTitulares.setVisible(true);
                    tableTitulares.setEnabled(true);


                    ((DefaultTableModel) tableDependentes.getModel()).setRowCount(0);

                    btnExcluirDependenteSelecionado.setEnabled(false);
                    novo = false;
                }
            
            }else{ 
                if((cpfIgual==true&&telefoneIgual==false)||
                  (((editar==true) && (telefoneV.equals(txtTelefone.getText()))&& cpfIgual==true)==true)){
                    JOptionPane.showMessageDialog(null, "CPF ja cadastrado!");
                
                }else if((telefoneIgual==true&&cpfIgual==false)||
                        (((editar==true) && (cpfV.equals(txtCPF.getText())) && telefoneIgual==true)==true)){
                            JOptionPane.showMessageDialog(null, "Telefone ja cadastrado!");
                
                }else{
                    JOptionPane.showMessageDialog(null, "Telefone e CPF ja cadastrados!");
                }
      }
            
    }
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnCancelar.setEnabled(false);
        btnNovo.setEnabled(true);
        btnEditar.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnAdicionarDependente.setEnabled(false);
        txtBairro.setEnabled(false);
        txtCPF.setEnabled(false);
        txtCidade.setEnabled(false);
        txtComplemento.setEnabled(false);
        txtEstado.setEnabled(false);
        txtNome.setEnabled(false);
        txtNumero.setEnabled(false);
        txtRua.setEnabled(false);
        txtTelefone.setEnabled(false);
        tableDependentes.setEnabled(false);
        tableTitulares.setEnabled(true);
        tableTitulares.setVisible(true);
        ((DefaultTableModel) tableDependentes.getModel()).setRowCount(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tableTitularesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTitularesMouseReleased
            
        ((DefaultTableModel) tableDependentes.getModel()).setRowCount(0);
        
        if(tableTitulares.getSelectedRow() != -1){
            btnEditar.setEnabled(true);
            btnAtivarDesativar.setEnabled(true);
            DefaultTableModel dtM = (DefaultTableModel) tableDependentes.getModel();
            int linhaSel = tableTitulares.getSelectedRow();
            
            txtNome.setText(Titular.titular.get(linhaSel).getNome());
            txtCPF.setText(Titular.titular.get(linhaSel).getCpf());
            txtBairro.setText(Titular.titular.get(linhaSel).getBairro());
            txtCidade.setText(Titular.titular.get(linhaSel).getCidade());
            txtComplemento.setText(Titular.titular.get(linhaSel).getComplemento());
            txtEstado.setText(Titular.titular.get(linhaSel).getEstado());
            txtNumero.setText(String.valueOf(Titular.titular.get(linhaSel).getNumero()));
            txtRua.setText(Titular.titular.get(linhaSel).getRua());
            txtTelefone.setText(Titular.titular.get(linhaSel).getTelefone());
            
            tableDependentes.setEnabled(true);
            int linha;
            for(int i=0; i<Titular.titular.get(linhaSel).codDependente.size();i++){
                linha = Titular.titular.get(linhaSel).codDependente.get(i)-1;
                
                dtM.addRow(new Object[]{Dependente.listaDep.get(linha).getCodDependente(),
                                        Dependente.listaDep.get(linha).getNome(),
                                        Dependente.listaDep.get(linha).getCpf()});
            }
            
            tableDependentes.setEnabled(false);
        }
    }//GEN-LAST:event_tableTitularesMouseReleased

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroActionPerformed

    private void btnAtivarDesativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtivarDesativarActionPerformed
        btnEditar.setEnabled(false);
        btnAtivarDesativar.setEnabled(false);
        
        Object obj = tableTitulares.getModel().getValueAt(tableTitulares.getSelectedRow() ,0);
        String str = String.valueOf(obj);
        int id = Integer.parseInt(str);
        
        for(int i = 0; i < Titular.titular.size(); i++){
            if(Titular.titular.get(i).getCodAssociado()==id){
                id = i;
            }
        }
        
        if(Titular.titular.get(id).isSituacao()==true){
            if(JOptionPane.showConfirmDialog(null, "Deseja realmente desativar o registro?", "Pergunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)== JOptionPane.YES_OPTION){
                Titular.titular.get(id).setSituacao(false);
                tableTitulares.getModel().setValueAt("Inativo" ,tableTitulares.getSelectedRow() , 10);

                JOptionPane.showMessageDialog(null, "Registro desativado com sucesso!");
            }

        }else{
            if(JOptionPane.showConfirmDialog(null, "Deseja realmente reativar o registro?", "Pergunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)== JOptionPane.YES_OPTION){
                Titular.titular.get(id).setSituacao(true);
                tableTitulares.getModel().setValueAt("Ativo" ,tableTitulares.getSelectedRow() , 10);

                JOptionPane.showMessageDialog(null, "Registro reativado com sucesso!");
            }
        }
        
    }//GEN-LAST:event_btnAtivarDesativarActionPerformed

    private void btnAdicionarDependenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarDependenteActionPerformed
        
        if(Dependente.listaDep.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nenhum dependente cadastrado!, favor cadastrar primeiro!");
        }else{
            if(escolherDependent==null){
                escolherDependent = new EscolherDependent();
                escolherDependent.setLocationRelativeTo(null);
                escolherDependent.setVisible(true);
                    
            }else{
                escolherDependent.setLocationRelativeTo(null);
                escolherDependent.setVisible(true);
            }
            escolherDependent.enviaFrame(this);
            
            }
    }//GEN-LAST:event_btnAdicionarDependenteActionPerformed

    private void btnExcluirDependenteSelecionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirDependenteSelecionadoActionPerformed
        
        
            DefaultTableModel dtm = (DefaultTableModel) tableDependentes.getModel();
            dtm.removeRow(tableDependentes.getSelectedRow());
            btnExcluirDependenteSelecionado.setEnabled(false);
        
    }//GEN-LAST:event_btnExcluirDependenteSelecionadoActionPerformed

    private void tableDependentesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDependentesMouseReleased
        if(novo==true||editar==true){
            btnExcluirDependenteSelecionado.setEnabled(true);
        }
    }//GEN-LAST:event_tableDependentesMouseReleased

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
            java.util.logging.Logger.getLogger(CadastroTitular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroTitular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroTitular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroTitular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroTitular().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAdicionarDependente;
    private javax.swing.JButton btnAtivarDesativar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JToggleButton btnExcluirDependenteSelecionado;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblDependentes;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblRua;
    private javax.swing.JTable tableDependentes;
    private javax.swing.JTable tableTitulares;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
