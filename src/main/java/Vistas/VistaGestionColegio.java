/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;


import BD.ColegioDAO;
import Clases.Colegio;
import Clases.Estudiante;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Utils.GroupButtonUtils;

/**
 * Ventana para gestionar las operaciones de creación, modificación,
 * eliminación y consulta en la base de datos Escuela en PostgreSQL
 * para la tabla colegio. 
 * En esta clase se definen todos los eventos disparados por los componentes
 * de Java Swing en la ventana y se cargan de la base de datos la
 * información que está almacenada
 *
 * @author asisr
 */
public class VistaGestionColegio extends javax.swing.JFrame {

    Colegio colegioSeleccionado = new Colegio();
    ArrayList<Colegio> listaColegio = new ArrayList<Colegio>();
    GroupButtonUtils utilButton = new GroupButtonUtils();
    
    public VistaGestionColegio() {
        initComponents();
        cargarDatos();
        cargarCmbEstudiantes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupHistoriales = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbColegios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        chActivo = new javax.swing.JCheckBox();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        tfCiudad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnTipoPublica = new javax.swing.JRadioButton();
        btnTipoPrivada = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbColegios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "idColegio", "Tipo", "Ciudad", "Estado actividad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
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
        tbColegios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbColegiosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbColegios);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestión de Colegios");

        jLabel3.setText("Tipo de Colegio");

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

        jLabel6.setText("Ciudad");

        btnLimpiar.setText("Limpíar campos");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGroupHistoriales.add(btnTipoPublica);
        btnTipoPublica.setText("Pública");

        btnGroupHistoriales.add(btnTipoPrivada);
        btnTipoPrivada.setText("Privada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 237, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(tfCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnTipoPrivada)
                                    .addComponent(btnTipoPublica))
                                .addGap(299, 299, 299)))
                        .addGap(277, 277, 277))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chActivo)
                .addGap(444, 444, 444))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnTipoPublica)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTipoPrivada)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(chActivo)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnModificar)
                        .addComponent(btnRegistrar)
                        .addComponent(btnLimpiar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbColegiosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbColegiosMouseClicked
        int seleccion = tbColegios.rowAtPoint(evt.getPoint());
        colegioSeleccionado.setIdColegio(Integer.parseInt(String.valueOf(tbColegios.getValueAt(seleccion, 0))));
        colegioSeleccionado.setTipoColegio(String.valueOf(tbColegios.getValueAt(seleccion, 1)));
        colegioSeleccionado.setCiudad(String.valueOf(tbColegios.getValueAt(seleccion, 2)));
        colegioSeleccionado.setActivo(Boolean.parseBoolean(String.valueOf(tbColegios.getValueAt(seleccion, 3))));
        llenarCampos();
    }//GEN-LAST:event_tbColegiosMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Boolean resultado = ColegioDAO.eliminarColegio(colegioSeleccionado.getIdColegio());
        if(resultado){
            JOptionPane.showMessageDialog(null, "Eliminacion exitosa");
        }else{
            JOptionPane.showMessageDialog(null, "Fallo al eliminar el colegio");
        }
        limpiarCampos();
        cargarDatos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if(validarCamposVacios()){
            
            Colegio colegio = new Colegio();
            colegio.setTipoColegio(utilButton.getSelectedButtonText(btnGroupHistoriales));
            colegio.setCiudad(tfCiudad.getText());
            colegio.setActivo(chActivo.isSelected());
            Boolean resultado = ColegioDAO.registrarColegio(colegio);
            if(resultado){
                JOptionPane.showMessageDialog(null, "Registro exitoso");
            }else{
                JOptionPane.showMessageDialog(null, "Fallo el registro del colegio");
            }
            limpiarCampos();
            cargarDatos();
        }else{
            JOptionPane.showMessageDialog(null, "Favor de proporcionar toda la informacion");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(validarCamposVacios()){
            Colegio colegio = new Colegio();
            colegio.setIdColegio(colegioSeleccionado.getIdColegio());
            colegio.setTipoColegio(utilButton.getSelectedButtonText(btnGroupHistoriales));
            colegio.setCiudad(tfCiudad.getText());
            colegio.setActivo(chActivo.isSelected());
            Boolean resultado = ColegioDAO.modificarColegio(colegio);
            if(resultado){
                JOptionPane.showMessageDialog(null, "Modificacion exitosa");
            }else{
                JOptionPane.showMessageDialog(null, "Fallo la moficacion del colegio");
            }
            limpiarCampos();
            cargarDatos();
        }else{
            JOptionPane.showMessageDialog(null, "Favor de proporcionar toda la informacion");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.ButtonGroup btnGroupHistoriales;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JRadioButton btnTipoPrivada;
    private javax.swing.JRadioButton btnTipoPublica;
    private javax.swing.JCheckBox chActivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbColegios;
    private javax.swing.JTextField tfCiudad;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos() {
        DefaultTableModel model = new DefaultTableModel();
        ResultSet rs = ColegioDAO.consultarColegios();
        model.setColumnIdentifiers(new Object[]{"idColegio", "TipoColegio", "Ciudad", "Estado actividad"});
        try{
            while(rs.next()){
                model.addRow(new Object[]{rs.getInt("idcolegio"), rs.getString("privado"), rs.getString("distrital"), rs.getBoolean("activo")});
            }
            tbColegios.setModel(model);
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
    }
    
    private void cargarCmbEstudiantes() {
        
    }

    private void llenarCampos() {
        /*if(colegioSeleccionado.getTipoColegio().t == "Privada"){
            btnGroupHistoriales.setSelected(btnTipoPrivada.getModel(), true);
        }
        if(colegioSeleccionado.getTipoColegio() == "Pública"){
            btnGroupHistoriales.setSelected(btnTipoPublica.getModel(), true);
        }
*/
        tfCiudad.setText(colegioSeleccionado.getCiudad());
        chActivo.setSelected(colegioSeleccionado.getActivo());
        btnEliminar.setEnabled(true);
        btnModificar.setEnabled(true);
        btnLimpiar.setEnabled(true);
        btnRegistrar.setEnabled(false);
    }

    private void limpiarCampos() {
        btnGroupHistoriales.clearSelection();
        tfCiudad.setText("");
        chActivo.setSelected(false);
        btnLimpiar.setEnabled(false);
        btnRegistrar.setEnabled(true);
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
    }

    private Boolean validarCamposVacios() {
        Boolean camposLLenos = true;
        if(btnGroupHistoriales.getSelection() == null){
            camposLLenos = false;
        }
        if("".equals(tfCiudad.getText())){
            camposLLenos = false;
        }
        return camposLLenos;
    }
    
}