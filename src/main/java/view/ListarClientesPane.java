package view;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.dao.ClienteDAOImpl;
import model.entity.Cliente;

public class ListarClientesPane extends javax.swing.JPanel {

    private TelaPrincipal telaPrincipal;
    
    public ListarClientesPane(TelaPrincipal telaPrincipal) {
        initComponents();
        this.telaPrincipal = telaPrincipal;
        DefaultTableModel model = (DefaultTableModel) tabelaClientes.getModel();
        List<Cliente> listaClientes = clienteDAOImpl.findAll();
        for(Cliente cliente : listaClientes) {
            model.addRow(new Object[] {cliente.getId(), cliente.getNome(), cliente.getCpf(), cliente.getTelefone()});
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
        tabelaClientes = new javax.swing.JTable();

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "CPF", "TELEFONE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaClientes);
        if (tabelaClientes.getColumnModel().getColumnCount() > 0) {
            tabelaClientes.getColumnModel().getColumn(0).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(0).setPreferredWidth(40);
            tabelaClientes.getColumnModel().getColumn(1).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(1).setPreferredWidth(200);
            tabelaClientes.getColumnModel().getColumn(2).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(2).setPreferredWidth(100);
            tabelaClientes.getColumnModel().getColumn(3).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClientesMouseClicked
        if(evt.getClickCount() == 2) {
            int linhaSelecionada = tabelaClientes.getSelectedRow();
            if (linhaSelecionada != -1) {
                Long idSelecionado = (Long) tabelaClientes.getValueAt(linhaSelecionada, 0);
                telaPrincipal.ativarEdicaoCliente(idSelecionado);
            }
        }
    }//GEN-LAST:event_tabelaClientesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaClientes;
    // End of variables declaration//GEN-END:variables
    ClienteDAOImpl clienteDAOImpl = new ClienteDAOImpl();
}