/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidaddos;

import java.awt.Color;
import funcion.evaluarFunciones;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import informacion.informacionBiseccion;
import informacion.informacionFalsaPosicion;

/**
 *
 * @author Jorge Alvarado
 */
public class MetodoBiseccionFalsaPosicion extends javax.swing.JFrame {

    /**
     * Creates new form MetodoBiseccionFalsaPosicion
     */
    public MetodoBiseccionFalsaPosicion() {
        initComponents();
        setLocationRelativeTo(null);

        grupoBotones.add(botonBiseccion);
        grupoBotones.add(botonFalsaPosicion);
    }

    int xMouse, yMouse;

    Color sombra = new Color(0, 134, 170);

    DefaultTableModel modelo;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitPnl = new javax.swing.JPanel();
        exitLb = new javax.swing.JLabel();
        grupoBotones = new javax.swing.ButtonGroup();
        panelBackGround = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        textFuncion = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textPuntoA = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        textPuntoB = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        textError = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        botonBiseccion = new javax.swing.JRadioButton();
        botonFalsaPosicion = new javax.swing.JRadioButton();
        panelEvaluar = new javax.swing.JPanel();
        labelEvaluar = new javax.swing.JLabel();
        panelTeoria = new javax.swing.JPanel();
        labelInformacion = new javax.swing.JLabel();
        panelSalir = new javax.swing.JPanel();
        exitLb1 = new javax.swing.JLabel();
        panelRetroceder = new javax.swing.JPanel();
        labelBack = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableResultados = new javax.swing.JTable();
        labelRaiz = new javax.swing.JLabel();
        labelFx = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        panelLimpiar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        exitPnl.setBackground(new java.awt.Color(255, 255, 255));

        exitLb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitLb.setText("X");
        exitLb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitLbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitLbMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitPnlLayout = new javax.swing.GroupLayout(exitPnl);
        exitPnl.setLayout(exitPnlLayout);
        exitPnlLayout.setHorizontalGroup(
            exitPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitLb, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        exitPnlLayout.setVerticalGroup(
            exitPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitLb, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panelBackGround.setBackground(new java.awt.Color(255, 255, 255));
        panelBackGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 61, 121));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelBackGround.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 860));

        jPanel2.setBackground(new java.awt.Color(213, 159, 15));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelBackGround.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 860));

        textFuncion.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        textFuncion.setForeground(new java.awt.Color(204, 204, 204));
        textFuncion.setText("Ingrese su función aquí");
        textFuncion.setBorder(null);
        textFuncion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textFuncionMousePressed(evt);
            }
        });
        textFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFuncionActionPerformed(evt);
            }
        });
        panelBackGround.add(textFuncion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 89, 500, 30));
        panelBackGround.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 122, 500, 10));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        jLabel1.setText("FUNCIÓN");
        panelBackGround.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        jLabel2.setText("Punto a");
        panelBackGround.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        textPuntoA.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        textPuntoA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textPuntoA.setText("0");
        textPuntoA.setBorder(null);
        panelBackGround.add(textPuntoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 100, 20));
        panelBackGround.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 181, 100, 10));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        jLabel3.setText("Punto b");
        panelBackGround.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        textPuntoB.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        textPuntoB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textPuntoB.setText("1");
        textPuntoB.setBorder(null);
        panelBackGround.add(textPuntoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 100, 20));
        panelBackGround.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 100, 20));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel4.setText("Error");
        panelBackGround.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, -1, -1));

        textError.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        textError.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textError.setText("0.0001");
        textError.setBorder(null);
        panelBackGround.add(textError, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 100, 20));
        panelBackGround.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 100, 10));

        botonBiseccion.setBackground(new java.awt.Color(255, 255, 255));
        botonBiseccion.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        botonBiseccion.setText("Método de bisección");
        botonBiseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBiseccionActionPerformed(evt);
            }
        });
        panelBackGround.add(botonBiseccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(657, 59, -1, -1));

        botonFalsaPosicion.setBackground(new java.awt.Color(255, 255, 255));
        botonFalsaPosicion.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        botonFalsaPosicion.setText("Método de falsa posición");
        panelBackGround.add(botonFalsaPosicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(657, 98, -1, -1));

        panelEvaluar.setBackground(new java.awt.Color(0, 134, 190));

        labelEvaluar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        labelEvaluar.setForeground(new java.awt.Color(255, 255, 255));
        labelEvaluar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEvaluar.setText("Evaluar");
        labelEvaluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelEvaluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelEvaluarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelEvaluarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelEvaluarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelEvaluarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                labelEvaluarMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout panelEvaluarLayout = new javax.swing.GroupLayout(panelEvaluar);
        panelEvaluar.setLayout(panelEvaluarLayout);
        panelEvaluarLayout.setHorizontalGroup(
            panelEvaluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelEvaluar, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        panelEvaluarLayout.setVerticalGroup(
            panelEvaluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelEvaluar, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        panelBackGround.add(panelEvaluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 208, 280, -1));

        panelTeoria.setBackground(new java.awt.Color(0, 134, 190));
        panelTeoria.setPreferredSize(new java.awt.Dimension(136, 33));

        labelInformacion.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        labelInformacion.setForeground(new java.awt.Color(255, 255, 255));
        labelInformacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInformacion.setText("Teoria");
        labelInformacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelInformacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelInformacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelInformacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelInformacionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelTeoriaLayout = new javax.swing.GroupLayout(panelTeoria);
        panelTeoria.setLayout(panelTeoriaLayout);
        panelTeoriaLayout.setHorizontalGroup(
            panelTeoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTeoriaLayout.createSequentialGroup()
                .addComponent(labelInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelTeoriaLayout.setVerticalGroup(
            panelTeoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelInformacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panelBackGround.add(panelTeoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 280, 70));

        panelSalir.setBackground(new java.awt.Color(255, 255, 255));

        exitLb1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        exitLb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitLb1.setText("x");
        exitLb1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitLb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLb1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitLb1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitLb1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelSalirLayout = new javax.swing.GroupLayout(panelSalir);
        panelSalir.setLayout(panelSalirLayout);
        panelSalirLayout.setHorizontalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitLb1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        panelSalirLayout.setVerticalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitLb1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelBackGround.add(panelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, -1, -1));

        panelRetroceder.setBackground(new java.awt.Color(255, 255, 255));
        panelRetroceder.setMaximumSize(new java.awt.Dimension(40, 40));

        labelBack.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        labelBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBack.setText("<");
        labelBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelBackMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelRetrocederLayout = new javax.swing.GroupLayout(panelRetroceder);
        panelRetroceder.setLayout(panelRetrocederLayout);
        panelRetrocederLayout.setHorizontalGroup(
            panelRetrocederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelRetrocederLayout.setVerticalGroup(
            panelRetrocederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panelBackGround.add(panelRetroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, -1, -1));
        panelBackGround.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 291, 860, 10));

        tableResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "n", "a", "b", "f(a)", "f(b)", "x", "f(x)", "|f(x)|<error", "f(a) * f(x) ", "f(a) * f(x) <0"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableResultados.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tableResultados);

        panelBackGround.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 319, 860, -1));

        labelRaiz.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        labelRaiz.setText("La raiz de f(x) es: ");
        panelBackGround.add(labelRaiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 810, -1, -1));

        labelFx.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        labelFx.setText("f(x) = ");
        panelBackGround.add(labelFx, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 763, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        panelBackGround.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        panelLimpiar.setBackground(new java.awt.Color(0, 134, 190));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Limpiar");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelLimpiarLayout = new javax.swing.GroupLayout(panelLimpiar);
        panelLimpiar.setLayout(panelLimpiarLayout);
        panelLimpiarLayout.setHorizontalGroup(
            panelLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        panelLimpiarLayout.setVerticalGroup(
            panelLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        panelBackGround.add(panelLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 280, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFuncionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFuncionMousePressed
        textFuncion.setText("");
        textFuncion.setForeground(Color.black);
    }//GEN-LAST:event_textFuncionMousePressed

    private void labelEvaluarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelEvaluarMouseEntered
//        Color sombra = new Color(0, 134, 170);
        panelEvaluar.setBackground(sombra);        // TODO add your handling code here:
    }//GEN-LAST:event_labelEvaluarMouseEntered

    private void labelEvaluarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelEvaluarMouseExited
        Color original = new Color(0, 134, 190);
        panelEvaluar.setBackground(original);
    }//GEN-LAST:event_labelEvaluarMouseExited

    private void exitLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLbMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitLbMouseClicked

    private void exitLbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLbMouseEntered
        exitPnl.setBackground(Color.gray);
    }//GEN-LAST:event_exitLbMouseEntered

    private void exitLbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLbMouseExited
        exitPnl.setBackground(Color.WHITE);
    }//GEN-LAST:event_exitLbMouseExited

    private void exitLb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLb1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitLb1MouseClicked

    private void exitLb1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLb1MouseEntered
        panelSalir.setBackground(Color.gray);
    }//GEN-LAST:event_exitLb1MouseEntered

    private void exitLb1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLb1MouseExited
        panelSalir.setBackground(Color.WHITE);
    }//GEN-LAST:event_exitLb1MouseExited

    private void labelBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBackMouseEntered
        panelRetroceder.setBackground(Color.GRAY);
    }//GEN-LAST:event_labelBackMouseEntered

    private void labelBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBackMouseExited
        panelRetroceder.setBackground(Color.WHITE);
    }//GEN-LAST:event_labelBackMouseExited

    private void labelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBackMouseClicked
        this.setVisible(false);
        portadaUnidadDos abrir = new portadaUnidadDos();
        abrir.setVisible(true);
    }//GEN-LAST:event_labelBackMouseClicked

    private void labelInformacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelInformacionMouseEntered
        Color sombra = new Color(0, 134, 170);
        panelTeoria.setBackground(sombra);
    }//GEN-LAST:event_labelInformacionMouseEntered

    private void labelInformacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelInformacionMouseExited
        Color original = new Color(0, 134, 190);
        panelTeoria.setBackground(original);
    }//GEN-LAST:event_labelInformacionMouseExited

    private void labelEvaluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelEvaluarMouseClicked

        String funcion = textFuncion.getText();

        limpiarTabla();
        modelo = (DefaultTableModel) tableResultados.getModel();

        evaluarFunciones Funcion = new evaluarFunciones();
        Funcion.setFuncion(funcion);

        double a = Double.parseDouble(textPuntoA.getText());
        double b = Double.parseDouble(textPuntoB.getText());

        if (botonBiseccion.isSelected()) {
            if (!funcion.equals("") && Funcion.contieneX()) {
                if (Funcion.evaluar(a) > 0 && Funcion.evaluar(b) > 0) {
                    JOptionPane.showMessageDialog(null, "La funcion no cruza el eje X en el intervalo, "
                            + " ingrese un intervalo valido", "ERROR 1.2", JOptionPane.ERROR_MESSAGE);
                } else {
                    biseccion(funcion);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Introduzca una funcion valida \n "
                        + "(El campo de la funcion esta vacio o la funcion no es valida) \n Las funciones validas son: \n "
                        + "polinomios, trigonometricas, racionales, radicales", "ERROR 2", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            if (botonFalsaPosicion.isSelected()) {
                if (!funcion.equals("") && Funcion.contieneX()) {
                    if (Funcion.evaluar(a) > 0 && Funcion.evaluar(b) > 0) {
                        JOptionPane.showMessageDialog(null, "La funcion no cruza el eje X en el intervalo, }"
                                + " ingrese un intervalo valido", "ERROR 1.2", JOptionPane.ERROR_MESSAGE);
                    } else {
                        falsaPosicion(funcion);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Introduzca una funcion valida \n "
                            + "(El campo de la funcion esta vacio o la funcion no es valida) \n Las funciones validas son: \n "
                            + "polinomios, trigonometricas, racionales, radicales", "ERROR 2", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Selecciona el metodo con el que deseas hallar la raiz", "ERROR 1.0", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_labelEvaluarMouseClicked

    private void labelEvaluarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelEvaluarMousePressed
        Color click = new Color(0, 134, 150);
        panelEvaluar.setBackground(click);
    }//GEN-LAST:event_labelEvaluarMousePressed

    private void labelEvaluarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelEvaluarMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_labelEvaluarMouseReleased

    private void labelInformacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelInformacionMouseClicked
        if (botonBiseccion.isSelected()) {
            informacionBiseccion abrir = new informacionBiseccion();
            abrir.setVisible(true);
        } else if (botonFalsaPosicion.isSelected()) {
            informacionFalsaPosicion abrir = new informacionFalsaPosicion();
            abrir.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Elige el metodo del que quieres conocer la información", "ERROR 2.1", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_labelInformacionMouseClicked

    private void textFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFuncionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFuncionActionPerformed

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();// TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void botonBiseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBiseccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBiseccionActionPerformed

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        Color sombra = new Color(0, 134, 170);
        panelLimpiar.setBackground(sombra);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        Color original = new Color(0, 134, 190);
        panelLimpiar.setBackground(original);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Color sombra = new Color(204, 204, 204);
        textFuncion.setForeground(sombra);
        textFuncion.setText("Ingrese su función aquí");
        textError.setText("0.0001");
        textPuntoA.setText("0");
        textPuntoB.setText("1");
        labelFx.setText("f(x) = ");
        labelRaiz.setText("La raiz de f(x) es: ");
        limpiarTabla();
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(MetodoBiseccionFalsaPosicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MetodoBiseccionFalsaPosicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MetodoBiseccionFalsaPosicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MetodoBiseccionFalsaPosicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MetodoBiseccionFalsaPosicion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton botonBiseccion;
    private javax.swing.JRadioButton botonFalsaPosicion;
    private javax.swing.JLabel exitLb;
    private javax.swing.JLabel exitLb1;
    private javax.swing.JPanel exitPnl;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel labelBack;
    private javax.swing.JLabel labelEvaluar;
    private javax.swing.JLabel labelFx;
    private javax.swing.JLabel labelInformacion;
    private javax.swing.JLabel labelRaiz;
    private javax.swing.JPanel panelBackGround;
    private javax.swing.JPanel panelEvaluar;
    private javax.swing.JPanel panelLimpiar;
    private javax.swing.JPanel panelRetroceder;
    private javax.swing.JPanel panelSalir;
    private javax.swing.JPanel panelTeoria;
    private javax.swing.JTable tableResultados;
    private javax.swing.JTextField textError;
    private javax.swing.JTextField textFuncion;
    private javax.swing.JTextField textPuntoA;
    private javax.swing.JTextField textPuntoB;
    // End of variables declaration//GEN-END:variables

    public void limpiarTabla() {
        tableResultados.setModel(new DefaultTableModel(new Object[][]{},
                new String[]{"n", "a", "b", "f(a)", "f(b)", "x", "f(x)", "|f(x)|<erro",
                    "f(a)*f(b)", "f(a)*f(b)<0"}));
    }

    public void biseccion(String funcion) {

        evaluarFunciones Funcion = new evaluarFunciones();

        Funcion.setFuncion(funcion);

        double a = Double.parseDouble(textPuntoA.getText());
        double b = Double.parseDouble(textPuntoB.getText());
        double error = Double.parseDouble(textError.getText());

        double x;
        int contador = 0;

        double funcionA = Funcion.evaluar(a);
        double funcionB = Funcion.evaluar(b);

        if (Double.isNaN(funcionA) || Double.isNaN(funcionB)) {
            JOptionPane.showMessageDialog(null, "La evaluacion de F(a) o F(b) no es un numero, esta indefinida o es infinita \n"
                    + "1.-Recuerda las siguientes restricciones\n"
                    + "2.-La funcion debe contener almenos una x\n"
                    + "3.-ln(x): donde x debe ser mayor a 0 \n"
                    + "4.-Racionales: donde el denominador no debe ser cero\n"
                    + "5.-Radicales: donde el interior de la raiz no debe ser negativo", "ERROR 3", JOptionPane.ERROR_MESSAGE);
        }
        if (Funcion.evaluar(a) * Funcion.evaluar(b) > 0) {

            JOptionPane.showMessageDialog(null, "Dar otro intervalo", "ERROR 3.1", JOptionPane.ERROR_MESSAGE);

        } else {
            if (Math.abs(funcionA) < error) {
                JOptionPane.showMessageDialog(null, "La raiz se encuentra en el intervalo a");
                labelRaiz.setText("El valor de la raiz es: " + a);
            } else if (Math.abs(funcionB) < error) {
                JOptionPane.showMessageDialog(null, "La raiz se encuentra en el intervalo b");
                labelRaiz.setText("El valor de la raiz es: " + b);
            } else {
                do {
                    x = (a + b) / 2;
                    contador++;

                    funcionA = Funcion.evaluar(a);
                    funcionB = Funcion.evaluar(b);
                    double funcionX = Funcion.evaluar(x);

                    modelo.addRow(new Object[]{contador, a, b, funcionA,
                        funcionB, x, funcionX, menorError(error, funcionX),
                        funcionA * funcionB, menorCero(funcionA, funcionX)});

                    if (Funcion.evaluar(a) * Funcion.evaluar(x) < 0) {
                        b = x;
                    } else {
                        a = x;
                    }

                    labelRaiz.setText("La raíz de f(x) es: " + x);
                } while (Math.abs(Funcion.evaluar(x)) > error);
            }

        }

        labelFx.setText("f(x) = " + funcion);
    }

    public void falsaPosicion(String funcion) {

        evaluarFunciones Funcion = new evaluarFunciones();
        Funcion.setFuncion(funcion);

        double a = Double.parseDouble(textPuntoA.getText());
        double b = Double.parseDouble(textPuntoB.getText());
        double error = Double.parseDouble(textError.getText());

        double x;
        int contador = 0;
//La funcion no cruza
        double funcionA = Funcion.evaluar(a);
        double funcionB = Funcion.evaluar(b);

        if (Double.isNaN(funcionA) || Double.isNaN(funcionB)) {
            JOptionPane.showMessageDialog(null, "La evaluacion de F(a) o F(b) no es un numero, esta indefinida o es infinita \n"
                    + "1.-Recuerda las siguientes restricciones\n"
                    + "2.-La funcion debe contener almenos una x\n"
                    + "3.-ln(x): donde x debe ser mayor a 0 \n"
                    + "4.-Racionales: donde el denominador no debe ser cero\n"
                    + "5.-Radicales: donde el interior de la raiz no debe ser negativo", "ERROR 3", JOptionPane.ERROR_MESSAGE);
        }

        if (Funcion.evaluar(a) * Funcion.evaluar(b) > 0) {

            JOptionPane.showMessageDialog(null, "Dar otro intervalo", "ERROR 3.1", JOptionPane.ERROR_MESSAGE);

        } else {
            if (Math.abs(Funcion.evaluar(a)) < error) {
                JOptionPane.showMessageDialog(null, "La raiz se encuentra en el intervalo a");
                labelRaiz.setText("El valor de la raiz es: " + a);
            } else if (Math.abs(Funcion.evaluar(b)) < error) {
                JOptionPane.showMessageDialog(null, "La raiz se encuentra en el intervalo b");
                labelRaiz.setText("El valor de la raiz es: " + b);
            } else {
                do {
                    x = (b * funcionA - a * funcionB) / (funcionA - funcionB);
                    contador++;

                    funcionA = Funcion.evaluar(a);
                    funcionB = Funcion.evaluar(b);

                    modelo.addRow(new Object[]{contador, a, b, funcionA, funcionB,
                        x, Funcion.evaluar(x), menorError(error, Funcion.evaluar(x)),
                        funcionA * funcionB, menorCero(funcionA, Funcion.evaluar(x))});

                    if (Funcion.evaluar(a) * Funcion.evaluar(x) < 0) {
                        b = x;
                    } else {
                        a = x;
                    }
                    labelRaiz.setText("La raíz de f(x) es: " + x);
                } while (Math.abs(Funcion.evaluar(x)) > error);
            }
        }
    }

    public boolean menorCero(double funcionA, double funcionX) {
        if (funcionA * funcionX < 0) {
            return true;
        }
        return false;
    }

    public boolean menorError(double error, double funcionX) {
        if (Math.abs(funcionX) < error) {
            return true;
        }
        return false;
    }

}
