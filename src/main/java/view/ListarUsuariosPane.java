package view;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.entity.Usuario;
import model.dao.UsuarioDAOImpl;
import model.filter.UsuarioFilter;


public class ListarUsuariosPane extends javax.swing.JPanel {

    private final TelaPrincipal telaPrincipal;
    
    public ListarUsuariosPane(TelaPrincipal telaPrincipal) {
        initComponents();
        this.telaPrincipal = telaPrincipal;
        preencherTabela(usuarioDAOImpl.findAll());
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
        tabelaUsuarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputNomeUsuario = new javax.swing.JTextField();

        tabelaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "LOGIN", "NOME"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class
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
        tabelaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaUsuarios);
        if (tabelaUsuarios.getColumnModel().getColumnCount() > 0) {
            tabelaUsuarios.getColumnModel().getColumn(0).setMaxWidth(60);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Filtrar lista");

        jLabel2.setText("Nome do usuário:");

        inputNomeUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputNomeUsuarioKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(inputNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 39, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaUsuariosMouseClicked
        if(evt.getClickCount() == 2) {
            int linhaSelecionada = tabelaUsuarios.getSelectedRow();
            if (linhaSelecionada != -1) {
                Long idSelecionado = (Long) tabelaUsuarios.getValueAt(linhaSelecionada, 0);
                telaPrincipal.ativarEdicaoUsuario(idSelecionado);
            }
            
        }
    }//GEN-LAST:event_tabelaUsuariosMouseClicked

    private void inputNomeUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputNomeUsuarioKeyReleased
        buscaFiltrada();
    }//GEN-LAST:event_inputNomeUsuarioKeyReleased

    private void buscaFiltrada() {
        String nomeUsuario = inputNomeUsuario.getText();
            UsuarioFilter clienteFilter = new UsuarioFilter();
            if (!nomeUsuario.isEmpty()) {
                clienteFilter = new UsuarioFilter(nomeUsuario);
            } 
            List<Usuario> listaFiltrada = usuarioDAOImpl.findWithFilter(clienteFilter);
            preencherTabela(listaFiltrada);
    }
    
    private void preencherTabela(List<Usuario> lista) {
        DefaultTableModel model = (DefaultTableModel) tabelaUsuarios.getModel();
        model.setRowCount(0);
        for (Usuario usuario: lista) {
            model.addRow(new Object[]{usuario.getId(), usuario.getLogin(), usuario.getNome()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputNomeUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaUsuarios;
    // End of variables declaration//GEN-END:variables
    private final UsuarioDAOImpl usuarioDAOImpl = new UsuarioDAOImpl();
}
