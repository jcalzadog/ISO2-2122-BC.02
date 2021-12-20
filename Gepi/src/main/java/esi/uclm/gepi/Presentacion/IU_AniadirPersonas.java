/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package esi.uclm.gepi.Presentacion;

import com.mysql.cj.jdbc.exceptions.MysqlDataTruncation;
import esi.uclm.gepi.Dominio.GestorPersona;
import java.awt.Frame;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Enrique
 */
public class IU_AniadirPersonas extends javax.swing.JDialog {

    GestorPersona gestorPersona;
    
    /**
     * Creates new form IU_AniadirPersonas
     */
    public IU_AniadirPersonas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        gestorPersona = new GestorPersona();
        ImageIcon imgIconApp = new ImageIcon("src/main/resources/Imagenes/icono.png");
        this.setIconImage(imgIconApp.getImage());
        this.setTitle("Añadir Persona");
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

        buttongroupenfermos = new javax.swing.ButtonGroup();
        btngroupConfinados = new javax.swing.ButtonGroup();
        btnGroupAtencion = new javax.swing.ButtonGroup();
        btnGroupSano = new javax.swing.ButtonGroup();
        btnGroupCuarentena = new javax.swing.ButtonGroup();
        btnGroupVulnerable = new javax.swing.ButtonGroup();
        btnGroupVacunado = new javax.swing.ButtonGroup();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtFechanac = new javax.swing.JTextField();
        rbSiEnfermo = new javax.swing.JRadioButton();
        rbNoEnfermo = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rbSiConfinado = new javax.swing.JRadioButton();
        rbSiAtencion = new javax.swing.JRadioButton();
        rbSiSano = new javax.swing.JRadioButton();
        rbSiCuarentena = new javax.swing.JRadioButton();
        rbSiVulnerable = new javax.swing.JRadioButton();
        rbSiVacunado = new javax.swing.JRadioButton();
        rbNoConfinado = new javax.swing.JRadioButton();
        rbNoAtencion = new javax.swing.JRadioButton();
        rbNoSano = new javax.swing.JRadioButton();
        rbNoCuarentena = new javax.swing.JRadioButton();
        rbNoVulnerable = new javax.swing.JRadioButton();
        rbNoVacunado = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        txtIdentificador = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        buttongroupenfermos.add(rbSiEnfermo);
        rbSiEnfermo.setText("Si");

        buttongroupenfermos.add(rbNoEnfermo);
        rbNoEnfermo.setText("No");

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellidos:");

        jLabel3.setText("Teléfono:");

        jLabel4.setText("Fecha nacimiento:");

        jLabel5.setText("Enfermo:");

        jLabel6.setText("Confinado:");

        jLabel7.setText("Atencion:");

        jLabel8.setText("Sano:");

        jLabel9.setText("Cuarentena:");

        jLabel10.setText("Vulnerable:");

        jLabel11.setText("Vacunado:");

        btngroupConfinados.add(rbSiConfinado);
        rbSiConfinado.setText("Si");

        btnGroupAtencion.add(rbSiAtencion);
        rbSiAtencion.setText("Si");

        btnGroupSano.add(rbSiSano);
        rbSiSano.setText("Si");

        btnGroupCuarentena.add(rbSiCuarentena);
        rbSiCuarentena.setText("Si");

        btnGroupVulnerable.add(rbSiVulnerable);
        rbSiVulnerable.setText("Si");

        btnGroupVacunado.add(rbSiVacunado);
        rbSiVacunado.setText("Si");

        btngroupConfinados.add(rbNoConfinado);
        rbNoConfinado.setText("No");

        btnGroupAtencion.add(rbNoAtencion);
        rbNoAtencion.setText("No");

        btnGroupSano.add(rbNoSano);
        rbNoSano.setText("No");

        btnGroupCuarentena.add(rbNoCuarentena);
        rbNoCuarentena.setText("No");

        btnGroupVulnerable.add(rbNoVulnerable);
        rbNoVulnerable.setText("No");

        btnGroupVacunado.add(rbNoVacunado);
        rbNoVacunado.setText("No");

        jLabel12.setText("DNI:");

        txtIdentificador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdentificadorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdentificadorKeyReleased(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel12))
                            .addGap(91, 91, 91)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFechanac, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbSiEnfermo)
                                    .addComponent(rbSiConfinado))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rbSiAtencion)
                                        .addComponent(rbSiSano)
                                        .addComponent(rbSiCuarentena)
                                        .addComponent(rbSiVulnerable)
                                        .addComponent(rbSiVacunado))))
                            .addGap(58, 58, 58)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rbNoConfinado)
                                .addComponent(rbNoEnfermo)
                                .addComponent(rbNoAtencion)
                                .addComponent(rbNoSano)
                                .addComponent(rbNoCuarentena)
                                .addComponent(rbNoVulnerable)
                                .addComponent(rbNoVacunado))))
                    .addComponent(btnGuardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFechanac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rbNoEnfermo)
                    .addComponent(rbSiEnfermo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rbSiConfinado)
                    .addComponent(rbNoConfinado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbNoAtencion)
                        .addGap(18, 18, 18)
                        .addComponent(rbNoSano)
                        .addGap(18, 18, 18)
                        .addComponent(rbNoCuarentena)
                        .addGap(18, 18, 18)
                        .addComponent(rbNoVulnerable)
                        .addGap(18, 18, 18)
                        .addComponent(rbNoVacunado))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbSiAtencion)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbSiSano)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbSiCuarentena)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(rbSiVulnerable))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rbSiVacunado)
                            .addComponent(jLabel11))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        int id;
        String nombre;
        String apellidos;
        int telefono;
        String fechanac;
        boolean enfermo;
        boolean confinado;
        boolean atencion;
        boolean sano;
        boolean cuarentena;
        boolean vulnerable;
        boolean vacunado;

        //COMPROBACIONES DE QUE NO ESTEN VACIOS
        if (this.txtIdentificador.getText().isEmpty() || this.txtNombre.getText().isEmpty()
                || this.txtApellidos.getText().isEmpty() || this.txtTelefono.getText().isEmpty()
                || this.txtFechanac.getText().isEmpty() || this.btnGroupAtencion.getSelection() == null
                || this.btnGroupCuarentena.getSelection() == null || this.btnGroupSano.getSelection() == null
                || this.btnGroupVacunado.getSelection() == null || this.btnGroupVulnerable.getSelection() == null
                || this.btngroupConfinados.getSelection() == null) {

            JOptionPane.showMessageDialog(this, "Estás olvidando algún campo", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            id = Integer.parseInt(this.txtIdentificador.getText());
            nombre = this.txtNombre.getText();
            apellidos = this.txtApellidos.getText();
            telefono = Integer.parseInt(this.txtTelefono.getText());
            fechanac = this.txtFechanac.getText();
            enfermo = this.rbSiEnfermo.isSelected();
            confinado = this.rbSiConfinado.isSelected();
            atencion = this.rbSiAtencion.isSelected();
            sano = this.rbSiSano.isSelected();
            cuarentena = this.rbSiCuarentena.isSelected();
            vulnerable = this.rbSiVulnerable.isSelected();
            vacunado = this.rbSiVacunado.isSelected();

            try {
                this.gestorPersona.insertarPersona(id, nombre, apellidos, telefono, fechanac, enfermo, confinado, atencion, sano, cuarentena, vulnerable, vacunado, "no tiene");
           
                this.dispose();

            } catch (MysqlDataTruncation dt) {
                JOptionPane.showMessageDialog(this, "Has introducido la fecha de manera incorrecta.\nIntroduce el formato correcto: YYYY-MM-DD.", "Error", JOptionPane.ERROR_MESSAGE);

            } catch (SQLIntegrityConstraintViolationException icv) {
                JOptionPane.showMessageDialog(this, "Ya hay una persona registrada con ese identificador.", "Error", JOptionPane.ERROR_MESSAGE);

            } catch (Exception ex) {
                Logger.getLogger(IU_AniadirPersonas.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Has introducido algun campo de manera incorrecta.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtIdentificadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificadorKeyPressed

    }//GEN-LAST:event_txtIdentificadorKeyPressed

    private void txtIdentificadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificadorKeyReleased
        if (!Character.isDigit(evt.getKeyChar())) {
            this.txtIdentificador.setText(""); 
          
        }
    }//GEN-LAST:event_txtIdentificadorKeyReleased

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
            
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        if (!Character.isDigit(evt.getKeyChar())) {
            this.txtTelefono.setText("");
        }
    }//GEN-LAST:event_txtTelefonoKeyReleased

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
            java.util.logging.Logger.getLogger(IU_AniadirPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IU_AniadirPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IU_AniadirPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IU_AniadirPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IU_AniadirPersonas dialog = new IU_AniadirPersonas(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupAtencion;
    private javax.swing.ButtonGroup btnGroupCuarentena;
    private javax.swing.ButtonGroup btnGroupSano;
    private javax.swing.ButtonGroup btnGroupVacunado;
    private javax.swing.ButtonGroup btnGroupVulnerable;
    private javax.swing.JButton btnGuardar;
    private javax.swing.ButtonGroup btngroupConfinados;
    private javax.swing.ButtonGroup buttongroupenfermos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rbNoAtencion;
    private javax.swing.JRadioButton rbNoConfinado;
    private javax.swing.JRadioButton rbNoCuarentena;
    private javax.swing.JRadioButton rbNoEnfermo;
    private javax.swing.JRadioButton rbNoSano;
    private javax.swing.JRadioButton rbNoVacunado;
    private javax.swing.JRadioButton rbNoVulnerable;
    private javax.swing.JRadioButton rbSiAtencion;
    private javax.swing.JRadioButton rbSiConfinado;
    private javax.swing.JRadioButton rbSiCuarentena;
    private javax.swing.JRadioButton rbSiEnfermo;
    private javax.swing.JRadioButton rbSiSano;
    private javax.swing.JRadioButton rbSiVacunado;
    private javax.swing.JRadioButton rbSiVulnerable;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtFechanac;
    private javax.swing.JTextField txtIdentificador;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
