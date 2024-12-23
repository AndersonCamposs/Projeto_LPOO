
package view;

import java.awt.Component;
import java.util.Optional;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import model.entity.Usuario;

public class TelaPrincipal extends javax.swing.JFrame {

    private Usuario authUser;
    
    public TelaPrincipal(Usuario authUser) {
        initComponents();
        this.setResizable(false);
        this.authUser = authUser;
    }
   
    public Usuario getAuthUser() {
        return this.authUser;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        registrarUsuarioMenuItem = new javax.swing.JCheckBoxMenuItem();
        listarUsuariosMenuItemActionPerformed = new javax.swing.JCheckBoxMenuItem();
        jMenu5 = new javax.swing.JMenu();
        registrarClienteMenuItem = new javax.swing.JCheckBoxMenuItem();
        listarClientesMenuItem = new javax.swing.JCheckBoxMenuItem();
        jMenu4 = new javax.swing.JMenu();
        registrarReservaMenuItem = new javax.swing.JCheckBoxMenuItem();
        listarReservasMenuItem = new javax.swing.JCheckBoxMenuItem();
        jMenu6 = new javax.swing.JMenu();
        registrarProdutoMenuItem = new javax.swing.JCheckBoxMenuItem();
        listarProdutosMenuItem = new javax.swing.JCheckBoxMenuItem();
        jMenu9 = new javax.swing.JMenu();
        registrarCategoriaMenuItem = new javax.swing.JCheckBoxMenuItem();
        listarCategoriasMenuItem = new javax.swing.JCheckBoxMenuItem();
        jMenu7 = new javax.swing.JMenu();
        registrarVendaMenuItem = new javax.swing.JMenuItem();
        listarVendasMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        sairMenuItem = new javax.swing.JMenuItem();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arena Campos");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastros");

        jMenu3.setText("Usuários");

        registrarUsuarioMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        registrarUsuarioMenuItem.setSelected(true);
        registrarUsuarioMenuItem.setText("Registrar usuário");
        registrarUsuarioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarUsuarioMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(registrarUsuarioMenuItem);

        listarUsuariosMenuItemActionPerformed.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        listarUsuariosMenuItemActionPerformed.setSelected(true);
        listarUsuariosMenuItemActionPerformed.setText("Listar usuários");
        listarUsuariosMenuItemActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarUsuariosMenuItemActionPerformedActionPerformed(evt);
            }
        });
        jMenu3.add(listarUsuariosMenuItemActionPerformed);

        jMenu1.add(jMenu3);

        jMenu5.setText("Cliente");

        registrarClienteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        registrarClienteMenuItem.setSelected(true);
        registrarClienteMenuItem.setText("Registrar cliente");
        registrarClienteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarClienteMenuItemActionPerformed(evt);
            }
        });
        jMenu5.add(registrarClienteMenuItem);

        listarClientesMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        listarClientesMenuItem.setSelected(true);
        listarClientesMenuItem.setText("Listar clientes");
        listarClientesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarClientesMenuItemActionPerformed(evt);
            }
        });
        jMenu5.add(listarClientesMenuItem);

        jMenu1.add(jMenu5);

        jMenu4.setText("Reserva");

        registrarReservaMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        registrarReservaMenuItem.setSelected(true);
        registrarReservaMenuItem.setText("Registrar uma reserva");
        registrarReservaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarReservaMenuItemActionPerformed(evt);
            }
        });
        jMenu4.add(registrarReservaMenuItem);

        listarReservasMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        listarReservasMenuItem.setSelected(true);
        listarReservasMenuItem.setText("Listar reservas");
        listarReservasMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarReservasMenuItemActionPerformed(evt);
            }
        });
        jMenu4.add(listarReservasMenuItem);

        jMenu1.add(jMenu4);

        jMenu6.setText("Produtos");

        registrarProdutoMenuItem.setSelected(true);
        registrarProdutoMenuItem.setText("Registrar um produto");
        registrarProdutoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarProdutoMenuItemActionPerformed(evt);
            }
        });
        jMenu6.add(registrarProdutoMenuItem);

        listarProdutosMenuItem.setSelected(true);
        listarProdutosMenuItem.setText("Listar produtos");
        listarProdutosMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarProdutosMenuItemActionPerformed(evt);
            }
        });
        jMenu6.add(listarProdutosMenuItem);

        jMenu9.setText("Categorias");

        registrarCategoriaMenuItem.setSelected(true);
        registrarCategoriaMenuItem.setText("Registrar categoria");
        registrarCategoriaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarCategoriaMenuItemActionPerformed(evt);
            }
        });
        jMenu9.add(registrarCategoriaMenuItem);

        listarCategoriasMenuItem.setSelected(true);
        listarCategoriasMenuItem.setText("Listar categorias");
        listarCategoriasMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarCategoriasMenuItemActionPerformed(evt);
            }
        });
        jMenu9.add(listarCategoriasMenuItem);

        jMenu6.add(jMenu9);

        jMenu1.add(jMenu6);

        jMenu7.setText("Vendas");

        registrarVendaMenuItem.setText("Registrar venda");
        registrarVendaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarVendaMenuItemActionPerformed(evt);
            }
        });
        jMenu7.add(registrarVendaMenuItem);

        listarVendasMenuItem.setText("Listar vendas");
        listarVendasMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarVendasMenuItemActionPerformed(evt);
            }
        });
        jMenu7.add(listarVendasMenuItem);

        jMenu1.add(jMenu7);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opções");

        sairMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        sairMenuItem.setText("Sair");
        sairMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(sairMenuItem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarUsuarioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarUsuarioMenuItemActionPerformed
        this.limparTela();
        montarFormularioUsuarioJIF(Optional.empty());
    }//GEN-LAST:event_registrarUsuarioMenuItemActionPerformed

    private void listarUsuariosMenuItemActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarUsuariosMenuItemActionPerformedActionPerformed
        JInternalFrame listarUsuarioJIF = new JInternalFrame("Lista de Usuários");
        listarUsuarioJIF.setBounds(100, 50, 410, 500);
        listarUsuarioJIF.setVisible(true);
        listarUsuarioJIF.setClosable(true);
        listarUsuarioJIF.setResizable(true);
        ListarUsuariosPane listarUsuarioPane = new ListarUsuariosPane(this);
        listarUsuarioJIF.add(listarUsuarioPane);
        jDesktopPane1.add(listarUsuarioJIF);
    }//GEN-LAST:event_listarUsuariosMenuItemActionPerformedActionPerformed
 
    private void registrarClienteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarClienteMenuItemActionPerformed
        this.limparTela();
        montarFormularioClienteJIF(Optional.empty());
    }//GEN-LAST:event_registrarClienteMenuItemActionPerformed

    private void listarClientesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarClientesMenuItemActionPerformed
        JInternalFrame listarClienteJIF = new JInternalFrame("Lista de clientes");
        listarClienteJIF.setBounds(100, 50, 500, 500);
        listarClienteJIF.setVisible(true);
        listarClienteJIF.setClosable(true);
        listarClienteJIF.setResizable(true);
        ListarClientesPane listarClientePane = new ListarClientesPane(this);
        listarClienteJIF.add(listarClientePane);
        jDesktopPane1.add(listarClienteJIF);
    }//GEN-LAST:event_listarClientesMenuItemActionPerformed

    private void registrarReservaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarReservaMenuItemActionPerformed
        this.limparTela();
        montarFormularioReservaJIF(Optional.empty());
    }//GEN-LAST:event_registrarReservaMenuItemActionPerformed

    private void listarReservasMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarReservasMenuItemActionPerformed
        JInternalFrame listarReservaJIF = new JInternalFrame("Lista de Reservas");
        listarReservaJIF.setBounds(100, 100, 500, 330);
        listarReservaJIF.setVisible(true);
        listarReservaJIF.setClosable(true);
        listarReservaJIF.setResizable(true);
        ListarReservasPane listarReservasPane = new ListarReservasPane(this);
        listarReservaJIF.add(listarReservasPane);
        jDesktopPane1.add(listarReservaJIF);
    }//GEN-LAST:event_listarReservasMenuItemActionPerformed

    private void listarCategoriasMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarCategoriasMenuItemActionPerformed
        JInternalFrame listarCategoriasJIF = new JInternalFrame("Lista de categorias");
        listarCategoriasJIF.setBounds(100, 100, 200, 330);
        listarCategoriasJIF.setVisible(true);
        listarCategoriasJIF.setClosable(true);
        listarCategoriasJIF.setResizable(true);
        ListarCategoriasPane listarCategoriasPane = new ListarCategoriasPane(this);
        listarCategoriasJIF.add(listarCategoriasPane);
        jDesktopPane1.add(listarCategoriasJIF);
    }//GEN-LAST:event_listarCategoriasMenuItemActionPerformed

    private void registrarCategoriaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarCategoriaMenuItemActionPerformed
        montarFormularioCategoriaJIF(Optional.empty());
    }//GEN-LAST:event_registrarCategoriaMenuItemActionPerformed

    private void registrarProdutoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarProdutoMenuItemActionPerformed
        montarFormularioProdutoJIF(Optional.empty());
    }//GEN-LAST:event_registrarProdutoMenuItemActionPerformed

    private void listarProdutosMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarProdutosMenuItemActionPerformed
       JInternalFrame listarProdutosJIF = new JInternalFrame("Lista de produtos");
       listarProdutosJIF.setBounds(100, 50, 480, 500);
       listarProdutosJIF.setVisible(true);
       listarProdutosJIF.setClosable(true);
       listarProdutosJIF.setResizable(true);
       ListarProdutosPane listarProdutosPane = new ListarProdutosPane(this);
       listarProdutosJIF.add(listarProdutosPane);
       jDesktopPane1.add(listarProdutosJIF);
    }//GEN-LAST:event_listarProdutosMenuItemActionPerformed

    private void registrarVendaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarVendaMenuItemActionPerformed
       montarFormularioVendaJIF();
    }//GEN-LAST:event_registrarVendaMenuItemActionPerformed

    private void listarVendasMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarVendasMenuItemActionPerformed
        JInternalFrame listarVendasJIF = new JInternalFrame("Lista de vendas");
        listarVendasJIF.setBounds(100, 100, 450, 330);
        listarVendasJIF.setVisible(true);
        listarVendasJIF.setClosable(true);
        listarVendasJIF.setResizable(true);
        ListarVendasPane listarVendasPane = new ListarVendasPane(this);
        listarVendasJIF.add(listarVendasPane);
        jDesktopPane1.add(listarVendasJIF);
    }//GEN-LAST:event_listarVendasMenuItemActionPerformed

    private void sairMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairMenuItemActionPerformed
       logout();
    }//GEN-LAST:event_sairMenuItemActionPerformed

    
    
    public void ativarEdicaoUsuario(Long id) {
        this.limparTela();
        montarFormularioUsuarioJIF(Optional.of(id));
    }
    
    public void ativarEdicaoUsuarioSenha(Long id) {
        this.limparTela();
        montarFormularioEdicaoSenha(id);
    }
    
    public void ativarEdicaoCliente(Long id) {
        this.limparTela();
        montarFormularioClienteJIF(Optional.of(id));
    }
    
    public void ativarEdicaoReserva(Long id) {
        this.limparTela();
        montarFormularioReservaJIF(Optional.of(id));
    }
    
    public void ativarEdicaoCategoria(Long id) {
        this.limparTela();
        montarFormularioCategoriaJIF(Optional.of(id));
    }
    
    public void ativarEdicaoProduto(Long id) {
        this.limparTela();
        montarFormularioProdutoJIF(Optional.of(id));
    }
    
    private void montarFormularioUsuarioJIF(Optional<Long> id) {
        JInternalFrame formularioUsuarioJIF = new JInternalFrame("Formulário de usuário");
        formularioUsuarioJIF.setBounds(100, 100, 410, 370);
        formularioUsuarioJIF.setVisible(true);
        formularioUsuarioJIF.setClosable(true);
        formularioUsuarioJIF.setResizable(true);
        
        RegistrarUsuarioPane formulario;
        if(id.isEmpty()) {
            formulario = new RegistrarUsuarioPane();
        } else {
            formulario = new RegistrarUsuarioPane(id.get(), this);
        }
        formularioUsuarioJIF.add(formulario);
        jDesktopPane1.add(formularioUsuarioJIF);
    }
    
    private void montarFormularioEdicaoSenha(Long id) {
        JInternalFrame formularioEdicaoSenhaJIF = new JInternalFrame("Editar senha");
        formularioEdicaoSenhaJIF.setBounds(100, 100, 450, 370);
        formularioEdicaoSenhaJIF.setVisible(true);
        formularioEdicaoSenhaJIF.setClosable(true);
        
        EditarSenhaPane formulario = new EditarSenhaPane(id, this);
        formularioEdicaoSenhaJIF.add(formulario);
        jDesktopPane1.add(formularioEdicaoSenhaJIF);
    }
    
    private void montarFormularioClienteJIF(Optional<Long> id) {
        JInternalFrame formularioClienteJIF = new JInternalFrame("Formulário de cliente");
        formularioClienteJIF.setBounds(100, 100, 410, 370);
        formularioClienteJIF.setVisible(true);
        formularioClienteJIF.setClosable(true);
        formularioClienteJIF.setResizable(true);
        
        RegistrarClientePane formulario;
        if(id.isEmpty()) {
            formulario = new RegistrarClientePane();
        } else {
            formulario = new RegistrarClientePane(id.get());
        }
        formularioClienteJIF.add(formulario);
        jDesktopPane1.add(formularioClienteJIF);
    }
    
    private void montarFormularioReservaJIF(Optional<Long> id) {
        JInternalFrame formularioReservaJIF = new JInternalFrame("Formulário de Reserva");
        formularioReservaJIF.setBounds(100, 100, 360, 180);
        formularioReservaJIF.setVisible(true);
        formularioReservaJIF.setClosable(true);
        formularioReservaJIF.setResizable(true);
        RegistrarReservaPane formulario;
        if(id.isEmpty()) {
             formulario = new RegistrarReservaPane(formularioReservaJIF);
        } else {
            formulario = new RegistrarReservaPane(formularioReservaJIF, id.get());
        }
        formularioReservaJIF.add(formulario);
        jDesktopPane1.add(formularioReservaJIF);
    }
    
    private void montarFormularioCategoriaJIF(Optional<Long> id) {
        JInternalFrame formularioCategoriaJIF = new JInternalFrame("Formulário de categoria");
        formularioCategoriaJIF.setBounds(100, 100, 350, 250);
        formularioCategoriaJIF.setVisible(true);
        formularioCategoriaJIF.setClosable(true);
        formularioCategoriaJIF.setResizable(true);
        
        RegistrarCategoriaPane formulario;
        if(id.isEmpty()) {
            formulario = new RegistrarCategoriaPane();
        } else {
            formulario = new RegistrarCategoriaPane(id.get());
        }
        
        formularioCategoriaJIF.add(formulario);
        jDesktopPane1.add(formularioCategoriaJIF);
    }
    
    private void montarFormularioProdutoJIF(Optional<Long> id) {
        JInternalFrame formularioProdutoJIF = new JInternalFrame("Formulário de produto");
        formularioProdutoJIF.setBounds(100, 100, 380, 200);
        formularioProdutoJIF.setVisible(true);
        formularioProdutoJIF.setClosable(true);
        formularioProdutoJIF.setResizable(true);
        RegistrarProdutoPane formulario;
        if(id.isEmpty()) {
            formulario = new RegistrarProdutoPane();
        } else {
            formulario = new RegistrarProdutoPane(id.get());
        }
        
        formularioProdutoJIF.add(formulario);
        jDesktopPane1.add(formularioProdutoJIF);
    }
    
    private void montarFormularioVendaJIF() {
        JInternalFrame formularioVendaJIF = new JInternalFrame("Formulário de venda");
        formularioVendaJIF.setBounds(100, 50, 500, 500);
        formularioVendaJIF.setVisible(true);
        formularioVendaJIF.setClosable(true);
        formularioVendaJIF.setResizable(false);
        
        RegistrarVendaPane formulario = new RegistrarVendaPane();
        formularioVendaJIF.add(formulario);  
        jDesktopPane1.add(formularioVendaJIF);
    }
        
    
    private void limparTela() {
        for(Component component: jDesktopPane1.getComponents()) {
            if(component instanceof JInternalFrame) {
                jDesktopPane1.remove(component);
            }
        }
        this.revalidate();
        this.repaint();
    }
    
    public JDesktopPane getJDesktopPane() {
        return this.jDesktopPane1;
    }
    
    public void logout() {
        new LoginFrame().setVisible(true);
        this.dispose();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JCheckBoxMenuItem listarCategoriasMenuItem;
    private javax.swing.JCheckBoxMenuItem listarClientesMenuItem;
    private javax.swing.JCheckBoxMenuItem listarProdutosMenuItem;
    private javax.swing.JCheckBoxMenuItem listarReservasMenuItem;
    private javax.swing.JCheckBoxMenuItem listarUsuariosMenuItemActionPerformed;
    private javax.swing.JMenuItem listarVendasMenuItem;
    private javax.swing.JCheckBoxMenuItem registrarCategoriaMenuItem;
    private javax.swing.JCheckBoxMenuItem registrarClienteMenuItem;
    private javax.swing.JCheckBoxMenuItem registrarProdutoMenuItem;
    private javax.swing.JCheckBoxMenuItem registrarReservaMenuItem;
    private javax.swing.JCheckBoxMenuItem registrarUsuarioMenuItem;
    private javax.swing.JMenuItem registrarVendaMenuItem;
    private javax.swing.JMenuItem sairMenuItem;
    // End of variables declaration//GEN-END:variables
}
