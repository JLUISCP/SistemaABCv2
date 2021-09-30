/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import BD.EstudianteDAO;
import BD.InfSaludDAO;
import Clases.Estudiante;
import Clases.InfSalud;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author enano
 */
public class VistaInfSalud extends javax.swing.JFrame {
    Estudiante estudiante = new Estudiante();
    InfSalud infSalud = new InfSalud();

    /**
     * Creates new form VistaInfSalud
     */
    public VistaInfSalud() {
        initComponents();
        cargarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfPeso = new javax.swing.JTextField();
        tfAltura = new javax.swing.JTextField();
        tfPresionArterial = new javax.swing.JTextField();
        tfIMC = new javax.swing.JTextField();
        tfGrupoSanguineo = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbEstudiantes = new javax.swing.JTable();
        chActivo = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Información Salud");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Estudiantes");

        jLabel2.setText("Altura:");

        jLabel3.setText("Peso:");

        jLabel4.setText("Indice de masa corporal:");

        jLabel5.setText("Grupo sanguineo:");

        jLabel6.setText("Presión arterial:");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");

        tbEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idEstudiante", "Primer Nombre", "Segundo Nombre", "Primer Apellido", "Segundo Apellido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbEstudiantesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbEstudiantes);

        chActivo.setText("Activo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(37, 37, 37)
                                .addComponent(tfGrupoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfPresionArterial, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnModificar)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chActivo))
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tfPresionArterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chActivo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tfIMC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfGrupoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver)
                    .addComponent(btnModificar)
                    .addComponent(btnAgregar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void tbEstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEstudiantesMouseClicked
        // TODO add your handling code here:
        int seleccion = tbEstudiantes.rowAtPoint(evt.getPoint());
        estudiante.setIdEstudiante(Integer.parseInt(String.valueOf(tbEstudiantes.getValueAt(seleccion, 0))));
        estudiante.setPrimerNombre(String.valueOf(tbEstudiantes.getValueAt(seleccion, 1)));
        estudiante.setSegundoNombre(String.valueOf(tbEstudiantes.getValueAt(seleccion, 2)));
        estudiante.setPrimerApellido(String.valueOf(tbEstudiantes.getValueAt(seleccion, 3)));
        estudiante.setSegundoApellido(String.valueOf(tbEstudiantes.getValueAt(seleccion, 4)));
        llenarCampos();
    }//GEN-LAST:event_tbEstudiantesMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(camposVacios()){
            InfSalud infSalud = new InfSalud();
            
            infSalud.setPeso(tfPeso.getText());
            infSalud.setAltura(tfAltura.getText());
            infSalud.setPresionArterial(tfPresionArterial.getText());
            infSalud.setGrupo_sang(tfGrupoSanguineo.getText());
            infSalud.setIndiceMasaCorporal(tfIMC.getText());
            infSalud.setActivo(chActivo.isSelected());
            infSalud.setIdestudiante(estudiante.getIdEstudiante());
            Boolean resultado = InfSaludDAO.crearInfSalud(infSalud);
            if(resultado){
                JOptionPane.showMessageDialog(null, "Registro exitoso");
            }else{
                JOptionPane.showMessageDialog(null, "Fallo el registro de la información de salud");
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void llenarCampos() {
        tfPeso.setText(infSalud.getPeso());
        tfAltura.setText(infSalud.getAltura());
        tfPresionArterial.setText(infSalud.getPresionArterial());
        tfGrupoSanguineo.setText(infSalud.getGrupo_sang());
        tfIMC.setText(infSalud.getIndiceMasaCorporal());
        chActivo.setSelected(infSalud.getActivo());
        btnModificar.setEnabled(true);
        btnAgregar.setEnabled(true);
    }
    
    private boolean camposVacios(){
        Boolean camposLlenos = true;
        if(tfPeso.getText() == ""){
            camposLlenos = false;
        }
        if(tfAltura.getText() == ""){
            camposLlenos = false;
        }
        if(tfPresionArterial.getText() == ""){
            camposLlenos = false;
        }
        if(tfGrupoSanguineo.getText() == ""){
            camposLlenos = false;
        }
        if(tfIMC.getText() == ""){
            camposLlenos = false;
        }
        return camposLlenos; 
    }
    
    private void cargarDatos() {
        DefaultTableModel model = new DefaultTableModel();
        ResultSet rs = EstudianteDAO.consultarEstudiantes();
        model.setColumnIdentifiers(new Object[]{"idEstudiante","Primer nombre", "Segundo nombre", "Primer apellido", "Segundo apellido"});
        try{
            while(rs.next()){
                model.addRow(new Object[]{rs.getInt("idestudiante"), rs.getString("primernombre"), rs.getString("segundonombre"), rs.getString("primerapellido"), rs.getString("segundoapellido")});
                System.out.println("hlou");
            }
            tbEstudiantes.setModel(model);
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        btnModificar.setEnabled(false);
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
            java.util.logging.Logger.getLogger(VistaInfSalud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaInfSalud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaInfSalud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaInfSalud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaInfSalud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JCheckBox chActivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbEstudiantes;
    private javax.swing.JTextField tfAltura;
    private javax.swing.JTextField tfGrupoSanguineo;
    private javax.swing.JTextField tfIMC;
    private javax.swing.JTextField tfPeso;
    private javax.swing.JTextField tfPresionArterial;
    // End of variables declaration//GEN-END:variables
}