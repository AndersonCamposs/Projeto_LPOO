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
        painelAgendamento.setVisible(false);
        comboBoxHorario.setEnabled(false);
        /*loadComboBoxContent();
        jLabel1.setText("Registrar reserva");
        btnDeletar.setVisible(false);*/
    }
    
    public RegistrarReservaPane(Long id) {
        initComponents();
        
    }
    
    private void loadComboBoxQuadraContent() {
        QuadraDAOImpl quadraDAOImpl = new QuadraDAOImpl();
        List<Quadra> listaQuadras = quadraDAOImpl.findAll();
        for(Quadra quadra: listaQuadras) {
            comboBoxQuadra.addItem(quadra);
        }
        comboBoxQuadra.setSelectedIndex(-1);
    }
    
    private void loadComboBoxHorarioContent() {
        HorarioDAOImpl horarioDAOImpl = new HorarioDAOImpl();
        List<Horario> listaHorarios = horarioDAOImpl.findAll();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inputDataReserva = new javax.swing.JFormattedTextField();
        btnVerificarDispobibilidades = new javax.swing.JButton();
        painelAgendamento = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        comboBoxQuadra = new javax.swing.JComboBox<>();
        comboBoxHorario = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setPreferredSize(new java.awt.Dimension(394, 322));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Data:");

        try {
            inputDataReserva.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnVerificarDispobibilidades.setText("Ver vagas");
        btnVerificarDispobibilidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarDispobibilidadesActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Quadra: ");

        comboBoxQuadra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboBoxQuadra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxQuadraActionPerformed(evt);
            }
        });

        comboBoxHorario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboBoxHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxHorarioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Horário:");

        javax.swing.GroupLayout painelAgendamentoLayout = new javax.swing.GroupLayout(painelAgendamento);
        painelAgendamento.setLayout(painelAgendamentoLayout);
        painelAgendamentoLayout.setHorizontalGroup(
            painelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAgendamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBoxQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(painelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(comboBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelAgendamentoLayout.setVerticalGroup(
            painelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAgendamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(inputDataReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnVerificarDispobibilidades))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jLabel1)))
                        .addGap(0, 103, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painelAgendamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputDataReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerificarDispobibilidades))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(painelAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarDispobibilidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarDispobibilidadesActionPerformed
        painelAgendamento.setVisible(true);
        ReservaDAOImpl reservaDAOImpl = new ReservaDAOImpl();
        this.listaReservas = reservaDAOImpl.getByDate(getDateObject(inputDataReserva.getText()));
        
    }//GEN-LAST:event_btnVerificarDispobibilidadesActionPerformed

    private void comboBoxQuadraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxQuadraActionPerformed
        
        System.out.println("Vai carregar os horários diponíveis");
    }//GEN-LAST:event_comboBoxQuadraActionPerformed

    private void comboBoxHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxHorarioActionPerformed

    private LocalDate getDateObject(String date) {
        String[] arrayDate = date.split("/");
        int y = Integer.parseInt(arrayDate[2]);
        int m = Integer.parseInt(arrayDate[1]);
        int d = Integer.parseInt(arrayDate[0]);
        return LocalDate.of(y, m, d);
    }
    
    private void limparCampos() {
        /*inputCpfCliente.setText("");
        inputDataReserva.setText("");
        comboBoxQuadra.setSelectedIndex(0);
        comboBoxHorario.setSelectedIndex(0);
        comboBoxDiaSemana.setSelectedIndex(0);*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerificarDispobibilidades;
    private javax.swing.JComboBox<Horario> comboBoxHorario;
    private javax.swing.JComboBox<Quadra> comboBoxQuadra;
    private javax.swing.JFormattedTextField inputDataReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel painelAgendamento;
    // End of variables declaration//GEN-END:variables
    List<Reserva> listaReservas;
}
