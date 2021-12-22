/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package esi.uclm.gepi.Presentacion;

import esi.uclm.gepi.Dominio.GestorEstadistica;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.LinkedList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego
 */
public class IU_Estadisticas extends javax.swing.JDialog {

    private GestorEstadistica gestorE;

    /**
     * Creates new form IU_Estadisticas
     */
    public IU_Estadisticas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("EstadÃ­sticas");
        this.setResizable(false);

        try {
            gestorE = new GestorEstadistica();

            cargarDatos();

        } catch (Exception ex) {
            Logger.getLogger(IU_Estadisticas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void cargarDatos() {
        DefaultListModel<String> model = new DefaultListModel<String>();
        LinkedList<String> enfermedadesCatalogadas = gestorE.getEnfermedades();
        for (int i = 0; i < enfermedadesCatalogadas.size(); i++) {
            model.addElement(enfermedadesCatalogadas.get(i));
        }

        //ESTADISTICAS GENERALES
        Object numEnfermedadesTotales = gestorE.getNumeroEnfermedades();
        lblNumE.setText(numEnfermedadesTotales + "");

        LinkedList<Object> numEstadosPersona = gestorE.getNumeroPersonasEstados();
        lblNumSanas.setText(numEstadosPersona.get(3) + "");
        lblNumVacunadas.setText(numEstadosPersona.get(6) + "");
        lblNumAtencion.setText(numEstadosPersona.get(2) + "");
        lblNumConfinadas.setText(numEstadosPersona.get(1) + "");
        lblNumEnfermas.setText(numEstadosPersona.get(0) + "");
        lblNumCuarentena.setText(numEstadosPersona.get(4) + "");
        lblNumVulnerables.setText(numEstadosPersona.get(5) + "");

        //ESTADISTICAS ENFERMEDADES
        lblNumECatalog.setText(numEnfermedadesTotales + "");
        jListEnfermedades2.setModel(model);
        jListEnfermedades2.addListSelectionListener(e -> {
            String enfermedadSeleccionada = jListEnfermedades2.getSelectedValue();

            //TABLA
            jTableEvolucion.getTableHeader().setReorderingAllowed(false);
            DefaultTableModel modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int col) {
                    return false;
                }
            };
            String[] col = {"Fecha", "Contagios"};

            modelo.setColumnIdentifiers(col);
            Vector v = gestorE.getEvolucionEnfermedad(enfermedadSeleccionada);

            for (int i = 0; i < v.size(); i++) {
                modelo.addRow((Vector) v.get(i));
            }

            //Asigna el modelo a la tabla
            jTableEvolucion.setModel(modelo);

            //BARRAS
            LinkedList evolucionCuatrimestres = gestorE.getEvolucionCuatrimestres(enfermedadSeleccionada);
            LinkedList barras = new LinkedList();
            barras.add(barra1Q1);
            barras.add(barra1Q2);
            barras.add(barra1Q3);
            barras.add(barra1Q4);
            barras.add(barra2Q1);
            barras.add(barra2Q2);
            barras.add(barra2Q3);
            barras.add(barra2Q4);

            for (int i = 0; i < evolucionCuatrimestres.size(); i++) {
                int contagios = Integer.parseInt(String.valueOf(evolucionCuatrimestres.get(i)));

                if (contagios < 500) {
                    ((javax.swing.JPanel) barras.get(i)).setBackground(Color.GREEN);
                } else if (contagios >= 500 && contagios < 1000) {
                    ((javax.swing.JPanel) barras.get(i)).setBackground(Color.ORANGE);
                } else if (contagios >= 1000) {
                    ((javax.swing.JPanel) barras.get(i)).setBackground(Color.RED);
                }
            }
        });

        //ESTADISTICAS CAMPAÃ‘AS   
        jListEnfermedades.setModel(model);
        jListEnfermedades.addListSelectionListener(e -> {
            String enfermedadSeleccionada = jListEnfermedades.getSelectedValue();
            LinkedList<String> numCapanias = gestorE.getNumCampaniaEnfermedad(enfermedadSeleccionada);
            lblNumInfor.setText(numCapanias.get(0));
            lblNumVacu.setText(numCapanias.get(1));
        });

        //ESTADISTICAS VACUNAS
        tablaVacunas.getTableHeader().setReorderingAllowed(false);
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };
        String[] col = {"Nombre", "Vacunas"};

        modelo.setColumnIdentifiers(col);
        Vector v = gestorE.getVacunasEnfermedades();

        for (int i = 0; i < v.size(); i++) {
            modelo.addRow((Vector) v.get(i));
        }

        //Asigna el modelo a la tabla
        tablaVacunas.setModel(modelo);

        tablaAprovisionamiento.getTableHeader().setReorderingAllowed(false);
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };
        String[] col2 = {"Nombre", "Vacunas"};

        modelo.setColumnIdentifiers(col2);
        v = gestorE.getAprovisionamientoVacunas();

        for (int i = 0; i < v.size(); i++) {
            modelo.addRow((Vector) v.get(i));
        }

        //Asigna el modelo a la tabla
        tablaAprovisionamiento.setModel(modelo);

        //ESTADISTICAS RELACIONES y PREVISIONES
        lblPersonasVac.setText(numEstadosPersona.get(6) + "");
        lblPersonasEnf.setText(numEstadosPersona.get(0) + "");
        double relacion = Double.parseDouble(String.valueOf(numEstadosPersona.get(6))) / Double.parseDouble(String.valueOf(numEstadosPersona.get(0)));
        NumberFormat format = new DecimalFormat("#.###");
        lblRelacion.setText(String.valueOf(format.format(relacion)));

        cmbEnfermedades.removeAllItems();//limpia el combobox

        //Se recorre con un for la lista de conductores
        for (int i = 0; i < enfermedadesCatalogadas.size(); i++) {
            cmbEnfermedades.addItem(enfermedadesCatalogadas.get(i));
        }

        cmbEnfermedades.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                boolean prevision = gestorE.getPrevision(String.valueOf(cmbEnfermedades.getSelectedItem()), String.valueOf(cmbIntervalos.getSelectedItem()));
                if (prevision==true){
                    resultadoPrevision.setText("SI");
                    resultadoPrevision.setForeground(Color.RED);
                } else {
                    resultadoPrevision.setText("NO");
                    resultadoPrevision.setForeground(Color.GREEN);
                }
            }
        });
        cmbIntervalos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean prevision = gestorE.getPrevision(String.valueOf(cmbEnfermedades.getSelectedItem()), String.valueOf(cmbIntervalos.getSelectedItem()));
                if (prevision==true){
                    resultadoPrevision.setText("SI");
                    resultadoPrevision.setForeground(Color.RED);
                } else {
                    resultadoPrevision.setText("NO");
                    resultadoPrevision.setForeground(Color.GREEN);
                }
            }
        });
        
        cmbEnfermedades.setSelectedIndex(0);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbGeneral = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        lblTituloEnfermedades = new javax.swing.JLabel();
        lblNumE = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblTituloSanas = new javax.swing.JLabel();
        lblTituloVac = new javax.swing.JLabel();
        lblNumVacunadas = new javax.swing.JLabel();
        lblNumSanas = new javax.swing.JLabel();
        lblTituloAtenc = new javax.swing.JLabel();
        lblTituloConfi = new javax.swing.JLabel();
        lblNumAtencion = new javax.swing.JLabel();
        lblNumConfinadas = new javax.swing.JLabel();
        lblTituloEnfermas = new javax.swing.JLabel();
        lblTituloCuarent = new javax.swing.JLabel();
        lblNumEnfermas = new javax.swing.JLabel();
        lblNumCuarentena = new javax.swing.JLabel();
        lblTituloVulnerables = new javax.swing.JLabel();
        lblNumVulnerables = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblTituloCatalog = new javax.swing.JLabel();
        lblNumECatalog = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListEnfermedades2 = new javax.swing.JList<>();
        barra1Q1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        barra1Q2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        barra1Q3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        barra1Q4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        barra2Q1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        barra2Q2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        barra2Q3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        barra2Q4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableEvolucion = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnLeyenda = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListEnfermedades = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNumInfor = new javax.swing.JLabel();
        lblNumVacu = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaAprovisionamiento = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaVacunas = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        cmbEnfermedades = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        cmbIntervalos = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        resultadoPrevision = new javax.swing.JLabel();
        lblPersonasVac = new javax.swing.JLabel();
        lblPersonasEnf = new javax.swing.JLabel();
        lblRelacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tbGeneral.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblTituloEnfermedades.setText("Número de Enfermedades Totales:");

        lblNumE.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNumE.setForeground(new java.awt.Color(204, 0, 0));
        lblNumE.setText("00000");

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTituloSanas.setText("Personas Sanas: ");

        lblTituloVac.setText("Personas Vacunadas: ");

        lblNumVacunadas.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNumVacunadas.setForeground(new java.awt.Color(0, 204, 0));
        lblNumVacunadas.setText("00000");

        lblNumSanas.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNumSanas.setForeground(new java.awt.Color(0, 204, 0));
        lblNumSanas.setText("00000");

        lblTituloAtenc.setText("Personas En Atención: ");

        lblTituloConfi.setText("Personas Confinadas: ");

        lblNumAtencion.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNumAtencion.setText("00000");

        lblNumConfinadas.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNumConfinadas.setText("00000");

        lblTituloEnfermas.setText("Personas Enfermas: ");

        lblTituloCuarent.setText("Personas En Cuarentena: ");

        lblNumEnfermas.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNumEnfermas.setForeground(new java.awt.Color(204, 0, 0));
        lblNumEnfermas.setText("00000");

        lblNumCuarentena.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNumCuarentena.setForeground(new java.awt.Color(204, 0, 0));
        lblNumCuarentena.setText("00000");

        lblTituloVulnerables.setText("Personas Vulnerables: ");

        lblNumVulnerables.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNumVulnerables.setForeground(new java.awt.Color(204, 0, 0));
        lblNumVulnerables.setText("00000");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblTituloConfi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNumConfinadas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lblTituloSanas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNumSanas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lblTituloVac)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNumVacunadas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lblTituloAtenc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNumAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(118, 118, 118)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lblTituloVulnerables)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNumVulnerables, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lblTituloCuarent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNumCuarentena, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lblTituloEnfermas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNumEnfermas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloSanas)
                    .addComponent(lblNumSanas)
                    .addComponent(lblTituloEnfermas)
                    .addComponent(lblNumEnfermas))
                .addGap(36, 36, 36)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloVac)
                    .addComponent(lblNumVacunadas)
                    .addComponent(lblTituloCuarent)
                    .addComponent(lblNumCuarentena))
                .addGap(36, 36, 36)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloAtenc)
                    .addComponent(lblNumAtencion)
                    .addComponent(lblTituloVulnerables)
                    .addComponent(lblNumVulnerables))
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloConfi)
                    .addComponent(lblNumConfinadas))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblTituloEnfermedades)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNumE, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloEnfermedades)
                    .addComponent(lblNumE))
                .addGap(26, 26, 26)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTituloEnfermedades.getAccessibleContext().setAccessibleName("lblNumEnfermedades");

        tbGeneral.addTab("Estadísticas Generales", jPanel2);

        lblTituloCatalog.setText("Número de Enfermedades Catalogadas:");

        lblNumECatalog.setText("0");

        jLabel4.setText("Enfermedades");

        jListEnfermedades2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jListEnfermedades2);

        barra1Q1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setText("Q1");

        javax.swing.GroupLayout barra1Q1Layout = new javax.swing.GroupLayout(barra1Q1);
        barra1Q1.setLayout(barra1Q1Layout);
        barra1Q1Layout.setHorizontalGroup(
            barra1Q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barra1Q1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        barra1Q1Layout.setVerticalGroup(
            barra1Q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barra1Q1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        barra1Q2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setText("Q2");

        javax.swing.GroupLayout barra1Q2Layout = new javax.swing.GroupLayout(barra1Q2);
        barra1Q2.setLayout(barra1Q2Layout);
        barra1Q2Layout.setHorizontalGroup(
            barra1Q2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barra1Q2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        barra1Q2Layout.setVerticalGroup(
            barra1Q2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barra1Q2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        barra1Q3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setText("Q3");

        javax.swing.GroupLayout barra1Q3Layout = new javax.swing.GroupLayout(barra1Q3);
        barra1Q3.setLayout(barra1Q3Layout);
        barra1Q3Layout.setHorizontalGroup(
            barra1Q3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barra1Q3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        barra1Q3Layout.setVerticalGroup(
            barra1Q3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barra1Q3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        barra1Q4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setText("Q4");

        javax.swing.GroupLayout barra1Q4Layout = new javax.swing.GroupLayout(barra1Q4);
        barra1Q4.setLayout(barra1Q4Layout);
        barra1Q4Layout.setHorizontalGroup(
            barra1Q4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barra1Q4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        barra1Q4Layout.setVerticalGroup(
            barra1Q4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barra1Q4Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        barra2Q1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setText("Q1");

        javax.swing.GroupLayout barra2Q1Layout = new javax.swing.GroupLayout(barra2Q1);
        barra2Q1.setLayout(barra2Q1Layout);
        barra2Q1Layout.setHorizontalGroup(
            barra2Q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barra2Q1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        barra2Q1Layout.setVerticalGroup(
            barra2Q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barra2Q1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        barra2Q2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setText("Q2");

        javax.swing.GroupLayout barra2Q2Layout = new javax.swing.GroupLayout(barra2Q2);
        barra2Q2.setLayout(barra2Q2Layout);
        barra2Q2Layout.setHorizontalGroup(
            barra2Q2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barra2Q2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        barra2Q2Layout.setVerticalGroup(
            barra2Q2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barra2Q2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        barra2Q3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel14.setText("Q3");

        javax.swing.GroupLayout barra2Q3Layout = new javax.swing.GroupLayout(barra2Q3);
        barra2Q3.setLayout(barra2Q3Layout);
        barra2Q3Layout.setHorizontalGroup(
            barra2Q3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barra2Q3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        barra2Q3Layout.setVerticalGroup(
            barra2Q3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barra2Q3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        barra2Q4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel15.setText("Q4");

        javax.swing.GroupLayout barra2Q4Layout = new javax.swing.GroupLayout(barra2Q4);
        barra2Q4.setLayout(barra2Q4Layout);
        barra2Q4Layout.setHorizontalGroup(
            barra2Q4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barra2Q4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        barra2Q4Layout.setVerticalGroup(
            barra2Q4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barra2Q4Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("2020");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("2021");

        jTableEvolucion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTableEvolucion);

        jLabel6.setText("Evolucion");

        btnLeyenda.setText("Leyenda");
        btnLeyenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeyendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(btnLeyenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(85, 85, 85))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(barra1Q1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(barra1Q2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(barra1Q3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(barra1Q4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(barra2Q1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(barra2Q2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(barra2Q3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(barra2Q4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTituloCatalog, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumECatalog)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloCatalog)
                    .addComponent(lblNumECatalog))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(barra1Q1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barra1Q2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barra1Q3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barra1Q4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barra2Q1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barra2Q2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barra2Q3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barra2Q4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(btnLeyenda))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        tbGeneral.addTab("Enfermedades", jPanel3);

        jListEnfermedades.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jListEnfermedades);

        jLabel1.setText("Enfermedades");

        jLabel2.setText("Número de Campañas Informativas:");

        jLabel3.setText("Número de Campañas Vacunativas:");

        lblNumInfor.setText("0");

        lblNumVacu.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(lblNumInfor))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNumVacu)))))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblNumInfor))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblNumVacu))))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        tbGeneral.addTab("Campañas", jPanel1);

        jLabel16.setText("Vacunas de Enfermedades");

        jLabel17.setText("Cantidad de Vacunas Disponibles");

        tablaAprovisionamiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tablaAprovisionamiento);

        tablaVacunas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tablaVacunas);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        tbGeneral.addTab("Vacunas", jPanel4);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel18.setText("Relación Entre Personas Vacunadas y Enfermas");

        jLabel19.setText("Vacunadas:");

        jLabel20.setText("Enfermas:");

        jLabel21.setText("Resultado:");

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel22.setText("Previsión de Olas de Contagios");

        jLabel26.setText("Selecciona Enfermedad y Intervalo de Tiempo");

        cmbEnfermedades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel27.setText("Enfermedad:");

        jLabel28.setText("Intervalo:");

        cmbIntervalos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semana", "Mes" }));

        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel29.setText("Posible Ola de Contagio:");

        resultadoPrevision.setText("SI/NO");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addComponent(resultadoPrevision, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(resultadoPrevision))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel22))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel26))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbEnfermedades, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbIntervalos, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbEnfermedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(cmbIntervalos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        lblPersonasVac.setText("0");

        lblPersonasEnf.setText("0");

        lblRelacion.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPersonasEnf)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblPersonasVac)
                                .addGap(131, 131, 131)
                                .addComponent(jLabel21)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRelacion))
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel21)
                    .addComponent(lblPersonasVac)
                    .addComponent(lblRelacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(lblPersonasEnf))
                .addGap(33, 33, 33)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbGeneral.addTab("Relaciones y Previsiones", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tbGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbGeneral)
        );

        tbGeneral.getAccessibleContext().setAccessibleName("tpGeneral");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLeyendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeyendaActionPerformed
        // TODO add your handling code here:
        IU_LeyendaEstadisticas leyenda = new IU_LeyendaEstadisticas(new javax.swing.JFrame(), true);
        leyenda.setVisible(true);
    }//GEN-LAST:event_btnLeyendaActionPerformed

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
            java.util.logging.Logger.getLogger(IU_Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IU_Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IU_Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IU_Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IU_Estadisticas dialog = new IU_Estadisticas(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel barra1Q1;
    private javax.swing.JPanel barra1Q2;
    private javax.swing.JPanel barra1Q3;
    private javax.swing.JPanel barra1Q4;
    private javax.swing.JPanel barra2Q1;
    private javax.swing.JPanel barra2Q2;
    private javax.swing.JPanel barra2Q3;
    private javax.swing.JPanel barra2Q4;
    private javax.swing.JButton btnLeyenda;
    private javax.swing.JComboBox<String> cmbEnfermedades;
    private javax.swing.JComboBox<String> cmbIntervalos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListEnfermedades;
    private javax.swing.JList<String> jListEnfermedades2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTableEvolucion;
    private javax.swing.JLabel lblNumAtencion;
    private javax.swing.JLabel lblNumConfinadas;
    private javax.swing.JLabel lblNumCuarentena;
    private javax.swing.JLabel lblNumE;
    private javax.swing.JLabel lblNumECatalog;
    private javax.swing.JLabel lblNumEnfermas;
    private javax.swing.JLabel lblNumInfor;
    private javax.swing.JLabel lblNumSanas;
    private javax.swing.JLabel lblNumVacu;
    private javax.swing.JLabel lblNumVacunadas;
    private javax.swing.JLabel lblNumVulnerables;
    private javax.swing.JLabel lblPersonasEnf;
    private javax.swing.JLabel lblPersonasVac;
    private javax.swing.JLabel lblRelacion;
    private javax.swing.JLabel lblTituloAtenc;
    private javax.swing.JLabel lblTituloCatalog;
    private javax.swing.JLabel lblTituloConfi;
    private javax.swing.JLabel lblTituloCuarent;
    private javax.swing.JLabel lblTituloEnfermas;
    private javax.swing.JLabel lblTituloEnfermedades;
    private javax.swing.JLabel lblTituloSanas;
    private javax.swing.JLabel lblTituloVac;
    private javax.swing.JLabel lblTituloVulnerables;
    private javax.swing.JLabel resultadoPrevision;
    private javax.swing.JTable tablaAprovisionamiento;
    private javax.swing.JTable tablaVacunas;
    private javax.swing.JTabbedPane tbGeneral;
    // End of variables declaration//GEN-END:variables
}
