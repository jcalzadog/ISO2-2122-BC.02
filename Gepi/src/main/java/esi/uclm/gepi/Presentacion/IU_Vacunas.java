/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package esi.uclm.gepi.Presentacion;

import esi.uclm.gepi.Dominio.GestorAprovisionamiento;
import esi.uclm.gepi.Dominio.GestorCampania;
import esi.uclm.gepi.Dominio.GestorPersona;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alex_
 */
public class IU_Vacunas extends javax.swing.JDialog {

    GestorCampania gestorCampania;
    GestorAprovisionamiento gestorApro;
    
    
    /**
     * Creates new form IU_Vacunas
     */
    public IU_Vacunas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon imgIconApp = new ImageIcon("src/main/resources/Imagenes/icono.png");
        this.setIconImage(imgIconApp.getImage());
        this.setTitle("GEPI");
        this.setResizable(false);
        rellenarTabla();
        rellenarLista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tipoVariable = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        nombreCampania = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fechaCampania = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        costeCampania = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tempoCampania = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        efectividadCampania = new javax.swing.JTextField();
        aceptarCampania = new javax.swing.JButton();
        limpiarCampania = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nombreApro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cantidadApro = new javax.swing.JTextField();
        aceptarApro = new javax.swing.JButton();
        limpiarApro = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersonas = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaSMS = new javax.swing.JList<>();
        jLabel14 = new javax.swing.JLabel();
        enviarSMS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Aqui podras añadir una nueva campaña");

        jLabel2.setText("Tipo:");

        tipoVariable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vacunacion", "Informativa" }));
        tipoVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoVariableActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre:");

        jLabel4.setText("Fecha: ");

        fechaCampania.setToolTipText("");
        fechaCampania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaCampaniaActionPerformed(evt);
            }
        });

        jLabel5.setText("Coste:");

        costeCampania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costeCampaniaActionPerformed(evt);
            }
        });

        jLabel6.setText("Temporalidad: ");

        jLabel7.setText("Efectividad:");

        efectividadCampania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efectividadCampaniaActionPerformed(evt);
            }
        });

        aceptarCampania.setText("Aceptar");
        aceptarCampania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarCampaniaActionPerformed(evt);
            }
        });

        limpiarCampania.setText("Limpiar");
        limpiarCampania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarCampaniaActionPerformed(evt);
            }
        });

        jLabel8.setText("* Todos los campos son obligatorios");

        jLabel9.setText("Formato YYYY-MM-DD (ejemplo 5 de agosto de 2020: 2020-08-05)");

        jLabel15.setText("Numero decimal con punto (ejemplo 14.50)");

        jLabel16.setText("Cantidad en dias (entero positivo)");

        jLabel17.setText("% (0-100, sin decimales)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(36, 36, 36)
                        .addComponent(tipoVariable, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(aceptarCampania)
                            .addGap(18, 18, 18)
                            .addComponent(limpiarCampania, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(66, 66, 66)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(efectividadCampania, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                .addComponent(tempoCampania)
                                .addComponent(costeCampania)
                                .addComponent(fechaCampania)
                                .addComponent(nombreCampania)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tipoVariable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nombreCampania, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fechaCampania, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(costeCampania, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tempoCampania, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(efectividadCampania, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarCampania)
                    .addComponent(limpiarCampania))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Campaña", jPanel1);

        jLabel10.setText("Aqui podras registrar el aprovisionamiento de las vacunas");

        jLabel11.setText("Nombre: ");

        jLabel12.setText("*Todos los campos son obligatorios");

        jLabel13.setText("Cantidad: ");

        cantidadApro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadAproActionPerformed(evt);
            }
        });

        aceptarApro.setText("Aceptar");
        aceptarApro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarAproActionPerformed(evt);
            }
        });

        limpiarApro.setText("Limpiar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(16, 16, 16)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(nombreApro, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                    .addComponent(cantidadApro)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(aceptarApro)
                        .addGap(18, 18, 18)
                        .addComponent(limpiarApro, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(314, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(nombreApro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cantidadApro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarApro)
                    .addComponent(limpiarApro))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Vacunas", jPanel2);

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Personas", jPanel3);

        jScrollPane2.setViewportView(listaSMS);

        jLabel14.setText("Aqui puedes mandar un SMS a las personas mas vunerables, seleccionado dicha campaña: ");

        enviarSMS.setText("Enviar");
        enviarSMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarSMSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(enviarSMS)))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(enviarSMS)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("SMS", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fechaCampaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaCampaniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaCampaniaActionPerformed

    private void costeCampaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costeCampaniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costeCampaniaActionPerformed

    private void efectividadCampaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efectividadCampaniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_efectividadCampaniaActionPerformed

    private void aceptarCampaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarCampaniaActionPerformed
        String tipo;
        
        if(tipoVariable.getSelectedIndex() == 0){
            tipo = "vacunacion";
        }else{
            tipo = "informativa";
        }
        
        String nombre = nombreCampania.getText();
        String fecha = fechaCampania.getText();
        System.out.println(fecha);
        String coste = costeCampania.getText();
        String tempo = tempoCampania.getText();
        String efectividad = efectividadCampania.getText();
        
        if(tipo.isEmpty() || nombre.isEmpty() || fecha.isEmpty() || coste.isEmpty() || tempo.isEmpty() || efectividad.isEmpty()){
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "ERROR", 0);
        }else{
            try {
                gestorCampania = new GestorCampania();
                int resultado = gestorCampania.anadirCampania(tipo, nombre, fecha, coste, tempo, efectividad);
                
                if(resultado == 1){
                    JOptionPane.showMessageDialog(null, "Campaña añadida correctamente");
                }else{
                    throw new RuntimeException("Algun error inesperado");
                }
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Algun error inesperado", "ERROR", 0);
            }
        }
        
    }//GEN-LAST:event_aceptarCampaniaActionPerformed

    private void tipoVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoVariableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoVariableActionPerformed

    private void limpiarCampaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarCampaniaActionPerformed
        tipoVariable.setSelectedIndex(0);
        nombreCampania.setText("");
        fechaCampania.setText("");
        costeCampania.setText("");
        tempoCampania.setText("");
        efectividadCampania.setText("");
    }//GEN-LAST:event_limpiarCampaniaActionPerformed

    private void cantidadAproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadAproActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadAproActionPerformed

    private void aceptarAproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarAproActionPerformed
        String nombre = nombreApro.getText();
        String cant = cantidadApro.getText();
        
        if(nombre.isEmpty() || cant.isEmpty()){
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "ERROR", 0);
        }else{
            try {
                gestorApro = new GestorAprovisionamiento();
                int resultado = gestorApro.añadirAprovisionamiento(nombre, cant);
                
                if(resultado == 1){
                    JOptionPane.showMessageDialog(null, "Aprovisionamiento añadida correctamente");
                }else{
                    throw new RuntimeException("Algun error inesperado");
                }
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Algun error inesperado", "ERROR", 0);
            }
             
        }
    }//GEN-LAST:event_aceptarAproActionPerformed

    private void enviarSMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarSMSActionPerformed
        if(listaSMS.isSelectionEmpty()){
            JOptionPane.showMessageDialog(null, "Selecciona una campaña", "ERROR", 0);
        }else{
            JOptionPane.showMessageDialog(null, "Se ha enviado el SMS a las personas vulnerables correctamente");
        }
    }//GEN-LAST:event_enviarSMSActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IU_Vacunas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IU_Vacunas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IU_Vacunas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IU_Vacunas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IU_Vacunas dialog = new IU_Vacunas(new javax.swing.JFrame(), true);
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
    
    public void rellenarTabla(){
        tablaPersonas.getTableHeader().setReorderingAllowed(false);
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int col){
               return false; 
            }
        };
        Object[] columnas = {"Identificador","Nombre","Apellidos","Teléfono","F. Nac","Enfermo","Confinado","NªAtencion","Sano","Cuarentena","Vulnerable","Vacunado","Contactos"};
        modelo.setColumnIdentifiers(columnas);
        GestorPersona gp = new GestorPersona();
        Vector<Object> tipo = gp.getPersonas();
        System.out.println("-------------faldkjfañdlkfjañdl-----");
        System.out.println(tipo.toString());
        for(int i = 0; i < tipo.size(); i++){
            modelo.addRow((Vector) tipo.get(i)); 
        }
        //Asigna el modelo a la tabla
        tablaPersonas.setModel(modelo);
    }

    public void rellenarLista(){
        try {
            Vector aux = new Vector();
            gestorCampania = new GestorCampania();
            
            Vector vector = gestorCampania.getCampanias();
            
            for (Object resultado : vector) {
                String [] partes = resultado.toString().split(",");
                aux.add(partes[1] + " - " + partes[2]);
            }
       
            listaSMS.setListData(aux);
          
        } catch (Exception ex) {
            Logger.getLogger(IU_Vacunas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarApro;
    private javax.swing.JButton aceptarCampania;
    private javax.swing.JTextField cantidadApro;
    private javax.swing.JTextField costeCampania;
    private javax.swing.JTextField efectividadCampania;
    private javax.swing.JButton enviarSMS;
    private javax.swing.JTextField fechaCampania;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton limpiarApro;
    private javax.swing.JButton limpiarCampania;
    private javax.swing.JList<String> listaSMS;
    private javax.swing.JTextField nombreApro;
    private javax.swing.JTextField nombreCampania;
    private javax.swing.JTable tablaPersonas;
    private javax.swing.JTextField tempoCampania;
    private javax.swing.JComboBox<String> tipoVariable;
    // End of variables declaration//GEN-END:variables
}
