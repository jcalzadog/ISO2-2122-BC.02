/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package esi.uclm.gepi.Presentacion;

import esi.uclm.gepi.Dominio.GestorPersona;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Enrique 
 * 
 */
public class IU_Seguimiento extends javax.swing.JFrame {
    GestorPersona gestorPersona;
    /**
     * Creates new form IU_Seguimiento
     */
    public IU_Seguimiento() {
        
        gestorPersona = new GestorPersona();
        initComponents();
        rellenarTabla();
        this.setTitle("Seguimiento");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
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
        tablaPersonas = new javax.swing.JTable();
        botonRefrescar = new javax.swing.JButton();
        botonAddPersona = new javax.swing.JButton();
        botonAddContactos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tablaPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaPersonas);

        botonRefrescar.setText("Refrescar Tabla");
        botonRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRefrescarActionPerformed(evt);
            }
        });

        botonAddPersona.setText("Añadir Persona");
        botonAddPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAddPersonaActionPerformed(evt);
            }
        });

        botonAddContactos.setText("Establecer Contactos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonRefrescar)
                        .addGap(270, 270, 270)
                        .addComponent(botonAddPersona)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                        .addComponent(botonAddContactos)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonRefrescar)
                    .addComponent(botonAddPersona)
                    .addComponent(botonAddContactos))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRefrescarActionPerformed
       rellenarTabla();
    }//GEN-LAST:event_botonRefrescarActionPerformed

    private void botonAddPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAddPersonaActionPerformed
        IU_AniadirPersonas ap = new IU_AniadirPersonas(this,true);
        ap.setVisible(true);
    }//GEN-LAST:event_botonAddPersonaActionPerformed

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
            java.util.logging.Logger.getLogger(IU_Seguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IU_Seguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IU_Seguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IU_Seguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IU_Seguimiento().setVisible(true);
            }
        });
    }
    
    public void rellenarTabla(){
        tablaPersonas.getTableHeader().setReorderingAllowed(false);
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int col){
               return false; 
            }
        };
        String[] col = {"Identificador","Nombre","Apellidos","Telefono","Fecha Nacimiento","Enfermo","Confinado","Atencion",
           "Sano","Cuarentena","Vulnerable","Vacunado","Contactos"};
       
        modelo.setColumnIdentifiers(col);
        Vector v = gestorPersona.getPersonas();
        
        for (int i = 0; i < v.size(); i++) {
            modelo.addRow((Vector) v.get(i));
        }
      
      
        //Asigna el modelo a la tabla
        tablaPersonas.setModel(modelo);
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAddContactos;
    private javax.swing.JButton botonAddPersona;
    private javax.swing.JButton botonRefrescar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPersonas;
    // End of variables declaration//GEN-END:variables
}