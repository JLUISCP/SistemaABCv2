/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import BD.AcudienteDAO;
import BD.EstudianteDAO;
import Clases.Acudiente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EduardoLeoLim
 */
public class VistaGestionAcudiente extends javax.swing.JFrame {
    private List<Acudiente> listaAcudientes;
    private Acudiente acudienteSeleccion;
    /**
     * Creates new form VistaAcudiente
     */
    public VistaGestionAcudiente() {
        initComponents();
        listaAcudientes = new ArrayList<Acudiente>();
        acudienteSeleccion = null;
        this.cargarDatos();
        this.cargarCmbEstudiantes();
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
        tblTutores = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        javax.swing.JLabel lblTitulo = new javax.swing.JLabel();
        javax.swing.JLabel lblNombrePadre = new javax.swing.JLabel();
        javax.swing.JLabel lblNombreMadre = new javax.swing.JLabel();
        javax.swing.JLabel lblEmail = new javax.swing.JLabel();
        txtNombrePadre = new javax.swing.JTextField();
        txtNombreMadre = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        javax.swing.JLabel lblTelefono1 = new javax.swing.JLabel();
        txtTelefono1 = new javax.swing.JTextField();
        txtTelefono2 = new javax.swing.JTextField();
        javax.swing.JLabel lblTelefono2 = new javax.swing.JLabel();
        btnLimpiarForm = new javax.swing.JButton();
        javax.swing.JLabel lblEstudiante = new javax.swing.JLabel();
        cbxEstudiante = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblTutores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Padre", "Madre", "Correo electrónico", "Teléfono 1", "Teléfono 2"
            }
        ));
        tblTutores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblTutores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTutoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTutores);
        tblTutores.getAccessibleContext().setAccessibleDescription("");

        btnRegistrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblTitulo.setText("Gestión de Tutores");

        lblNombrePadre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombrePadre.setText("Nombre del Padre:");

        lblNombreMadre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombreMadre.setText("Nombre de la madre:");

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEmail.setText("Correo electrónico:");

        txtNombrePadre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtNombreMadre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblTelefono1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTelefono1.setText("Teléfono 1:");

        txtTelefono1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtTelefono2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblTelefono2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTelefono2.setText("Teléfono 2");

        btnLimpiarForm.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLimpiarForm.setText("Limpiar formulario");
        btnLimpiarForm.setEnabled(false);
        btnLimpiarForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarFormActionPerformed(evt);
            }
        });

        lblEstudiante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEstudiante.setText("Estudiante:");

        cbxEstudiante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnLimpiarForm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRegistrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(406, 406, 406)
                                .addComponent(lblTitulo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombrePadre)
                                    .addComponent(lblNombreMadre)
                                    .addComponent(lblEmail))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombreMadre)
                                    .addComponent(txtNombrePadre)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTelefono1)
                                    .addComponent(lblTelefono2)
                                    .addComponent(lblEstudiante))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTelefono1)
                                    .addComponent(txtTelefono2)
                                    .addComponent(cbxEstudiante, 0, 200, Short.MAX_VALUE))))
                        .addGap(0, 171, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombrePadre)
                    .addComponent(txtNombrePadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono1)
                    .addComponent(txtTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreMadre)
                    .addComponent(txtNombreMadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono2)
                    .addComponent(txtTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstudiante)
                    .addComponent(cbxEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnEditar)
                    .addComponent(btnRegistrar)
                    .addComponent(btnLimpiarForm))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if(validarCamposVacios()){
            String estudiante = cbxEstudiante.getSelectedItem().toString();
                estudiante = estudiante.substring(0, estudiante.indexOf(" "));
                System.out.println(estudiante);
                int IDEstudiante = Integer.parseInt(estudiante);
                
            Acudiente acudiente = new Acudiente();
            acudiente.setNom_madre(txtNombreMadre.getText());
            acudiente.setNom_padre(txtNombrePadre.getText());
            acudiente.setDirec_elect(txtEmail.getText());
            acudiente.setActivo(true);
            acudiente.setTelefono1(txtTelefono1.getText());
            acudiente.setTelefono2(txtTelefono2.getText());
            acudiente.setIdestudiante(IDEstudiante);
            
            Boolean resultado = AcudienteDAO.registrarAcudiente(acudiente);
            if(resultado){
                JOptionPane.showMessageDialog(null, "Registro exitoso");
            }else{
                JOptionPane.showMessageDialog(null, "Fallo el registro de los tutores");
            }
            limpiarCampos();
            cargarDatos();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(validarCamposVacios()){
            String estudiante = cbxEstudiante.getSelectedItem().toString();
                estudiante = estudiante.substring(0, estudiante.indexOf(" "));
                System.out.println(estudiante);
                int IDEstudiante = Integer.parseInt(estudiante);
            acudienteSeleccion.setNom_madre(txtNombreMadre.getText());
            acudienteSeleccion.setNom_padre(txtNombrePadre.getText());
            acudienteSeleccion.setDirec_elect(txtEmail.getText());
            acudienteSeleccion.setActivo(true);
            acudienteSeleccion.setTelefono1(txtTelefono1.getText());
            acudienteSeleccion.setTelefono2(txtTelefono2.getText());
            acudienteSeleccion.setIdestudiante(IDEstudiante);
            
            Boolean resultado = AcudienteDAO.modificarAcudiente(acudienteSeleccion);
            if(resultado){
                JOptionPane.showMessageDialog(null, "Modificacion exitosa");
            }else{
                JOptionPane.showMessageDialog(null, "Fallo la moficacion de Acudiente");
            }
            limpiarCampos();
            cargarDatos();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int indice = this.tblTutores.getSelectedRow();
        if(indice >= 0){
            Acudiente acudiente = this.listaAcudientes.get(indice);
            int idAcudiente = acudiente.getIdacudiente();
            
            Boolean resultado = AcudienteDAO.eliminarAcudiente(idAcudiente);
            if(resultado){
                JOptionPane.showMessageDialog(null, "Eliminación exitosa");
            }else{
                JOptionPane.showMessageDialog(null, "Fallo la eliminación de Acudiente");
            }
            limpiarCampos();
            cargarDatos();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarFormActionPerformed
        this.limpiarCampos();
    }//GEN-LAST:event_btnLimpiarFormActionPerformed

    private void tblTutoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTutoresMouseClicked
        int seleccion = this.tblTutores.getSelectedRow();
        acudienteSeleccion = this.listaAcudientes.get(seleccion);
        this.llenarCampos();
    }//GEN-LAST:event_tblTutoresMouseClicked

    private void cargarDatos(){
        DefaultTableModel model = new DefaultTableModel();
        ResultSet rs = AcudienteDAO.consultarAcudientes();
        model.setColumnIdentifiers(new Object[]{"Padre","Madre", "Correo electrónico", "Teléfono 1", "Teléfono 2"});
        try{
            while(rs.next()){
                Acudiente acudiente = new Acudiente();
                acudiente.setIdacudiente(rs.getInt("idAcudiente"));
                acudiente.setIdestudiante(rs.getInt("idEstudiante"));
                acudiente.setActivo(rs.getBoolean("activo"));
                acudiente.setDirec_elect(rs.getString("email"));
                acudiente.setNom_madre(rs.getString("nombreMadre"));
                acudiente.setNom_padre(rs.getString("nombrePadre"));
                acudiente.setTelefono1(rs.getString("telefono1"));
                acudiente.setTelefono2(rs.getString("telefono2"));
                this.listaAcudientes.add(acudiente);
                model.addRow(new Object[]{acudiente.getNom_padre(),acudiente.getNom_madre(), 
                    acudiente.getDirec_elect(), acudiente.getTelefono1(), acudiente.getTelefono2()});
            }
            this.tblTutores.setModel(model);
        }catch(SQLException e){
            System.out.println(e.toString());
        }catch(NullPointerException e){
            System.out.println(e.toString());
        }
        btnEliminar.setEnabled(false);
        btnEditar.setEnabled(false);
    }
    
    private void limpiarCampos(){
        this.txtNombreMadre.setText("");
        this.txtNombrePadre.setText("");
        this.txtEmail.setText("");
        this.txtTelefono1.setText("");
        this.txtTelefono2.setText("");
        this.btnLimpiarForm.setEnabled(false);
        this.btnRegistrar.setEnabled(true);
        this.btnEditar.setEnabled(false);
        this.btnEliminar.setEnabled(false);
        this.cargarCmbEstudiantes();
    }
    
    private boolean validarCamposVacios(){
        Boolean camposLLenos = true;
        if(txtNombreMadre.getText() == ""){
            camposLLenos = false;
        }
        if(txtNombrePadre.getText() == ""){
            camposLLenos = false;
        }
        if(txtEmail.getText() == ""){
            camposLLenos = false;
        }
        if(txtTelefono1.getText() == ""){
            camposLLenos = false;
        }
        if(txtTelefono2.getText() == ""){
            camposLLenos = false;
        }
        if(!(cbxEstudiante.getSelectedIndex() >= 0)){
            camposLLenos = false;
        }
        return camposLLenos;
    }
    
    private void cargarCmbEstudiantes() {
        cbxEstudiante.removeAllItems();
        ResultSet rs = EstudianteDAO.consultarEstudiantes();
        //Rest of your code here
        try {
            if(rs != null){
                while ((rs.next())) {
                    cbxEstudiante.addItem(rs.getString("idestudiante") + " " + rs.getString("primernombre") + " " + rs.getString("segundonombre") +" " +
                        rs.getString("primerapellido") + " " +  rs.getString("segundoapellido"));
                }
            }
            this.cbxEstudiante.setSelectedIndex(-1);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Conexión cerrada");
        }
    }
    
    private void llenarCampos(){
        this.txtEmail.setText(acudienteSeleccion.getDirec_elect());
        this.txtNombreMadre.setText(acudienteSeleccion.getNom_madre());
        this.txtNombrePadre.setText(acudienteSeleccion.getNom_padre());
        this.txtTelefono1.setText(acudienteSeleccion.getTelefono1());
        this.txtTelefono2.setText(acudienteSeleccion.getTelefono2());
        
        for (int i = 0; i < this.cbxEstudiante.getItemCount(); i++){
            String estudiante = cbxEstudiante.getItemAt(i).toString();
                estudiante = estudiante.substring(0, estudiante.indexOf(" "));
                int IDEstudiante = Integer.parseInt(estudiante);
            if (acudienteSeleccion.getIdestudiante() == IDEstudiante) {
                this.cbxEstudiante.setSelectedIndex(i);
                break;
            }
        }
        
        btnEliminar.setEnabled(true);
        btnEditar.setEnabled(true);
        btnLimpiarForm.setEnabled(true);
        btnRegistrar.setEnabled(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiarForm;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbxEstudiante;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTutores;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombreMadre;
    private javax.swing.JTextField txtNombrePadre;
    private javax.swing.JTextField txtTelefono1;
    private javax.swing.JTextField txtTelefono2;
    // End of variables declaration//GEN-END:variables
}
