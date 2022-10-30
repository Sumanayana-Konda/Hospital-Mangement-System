/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author sumanayana
 */
public class SysAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form SysAdminWorkArea
     */
    public SysAdminWorkArea() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mainPanel = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        getPatientsDirectory = new javax.swing.JButton();
        logOutAdmin = new javax.swing.JButton();
        doctorsPanel = new javax.swing.JButton();
        hospitalsPanel = new javax.swing.JButton();
        communityPanel = new javax.swing.JButton();
        cityPanel = new javax.swing.JButton();
        encounterPanel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        getPatientsDirectory.setBackground(new java.awt.Color(204, 204, 255));
        getPatientsDirectory.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        getPatientsDirectory.setText("Patients");
        getPatientsDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getPatientsDirectoryActionPerformed(evt);
            }
        });

        logOutAdmin.setBackground(new java.awt.Color(204, 204, 255));
        logOutAdmin.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        logOutAdmin.setText("Logout");
        logOutAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutAdminActionPerformed(evt);
            }
        });

        doctorsPanel.setBackground(new java.awt.Color(204, 204, 255));
        doctorsPanel.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        doctorsPanel.setText("Doctors");
        doctorsPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorsPanelActionPerformed(evt);
            }
        });

        hospitalsPanel.setBackground(new java.awt.Color(204, 204, 255));
        hospitalsPanel.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        hospitalsPanel.setText("Hospitals");
        hospitalsPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalsPanelActionPerformed(evt);
            }
        });

        communityPanel.setBackground(new java.awt.Color(204, 204, 255));
        communityPanel.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        communityPanel.setText("Communities");
        communityPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityPanelActionPerformed(evt);
            }
        });

        cityPanel.setBackground(new java.awt.Color(204, 204, 255));
        cityPanel.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        cityPanel.setText("Cities");
        cityPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityPanelActionPerformed(evt);
            }
        });

        encounterPanel.setBackground(new java.awt.Color(204, 204, 255));
        encounterPanel.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
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
                    .addComponent(getPatientsDirectory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logOutAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(doctorsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hospitalsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(communityPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cityPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(encounterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(getPatientsDirectory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(doctorsPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hospitalsPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(communityPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cityPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(encounterPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addComponent(logOutAdmin)
                .addGap(23, 23, 23))
        );

        mainPanel.setLeftComponent(jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Hello,");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setText("System Admin");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(265, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        mainPanel.setRightComponent(jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void getPatientsDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getPatientsDirectoryActionPerformed
        // TODO add your handling code here:
        PatientsDirectoryUI pat = new PatientsDirectoryUI();
        mainPanel.setRightComponent(pat);
        
        
    }//GEN-LAST:event_getPatientsDirectoryActionPerformed

    private void logOutAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutAdminActionPerformed
        // TODO add your handling code here:
        
        Home home = new Home();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        home.setVisible(true);
    }//GEN-LAST:event_logOutAdminActionPerformed

    private void doctorsPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorsPanelActionPerformed
        // TODO add your handling code here:
        SysAdminDoctorsPanel sysdoc = new SysAdminDoctorsPanel();
        mainPanel.setRightComponent(sysdoc);
    }//GEN-LAST:event_doctorsPanelActionPerformed

    private void hospitalsPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalsPanelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hospitalsPanelActionPerformed

    private void communityPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityPanelActionPerformed
        // TODO add your handling code here:
        CommunityPanel commpanel = new CommunityPanel();
        mainPanel.setRightComponent(commpanel);
    }//GEN-LAST:event_communityPanelActionPerformed

    private void cityPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityPanelActionPerformed
        // TODO add your handling code here:
        CitiesPanel citypanel = new CitiesPanel();
        mainPanel.setRightComponent(citypanel);
    }//GEN-LAST:event_cityPanelActionPerformed

    private void encounterPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encounterPanelActionPerformed
        // TODO add your handling code here:
        EncounterHistoryPanel en = new EncounterHistoryPanel();
        mainPanel.setRightComponent(en);
    }//GEN-LAST:event_encounterPanelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cityPanel;
    private javax.swing.JButton communityPanel;
    private javax.swing.JButton doctorsPanel;
    private javax.swing.JButton encounterPanel;
    private javax.swing.JButton getPatientsDirectory;
    private javax.swing.JButton hospitalsPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logOutAdmin;
    private javax.swing.JSplitPane mainPanel;
    // End of variables declaration//GEN-END:variables
}