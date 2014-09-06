/*
 * Copyright (C) 2014 Wes Hampson.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */

package weshampson.commonutils.gui.exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import weshampson.commonutils.io.DocumentOutputStream;

/**
 *
 * @author  Wes Hampson
 * @version 0.2.0 (Sep 6, 2014)
 * @since   0.2.0 (Sep 5, 2014)
 */
public class UncaughtExceptionDialog extends javax.swing.JDialog {
    public UncaughtExceptionDialog(java.awt.Frame parent, boolean modal, Throwable t) {
        super(parent, modal);
        initComponents();
        initExceptionInformation(t);
        showDetailsToggleButton.setSelected(false);
        exceptionDetailsScrollPane.setVisible(false);
        exceptionDetailsTextPane.setVisible(false);
        oKButton.requestFocus();
    }
    private void initExceptionInformation(Throwable t) {
         PrintWriter documentWriter = new PrintWriter(new DocumentOutputStream(exceptionDetailsTextPane));
        StringWriter stringWriter = new StringWriter();
        PrintWriter stackTraceWriter = new PrintWriter(stringWriter);
        t.printStackTrace(stackTraceWriter);
        setTitle("Uncaught Exception: " + t.getClass().getName());
        exceptionDetailsLabel.setText("<html><p style='width: 200px;'>" + t.toString());
        documentWriter.println(stringWriter.toString());
        documentWriter.flush();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exceptionDetailsLabel = new javax.swing.JLabel();
        terminateApplicationLabel = new javax.swing.JLabel();
        exceptionDetailsScrollPane = new javax.swing.JScrollPane();
        exceptionDetailsTextPane = new javax.swing.JTextPane() {
            @Override
            public boolean getScrollableTracksViewportWidth() {
                return(getUI().getPreferredSize(this).width <= getParent().getSize().width);
            }
        };
        showDetailsToggleButton = new javax.swing.JToggleButton();
        oKButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        exceptionDetailsLabel.setText("<exception details>");

        terminateApplicationLabel.setText("Click OK to terminate the application.");

        exceptionDetailsTextPane.setEditable(false);
        exceptionDetailsScrollPane.setViewportView(exceptionDetailsTextPane);

        showDetailsToggleButton.setSelected(true);
        showDetailsToggleButton.setText("Show Details");
        showDetailsToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDetailsToggleButtonActionPerformed(evt);
            }
        });

        oKButton.setText("OK");
        oKButton.setMaximumSize(new java.awt.Dimension(93, 23));
        oKButton.setMinimumSize(new java.awt.Dimension(93, 23));
        oKButton.setPreferredSize(new java.awt.Dimension(93, 23));
        oKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oKButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exceptionDetailsScrollPane)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 138, Short.MAX_VALUE)
                        .addComponent(showDetailsToggleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oKButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exceptionDetailsLabel)
                            .addComponent(terminateApplicationLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exceptionDetailsLabel)
                .addGap(18, 18, 18)
                .addComponent(terminateApplicationLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exceptionDetailsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oKButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showDetailsToggleButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showDetailsToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDetailsToggleButtonActionPerformed
        exceptionDetailsScrollPane.setVisible(showDetailsToggleButton.isSelected());
        exceptionDetailsTextPane.setVisible(showDetailsToggleButton.isSelected());
        pack();
    }//GEN-LAST:event_showDetailsToggleButtonActionPerformed

    private void oKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oKButtonActionPerformed
        dispose();
    }//GEN-LAST:event_oKButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exceptionDetailsLabel;
    private javax.swing.JScrollPane exceptionDetailsScrollPane;
    private javax.swing.JTextPane exceptionDetailsTextPane;
    private javax.swing.JButton oKButton;
    private javax.swing.JToggleButton showDetailsToggleButton;
    private javax.swing.JLabel terminateApplicationLabel;
    // End of variables declaration//GEN-END:variables
}