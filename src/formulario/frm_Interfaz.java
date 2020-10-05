package formulario;

import planificadordisco.Lista;
import planificadordisco.Nodo;

import java.awt.BasicStroke;
import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class frm_Interfaz extends javax.swing.JFrame {
    Lista myList = new Lista();
    Lista listAux = new Lista();    

    
    double promTB = 0, promTR = 0, promTE = 0;
        
    ChartPanel panel;
    
    public int cabezal;
    public int pistInicio;
    public int pistFin;
    public int velocidad;
    
    public frm_Interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPeticion = new javax.swing.JTextField();
        txtTll = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jradioTll1 = new javax.swing.JRadioButton();
        jradioTll2 = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        btnSSTF = new javax.swing.JButton();
        btnCLook = new javax.swing.JButton();
        btnSCAN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePeticion = new javax.swing.JTable();
        panelGraphic = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCabezal = new javax.swing.JTextField();
        txtInicio = new javax.swing.JTextField();
        txtFin = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtVelocidad = new javax.swing.JTextField();
        jradioVel1 = new javax.swing.JRadioButton();
        jradioVel2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        labelPTB = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        labelPTR = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        labelPTE = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(151, 155, 141));

        jPanel2.setBackground(new java.awt.Color(33, 78, 52));

        jLabel1.setBackground(new java.awt.Color(243, 243, 243));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(243, 243, 243));
        jLabel1.setText("GESTOR DE DISCO");

        jLabel8.setBackground(new java.awt.Color(243, 243, 243));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(243, 243, 243));
        jLabel8.setText("UNIVERSIDAD NACIONAL DEL ALTIPLANO");

        jLabel9.setBackground(new java.awt.Color(243, 243, 243));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(243, 243, 243));
        jLabel9.setText("FACULTAD DE INGENIERÍA MECÁNICA ELÉCTRICA, ELECTRÓNICA Y SISTEMAS");

        jLabel10.setBackground(new java.awt.Color(243, 243, 243));
        jLabel10.setForeground(new java.awt.Color(243, 243, 243));
        jLabel10.setText("ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formulario/now-logo (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(34, 34, 34))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(38, 38, 38))
        );

        jPanel4.setBackground(new java.awt.Color(92, 116, 87));

        jLabel6.setForeground(new java.awt.Color(243, 243, 243));
        jLabel6.setText("Pista Solicitada: ");

        jLabel7.setForeground(new java.awt.Color(243, 243, 243));
        jLabel7.setText("TLL: ");

        jLabel5.setForeground(new java.awt.Color(243, 243, 243));
        jLabel5.setText("Habilitar TLL: ");

        btnAgregar.setText("Agregar Petición");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jradioTll1.setBackground(new java.awt.Color(92, 116, 87));
        buttonGroup2.add(jradioTll1);
        jradioTll1.setSelected(true);
        jradioTll1.setText("Si");
        jradioTll1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jradioTll1ActionPerformed(evt);
            }
        });

        jradioTll2.setBackground(new java.awt.Color(92, 116, 87));
        buttonGroup2.add(jradioTll2);
        jradioTll2.setText("No");
        jradioTll2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jradioTll2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jradioTll1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jradioTll2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTll, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPeticion, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jradioTll1)
                    .addComponent(jradioTll2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPeticion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtTll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(92, 116, 87));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Politicas de Planificación"));
        jPanel5.setForeground(new java.awt.Color(243, 243, 243));

        btnSSTF.setText("SSTF");
        btnSSTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSSTFActionPerformed(evt);
            }
        });

        btnCLook.setText("C-LOOK");
        btnCLook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCLookActionPerformed(evt);
            }
        });

        btnSCAN.setText("SCAN");
        btnSCAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSCANActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSSTF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSCAN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCLook)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSCAN)
                    .addComponent(btnCLook)
                    .addComponent(btnSSTF))
                .addContainerGap())
        );

        jTablePeticion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Petición", "Tiempo de Llegada", "Tiempo de Busqueda", "Tiempo de Recorrido", "Tiempo de Espera"
            }
        ));
        jScrollPane1.setViewportView(jTablePeticion);

        panelGraphic.setBackground(new java.awt.Color(198, 219, 240));

        javax.swing.GroupLayout panelGraphicLayout = new javax.swing.GroupLayout(panelGraphic);
        panelGraphic.setLayout(panelGraphicLayout);
        panelGraphicLayout.setHorizontalGroup(
            panelGraphicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelGraphicLayout.setVerticalGroup(
            panelGraphicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(92, 116, 87));

        jLabel2.setForeground(new java.awt.Color(243, 243, 243));
        jLabel2.setText("Cabezal Inicial: ");

        jLabel3.setForeground(new java.awt.Color(243, 243, 243));
        jLabel3.setText("Pista Inicio: ");

        jLabel4.setForeground(new java.awt.Color(243, 243, 243));
        jLabel4.setText("Pista Fin: ");

        txtFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFinActionPerformed(evt);
            }
        });

        btnGenerar.setText("Generar Disco");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(243, 243, 243));
        jLabel12.setText("Velocidad: ");

        jradioVel1.setBackground(new java.awt.Color(92, 116, 87));
        buttonGroup1.add(jradioVel1);
        jradioVel1.setSelected(true);
        jradioVel1.setText("Si");
        jradioVel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jradioVel1ActionPerformed(evt);
            }
        });

        jradioVel2.setBackground(new java.awt.Color(92, 116, 87));
        buttonGroup1.add(jradioVel2);
        jradioVel2.setText("No");
        jradioVel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jradioVel2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnGenerar)
                        .addContainerGap(106, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCabezal, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jradioVel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jradioVel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtVelocidad)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCabezal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVelocidad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jradioVel1)
                        .addComponent(jradioVel2)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenerar)
                .addContainerGap())
        );

        jButton1.setText("Reiniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel13.setText("PTB: ");

        labelPTB.setText("0");

        jLabel15.setText("PTR: ");

        labelPTR.setText("0");

        jLabel17.setText("PTE: ");

        labelPTE.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelPTB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelPTR)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPTE)
                        .addGap(74, 74, 74))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelGraphic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(labelPTR)
                            .addComponent(jLabel17)
                            .addComponent(labelPTE)
                            .addComponent(labelPTB)
                            .addComponent(jLabel13))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelGraphic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.getAccessibleContext().setAccessibleName("Politicas de Gestión de Disco"); // NOI18N

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        txtCabezal.setEnabled(false);
        txtVelocidad.setEnabled(false);
        txtInicio.setEnabled(false);
        txtFin.setEnabled(false);
        
        cabezal = Integer.parseInt(txtCabezal.getText());
        pistInicio = Integer.parseInt(txtInicio.getText());
        pistFin = Integer.parseInt(txtFin.getText());
        
        if(jradioVel2.isSelected()){
            velocidad = 0;
        }else{
            velocidad = Integer.parseInt(txtVelocidad.getText());
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int peticion = Integer.parseInt(txtPeticion.getText());
        int tll;
       
        if(jradioTll2.isSelected()){
            tll = 0;
        }else{
            tll= Integer.parseInt(txtTll.getText());
        }
        myList.agregarFinal(peticion,tll);

        txtPeticion.setText("");
        txtTll.setText("");
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnSSTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSSTFActionPerformed
        if(jradioTll1.isSelected()){
            myList.SSTF2(cabezal, velocidad,listAux);
        }
        if(jradioTll2.isSelected()){
            myList.SSTF(cabezal,listAux);
        }
        String matriz[][] = new String[myList.total()][5];
        
        for(int i=0; i<myList.total();i++){
            matriz[i][0] = String.valueOf(myList.retNodo(i).peticion);
            matriz[i][1] = String.valueOf(myList.retNodo(i).TLL);
            matriz[i][2] = String.valueOf(myList.retNodo(i).TB);
            matriz[i][3] = String.valueOf(myList.retNodo(i).TR);
            matriz[i][4] = String.valueOf(myList.retNodo(i).TE);
            
            promTB += myList.retNodo(i).TB;
            promTR += myList.retNodo(i).TR;
            promTE += myList.retNodo(i).TE;
        }
        
        promTB = promTB/myList.total();
        promTR = promTR/myList.total();
        promTE = promTE/myList.total();
        
        promTB = (double)Math.round(promTB * 100d)/100;
        promTR = (double)Math.round(promTR * 100d)/100;
        promTE = (double)Math.round(promTE * 100d)/100;
        
        labelPTB.setText(String.valueOf(promTB));
        labelPTR.setText(String.valueOf(promTR));
        labelPTE.setText(String.valueOf(promTE));
        
        jTablePeticion.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Petición", "Tiempo de Llegada", "Tiempo de Busqueda", "Tiempo de Recorrido", "Tiempo de Espera"
            }
        ));
        Nodo recorrido = listAux.retNodoPrimero();
        double cont = 1;
        XYSeries politica = new XYSeries("SSTF");
        politica.add(cont,cabezal);
        while(recorrido!=null){
            cont+=0.5;
            politica.add(cont,recorrido.peticion);
            recorrido = recorrido.siguiente;
        }
        
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(politica);
       
        JFreeChart xylineChart = ChartFactory.createXYLineChart(
                "SSTF", 
                "Tiempo", 
                "Pistas", 
                dataset,
                PlotOrientation.VERTICAL, true, true, false);
        XYPlot plot = xylineChart.getXYPlot();
        
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        
        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesStroke(0, new BasicStroke(4.0f));
        plot.setRenderer(renderer);
        
        panel = new ChartPanel(xylineChart);
        panelGraphic.setLayout(new java.awt.BorderLayout());
        panelGraphic.add(panel);
        panelGraphic.validate();
    }//GEN-LAST:event_btnSSTFActionPerformed

    private void txtFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFinActionPerformed

    private void btnSCANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSCANActionPerformed
        myList.SCAN(cabezal, pistInicio, pistFin, listAux);
        String matriz[][] = new String[myList.total()][5];
        
        for(int i=0; i<myList.total();i++){
            matriz[i][0] = String.valueOf(myList.retNodo(i).peticion);
            matriz[i][1] = String.valueOf(myList.retNodo(i).TLL);
            matriz[i][2] = String.valueOf(myList.retNodo(i).TB);
            matriz[i][3] = String.valueOf(myList.retNodo(i).TR);
            matriz[i][4] = String.valueOf(myList.retNodo(i).TE);
        
            promTB += myList.retNodo(i).TB;
            promTR += myList.retNodo(i).TR;
            promTE += myList.retNodo(i).TE;
        }
        
        promTB = promTB/myList.total();
        promTR = promTR/myList.total();
        promTE = promTE/myList.total();
        
        promTB = (double)Math.round(promTB * 100d)/100;
        promTR = (double)Math.round(promTR * 100d)/100;
        promTE = (double)Math.round(promTE * 100d)/100;
        
        labelPTB.setText(String.valueOf(promTB));
        labelPTR.setText(String.valueOf(promTR));
        labelPTE.setText(String.valueOf(promTE));
        
        
        jTablePeticion.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Petición", "Tiempo de Llegada", "Tiempo de Busqueda", "Tiempo de Recorrido", "Tiempo de Espera"
            }
        ));  
        Nodo recorrido = listAux.retNodoPrimero();
        
        double cont = 1;
        XYSeries politica2 = new XYSeries("SCAN");
        politica2.add(cont,cabezal);
        while(recorrido!=null){
            cont+=0.5;
            politica2.add(cont,recorrido.peticion);
            recorrido = recorrido.siguiente;
        }
        
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(politica2);
       
        JFreeChart xylineChart = ChartFactory.createXYLineChart(
                "SCAN", 
                "Tiempo", 
                "Pistas", 
                dataset,
                PlotOrientation.VERTICAL, true, true, false);
 
        
        XYPlot plot = xylineChart.getXYPlot();
        
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        
        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesStroke(0, new BasicStroke(4.0f));
        plot.setRenderer(renderer);
        
        panel = new ChartPanel(xylineChart);
        
        panelGraphic.setLayout(new java.awt.BorderLayout());
        panelGraphic.add(panel);
        panelGraphic.validate();
    }//GEN-LAST:event_btnSCANActionPerformed

    private void btnCLookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCLookActionPerformed
        if(jradioTll1.isSelected()){
            myList.CLOOK2(cabezal, velocidad, listAux);
        }
        if(jradioTll2.isSelected()){
            myList.CLOOK(cabezal, listAux);
        }
        String matriz[][] = new String[myList.total()][5];
        
        for(int i=0; i<myList.total();i++){
            matriz[i][0] = String.valueOf(myList.retNodo(i).peticion);
            matriz[i][1] = String.valueOf(myList.retNodo(i).TLL);
            matriz[i][2] = String.valueOf(myList.retNodo(i).TB);
            matriz[i][3] = String.valueOf(myList.retNodo(i).TR);
            matriz[i][4] = String.valueOf(myList.retNodo(i).TE);
        
            promTB += myList.retNodo(i).TB;
            promTR += myList.retNodo(i).TR;
            promTE += myList.retNodo(i).TE;
        }
        
        promTB = promTB/myList.total();
        promTR = promTR/myList.total();
        promTE = promTE/myList.total();
        
        promTB = (double)Math.round(promTB * 100d)/100;
        promTR = (double)Math.round(promTR * 100d)/100;
        promTE = (double)Math.round(promTE * 100d)/100;
        
        labelPTB.setText(String.valueOf(promTB));
        labelPTR.setText(String.valueOf(promTR));
        labelPTE.setText(String.valueOf(promTE));
        
        jTablePeticion.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Petición", "Tiempo de Llegada", "Tiempo de Busqueda", "Tiempo de Recorrido", "Tiempo de Espera"
            }
        ));  
        
        Nodo recorrido = listAux.retNodoPrimero();
        
        double cont = 1;
        XYSeries politica3 = new XYSeries("C-LOOK");
        politica3.add(cont,cabezal);
        while(recorrido!=null){
            cont+=0.5;
            politica3.add(cont,recorrido.peticion);
            recorrido = recorrido.siguiente;
        }
        
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(politica3);
       
        JFreeChart xylineChart = ChartFactory.createXYLineChart(
                "C-LOOK", 
                "Tiempo", 
                "Pistas", 
                dataset,
                PlotOrientation.VERTICAL, true, true, false);
 
        
        XYPlot plot = xylineChart.getXYPlot();
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        
        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesStroke(0, new BasicStroke(4.0f));
        plot.setRenderer(renderer);
        
        panel = new ChartPanel(xylineChart);
        
        panelGraphic.setLayout(new java.awt.BorderLayout());
        panelGraphic.add(panel);
        panelGraphic.validate();
    }//GEN-LAST:event_btnCLookActionPerformed

    private void jradioVel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jradioVel2ActionPerformed
        if(jradioVel2.isSelected()){
            txtVelocidad.setEnabled(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jradioVel2ActionPerformed

    private void jradioVel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jradioVel1ActionPerformed
        if(jradioVel1.isSelected()){
            txtVelocidad.setEnabled(true);
        }
    }//GEN-LAST:event_jradioVel1ActionPerformed

    private void jradioTll1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jradioTll1ActionPerformed
        if(jradioTll1.isSelected()){
            txtTll.setEnabled(true);
        }
    }//GEN-LAST:event_jradioTll1ActionPerformed

    private void jradioTll2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jradioTll2ActionPerformed
        if(jradioTll2.isSelected()){
            txtTll.setEnabled(false);
        }
    }//GEN-LAST:event_jradioTll2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtCabezal.setText(null);
        txtVelocidad.setText(null);
        txtInicio.setText(null);
        txtFin.setText(null);
        txtPeticion.setText(null);
        txtTll.setText(null);
        
        txtCabezal.setEnabled(true);
        txtVelocidad.setEnabled(true);
        txtInicio.setEnabled(true);
        txtFin.setEnabled(true);
        txtPeticion.setEnabled(true);
        txtTll.setEnabled(true);
        
        labelPTB.setText("0");
        labelPTR.setText("0");
        labelPTE.setText("0");
        
        
        jTablePeticion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Petición", "Tiempo de Llegada", "Tiempo de Busqueda", "Tiempo de Recorrido", "Tiempo de Espera"
            }
        ));
        
        myList.eliminarTodo();
        listAux.eliminarTodo();
        
        panel.removeAll();
        panel.repaint();
        
        panelGraphic.removeAll();
        panelGraphic.repaint();
            
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCLook;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnSCAN;
    private javax.swing.JButton btnSSTF;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePeticion;
    private javax.swing.JRadioButton jradioTll1;
    private javax.swing.JRadioButton jradioTll2;
    private javax.swing.JRadioButton jradioVel1;
    private javax.swing.JRadioButton jradioVel2;
    private javax.swing.JLabel labelPTB;
    private javax.swing.JLabel labelPTE;
    private javax.swing.JLabel labelPTR;
    private javax.swing.JPanel panelGraphic;
    private javax.swing.JTextField txtCabezal;
    private javax.swing.JTextField txtFin;
    private javax.swing.JTextField txtInicio;
    private javax.swing.JTextField txtPeticion;
    private javax.swing.JTextField txtTll;
    private javax.swing.JTextField txtVelocidad;
    // End of variables declaration//GEN-END:variables
}
