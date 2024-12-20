package view;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
import model.dao.VendaDAOImpl;
import model.entity.ProdutoVenda;
import model.entity.Venda;

public class ListarVendasPane extends javax.swing.JPanel {

    private final TelaPrincipal telaPrincipal;
    /**
     * Creates new form ListarVendasPane
     */
    public ListarVendasPane(TelaPrincipal telaPrincipal) {
        initComponents();
        this.telaPrincipal = telaPrincipal;
        DefaultTableModel model = (DefaultTableModel) tabelaVendas.getModel();
        listaVendas = vendaDAOImpl.findAll();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        for(Venda venda: listaVendas) {
            String dataVenda = venda.getDataVenda().format(formatter);
            model.addRow(new Object[] {venda.getId(), venda.getValor(), dataVenda});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVendas = new javax.swing.JTable();

        tabelaVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "VALOR", "DATA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.Float.class, java.lang.String.class
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
        tabelaVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaVendasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaVendas);
        if (tabelaVendas.getColumnModel().getColumnCount() > 0) {
            tabelaVendas.getColumnModel().getColumn(0).setMaxWidth(60);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaVendasMouseClicked
        if(evt.getClickCount() == 2) {
            int linhaSelecionada = tabelaVendas.getSelectedRow();
            if(linhaSelecionada != -1) {
                Long idSelecionado = (Long) tabelaVendas.getValueAt(linhaSelecionada, 0);
                for(Venda venda: listaVendas) {
                    if(venda.getId().longValue() == idSelecionado.longValue()) {
                        ListarCarrinhoDialog listarCarrinhoDialog = new ListarCarrinhoDialog(null, true, new ArrayList<>(venda.getProdutoVendas()), null);
                        listarCarrinhoDialog.setLocationRelativeTo(this);
                        listarCarrinhoDialog.setVisible(true);
                        return;
                    }
                }
            }
        }
    }//GEN-LAST:event_tabelaVendasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaVendas;
    // End of variables declaration//GEN-END:variables
    private final VendaDAOImpl vendaDAOImpl = new VendaDAOImpl();
    private final List<Venda> listaVendas;
}