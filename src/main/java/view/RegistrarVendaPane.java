package view;

import java.awt.Dimension;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.DocumentEvent;
import model.dao.VendaDAOImpl;
import model.dao.ClienteDAOImpl;
import model.dao.GenericDAOImpl;
import model.dao.ProdutoDAOImpl;
import model.dao.ProdutoVendaDAOImpl;
import model.dao.UsuarioDAOImpl;
import model.entity.Venda;
import model.entity.Cliente;
import model.entity.Produto;
import model.entity.ProdutoVenda;
import model.entity.Usuario;

public class RegistrarVendaPane extends javax.swing.JPanel {

    TelaPrincipal telaPrincipal;
    
    public RegistrarVendaPane(TelaPrincipal telaPrincipal) {
        initComponents();
        inputNomeProdutoAddListener();
        this.telaPrincipal = telaPrincipal;
        qtdProdutoSpinner.setModel(new SpinnerNumberModel(1, 1, 100, 1));
        jLabel1.setText("Registrar Venda");
        ProdutoDAOImpl produtoDAOImpl = new ProdutoDAOImpl();
        listaProdutos = produtoDAOImpl.findAll();
        //btnDeletar.setVisible(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputNomeProduto = new javax.swing.JTextField();
        btnVender = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        comboBoxProduto = new javax.swing.JComboBox<>();
        qtdProdutoSpinner = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        btnAddCarrinho = new javax.swing.JButton();
        btnVerCarrinho = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(394, 322));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setAlignmentX(10.0F);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nome do produto:");

        btnVender.setText("Vender");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Produto:");

        comboBoxProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboBoxProdutoMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("QTD:");

        btnAddCarrinho.setText("Adicionar ao carrinho");
        btnAddCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCarrinhoActionPerformed(evt);
            }
        });

        btnVerCarrinho.setText("Ver carrinho");
        btnVerCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCarrinhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnAddCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputNomeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(comboBoxProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(24, 24, 24)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(qtdProdutoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnVerCarrinho)
                                .addGap(18, 18, 18)
                                .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 8, Short.MAX_VALUE)))
                        .addGap(36, 36, 36)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtdProdutoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCarrinho)
                    .addComponent(btnVerCarrinho)
                    .addComponent(btnVender))
                .addContainerGap(184, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        float valorTotal = carrinhoCompras.stream()
                            .map(produtoVenda -> produtoVenda.getProduto().getValor() * produtoVenda.getQtdProduto())
                            .reduce(0.0f, Float::sum);
        
        if(JOptionPane.showConfirmDialog(this, String.format("Tem certeza que deseja registrar a venda no valor de %.2f?", valorTotal),
        "Registrar venda", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
            VendaDAOImpl vendaDAOImpl = new VendaDAOImpl();
            Venda venda = new Venda();
            venda.setDataVenda(LocalDate.now());
            venda.setValor(valorTotal);
            vendaDAOImpl.save(venda);
            
            ProdutoVendaDAOImpl produtoVendaDAOImpl = new ProdutoVendaDAOImpl();
            for(ProdutoVenda produtoVenda: carrinhoCompras) {
                produtoVenda.setVenda(venda);
                produtoVendaDAOImpl.saveProdutoVendaAndDecrementStock(produtoVenda);
            }
            
            JOptionPane.showMessageDialog(this, "Venda registrada com sucesso!", "SUCESSO: Venda registrada", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnVenderActionPerformed

    private void comboBoxProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboBoxProdutoMouseClicked
        
    }//GEN-LAST:event_comboBoxProdutoMouseClicked

    private void btnVerCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCarrinhoActionPerformed
        ListarCarrinhoDialog listarCarrinhoDialog = new ListarCarrinhoDialog(null, true, carrinhoCompras);
        listarCarrinhoDialog.setLocationRelativeTo(this);
        listarCarrinhoDialog.setVisible(true);
    }//GEN-LAST:event_btnVerCarrinhoActionPerformed

    private void btnAddCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCarrinhoActionPerformed
        if(comboBoxProduto.getSelectedItem() != null) {
            for(ProdutoVenda produtoVenda: carrinhoCompras) {
                if(produtoVenda.getProduto().equals((Produto) comboBoxProduto.getSelectedItem())) {
                    produtoVenda.setQtdProduto(produtoVenda.getQtdProduto() + (Integer) qtdProdutoSpinner.getValue());
                    comboBoxProduto.removeAllItems();
                    this.limparCampos();
                    return;
                }
            }
            ProdutoVenda produtoVenda = new ProdutoVenda();
            produtoVenda.setProduto((Produto) comboBoxProduto.getSelectedItem());
            produtoVenda.setQtdProduto((Integer) qtdProdutoSpinner.getValue());
            carrinhoCompras.add(produtoVenda); 
            comboBoxProduto.removeAllItems();
            this.limparCampos();
        }
    }//GEN-LAST:event_btnAddCarrinhoActionPerformed

    private void inputNomeProdutoAddListener() {
        this.inputNomeProduto.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                inputNomeProdutoOnChange();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                inputNomeProdutoOnChange();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                inputNomeProdutoOnChange();
            }
            
        });
    }
    
    private void inputNomeProdutoOnChange() {
        comboBoxProduto.removeAllItems();
        List<Produto> listaFiltrada = filtrarProdutos(inputNomeProduto.getText());
        loadComboBoxProdutoContent(listaFiltrada);
    }
    
    private List<Produto> filtrarProdutos(String texto) {
        List<Produto> listaFiltrada = this.listaProdutos
                .stream()
                .filter(produto -> produto.getNome().toUpperCase().contains(texto.toUpperCase()))
                .collect(Collectors.toList());
        
        return listaFiltrada;
                
    }
    
    private void loadComboBoxProdutoContent(List<Produto> listaFiltrada) {
        for (Produto produto: listaFiltrada) {
            comboBoxProduto.addItem(produto);
        }
    }
    
    private void limparCampos() {
        inputNomeProduto.setText("");
        qtdProdutoSpinner.setValue(1);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCarrinho;
    private javax.swing.JButton btnVender;
    private javax.swing.JButton btnVerCarrinho;
    private javax.swing.JComboBox<Produto> comboBoxProduto;
    private javax.swing.JTextField inputNomeProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSpinner qtdProdutoSpinner;
    // End of variables declaration//GEN-END:variables
    List<Produto> listaProdutos;
    List<ProdutoVenda> carrinhoCompras = new ArrayList<>();
}
