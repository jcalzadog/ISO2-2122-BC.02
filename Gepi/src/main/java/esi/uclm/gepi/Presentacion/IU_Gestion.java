/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.uclm.gepi.Presentacion;
import esi.uclm.gepi.Dominio.*;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alex_
 */
public class IU_Gestion extends javax.swing.JDialog {
 
    
    GestorEnfermedades gestorEnfermedad;
    GestorCampania gestorCampania;
    Vector<Object> enfermedades;
    Object[] nombreColum = {"ID","Nombre","Sintomas","Temporalidad","Medicina","Confinamiento","Vacunas"};
    /**
     * Creates new form IU_Gestion
     */
    public IU_Gestion(java.awt.Frame parent, boolean modal){
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Mostrar listado");
        this.setResizable(false);
        
        try{
           GestorEnfermedades gestorEnfermedad = new GestorEnfermedades();
           enfermedades = gestorEnfermedad.getEnfermedades();
           rellenarTabla(enfermedades,nombreColum);
        }catch(Exception ex){
            
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

        tipoVariable = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tipoVariable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enfermedades", "Campañas", "Estudios" }));
        tipoVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoVariableActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tipoVariable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 277, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tipoVariable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tipoVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoVariableActionPerformed
        // TODO add your handling code here:
        
        try {
            if(tipoVariable.getSelectedIndex() == 0){
                rellenarTabla(enfermedades,nombreColum);
            }else if(tipoVariable.getSelectedIndex() == 1){
                gestorCampania = new GestorCampania();
                Vector campanias = gestorCampania.getCampanias();
                Object[] campaniaCol = {"ID","Tipo","Nombre","Fecha","Coste","Temporalidad","Efectividad"};

                rellenarTabla(campanias,campaniaCol);
            }else{ 
                Object[] nombreColum = {"ID","Enfermedad","Campaña","Municipio"};

                rellenarTabla(enfermedades,nombreColum);
            }
         } catch (Exception ex) {
                Logger.getLogger(IU_Gestion.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_tipoVariableActionPerformed

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
            java.util.logging.Logger.getLogger(IU_Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IU_Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IU_Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IU_Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IU_Gestion dialog = new IU_Gestion(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public void rellenarTabla(Vector tipo, Object[] columna){
        
        tabla.getTableHeader().setReorderingAllowed(false);
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int col){
               return false; 
            }
        };
        
        modelo.setColumnIdentifiers(columna);
        for(int i = 0; i < tipo.size(); i++){
            modelo.addRow((Vector) tipo.get(i)); 
        }
        //Asigna el modelo a la tabla
        tabla.setModel(modelo);
        
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    private javax.swing.JComboBox<String> tipoVariable;
    // End of variables declaration//GEN-END:variables
}
