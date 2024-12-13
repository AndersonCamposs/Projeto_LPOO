
package view;

import java.awt.Component;
import java.util.Optional;
import javax.swing.JInternalFrame;

public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
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
        listarUsuarioMenuItemActionPerformed = new javax.swing.JCheckBoxMenuItem();
        jMenu5 = new javax.swing.JMenu();
        registrarClienteMenuItem = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jCheckBoxMenuItem5 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem6 = new javax.swing.JCheckBoxMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jCheckBoxMenuItem7 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem8 = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();

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
            .addGap(0, 713, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
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

        listarUsuarioMenuItemActionPerformed.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        listarUsuarioMenuItemActionPerformed.setSelected(true);
        listarUsuarioMenuItemActionPerformed.setText("Listar usuários");
        listarUsuarioMenuItemActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarUsuarioMenuItemActionPerformedActionPerformed(evt);
            }
        });
        jMenu3.add(listarUsuarioMenuItemActionPerformed);

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

        jCheckBoxMenuItem4.setSelected(true);
        jCheckBoxMenuItem4.setText("Listar clientes");
        jMenu5.add(jCheckBoxMenuItem4);

        jMenu1.add(jMenu5);

        jMenu4.setText("Reserva");

        jCheckBoxMenuItem5.setSelected(true);
        jCheckBoxMenuItem5.setText("Registrar uma reserva");
        jMenu4.add(jCheckBoxMenuItem5);

        jCheckBoxMenuItem6.setSelected(true);
        jCheckBoxMenuItem6.setText("Listar reservas");
        jMenu4.add(jCheckBoxMenuItem6);

        jMenu1.add(jMenu4);

        jMenu6.setText("Produtos");

        jCheckBoxMenuItem7.setSelected(true);
        jCheckBoxMenuItem7.setText("Registrar um produto");
        jMenu6.add(jCheckBoxMenuItem7);

        jCheckBoxMenuItem8.setSelected(true);
        jCheckBoxMenuItem8.setText("Listar produtos");
        jMenu6.add(jCheckBoxMenuItem8);

        jMenu1.add(jMenu6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
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

    public void formularioEdicao(Long id) {
        this.limparTela();
        montarFormularioUsuarioJIF(Optional.of(id));
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
            formulario = new RegistrarUsuarioPane(id.get());
        }
        formularioUsuarioJIF.add(formulario);
        jDesktopPane1.add(formularioUsuarioJIF);
    }
    
    private void listarUsuarioMenuItemActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarUsuarioMenuItemActionPerformedActionPerformed
        JInternalFrame listarUsuarioJIF = new JInternalFrame("Lista de clientes");
        listarUsuarioJIF.setBounds(100, 100, 410, 330);
        listarUsuarioJIF.setVisible(true);
        listarUsuarioJIF.setClosable(true);
        listarUsuarioJIF.setResizable(true);
        ListarUsuarioPane listarUsuarioPane = new ListarUsuarioPane(this);
        listarUsuarioJIF.add(listarUsuarioPane);
        jDesktopPane1.add(listarUsuarioJIF);
    }//GEN-LAST:event_listarUsuarioMenuItemActionPerformedActionPerformed
 
    private void registrarClienteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarClienteMenuItemActionPerformed
        this.limparTela();
        montarFormularioClienteJIF(Optional.empty());
    }//GEN-LAST:event_registrarClienteMenuItemActionPerformed

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
    
    private void limparTela() {
        for(Component component: jDesktopPane1.getComponents()) {
            if(component instanceof JInternalFrame) {
                jDesktopPane1.remove(component);
            }
        }
        this.revalidate();
        this.repaint();
    }
    
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem5;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem6;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem7;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem8;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JCheckBoxMenuItem listarUsuarioMenuItemActionPerformed;
    private javax.swing.JCheckBoxMenuItem registrarClienteMenuItem;
    private javax.swing.JCheckBoxMenuItem registrarUsuarioMenuItem;
    // End of variables declaration//GEN-END:variables
}
