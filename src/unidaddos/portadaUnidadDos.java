/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidaddos;

import java.awt.Color;
import portadas.*;

/**
 *
 * @author Jorge Alvarado
 */
public class portadaUnidadDos extends javax.swing.JFrame {

    /**
     * Creates new form portadaUnidadDos
     */
    public portadaUnidadDos() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    int xMouse, yMouse;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackGround = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panelMetodoBiFp = new javax.swing.JPanel();
        metodoBiFpLB = new javax.swing.JLabel();
        panelMetodoNewton = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelMetodoSecante = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        exitPnl = new javax.swing.JPanel();
        exitLb = new javax.swing.JLabel();
        panelBack4 = new javax.swing.JPanel();
        backLb4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

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
            .addGap(0, 680, Short.MAX_VALUE)
        );

        panelBackGround.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        panelBackGround.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 680));

        panelMetodoBiFp.setBackground(new java.awt.Color(0, 134, 190));

        metodoBiFpLB.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        metodoBiFpLB.setForeground(new java.awt.Color(255, 255, 255));
        metodoBiFpLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        metodoBiFpLB.setText("Método de bisección y falsa posición");
        metodoBiFpLB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        metodoBiFpLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                metodoBiFpLBMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                metodoBiFpLBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                metodoBiFpLBMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelMetodoBiFpLayout = new javax.swing.GroupLayout(panelMetodoBiFp);
        panelMetodoBiFp.setLayout(panelMetodoBiFpLayout);
        panelMetodoBiFpLayout.setHorizontalGroup(
            panelMetodoBiFpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(metodoBiFpLB, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelMetodoBiFpLayout.setVerticalGroup(
            panelMetodoBiFpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(metodoBiFpLB, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        panelBackGround.add(panelMetodoBiFp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 665, -1));

        panelMetodoNewton.setBackground(new java.awt.Color(0, 134, 190));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Método de Newton");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelMetodoNewtonLayout = new javax.swing.GroupLayout(panelMetodoNewton);
        panelMetodoNewton.setLayout(panelMetodoNewtonLayout);
        panelMetodoNewtonLayout.setHorizontalGroup(
            panelMetodoNewtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelMetodoNewtonLayout.setVerticalGroup(
            panelMetodoNewtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panelBackGround.add(panelMetodoNewton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 665, -1));

        panelMetodoSecante.setBackground(new java.awt.Color(0, 134, 190));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Método de la secante");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelMetodoSecanteLayout = new javax.swing.GroupLayout(panelMetodoSecante);
        panelMetodoSecante.setLayout(panelMetodoSecanteLayout);
        panelMetodoSecanteLayout.setHorizontalGroup(
            panelMetodoSecanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMetodoSecanteLayout.setVerticalGroup(
            panelMetodoSecanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        panelBackGround.add(panelMetodoSecante, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 665, -1));

        exitPnl.setBackground(new java.awt.Color(255, 255, 255));

        exitLb.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        exitLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitLb.setText("x");
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

        panelBackGround.add(exitPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, -1, -1));

        panelBack4.setBackground(new java.awt.Color(255, 255, 255));

        backLb4.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        backLb4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backLb4.setText("<");
        backLb4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backLb4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLb4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backLb4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backLb4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelBack4Layout = new javax.swing.GroupLayout(panelBack4);
        panelBack4.setLayout(panelBack4Layout);
        panelBack4Layout.setHorizontalGroup(
            panelBack4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backLb4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        panelBack4Layout.setVerticalGroup(
            panelBack4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backLb4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panelBackGround.add(panelBack4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 40, 40));

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
            .addGap(0, 650, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelBackGround.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/b_fesalogo.png"))); // NOI18N
        panelBackGround.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, -1, -1));

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

    private void metodoBiFpLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_metodoBiFpLBMouseClicked
        this.setVisible(false);
        MetodoBiseccionFalsaPosicion abrir = new MetodoBiseccionFalsaPosicion();
        abrir.setVisible(true);
    }//GEN-LAST:event_metodoBiFpLBMouseClicked

    private void metodoBiFpLBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_metodoBiFpLBMouseEntered
        Color sombra = new Color(0,134,170);
        panelMetodoBiFp.setBackground(sombra);
    }//GEN-LAST:event_metodoBiFpLBMouseEntered

    private void metodoBiFpLBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_metodoBiFpLBMouseExited
        Color original = new Color(0,134,190);
        panelMetodoBiFp.setBackground(original);
    }//GEN-LAST:event_metodoBiFpLBMouseExited

    private void exitLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLbMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitLbMouseClicked

    private void exitLbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLbMouseEntered
        exitPnl.setBackground(Color.gray);
    }//GEN-LAST:event_exitLbMouseEntered

    private void exitLbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLbMouseExited
        exitPnl.setBackground(Color.WHITE);
    }//GEN-LAST:event_exitLbMouseExited

    private void backLb4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLb4MouseEntered
        panelBack4.setBackground(Color.gray);
    }//GEN-LAST:event_backLb4MouseEntered

    private void backLb4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLb4MouseExited
        panelBack4.setBackground(Color.WHITE);
    }//GEN-LAST:event_backLb4MouseExited

    private void backLb4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLb4MouseClicked
        this.setVisible(false);
        PortadaUnidades abrir = new PortadaUnidades();
        abrir.setVisible(true);
    }//GEN-LAST:event_backLb4MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        Color sombra = new Color(0,134,170);
        panelMetodoNewton.setBackground(sombra);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        Color original = new Color(0,134,190);
        panelMetodoNewton.setBackground(original);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setVisible(false);
        MetodoNewton abrir = new MetodoNewton();
        abrir.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        Color sombra = new Color(0,134,170);
        panelMetodoSecante.setBackground(sombra);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        Color original = new Color(0,134,190);
        panelMetodoSecante.setBackground(original);
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setVisible(false);
        MetodoSecante abrir = new MetodoSecante();
        abrir.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_jPanel3MouseDragged

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
            java.util.logging.Logger.getLogger(portadaUnidadDos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(portadaUnidadDos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(portadaUnidadDos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(portadaUnidadDos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new portadaUnidadDos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLb4;
    private javax.swing.JLabel exitLb;
    private javax.swing.JPanel exitPnl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel metodoBiFpLB;
    private javax.swing.JPanel panelBack4;
    private javax.swing.JPanel panelBackGround;
    private javax.swing.JPanel panelMetodoBiFp;
    private javax.swing.JPanel panelMetodoNewton;
    private javax.swing.JPanel panelMetodoSecante;
    // End of variables declaration//GEN-END:variables
}