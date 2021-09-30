/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leoli
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        javax.swing.JLabel lblTitulo = new javax.swing.JLabel();
        btnVistaEstudiante = new javax.swing.JButton();
        tbnVistacolegios = new javax.swing.JButton();
        btnVistaAcudiente = new javax.swing.JButton();
        btnVistaHistoria = new javax.swing.JButton();
        btnVistaSalud = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Sistema de Gestión de Escuela");

        btnVistaEstudiante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVistaEstudiante.setText("Estudiantes");
        btnVistaEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVistaEstudianteActionPerformed(evt);
            }
        });

        tbnVistacolegios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbnVistacolegios.setText("Colegios");
        tbnVistacolegios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnVistacolegiosActionPerformed(evt);
            }
        });

        btnVistaAcudiente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVistaAcudiente.setText("Acudiente");
        btnVistaAcudiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVistaAcudienteActionPerformed(evt);
            }
        });

        btnVistaHistoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVistaHistoria.setText("Historia Academica");
        btnVistaHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVistaHistoriaActionPerformed(evt);
            }
        });

        btnVistaSalud.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVistaSalud.setText("Salud");
        btnVistaSalud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVistaSaludActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnVistaEstudiante)
                                .addGap(18, 18, 18)
                                .addComponent(btnVistaSalud))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnVistaHistoria)
                                .addGap(18, 18, 18)
                                .addComponent(btnVistaAcudiente)
                                .addGap(18, 18, 18)
                                .addComponent(tbnVistacolegios)))
                        .addGap(0, 23, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVistaEstudiante)
                    .addComponent(btnVistaSalud))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVistaHistoria)
                    .addComponent(btnVistaAcudiente)
                    .addComponent(tbnVistacolegios))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVistaEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVistaEstudianteActionPerformed
        new VistaGestion().setVisible(true);
    }//GEN-LAST:event_btnVistaEstudianteActionPerformed

    private void btnVistaSaludActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVistaSaludActionPerformed
        new VistaInfSalud().setVisible(true);
    }//GEN-LAST:event_btnVistaSaludActionPerformed

    private void btnVistaHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVistaHistoriaActionPerformed
        try {
            new VistaGestionHistoriaAcademica().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVistaHistoriaActionPerformed

    private void btnVistaAcudienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVistaAcudienteActionPerformed
        new VistaGestionAcudiente().setVisible(true);
    }//GEN-LAST:event_btnVistaAcudienteActionPerformed

    private void tbnVistacolegiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnVistacolegiosActionPerformed
        new VistaGestionColegio().setVisible(true);
    }//GEN-LAST:event_tbnVistacolegiosActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVistaAcudiente;
    private javax.swing.JButton btnVistaEstudiante;
    private javax.swing.JButton btnVistaHistoria;
    private javax.swing.JButton btnVistaSalud;
    private javax.swing.JButton tbnVistacolegios;
    // End of variables declaration//GEN-END:variables
}
