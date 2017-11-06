/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSC.JROficina.Apresentacao;

import DSC.JROficina.Aplicacao.Cliente;
import DSC.JROficina.Aplicacao.TipoCliente;
import DSC.JROficina.Aplicacao.ViolacaoRegrasNegocioException;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;


/**
 *
 * @author Rodrigo
 */
public class ClienteEditar extends TelaEdicao<Cliente> {

    /**
     * Creates new form ClienteEditar
     */
    public ClienteEditar() {
        super();
        initComponents();
        
        entidade = new Cliente();
        
        ComboBoxModel model = new DefaultComboBoxModel(TipoCliente.values());
        cbxTipoCliente.setModel(model);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        cbxTipoCliente = new javax.swing.JComboBox<>();
        txtCpf_cnpj = new javax.swing.JTextField();
        txtEnd = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();

        setTitle("Editar Cliente");
        setToolTipText("Editar Cliente");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Tipo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Cpf/CNPJ:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Endereço:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Telefone:");

        txtNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        cbxTipoCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxTipoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtCpf_cnpj.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCpf_cnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpf_cnpjActionPerformed(evt);
            }
        });

        txtEnd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtTel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnApagar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnApagar.setText("Apagar");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnApagar)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCpf_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTel)))
                        .addContainerGap(322, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEnd))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(91, 91, 91))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCpf_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar)
                    .addComponent(btnApagar))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Salvar();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        cancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        Apagar();
    }//GEN-LAST:event_btnApagarActionPerformed

    private void txtCpf_cnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpf_cnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpf_cnpjActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxTipoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtCpf_cnpj;
    private javax.swing.JTextField txtEnd;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void carregaCampos() {
        txtNome.setText(entidade.getNome());
        txtEnd.setText(entidade.getEndereco());
        txtTel.setText(entidade.getTelefone());
        txtCpf_cnpj.setText(entidade.getCpf_cnpj());
        cbxTipoCliente.setSelectedItem(entidade.getTipo());
    }

    @Override
    public void carregaObjeto() throws ViolacaoRegrasNegocioException {
        entidade.setNomee(txtNome.getText());
        entidade.setTelefone(txtTel.getText());
        entidade.setEndereco(txtEnd.getText());
        entidade.setCpf_cnpj(txtCpf_cnpj.getText());
        entidade.setTipo((TipoCliente) cbxTipoCliente.getSelectedItem());
    }

    @Override
    public boolean verificarCamposObrigatorios() {
        return cbxTipoCliente.getSelectedItem() == null || !txtNome.getText().isEmpty() &&
        !txtEnd.getText().isEmpty() && !txtCpf_cnpj.getText().isEmpty() && !txtTel.getText().isEmpty();
    }
}