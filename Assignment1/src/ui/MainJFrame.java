/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import model.EmployeeHistory;
import model.ProductDetails;

/**
 *
 * @author sumanayanakonda
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    EmployeeHistory historyArrayList;
    
    
    ProductDetails productdetails;
    
    
    public MainJFrame() {
        initComponents();
        historyArrayList = new EmployeeHistory();
        productdetails = new ProductDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPanel = new javax.swing.JSplitPane();
        controlpanel = new javax.swing.JPanel();
        bCreate = new javax.swing.JButton();
        bView = new javax.swing.JButton();
        jUpdate = new javax.swing.JButton();
        workarea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bCreate.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        bCreate.setText("Create");
        bCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCreateActionPerformed(evt);
            }
        });

        bView.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        bView.setText("View");
        bView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bViewActionPerformed(evt);
            }
        });

        jUpdate.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jUpdate.setText("Update");
        jUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlpanelLayout = new javax.swing.GroupLayout(controlpanel);
        controlpanel.setLayout(controlpanelLayout);
        controlpanelLayout.setHorizontalGroup(
            controlpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlpanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(controlpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        controlpanelLayout.setVerticalGroup(
            controlpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlpanelLayout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(bCreate)
                .addGap(39, 39, 39)
                .addComponent(bView)
                .addGap(40, 40, 40)
                .addComponent(jUpdate)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        splitPanel.setLeftComponent(controlpanel);

        javax.swing.GroupLayout workareaLayout = new javax.swing.GroupLayout(workarea);
        workarea.setLayout(workareaLayout);
        workareaLayout.setHorizontalGroup(
            workareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        workareaLayout.setVerticalGroup(
            workareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        splitPanel.setRightComponent(workarea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCreateActionPerformed
        // TODO add your handling code here:
        CreateJPanel createPanel = new CreateJPanel(historyArrayList);
        splitPanel.setRightComponent(createPanel);
    }//GEN-LAST:event_bCreateActionPerformed

    private void bViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bViewActionPerformed

        // TODO add your handling code here:
        ViewandDeleteJPanel viewPanel = new ViewandDeleteJPanel(historyArrayList);
        splitPanel.setRightComponent(viewPanel);
        
    }//GEN-LAST:event_bViewActionPerformed

    private void jUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateActionPerformed
        // TODO add your handling code here:
        UPDATEJPanel updatePanel = new UPDATEJPanel(historyArrayList);
        splitPanel.setRightComponent(updatePanel);
    }//GEN-LAST:event_jUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCreate;
    private javax.swing.JButton bView;
    private javax.swing.JPanel controlpanel;
    private javax.swing.JButton jUpdate;
    private javax.swing.JSplitPane splitPanel;
    private javax.swing.JPanel workarea;
    // End of variables declaration//GEN-END:variables
}
