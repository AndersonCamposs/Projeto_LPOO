package view;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.DocumentEvent;
import javax.swing.table.DefaultTableModel;
import model.dao.VendaDAOImpl;
import model.dao.ProdutoDAOImpl;
import model.dao.ProdutoVendaDAOImpl;
import model.entity.Venda;
import model.entity.Produto;
import model.entity.ProdutoVenda;

public class RegistrarVendaPane extends javax.swing.JPanel {

    
    public RegistrarVendaPane() {
        initComponents();
        inputNomeProdutoAddListener();
        qtdProdutoSpinner.setModel(new SpinnerNumberModel(1, 1, 100, 1));
        jLabel1.setText("Registrar Venda");
        ProdutoDAOImpl produtoDAOImpl = new ProdutoDAOImpl();
        listaProdutos = produtoDAOImpl.findAll();
        //btnDeletar.setVisible(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputNomeProduto = new javax.swing.JTextField();
        btnVender = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        comboBoxProduto = new javax.swing.JComboBox<>();
        qtdProdutoSpinner = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        btnAddCarrinho = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaCarrinho = new javax.swing.JTable();
        lblValorTotal = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

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

        tabelaCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "QTD.", "VALOR UNI."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCarrinhoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaCarrinho);

        lblValorTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblValorTotal.setForeground(new java.awt.Color(255, 0, 0));
        lblValorTotal.setText("R$ 0.0");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Carrinho de compras:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Valor total:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
                                        .addComponent(comboBoxProduto, 0, 116, Short.MAX_VALUE)
                                        .addGap(24, 24, 24)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(qtdProdutoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblValorTotal)))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                    .addComponent(btnVender))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorTotal)
                    .addComponent(jLabel7))
                .addGap(11, 11, 11))
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
            atualizarEstoque();
            esvaziarCarrinho();
        }
    }//GEN-LAST:event_btnVenderActionPerformed

    public void atualizarEstoque() {
        this.listaProdutos = new ProdutoDAOImpl().findAll();
    }
    
    public void removerItemCarrinho(String nome) {
        carrinhoCompras.removeIf(item -> item.getProduto().getNome().equalsIgnoreCase(nome));
    }
    
    private void comboBoxProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboBoxProdutoMouseClicked
        
    }//GEN-LAST:event_comboBoxProdutoMouseClicked

    private void btnAddCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCarrinhoActionPerformed
        if(comboBoxProduto.getSelectedItem() != null) {
            Produto produto = (Produto) comboBoxProduto.getSelectedItem();
            Integer qtdProduto = (Integer) qtdProdutoSpinner.getValue();
            if (qtdProduto > produto.getQtd_estoque()) {
                JOptionPane.showMessageDialog(this, 
                String.format("Não foi possível adicionar o produto %s ao carrinho. A quantidade atual no estoque é: %d", produto.getNome(), produto.getQtd_estoque()), 
                "ERRO: Não foi possível adicionar ao carrinho", 
                JOptionPane.ERROR_MESSAGE);
            } else {
                for(ProdutoVenda produtoVenda: carrinhoCompras) {
                    if(produtoVenda.getProduto().equals((Produto) comboBoxProduto.getSelectedItem())) {
                        Integer somaItensCarrinho = produtoVenda.getQtdProduto() + (Integer) qtdProdutoSpinner.getValue();
                        if(somaItensCarrinho > produtoVenda.getProduto().getQtd_estoque()) {
                            produtoVenda.setQtdProduto(produtoVenda.getProduto().getQtd_estoque());
                        } else {
                            produtoVenda.setQtdProduto(produtoVenda.getQtdProduto() + (Integer) qtdProdutoSpinner.getValue());
                        }
                        atualizarItensCarrinho();
                        lblValorTotal.setText(Float.toString(somarCarrinho()));
                        comboBoxProduto.removeAllItems();
                        this.limparCampos();
                        return;
                    }
                }
                ProdutoVenda produtoVenda = new ProdutoVenda();
                produtoVenda.setProduto(produto);
                produtoVenda.setQtdProduto(qtdProduto);
                carrinhoCompras.add(produtoVenda); 
                comboBoxProduto.removeAllItems();
                JOptionPane.showMessageDialog(this, 
                "Item adicionado ao carrinho com sucesso!", 
                "SUCESSO: Item adicionado", 
                JOptionPane.INFORMATION_MESSAGE);
                addItemCarrinho(produtoVenda);
                lblValorTotal.setText(Float.toString(somarCarrinho()));
                this.limparCampos();
            }
        }
    }//GEN-LAST:event_btnAddCarrinhoActionPerformed

    private void tabelaCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCarrinhoMouseClicked
        if(evt.getClickCount() == 2) {
            if(JOptionPane.showConfirmDialog(this, "Tem certeza que deseja remover o item do carrinho?",
            "Remover item", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
                int linhaSelecionada = tabelaCarrinho.getSelectedRow();
                if (linhaSelecionada != -1) {
                    String nomeSelecionado = (String) tabelaCarrinho.getValueAt(linhaSelecionada, 0);
                    this.removerItemCarrinho(nomeSelecionado);
                    DefaultTableModel model = (DefaultTableModel) tabelaCarrinho.getModel();
                    model.removeRow(linhaSelecionada);
                    JOptionPane.showMessageDialog(this, "Item removido do carrinho com sucesso!", "SUCESSO: Item removido", JOptionPane.INFORMATION_MESSAGE);
                    lblValorTotal.setText(Float.toString(somarCarrinho()));
                }
            }
        }
    }//GEN-LAST:event_tabelaCarrinhoMouseClicked

    private void addItemCarrinho(ProdutoVenda produtoVenda) {
        DefaultTableModel model = (DefaultTableModel) tabelaCarrinho.getModel();
        model.addRow(new Object[] {produtoVenda.getProduto().getNome(), produtoVenda.getQtdProduto(), produtoVenda.getProduto().getValor()});
    }
    
    private void atualizarItensCarrinho() {
        DefaultTableModel model = (DefaultTableModel) tabelaCarrinho.getModel();
        model.setRowCount(0);
        for(ProdutoVenda produtoVenda: carrinhoCompras) {
            model.addRow(new Object[] {produtoVenda.getProduto().getNome(), produtoVenda.getQtdProduto(), produtoVenda.getProduto().getValor()});
        }
    }
    
    private float somarCarrinho() {
        if (carrinhoCompras.isEmpty()) {
            return 0.0f;
        } else {
            return carrinhoCompras
                .stream()
                .map(produtoVenda -> produtoVenda.getProduto().getValor() * produtoVenda.getQtdProduto())
                .reduce(0.0f, Float::sum);
        }
    }
    
    private void esvaziarCarrinho() {
        DefaultTableModel model = (DefaultTableModel) tabelaCarrinho.getModel();
        model.setRowCount(0);
        this.carrinhoCompras.clear();
        lblValorTotal.setText(Float.toString(somarCarrinho()));
    }
    
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
    private javax.swing.JComboBox<Produto> comboBoxProduto;
    private javax.swing.JTextField inputNomeProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblValorTotal;
    private javax.swing.JSpinner qtdProdutoSpinner;
    private javax.swing.JTable tabelaCarrinho;
    // End of variables declaration//GEN-END:variables
    private List<Produto> listaProdutos;
    private List<ProdutoVenda> carrinhoCompras = new ArrayList<>();
}
