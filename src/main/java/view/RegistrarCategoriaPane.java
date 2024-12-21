package view;

import jakarta.persistence.RollbackException;
import jakarta.validation.ConstraintViolationException;
import javax.swing.JOptionPane;
import model.dao.CategoriaDAOImpl;
import model.entity.Categoria;
import utils.ValidationUtils;

public class RegistrarCategoriaPane extends javax.swing.JPanel {

    public RegistrarCategoriaPane() {
        initComponents();
        jLabel1.setText("Registrar categoria");
        btnDeletar.setVisible(false);
    }
    
    public RegistrarCategoriaPane(Long id) {
        initComponents();
        jLabel1.setText("Editar categoria");
        CategoriaDAOImpl categoriaDAOImpl = new CategoriaDAOImpl();
        c = categoriaDAOImpl.findById(id);
        inputNomeCategoria.setText(c.getNome());
        btnDeletar.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputNomeCategoria = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(394, 322));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setAlignmentX(10.0F);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btnSalvar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDeletar))
                                .addComponent(inputNomeCategoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(0, 144, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNomeCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnDeletar))
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (c != null) {
            try {
                Categoria categoria = prepareCategoriaObj();
                atualizarCategoria(categoria);
                JOptionPane.showMessageDialog(this, "Categoria atualizado com sucesso!", "SUCESSO: Categoria atualizado", JOptionPane.INFORMATION_MESSAGE);
            } catch (ConstraintViolationException e) {
                JOptionPane.showMessageDialog(this, ValidationUtils.formatValidationErrors(e.getConstraintViolations()), "ERRO: Violação de restrição", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            try {
                Categoria categoria = prepareCategoriaObj();
                salvarCategoria(categoria);
                JOptionPane.showMessageDialog(this, "Categoria salva com sucesso!", "SUCESSO: Categoria salva", JOptionPane.INFORMATION_MESSAGE);
                this.limparCampos();
            } catch (ConstraintViolationException e) {
                JOptionPane.showMessageDialog(this, ValidationUtils.formatValidationErrors(e.getConstraintViolations()), "ERRO: Violação de restrição", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        if(JOptionPane.showConfirmDialog(this, String.format("Tem ceteza que deseja deletar a categoria %s?", c.getNome()),
        "Deletar categoria", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
            if (c != null) {
                CategoriaDAOImpl categoriaDAOImpl = new CategoriaDAOImpl();
                categoriaDAOImpl.delete(c); 
                JOptionPane.showMessageDialog(this, "Categoria deletada com sucesso!", "SUCESSO: Categoria deletada", JOptionPane.INFORMATION_MESSAGE);  
                c = null;
                limparCampos();
                btnDeletar.setVisible(false);
            }
            
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void atualizarCategoria(Categoria categoria) throws RollbackException {
        new CategoriaDAOImpl().update(categoria);
    }
    
    private void salvarCategoria(Categoria categoria) throws ConstraintViolationException {
        new CategoriaDAOImpl().save(categoria);
    }
    
    private Categoria prepareCategoriaObj() {
        Categoria categoria = new Categoria();
        if (c != null) {
            categoria.setId(categoria.getId());
        }
        categoria.setNome(inputNomeCategoria.getText().toUpperCase());
        
        return categoria;
    }
    
    private void limparCampos() {
        inputNomeCategoria.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField inputNomeCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
    private Categoria c;
}
