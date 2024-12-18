package view;

import java.awt.Dimension;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import model.dao.CategoriaDAOImpl;
import model.dao.ProdutoDAOImpl;
import model.dao.GenericDAOImpl;
import model.dao.UsuarioDAOImpl;
import model.entity.Categoria;
import model.entity.Produto;
import model.entity.Usuario;

public class RegistrarProdutoPane extends javax.swing.JPanel {

    /**
     * Creates new form RegistrarUsuario
     */
    public RegistrarProdutoPane() {
        initComponents();
        jLabel1.setText("Registrar produto");
        loadComboBoxCategoriaContent();
        btnDeletar.setVisible(false);
    }
    
    public RegistrarProdutoPane(Long id) {
        initComponents();
        jLabel1.setText("Editar produto");
        ProdutoDAOImpl produtoDAOImpl = new ProdutoDAOImpl();
        p = produtoDAOImpl.findById(id);
        loadComboBoxCategoriaContent();
        inputNomeProduto.setText(p.getNome());
        inputValorProduto.setText(Float.toString(p.getValor()));
        qtdEstoqueSpinner.setValue(p.getQtd_estoque());
        btnDeletar.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputNomeProduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        comboBoxCategoria = new javax.swing.JComboBox<>();
        qtdEstoqueSpinner = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        inputValorProduto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(394, 322));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nome do produto:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Categoria");

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

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Estoque:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Valor(R$):");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inputValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(qtdEstoqueSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletar)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtdEstoqueSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar)
                    .addComponent(btnDeletar))
                .addContainerGap(201, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (p != null) {
            ProdutoDAOImpl produtoDAOImpl = new ProdutoDAOImpl();
            p.setNome(inputNomeProduto.getText().toUpperCase());
            p.setCategoria((Categoria) comboBoxCategoria.getSelectedItem());
            p.setValor(Float.parseFloat(inputValorProduto.getText().replace(",", ".")));
            p.setQtd_estoque((int) qtdEstoqueSpinner.getValue());
            
            produtoDAOImpl.update(p);
            JOptionPane.showMessageDialog(this, "Produto atualizado com sucesso!", "SUCESSO: Produto atualizado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            ProdutoDAOImpl produtoDAOImpl = new ProdutoDAOImpl();
            Produto produto = new Produto();
            produto.setNome(inputNomeProduto.getText().toUpperCase());
            produto.setCategoria((Categoria) comboBoxCategoria.getSelectedItem());
            produto.setValor(Float.parseFloat(inputValorProduto.getText().replace(",", ".")));
            produto.setQtd_estoque((int) qtdEstoqueSpinner.getValue());
            produtoDAOImpl.save(produto);
            
            JOptionPane.showMessageDialog(this, "Produto salvo com sucesso!", "SUCESSO: Produto salvo", JOptionPane.INFORMATION_MESSAGE);
            this.limparCampos();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        if(JOptionPane.showConfirmDialog(this, String.format("Tem ceteza que deseja deletar o produto %s?", p.getNome()),
        "Deletar produto", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
            if (p != null) {
                ProdutoDAOImpl produtoDAOImpl = new ProdutoDAOImpl();
                produtoDAOImpl.delete(p);
                JOptionPane.showMessageDialog(this, "Produto deletado com sucesso!", "SUCESSO: Usuário deletado", JOptionPane.INFORMATION_MESSAGE);  
                p = null;
                limparCampos();
                btnDeletar.setVisible(false);
            }
            
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void limparCampos() {
        inputNomeProduto.setText("");
        inputValorProduto.setText("");
        qtdEstoqueSpinner.setValue(0);
    }
    
    private void loadComboBoxCategoriaContent() {
        CategoriaDAOImpl categoriaDAOImpl = new CategoriaDAOImpl();
        List<Categoria> listaCategorias = categoriaDAOImpl.findAll();
        
        for(Categoria categoria: listaCategorias) {
            comboBoxCategoria.addItem(categoria);
            if(p != null) {
                if(p.getCategoria().equals(categoria)) {
                    comboBoxCategoria.setSelectedItem(categoria);
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<Categoria> comboBoxCategoria;
    private javax.swing.JTextField inputNomeProduto;
    private javax.swing.JTextField inputValorProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSpinner qtdEstoqueSpinner;
    // End of variables declaration//GEN-END:variables
    Produto p;
}
