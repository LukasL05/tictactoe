
package com.mycompany.tictactoe;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Scanner;
import javax.swing.JPanel;

/**
 *
 * @author lukas
 */
public class playfield extends javax.swing.JFrame {

    /**
     * Creates new form playfield
     */
    private int width;
    private int height;
    private String[] board = {"0","1","2","3","4","5","6","7","8"};
    tttAI ai = new tttAI();
    State state = new State(0, board);
    private int win;
   
    
       
    public playfield() {
        initComponents();
        width = topleft.getWidth();
        height = topleft.getHeight();
       
    }

    public void aiTurn(int space) {
       
        if (!ai.isTerminal(state)){
        int spacee = ai.minMaxDecision(state);
            if (spacee == 0) {
                drawCirc(topleft);
            }
            if (spacee == 1) {
                drawCirc(topmid);
            }
            if (spacee == 2) {
                drawCirc(topright);
            }
            if (spacee == 3) {
                drawCirc(midleft);
            }
            if (spacee == 4) {
                drawCirc(middle);
            }
            if (spacee == 5) {
                drawCirc(midright);
            }
            if (spacee == 6) {
                drawCirc(bottomleft);
            }
            if (spacee == 7) {
                drawCirc(midbottom);
            }
            if (spacee == 8) {
                drawCirc(bottomright);
            }
            
            board[ai.minMaxDecision(state)] = "O";  
        }
        
        if (ai.isTerminal(state)) {
        win = ai.utilityOf(state);
        if (win == 1)
        {
             lost l = new lost();
             l.setVisible(true);
        }
        if (win == 0)
        {
            System.out.println("Draw");
        }
        if (win == -1) 
        {
            System.out.println("You won");
        }
        } 
    }
    
    public void drawCirc(JPanel panel) {
        Graphics2D g2 = (Graphics2D) panel.getGraphics(); 
        g2.setStroke(new BasicStroke(10));
        g2.drawOval(width/4, height/4, 50, 50);
        
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topleft = new javax.swing.JPanel();
        middle = new javax.swing.JPanel();
        topmid = new javax.swing.JPanel();
        topright = new javax.swing.JPanel();
        midright = new javax.swing.JPanel();
        bottomright = new javax.swing.JPanel();
        midbottom = new javax.swing.JPanel();
        midleft = new javax.swing.JPanel();
        bottomleft = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        topleft.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        topleft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                topleftMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout topleftLayout = new javax.swing.GroupLayout(topleft);
        topleft.setLayout(topleftLayout);
        topleftLayout.setHorizontalGroup(
            topleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 107, Short.MAX_VALUE)
        );
        topleftLayout.setVerticalGroup(
            topleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );

        middle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        middle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                middleMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout middleLayout = new javax.swing.GroupLayout(middle);
        middle.setLayout(middleLayout);
        middleLayout.setHorizontalGroup(
            middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        middleLayout.setVerticalGroup(
            middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        topmid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        topmid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                topmidMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout topmidLayout = new javax.swing.GroupLayout(topmid);
        topmid.setLayout(topmidLayout);
        topmidLayout.setHorizontalGroup(
            topmidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        topmidLayout.setVerticalGroup(
            topmidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        topright.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        topright.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toprightMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout toprightLayout = new javax.swing.GroupLayout(topright);
        topright.setLayout(toprightLayout);
        toprightLayout.setHorizontalGroup(
            toprightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        toprightLayout.setVerticalGroup(
            toprightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        midright.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        midright.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                midrightMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout midrightLayout = new javax.swing.GroupLayout(midright);
        midright.setLayout(midrightLayout);
        midrightLayout.setHorizontalGroup(
            midrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        midrightLayout.setVerticalGroup(
            midrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        bottomright.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        bottomright.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bottomrightMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bottomrightLayout = new javax.swing.GroupLayout(bottomright);
        bottomright.setLayout(bottomrightLayout);
        bottomrightLayout.setHorizontalGroup(
            bottomrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        bottomrightLayout.setVerticalGroup(
            bottomrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        midbottom.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        midbottom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                midbottomMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout midbottomLayout = new javax.swing.GroupLayout(midbottom);
        midbottom.setLayout(midbottomLayout);
        midbottomLayout.setHorizontalGroup(
            midbottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        midbottomLayout.setVerticalGroup(
            midbottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        midleft.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        midleft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                midleftMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout midleftLayout = new javax.swing.GroupLayout(midleft);
        midleft.setLayout(midleftLayout);
        midleftLayout.setHorizontalGroup(
            midleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        midleftLayout.setVerticalGroup(
            midleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        bottomleft.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        bottomleft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bottomleftMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bottomleftLayout = new javax.swing.GroupLayout(bottomleft);
        bottomleft.setLayout(bottomleftLayout);
        bottomleftLayout.setHorizontalGroup(
            bottomleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        bottomleftLayout.setVerticalGroup(
            bottomleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Tic-Tac-Toe");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(208, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(midleft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(topleft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bottomleft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(topmid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(topright, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(middle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(midbottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(midright, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bottomright, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(jLabel1)))
                .addContainerGap(320, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(topleft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(topmid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(topright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(middle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(midright, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(midleft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bottomright, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(midbottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bottomleft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void topleftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topleftMouseClicked
        // TODO add your handling code here:
        if (!board[0].equals("O") && !board[0].equals("X") && !ai.isTerminal(state)) {
        Graphics2D g2 = (Graphics2D) topleft.getGraphics(); 
        g2.setStroke(new BasicStroke(10));
        g2.drawLine(0, 0, width, height);
        g2.drawLine(0, height, width, 0);
        board[0] = "X";
        aiTurn(0);
        }
        else {
            return;
        }
    }//GEN-LAST:event_topleftMouseClicked

    private void topmidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topmidMouseClicked
       if (!board[1].equals("O") && !board[1].equals("X") && !ai.isTerminal(state)) {
        Graphics2D g2 = (Graphics2D) topmid.getGraphics(); 
        
        g2.setStroke(new BasicStroke(10));
        g2.drawLine(0, 0, width, height);
        g2.drawLine(0, height, width, 0);
        board[1] = "X";
        aiTurn(1);
        
       }
       else {
           return;
       }
    }//GEN-LAST:event_topmidMouseClicked

    private void toprightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toprightMouseClicked
        if (!board[2].equals("O") && !board[2].equals("X") && !ai.isTerminal(state)) {
        Graphics2D g2 = (Graphics2D) topright.getGraphics(); 
        
        g2.setStroke(new BasicStroke(10));
        g2.drawLine(0, 0, width, height);
        g2.drawLine(0, height, width, 0);
         board[2] = "X";
         aiTurn(2);
        
        }
        else {
            return;
            
        }
    }//GEN-LAST:event_toprightMouseClicked

    private void midleftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_midleftMouseClicked
        if (!board[3].equals("O") && !board[3].equals("X") && !ai.isTerminal(state)) {
        Graphics2D g2 = (Graphics2D) midleft.getGraphics(); 
        
        g2.setStroke(new BasicStroke(10));
        g2.drawLine(0, 0, width, height);
        g2.drawLine(0, height, width, 0);
         board[3] = "X";
         aiTurn(3);
        
        }
        else {
            return;
            
        }
    }//GEN-LAST:event_midleftMouseClicked

    private void middleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_middleMouseClicked
        if (!board[4].equals("O") && !board[4].equals("X") && !ai.isTerminal(state)) {
        Graphics2D g2 = (Graphics2D) middle.getGraphics(); 
        
        g2.setStroke(new BasicStroke(10));
        g2.drawLine(0, 0, width, height);
        g2.drawLine(0, height, width, 0);
         board[4] = "X";
         aiTurn(4);
         
        }
        else {
            return;
        }
    }//GEN-LAST:event_middleMouseClicked

    private void midrightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_midrightMouseClicked
       if (!board[5].equals("O") && !board[5].equals("X") && !ai.isTerminal(state)) {
        Graphics2D g2 = (Graphics2D) midright.getGraphics(); 
        
        g2.setStroke(new BasicStroke(10));
        g2.drawLine(0, 0, width, height);
        g2.drawLine(0, height, width, 0);
         board[5] = "X";
         aiTurn(5);
       
       }
       else {
           return;
           
       }
    }//GEN-LAST:event_midrightMouseClicked

    private void bottomleftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bottomleftMouseClicked
       if (!board[6].equals("O") && !board[6].equals("X") && !ai.isTerminal(state)) {
        Graphics2D g2 = (Graphics2D) bottomleft.getGraphics(); 
        
        g2.setStroke(new BasicStroke(10));
        g2.drawLine(0, 0, width, height);
        g2.drawLine(0, height, width, 0);
         board[6] = "X";
         aiTurn(6);
       
       }
       else{
           return;
       }
    }//GEN-LAST:event_bottomleftMouseClicked

    private void midbottomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_midbottomMouseClicked
       if (!board[7].equals("O") && !board[7].equals("X") && !ai.isTerminal(state)) {
        Graphics2D g2 = (Graphics2D) midbottom.getGraphics(); 
        
        g2.setStroke(new BasicStroke(10));
        g2.drawLine(0, 0, width, height);
        g2.drawLine(0, height, width, 0);
         board[7] = "X";
         aiTurn(7);
        
       }
       else {
           return;
       }
    }//GEN-LAST:event_midbottomMouseClicked

    private void bottomrightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bottomrightMouseClicked
       if (!board[8].equals("O") && !board[8].equals("X") && !ai.isTerminal(state)) {
        Graphics2D g2 = (Graphics2D) bottomright.getGraphics(); 
        
        g2.setStroke(new BasicStroke(10));
        g2.drawLine(0, 0, width, height);
        g2.drawLine(0, height, width, 0);
         board[8] = "X";
         aiTurn(8);
       
       }
       else {
           return;
       }
    }//GEN-LAST:event_bottomrightMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        resetPanel(bottomright);
        resetPanel(midbottom);
        resetPanel(bottomleft);
        resetPanel(midright);
        resetPanel(middle);
        resetPanel(midleft);
        resetPanel(topright);
        resetPanel(topmid);
        resetPanel(topright); 
        
        board[0] = "0";
        board[1] = "1";
        board[2] = "2";
        board[3] = "3";
        board[4] = "4";
        board[5] = "5";
        board[6] = "6";
        board[7] = "7";
        board[8] = "8";
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public void resetPanel(JPanel panel) {
        repaint();
    }
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
            java.util.logging.Logger.getLogger(playfield.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(playfield.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(playfield.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(playfield.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new playfield().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomleft;
    private javax.swing.JPanel bottomright;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel midbottom;
    private javax.swing.JPanel middle;
    private javax.swing.JPanel midleft;
    private javax.swing.JPanel midright;
    private javax.swing.JPanel topleft;
    private javax.swing.JPanel topmid;
    private javax.swing.JPanel topright;
    // End of variables declaration//GEN-END:variables
}
