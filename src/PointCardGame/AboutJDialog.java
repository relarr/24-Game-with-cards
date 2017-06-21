package PointCardGame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Toolkit;

/**
 ****************************************************************************
 * Comments by student.
 * 
 ****************************************************************************
 * File name:       AboutJDialog.java
 * @author          Rafael Larrea
 * Created on:      March 11, 2015 11:04 PM
 * @version         1.0
 * Platform:        PC, Windows 7, NetBeans 8.0.1, JDK 1.8.0_20
 * @see             java.util.Color
 * @see             java.awt.Container
 * @see             java.awt.Toolkit
 * **************************************************************************
 * <b>
 * A JDialog Form for the About form
 * </b>
 * **************************************************************************
 */

public class AboutJDialog extends javax.swing.JDialog {

    /**
     * Creates new form AboutJDialog
     */
    public AboutJDialog() {
        initComponents();
        
        // Center the form.
        setLocationRelativeTo(null);
        
        //displays icon image
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/resources/icon.jpeg"));
        
        // Set the cancel button as default.
        this.getRootPane().setDefaultButton(cancelJButton);
        
        //set background color
        Container container = this.getContentPane();
        container.setBackground(Color.getHSBColor(0.290f, 0.779f, 0.793f));
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleJLabel = new javax.swing.JLabel();
        aboutJTextArea = new javax.swing.JTextArea();
        aboutJTextArea2 = new javax.swing.JTextArea();
        cancelJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About");

        titleJLabel.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        titleJLabel.setForeground(new java.awt.Color(246, 14, 17));
        titleJLabel.setText("About My 24 PointCard Game");

        aboutJTextArea.setEditable(false);
        aboutJTextArea.setColumns(20);
        aboutJTextArea.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        aboutJTextArea.setRows(5);
        aboutJTextArea.setText("24 Point Card Game\nCopyright © 2015\nRafael Erick Larrea  \nVersion: 1.0");

        aboutJTextArea2.setEditable(false);
        aboutJTextArea2.setColumns(20);
        aboutJTextArea2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        aboutJTextArea2.setRows(5);
        aboutJTextArea2.setText("           This  application simulates a 24 Point Card Game with cards.\nThe 24 Game is an arithmetical card game in which the objective is to find \na  way to  manipulate four integers  so that the end  result is 24.  Addition,  \nsubtraction,  multiplication,  or division,  and sometimes  other operations, \nmay be used to make four digits from one to nine equal 24.\n\nIf the user presses the Answer button an answer is shown if any and it does\nnot count as a lost game but a new set of 4 cards will be displayed. If the \nuser pressses the Refresh button without entering a expression, it does not \ncount  as  a lost game but  a new   set of 4 cards will be displayed.  A  lost\ngame is when an incorrect expression  is submitted and when the timer is \nup. A won game is when the user enters the correct expression.");

        cancelJButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cancelJButton.setMnemonic('C');
        cancelJButton.setText("Close");
        cancelJButton.setToolTipText("Close about form");
        cancelJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelJButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/about.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titleJLabel)
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(aboutJTextArea, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aboutJTextArea2))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cancelJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(titleJLabel)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(aboutJTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(aboutJTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelJButtonActionPerformed
        // closes the about form
        this.dispose();
    }//GEN-LAST:event_cancelJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea aboutJTextArea;
    private javax.swing.JTextArea aboutJTextArea2;
    private javax.swing.JButton cancelJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel titleJLabel;
    // End of variables declaration//GEN-END:variables
}
