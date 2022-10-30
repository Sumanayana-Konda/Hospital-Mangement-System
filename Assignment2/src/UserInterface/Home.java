/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface;

import Data.Ecosystem;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author sumanayana
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    
   Ecosystem ecoSys = Ecosystem.getInstance();
           
    
    public Home() {
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

        mainPanel = new javax.swing.JPanel();
        leftPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        userNameTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SignUp = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        userRole = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftPanel.setBackground(new java.awt.Color(153, 153, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/hospital (1).png"))); // NOI18N

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rightPanel.setBackground(new java.awt.Color(204, 204, 255));
        rightPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userNameTxt.setBackground(new java.awt.Color(153, 153, 255));
        userNameTxt.setToolTipText("Username");
        userNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtActionPerformed(evt);
            }
        });
        rightPanel.add(userNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 252, 32));

        passwordTxt.setBackground(new java.awt.Color(153, 153, 255));
        passwordTxt.setToolTipText("Password");
        passwordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtActionPerformed(evt);
            }
        });
        rightPanel.add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 252, 32));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/padlock.png"))); // NOI18N
        rightPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 30, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/user.png"))); // NOI18N
        rightPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 30, 30));

        SignUp.setBackground(new java.awt.Color(153, 153, 255));
        SignUp.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        SignUp.setText("Sign Up");
        SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpActionPerformed(evt);
            }
        });
        rightPanel.add(SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, -1));

        loginBtn.setBackground(new java.awt.Color(153, 153, 255));
        loginBtn.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        rightPanel.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        userRole.setBackground(new java.awt.Color(153, 153, 255));
        userRole.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        userRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patient", "Doctor", "Community Admin", "Hospital Admin", "System Admin" }));
        userRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userRoleActionPerformed(evt);
            }
        });
        rightPanel.add(userRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 163, 250, 30));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxtActionPerformed

    private void userNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTxtActionPerformed

    private void SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpActionPerformed
                                                                                                                // TODO add your handling code here:
        if(userRole.getSelectedItem().toString().equals("Patient")){
            CreatePatientPanel createPatientCmp = new CreatePatientPanel();
            this.setContentPane(createPatientCmp);
            this.invalidate();
            this.validate();
        }
        else{
            JOptionPane.showMessageDialog(this, "Please Contact Admin for Sign Up!");
        }
    }//GEN-LAST:event_SignUpActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
         HashMap<String,String> pManager;
        if(userNameTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter valid username.");
        }
        else if(!passwordTxt.isValid()){
            JOptionPane.showMessageDialog(this, "Please enter valid password.");
        }
        else if(userRole.getSelectedItem().toString().equals("Patient")){
            pManager = ecoSys.getPatientDirectory().getPasswordManager();
            if(!(pManager.containsKey(userNameTxt.getText()) && pManager.get(userNameTxt.getText()).equals(passwordTxt.getText()))){
                JOptionPane.showMessageDialog(this, "Login Failed, please enter valid credentials.");
            }
            else{
                PatientWorkArea patWrkArea = new PatientWorkArea(ecoSys.getPatientDirectory().getPatientMap().get(userNameTxt.getText()));
                this.setContentPane(patWrkArea);
                this.invalidate();
                this.validate();
            }
        }
        else if(userRole.getSelectedItem().toString().equals("System Admin")){
            pManager = ecoSys.getSystemAdminDirectory().getPasswordManager();
            if(!(pManager.containsKey(userNameTxt.getText()) && pManager.get(userNameTxt.getText()).equals(passwordTxt.getText()))){
                JOptionPane.showMessageDialog(this, "Login Failed, please enter valid credentials.");
            }
            else{
                SysAdminWorkArea sysAdmWrkArea = new SysAdminWorkArea();
                this.setContentPane(sysAdmWrkArea);
                this.invalidate();
                this.validate();
            }
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void userRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userRoleActionPerformed
        // TODO add your handling code here:
        
        if ((userRole.getSelectedItem().toString() == "System Admin")||(userRole.getSelectedItem().toString() == "Community Admin")||(userRole.getSelectedItem().toString() == "Hospital Admin")) {
            SignUp.setEnabled(false);
        } else {
            SignUp.setEnabled(true);
        }
        
    }//GEN-LAST:event_userRoleActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JTextField userNameTxt;
    private javax.swing.JComboBox<String> userRole;
    // End of variables declaration//GEN-END:variables
}
