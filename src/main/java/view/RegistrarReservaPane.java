package view;

import jakarta.validation.ConstraintViolationException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import model.dao.ClienteDAOImpl;
import model.dao.DiaSemanaDAOImpl;
import model.dao.HorarioDAOImpl;
import model.dao.QuadraDAOImpl;
import model.dao.ReservaDAOImpl;
import model.entity.Cliente;
import model.entity.Horario;
import model.entity.Quadra;
import model.entity.Reserva;
import utils.ValidationUtils;

public class RegistrarReservaPane extends javax.swing.JPanel {

    private JInternalFrame formularioReservaJIF;
    /**
     * Creates new form RegistrarUsuario
     */
    public RegistrarReservaPane(JInternalFrame formularioReservaJIF) {
        initComponents();
        painelAgendamento.setVisible(false);
        comboBoxHorario.setEnabled(false);
        this.formularioReservaJIF = formularioReservaJIF;
        jLabel1.setText("Registrar reserva");
        btnDeletar.setVisible(false);
    }
    
    public RegistrarReservaPane(JInternalFrame formularioReservaJIF, Long id) {
        initComponents();
        this.formularioReservaJIF = formularioReservaJIF;
        ReservaDAOImpl reservaDAOImpl = new ReservaDAOImpl();
        this.r = reservaDAOImpl.findById(id);
        jLabel1.setText("Informações da reserva");
        this.formularioReservaJIF.setBounds(100, 100, 410, 300);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        inputDataReserva.setValue(r.getDataReserva().format(formatter));
        inputCpfCliente.setText(r.getCliente().getCpf());
        inputCpfCliente.setEnabled(false);
        inputDataReserva.setEnabled(false);
        btnSalvar.setVisible(false);
        btnVerificarDispobibilidades.setEnabled(false);
        
        btnDeletar.setVisible(true);
        loadComboBoxQuadraContent();
    }
    
    private void loadComboBoxQuadraContent() {
        QuadraDAOImpl quadraDAOImpl = new QuadraDAOImpl();
        List<Quadra> listaQuadras = quadraDAOImpl.findAll();
        for(Quadra quadra: listaQuadras) {
            comboBoxQuadra.addItem(quadra);
        }
        if (r != null) {
            if (listaQuadras.contains(r.getQuadra())) {
                comboBoxQuadra.setSelectedItem(r.getQuadra());
                comboBoxQuadra.setEnabled(false);
            }
        } else {
          comboBoxQuadra.setSelectedIndex(0);
          // ISSO ATIVA O ACTION PERFORMED DO comboBoxQuadra
        }
        
    }
    
    private void loadComboBoxHorarioContent(List<Horario> lista) {
        comboBoxHorario.removeAllItems();
        for(Horario horario: lista) {
            comboBoxHorario.addItem(horario);
        }
        if (r != null) {
            comboBoxHorario.setSelectedItem(r.getHorario());
            comboBoxHorario.setEnabled(false);
        } else {
            comboBoxHorario.setSelectedIndex(0);
            comboBoxHorario.setEnabled(true);
        }
        
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
        inputCpfCliente = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        btnDeletar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

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
        inputDataReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDataReservaActionPerformed(evt);
            }
        });

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

        try {
            inputCpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("CPF do Cliente");

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAgendamentoLayout = new javax.swing.GroupLayout(painelAgendamento);
        painelAgendamento.setLayout(painelAgendamentoLayout);
        painelAgendamentoLayout.setHorizontalGroup(
            painelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAgendamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAgendamentoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelAgendamentoLayout.createSequentialGroup()
                        .addGroup(painelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(inputCpfCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxQuadra, javax.swing.GroupLayout.Alignment.LEADING, 0, 106, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(32, 32, 32)
                        .addGroup(painelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelAgendamentoLayout.createSequentialGroup()
                                .addGroup(painelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(0, 76, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAgendamentoLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))))
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
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar)
                    .addComponent(btnDeletar))
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputDataReserva)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(112, 112, 112)))
                .addComponent(btnVerificarDispobibilidades)
                .addGap(162, 162, 162))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painelAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(painelAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarDispobibilidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarDispobibilidadesActionPerformed
        if(Pattern.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}", inputDataReserva.getText())) {
            painelAgendamento.setVisible(true);
            this.formularioReservaJIF.setBounds(100, 100, 410, 300);
            loadComboBoxQuadraContent();
        } else {
            JOptionPane.showMessageDialog(this, "Data inválida, tente novamente.", "ERRO: Data inválida", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnVerificarDispobibilidadesActionPerformed

    private void comboBoxQuadraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxQuadraActionPerformed
        ReservaDAOImpl reservaDAOImpl = new ReservaDAOImpl();
        List<Reserva> reservasRegistradas = reservaDAOImpl.findByDataAndQuadra(getDateObject(inputDataReserva.getText()), (Quadra) comboBoxQuadra.getSelectedItem());
        HorarioDAOImpl horarioDAOImpl = new HorarioDAOImpl();
        List<Horario> listaHorarios = horarioDAOImpl.findAll();
        
        for (Reserva reserva: reservasRegistradas) {
            if(this.r != null && listaHorarios.contains(this.r.getHorario())) {
                continue;
            } else if(listaHorarios.contains(reserva.getHorario())) {
                listaHorarios.remove(reserva.getHorario());
            }
        }
        loadComboBoxHorarioContent(listaHorarios);
    }//GEN-LAST:event_comboBoxQuadraActionPerformed

    private void comboBoxHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxHorarioActionPerformed

    private void inputDataReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDataReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDataReservaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        ClienteDAOImpl clienteDAOImpl = new ClienteDAOImpl();
        List<Cliente> listaClientes = clienteDAOImpl.findByCpf(inputCpfCliente.getText());
        if (!listaClientes.isEmpty()) {
            try {
                Reserva reserva = prepareReservaObj(listaClientes.get(0));
                salvarReserva(reserva);
                JOptionPane.showMessageDialog(this, "Reserva cadastrada com sucesso.", "SUCESSO: Reserva cadastrada", JOptionPane.INFORMATION_MESSAGE);
                this.limparCampos();
                painelAgendamento.setVisible(false);
                this.formularioReservaJIF.setBounds(100, 100, 360, 180);
            } catch (ConstraintViolationException e) {
                JOptionPane.showMessageDialog(this, ValidationUtils.formatValidationErrors(e.getConstraintViolations()), "ERRO: Violação de restrição", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Cliente não encontrado, verifique e tente novamente.", "ERRO: Cliente não encontrado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Tem ceteza que deseja deletar esta reserva?",
        "Deletar cliente", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
            if (r != null) {
                ReservaDAOImpl resevaDAOImpl = new ReservaDAOImpl();
                resevaDAOImpl.delete(r);
                JOptionPane.showMessageDialog(this, "Reserva deletada com sucesso!", "SUCESSO: Reserva deletado", JOptionPane.INFORMATION_MESSAGE);  
                r = null;
                limparCampos();
                btnDeletar.setEnabled(false);
            }
            
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private LocalDate getDateObject(String date) {
        String[] arrayDate = date.split("/");
        int y = Integer.parseInt(arrayDate[2]);
        int m = Integer.parseInt(arrayDate[1]);
        int d = Integer.parseInt(arrayDate[0]);
        return LocalDate.of(y, m, d);
    }
    
    private void salvarReserva(Reserva reserva) throws ConstraintViolationException {
        ReservaDAOImpl reservaDAOImpl = new ReservaDAOImpl();
        reservaDAOImpl.save(reserva);
    }
    
    private Reserva prepareReservaObj(Cliente cliente) {
        Reserva reserva = new Reserva();
        if (r != null) {
            reserva.setId(r.getId());
        }
        reserva.setCliente(cliente);
        reserva.setDataReserva(getDateObject(inputDataReserva.getText()));
        reserva.setDiaSemana(new DiaSemanaDAOImpl().findByNome(reserva.getDataReserva().getDayOfWeek()).get(0));
        reserva.setHorario((Horario) comboBoxHorario.getSelectedItem());
        reserva.setQuadra((Quadra) comboBoxQuadra.getSelectedItem());
        reserva.setValor(50.0f);
        
        return reserva;
    }
    
    private void limparCampos() {
        inputCpfCliente.setText("");
        inputDataReserva.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVerificarDispobibilidades;
    private javax.swing.JComboBox<Horario> comboBoxHorario;
    private javax.swing.JComboBox<Quadra> comboBoxQuadra;
    private javax.swing.JFormattedTextField inputCpfCliente;
    private javax.swing.JFormattedTextField inputDataReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel painelAgendamento;
    // End of variables declaration//GEN-END:variables
    private Reserva r;
}
