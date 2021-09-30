/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import BD.Database;
import BD.HistoriaAcademicaDAO;
import BD.EstudianteDAO;
import Clases.HistoriaAcademica;
import Clases.Estudiante;
import Clases.HistoriaAcademica;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Ventana para gestionar las operaciones de creación, modificación,
 * eliminación y consulta en la base de datos Escuela en PostgreSQL
 * para la tabla historia_academica. 
 * En esta clase se definen todos los eventos disparados por los componentes
 * de Java Swing en la ventana y se cargan de la base de datos la
 * información que está almacenada
 *
 * @author asisr
 */
public class VistaGestionHistoriaAcademica extends javax.swing.JFrame {

    HistoriaAcademica historialSeleccionado = new HistoriaAcademica();
    ArrayList<HistoriaAcademica> listaHistoriaAcademica = new ArrayList<HistoriaAcademica>();

    public VistaGestionHistoriaAcademica() throws SQLException {
        initComponents();
        cargarDatos();
        try {
            cargarCmbEstudiantes();
        } catch (SQLException e) {
            System.out.println(e.toString());
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
        tbHistorialesAcademicos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        chActivo = new javax.swing.JCheckBox();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        tfColegioAnterior = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfAñoHistorial = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfGrado = new javax.swing.JTextField();
        cmb_Estudiantes = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        lb_IdEstudiante = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tbHistorialesAcademicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "idHistoriaAcademica", "idEstudiante", "Colegio Anterior", "Año", "Grado", "Estado actividad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbHistorialesAcademicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHistorialesAcademicosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbHistorialesAcademicos);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestión de Historiales Académicos");

        jLabel3.setText("Estudiante");

        chActivo.setText("esta activo?");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel6.setText("Colegio Anterior");

        btnLimpiar.setText("Limpíar campos");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel2.setText("Año");

        jLabel4.setText("Grado");

        cmb_Estudiantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Id del Estudiante:");

        lb_IdEstudiante.setText("Sin Id Seleccionado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpiar)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_IdEstudiante)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(chActivo)
                                .addGap(159, 159, 159))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(cmb_Estudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfColegioAnterior)
                                    .addComponent(tfAñoHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(btnRegistrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnModificar)
                                .addComponent(btnRegistrar)
                                .addComponent(btnLimpiar)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmb_Estudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(lb_IdEstudiante))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfColegioAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfAñoHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(chActivo)
                        .addGap(29, 29, 29)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

/**
 * Este evento sirve para detectar cuando una tupla de la base de datos
 * se selecciona y se llenan los textfields con sus campos correspondientes.
 */
    private void tbHistorialesAcademicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHistorialesAcademicosMouseClicked
        int seleccion = tbHistorialesAcademicos.rowAtPoint(evt.getPoint());
        historialSeleccionado.setIdhistorial_academico(Integer.parseInt(String.valueOf(tbHistorialesAcademicos.getValueAt(seleccion, 0))));
        historialSeleccionado.setIdestudiante(Integer.parseInt(String.valueOf(tbHistorialesAcademicos.getValueAt(seleccion, 1))));
        historialSeleccionado.setColegio_Anterior(String.valueOf(tbHistorialesAcademicos.getValueAt(seleccion, 2)));
        historialSeleccionado.setAño(String.valueOf(tbHistorialesAcademicos.getValueAt(seleccion, 3)));
        historialSeleccionado.setGrado(String.valueOf(tbHistorialesAcademicos.getValueAt(seleccion, 4)));
        historialSeleccionado.setActivo(Boolean.parseBoolean(String.valueOf(tbHistorialesAcademicos.getValueAt(seleccion, 5))));
        llenarCampos();
        lb_IdEstudiante.setText(String.valueOf(tbHistorialesAcademicos.getValueAt(seleccion, 0)));
    }//GEN-LAST:event_tbHistorialesAcademicosMouseClicked

/**
 * Este evento se dispara al seleccionar el botón Eliminar
 * y elimina una fila seleccionada de la tabla de Historias Academicas
 * Este evento solo puede utilizarse al seleccionar una fila de la tabla.
 */
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Boolean resultado = HistoriaAcademicaDAO.eliminarHistoriaAcademica(historialSeleccionado.getIdhistorial_academico());
        if(resultado){
            JOptionPane.showMessageDialog(null, "Eliminacion exitosa");
        }else{
            JOptionPane.showMessageDialog(null, "Fallo al eliminar el historial académico");
        }
        limpiarCampos();
        cargarDatos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed
/**
 * Este evento se dispara al seleccionar el botón Registrar
 * y registra una tupla en tabla de Historias Academicas
 * en la ventana de JFrame y en la base de datos.
 */
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (validarCamposVacios()) {
            String estudiante = cmb_Estudiantes.getSelectedItem().toString();
                estudiante = estudiante.substring(0, estudiante.indexOf(" "));
                System.out.println(estudiante);
                int IDEstudiante = Integer.parseInt(estudiante);
            HistoriaAcademica historiaAcademica = new HistoriaAcademica();
            historiaAcademica.setIdestudiante(IDEstudiante);
            historiaAcademica.setColegio_Anterior(tfColegioAnterior.getText());
            historiaAcademica.setAño(tfAñoHistorial.getText());
            historiaAcademica.setGrado(tfGrado.getText());
            historiaAcademica.setActivo(chActivo.isSelected());
            Boolean resultado = HistoriaAcademicaDAO.registrarHistoriaAcademica(historiaAcademica);
            if (resultado) {
                JOptionPane.showMessageDialog(null, "Registro exitoso");
            } else {
                JOptionPane.showMessageDialog(null, "Fallo el registro del historial academico");
            }
            limpiarCampos();
            cargarDatos();
        } else {
            JOptionPane.showMessageDialog(null, "Favor de proporcionar toda la informacion");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed
/**
 * Este evento se dispara al seleccionar el botón Modificar
 * y modifica una fila seleccionada de la tabla de Historias Academicas
 * si se realizaron cambios a sus campos.
 * Este evento solo puede utilizarse al seleccionar una fila de la tabla.
 */
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (validarCamposVacios()) {
            HistoriaAcademica historialacademico = new HistoriaAcademica();
            historialacademico.setIdhistorial_academico(historialSeleccionado.getIdhistorial_academico());
            historialacademico.setIdestudiante(historialacademico.getIdestudiante());
            historialacademico.setColegio_Anterior(tfColegioAnterior.getText());
            historialacademico.setAño(tfAñoHistorial.getText());
            historialacademico.setGrado(tfGrado.getText());
            historialacademico.setActivo(chActivo.isSelected());
            Boolean resultado = HistoriaAcademicaDAO.modificarHistoriaAcademica(historialacademico);
            if (resultado) {
                JOptionPane.showMessageDialog(null, "Modificacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "Fallo la moficacion del historial academico");
            }
            limpiarCampos();
            cargarDatos();
        } else {
            JOptionPane.showMessageDialog(null, "Favor de proporcionar toda la informacion");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JCheckBox chActivo;
    private javax.swing.JComboBox<String> cmb_Estudiantes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_IdEstudiante;
    private javax.swing.JTable tbHistorialesAcademicos;
    private javax.swing.JTextField tfAñoHistorial;
    private javax.swing.JTextField tfColegioAnterior;
    private javax.swing.JTextField tfGrado;
    // End of variables declaration//GEN-END:variables
/**
 * Este método carga los datos desde la 
 * tabla de base de datos historial_academico
 * a un componente JTable
 */
    private void cargarDatos() {
        DefaultTableModel model = new DefaultTableModel();
        ResultSet rs = HistoriaAcademicaDAO.consultarHistoriaAcademica();
        model.setColumnIdentifiers(new Object[]{"idHistoriaAcademica", "idEstudiante", "Colegio Anterior", "Año", "Grado", "Estado actividad"});
        try {
            while (rs.next()) {
                model.addRow(new Object[]{rs.getInt("idhistorial_academico"), rs.getInt("idestudiante"), rs.getString("cole_ant"), rs.getString("año"), rs.getString("grado"), rs.getBoolean("activo")});
            }
            tbHistorialesAcademicos.setModel(model);
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
    }

    private void cargarCmbEstudiantes() throws SQLException {
        cmb_Estudiantes.removeAllItems();
        ResultSet rs = EstudianteDAO.consultarEstudiantes();
        //Rest of your code here
        try {
            while ((rs.next())) {
                cmb_Estudiantes.addItem(rs.getString("idestudiante") + " " + rs.getString("primernombre") + " " + rs.getString("segundonombre") +" " +
                        rs.getString("primerapellido") + " " +  rs.getString("segundoapellido"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Conexión cerrada");
        }
    }
/**
 * Este método carga los datos desde la 
 * tabla de base de datos historial académico
 * a un componente JTable
 */
    private void llenarCampos() {
        tfColegioAnterior.setText(historialSeleccionado.getColegio_Anterior());
        tfAñoHistorial.setText(historialSeleccionado.getAño());
        tfGrado.setText(historialSeleccionado.getGrado());
        chActivo.setSelected(historialSeleccionado.getActivo());
        btnEliminar.setEnabled(true);
        btnModificar.setEnabled(true);
        btnLimpiar.setEnabled(true);
        btnRegistrar.setEnabled(false);
    }
/**
 * Este método limpia los cambos de los
 * text fields que almacenan la información
 * sobre el historial académico
 */
    private void limpiarCampos() {
        tfGrado.setText("");
        tfAñoHistorial.setText("");
        tfColegioAnterior.setText("");
        chActivo.setSelected(false);
        btnLimpiar.setEnabled(false);
        btnRegistrar.setEnabled(true);
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
    }
    /**
     * Valida los campos vacíos de los textfields
     * de Historiales académicos
     * @return camposLLenos como valor true Boolean
     */
    private Boolean validarCamposVacios() {
        Boolean camposLLenos = true;
        if (tfColegioAnterior.getText() == "") {
            camposLLenos = false;
        }
        if (tfAñoHistorial.getText() == "") {
            camposLLenos = false;
        }
        if (tfGrado.getText() == "") {
            camposLLenos = false;
        }
        return camposLLenos;
    }

}
