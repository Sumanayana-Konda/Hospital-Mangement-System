/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author sujithkaluva
 */
public class HospitalAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form HospitalAdminWorkArea
     */
    public HospitalAdminWorkArea(String hspAdminName) {
        initComponents();
        this.hospitalNameLabel.setText(hspAdminName);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jpanel1 = new javax.swing.JPanel();
        mainPanel = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        logOutAdmin = new javax.swing.JButton();
        getPatientsDirectory = new javax.swing.JButton();
        doctorsPanel = new javax.swing.JButton();
        hospitalsPanel = new javax.swing.JButton();
        encounterPanel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        hospitalNameLabel = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        logOutAdmin.setBackground(new java.awt.Color(204, 204, 255));
        logOutAdmin.setText("Logout");
        logOutAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutAdminActionPerformed(evt);
            }
        });

        getPatientsDirectory.setBackground(new java.awt.Color(204, 204, 255));
        getPatientsDirectory.setText("Patients");
        getPatientsDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getPatientsDirectoryActionPerformed(evt);
            }
        });

        doctorsPanel.setBackground(new java.awt.Color(204, 204, 255));
        doctorsPanel.setText("Doctors");
        doctorsPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorsPanelActionPerformed(evt);
            }
        });

        hospitalsPanel.setBackground(new java.awt.Color(204, 204, 255));
        hospitalsPanel.setText("Hospitals");
        hospitalsPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalsPanelActionPerformed(evt);
            }
        });

        encounterPanel.setBackground(new java.awt.Color(204, 204, 255));
        encounterPanel.setText("Encounters");
        encounterPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encounterPanelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logOutAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getPatientsDirectory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(doctorsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hospitalsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(encounterPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(getPatientsDirectory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(doctorsPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hospitalsPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(encounterPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 351, Short.MAX_VALUE)
                .addComponent(logOutAdmin)
                .addGap(14, 14, 14))
        );

        mainPanel.setLeftComponent(jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setText("Hello,");

        hospitalNameLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        hospitalNameLabel.setText("Hospital Admin");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(hospitalNameLabel))
                .addContainerGap(364, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hospitalNameLabel)
                .addContainerGap(335, Short.MAX_VALUE))
        );

        mainPanel.setRightComponent(jPanel3);

        javax.swing.GroupLayout Jpanel1Layout = new javax.swing.GroupLayout(Jpanel1);
        Jpanel1.setLayout(Jpanel1Layout);
        Jpanel1Layout.setHorizontalGroup(
            Jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
        );
        Jpanel1Layout.setVerticalGroup(
            Jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logOutAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutAdminActionPerformed
        // TODO add your handling code here:

        Home home = new Home();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        home.setVisible(true);
    }//GEN-LAST:event_logOutAdminActionPerformed

    private void getPatientsDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getPatientsDirectoryActionPerformed
        // TODO add your handling code here:
        PatientsDirectoryUI pat = new PatientsDirectoryUI();
        mainPanel.setRightComponent(pat);

    }//GEN-LAST:event_getPatientsDirectoryActionPerformed

    private void doctorsPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorsPanelActionPerformed
        // TODO add your handling code here:
        SysAdminDoctorsPanel sysdoc = new SysAdminDoctorsPanel();
        mainPanel.setRightComponent(sysdoc);
    }//GEN-LAST:event_doctorsPanelActionPerformed

    private void hospitalsPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalsPanelActionPerformed
        // TODO add your handling code here:
        HospitalAdminHospital hospPanel = new HospitalAdminHospital();
        mainPanel.setRightComponent(hospPanel);
    }//GEN-LAST:event_hospitalsPanelActionPerformed

    private void encounterPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encounterPanelActionPerformed
        // TODO add your handling code here:
        EncounterHistoryPanel encPanel = new EncounterHistoryPanel();
        mainPanel.setRightComponent(encPanel);
    }//GEN-LAST:event_encounterPanelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpanel1;
    private javax.swing.JButton doctorsPanel;
    private javax.swing.JButton encounterPanel;
    private javax.swing.JButton getPatientsDirectory;
    private javax.swing.JLabel hospitalNameLabel;
    private javax.swing.JButton hospitalsPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logOutAdmin;
    private javax.swing.JSplitPane mainPanel;
    // End of variables declaration//GEN-END:variables
}
