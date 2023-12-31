/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidadtres;

import funcion.matriz;
import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Alvarado
 */
public class Jacobi extends javax.swing.JFrame {

    /**
     * Creates new form Jacobi
     */
    public Jacobi() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    DecimalFormat rd = new DecimalFormat("###.#####");

    int xMouse, yMouse;
    Color sombra = new Color(0, 134, 170);
    Color original = new Color(0, 134, 190);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelAzul = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        textFieldDimension = new javax.swing.JTextField();
        panelValores = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelRetroceder = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        panelSalir = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaResultados = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        textFielsError = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAzul.setBackground(new java.awt.Color(0, 61, 121));

        javax.swing.GroupLayout panelAzulLayout = new javax.swing.GroupLayout(panelAzul);
        panelAzul.setLayout(panelAzulLayout);
        panelAzulLayout.setHorizontalGroup(
            panelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        panelAzulLayout.setVerticalGroup(
            panelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );

        jPanel1.add(panelAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 900));

        jPanel2.setBackground(new java.awt.Color(213, 159, 15));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 20, 900));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 100, 10));

        textFieldDimension.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        textFieldDimension.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldDimension.setText("4");
        textFieldDimension.setBorder(null);
        jPanel1.add(textFieldDimension, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 100, 40));

        panelValores.setBackground(new java.awt.Color(0, 134, 190));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingresar valores");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelValoresLayout = new javax.swing.GroupLayout(panelValores);
        panelValores.setLayout(panelValoresLayout);
        panelValoresLayout.setHorizontalGroup(
            panelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        panelValoresLayout.setVerticalGroup(
            panelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(panelValores, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 200, 50));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel3.setText("Dimensión:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

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
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel2.setText("Método de jacobi");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 780, 40));

        panelRetroceder.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("<");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelRetrocederLayout = new javax.swing.GroupLayout(panelRetroceder);
        panelRetroceder.setLayout(panelRetrocederLayout);
        panelRetrocederLayout.setHorizontalGroup(
            panelRetrocederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        panelRetrocederLayout.setVerticalGroup(
            panelRetrocederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(panelRetroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 40, 40));

        panelSalir.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("x");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelSalirLayout = new javax.swing.GroupLayout(panelSalir);
        panelSalir.setLayout(panelSalirLayout);
        panelSalirLayout.setHorizontalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        panelSalirLayout.setVerticalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(panelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 40, 40));

        textAreaResultados.setColumns(20);
        textAreaResultados.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        textAreaResultados.setRows(5);
        jScrollPane1.setViewportView(textAreaResultados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 800, 730));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel4.setText("Error");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, -1, -1));

        textFielsError.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        textFielsError.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFielsError.setText("0.0001");
        textFielsError.setBorder(null);
        textFielsError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFielsErrorActionPerformed(evt);
            }
        });
        jPanel1.add(textFielsError, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 100, 40));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 100, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        matriz objetoMatriz = new matriz();

        int dimension = Integer.parseInt(textFieldDimension.getText());

        double[][] matrizA = new double[dimension][dimension];

        textAreaResultados.append("========= Nueva operación =========\n");

        if (dimension < 3) {
            textAreaResultados.append("La dimension de la matriz no pueder ser menor a 4\n");
        } else {
            matrizA = objetoMatriz.llenaMatriz(dimension);
            muestraMatriz(matrizA, dimension, dimension);
            double[] vectorB = objetoMatriz.llenaVector(dimension);
            double error = Double.parseDouble(textFielsError.getText());
            jacobi(vectorB, matrizA, error);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered

        panelValores.setBackground(sombra);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited

        panelValores.setBackground(original);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.setVisible(false);
        PortadaUnidadTres abrir = new PortadaUnidadTres();
        abrir.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        panelRetroceder.setBackground(Color.gray);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        panelRetroceder.setBackground(Color.white);
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        panelSalir.setBackground(Color.gray);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        panelSalir.setBackground(Color.WHITE);
    }//GEN-LAST:event_jLabel6MouseExited

    private void textFielsErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFielsErrorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFielsErrorActionPerformed

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
            java.util.logging.Logger.getLogger(Jacobi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jacobi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jacobi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jacobi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jacobi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel panelAzul;
    private javax.swing.JPanel panelRetroceder;
    private javax.swing.JPanel panelSalir;
    private javax.swing.JPanel panelValores;
    private javax.swing.JTextArea textAreaResultados;
    private javax.swing.JTextField textFieldDimension;
    private javax.swing.JTextField textFielsError;
    // End of variables declaration//GEN-END:variables

    public void muestraMatriz(double[][] matriz, int renglon, int columna) {
        String auxiliar = "";
        for (int i = 0; i < renglon; i++) {
            auxiliar = " ";
            for (int j = 0; j < columna; j++) {
                auxiliar += "[ " + matriz[i][j] + " ] ";
            }
            textAreaResultados.append(auxiliar + " \n");
        }
        textAreaResultados.append("\n");
    }

    public void muestraVector(double[] vector, int dimension) {
        String auxiliar = "";
        for (int i = 0; i < dimension; i++) {
            auxiliar += "| ";
            auxiliar += vector[i];
            auxiliar += " |\n";
        }
        textAreaResultados.append(auxiliar + "\n");
    }

    public double[] jacobi(double vectorB[], double[][] matrizA, double error) {
        int n = vectorB.length;
        double[] auxiliaAntiguo = new double[n];
        double[] auxiliarActual = new double[n];
        matriz objeto = new matriz();

        if (objeto.determinanteMatriz(matrizA, matrizA.length) == 0) {
            textAreaResultados.append("El determinante de la matriz es 0 por lo tanto no se puede seguir con el procedimiento");
        } else {

            for (int i = 0; i < auxiliaAntiguo.length; i++) {
                auxiliaAntiguo[i] = Double.parseDouble(JOptionPane.showInputDialog("Introduce los valores iniciales"));;
            }

            for (int i = 0; i < auxiliarActual.length; i++) {
                auxiliarActual[i] = 0;
            }

            double norma = 1;
            double sumaAux;
            int contadorIteraciones = 0;

            while (norma > error) {
                sumaAux = 0;
                contadorIteraciones++;

                textAreaResultados.append("Iteracion " + contadorIteraciones + ": \n");

                for (int i = 0; i < auxiliaAntiguo.length; i++) {
                    auxiliaAntiguo[i] = auxiliarActual[i];
                }

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (j != i) {
                            sumaAux += matrizA[i][j] * auxiliaAntiguo[j];  // = Sum a_ij * x^k_j
                        }
                    }
                    auxiliarActual[i] = Double.parseDouble(rd.format((vectorB[i] - sumaAux) / matrizA[i][i]));
                    textAreaResultados.append("\nX[" + (i + 1) + "]: " + auxiliarActual[i]);
                    sumaAux = 0;
                }
                textAreaResultados.append("\n");
                norma = objeto.normaVector(objeto.restaVectores(auxiliarActual, auxiliaAntiguo));
            }
        }
        return auxiliarActual;
    }
}
