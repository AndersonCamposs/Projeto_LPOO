package view;

import java.awt.Dimension;
import java.sql.SQLException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;
import model.dao.ClienteDAOImpl;
import model.dao.DiaSemanaDAOImpl;
import model.dao.GenericDAOImpl;
import model.dao.HorarioDAOImpl;
import model.dao.QuadraDAOImpl;
import model.dao.ReservaDAOImpl;
import model.dao.UsuarioDAOImpl;
import model.entity.Cliente;
import model.entity.DiaSemana;
import model.entity.Horario;
import model.entity.Quadra;
import model.entity.Reserva;
import model.entity.Usuario;

public class RegistrarReservaPane extends javax.swing.JPanel {

    /**
     * Creates new form RegistrarUsuario
     */
    public RegistrarReservaPane() {
        initComponents();
        loadComboBoxContent();
        jLabel1.setText("Registrar reserva");
        btnDeletar.setVisible(false);
    }
    
    public RegistrarReservaPane(Long id) {
        initComponents();
        loadComboBoxContent();
    }
    
    private void loadComboBoxContent() {
        QuadraDAOImpl quadraDAOImpl = new QuadraDAOImpl();
        List<Quadra> listaQuadras = quadraDAOImpl.findAll();
        for(Quadra quadra: listaQuadras) {
            comboBoxQuadra.addItem(quadra);
        }
        
        comboBoxDiaSemana.setVisible(false);
        DiaSemanaDAOImpl diaSemanaDAOImpl = new DiaSemanaDAOImpl();
        List<DiaSemana> listaDiasSemana = diaSemanaDAOImpl.findAll();
        for(DiaSemana diaSemana: listaDiasSemana) {
            comboBoxDiaSemana.addItem(diaSemana);
        }
        
        HorarioDAOImpl horarioDAOImpl = new HorarioDAOImpl();
        List<Horario> listaHorarios = horarioDAOImpl.findAll();
        for (Horario horario: listaHorarios) {
            comboBoxHorario.addItem(horario);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        inputCpfCliente = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        comboBoxHorario = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        comboBoxQuadra = new javax.swing.JComboBox<>();
        inputDataReserva = new javax.swing.JFormattedTextField();
        comboBoxDiaSemana = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setPreferredSize(new java.awt.Dimension(394, 322));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("CPF:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Data:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        try {
            inputCpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Horário:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Quadra:");

        try {
            inputDataReserva.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDeletar)
                .addGap(159, 159, 159))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(120, 120, 120)
                                    .addComponent(btnSalvar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnLimpar))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel3)
                                    .addGap(88, 88, 88)
                                    .addComponent(jLabel1)))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(comboBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(comboBoxQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(34, 34, 34))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inputCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(inputDataReserva, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBoxDiaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputDataReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnLimpar))
                .addGap(18, 18, 18)
                .addComponent(btnDeletar)
                .addGap(18, 18, 18)
                .addComponent(comboBoxDiaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        ReservaDAOImpl reservaDAOImpl = new ReservaDAOImpl();
        ClienteDAOImpl clienteDAOImpl = new ClienteDAOImpl();
        List<Cliente> lista = clienteDAOImpl.getByCpf(inputCpfCliente.getText());
        if(!lista.isEmpty()) {
            Cliente cliente = lista.get(0);
            Reserva reserva = new Reserva();
            reserva.setDataReserva(getDateObject(inputDataReserva.getText()));
            for(int i = 0; i < comboBoxDiaSemana.getItemCount(); i++) {
                DiaSemana diaSemana = comboBoxDiaSemana.getItemAt(i);
                if(diaSemana.getNome().equalsIgnoreCase(reserva.getDataReserva().getDayOfWeek().name())) {
                    reserva.setDiaSemana(diaSemana);
                    break;
                }
            }
            reserva.setHorario((Horario) comboBoxHorario.getSelectedItem());
            reserva.setCliente(cliente);
            reserva.setValor(50f);
            
            reservaDAOImpl.save(reserva);
            
            JOptionPane.showMessageDialog(this, "Reserva salva com sucesso!", "SUCESSO: Reserva salva", JOptionPane.INFORMATION_MESSAGE);
            this.limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Cliente não encontrado", "ERRO: Cliente não encontrado", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private LocalDate getDateObject(String date) {
        String[] arrayDate = date.split("/");
        int y = Integer.parseInt(arrayDate[2]);
        int m = Integer.parseInt(arrayDate[1]);
        int d = Integer.parseInt(arrayDate[0]);
        return LocalDate.of(y, m, d);
    }
    
    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        this.limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void limparCampos() {
        inputCpfCliente.setText("");
        inputDataReserva.setText("");
        comboBoxQuadra.setSelectedIndex(0);
        comboBoxHorario.setSelectedIndex(0);
        comboBoxDiaSemana.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<DiaSemana> comboBoxDiaSemana;
    private javax.swing.JComboBox<Horario> comboBoxHorario;
    private javax.swing.JComboBox<Quadra> comboBoxQuadra;
    private javax.swing.JFormattedTextField inputCpfCliente;
    private javax.swing.JFormattedTextField inputDataReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
