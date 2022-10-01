/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.EmployeeHistory;
import model.ProductDetails;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.ArrayList;

/**
 *
 * @author sumanayanakonda
 */
public class CreateJPanel extends javax.swing.JPanel {
    
    
    EmployeeHistory historyArrayList;
    ProductDetails productdetails = new ProductDetails();
    public CreateJPanel(EmployeeHistory historyArrayList) {
        initComponents();
        this.historyArrayList = historyArrayList;
        jTextName.setName("Name");
        jTextEmployee_ID.setName("Employee_ID");
        jTextGender.setName("Gender");
        jTextLevel.setName("Level");
        jTextTeam_Info.setName("Team_Info");
        jTextStart_Date.setName("Start_Date");
        jTextEmail_Address.setName("Email");
        jTextAge.setName("Age");
        jTextCell_Phone_Number.setName("Phone_Number");
        jTextPosition_Title.setName("Position_Title");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jTitle = new javax.swing.JLabel();
        jName = new javax.swing.JLabel();
        jEmployee_ID = new javax.swing.JLabel();
        jAge = new javax.swing.JLabel();
        jGender = new javax.swing.JLabel();
        jStart_Date = new javax.swing.JLabel();
        jLevel = new javax.swing.JLabel();
        jTeam_Info = new javax.swing.JLabel();
        jPosition_Title = new javax.swing.JLabel();
        jContact_Info = new javax.swing.JLabel();
        jCell_Phone_Number = new javax.swing.JLabel();
        jEmail_Address = new javax.swing.JLabel();
        jTextName = new javax.swing.JTextField();
        jTextEmployee_ID = new javax.swing.JTextField();
        jTextAge = new javax.swing.JTextField();
        jTextGender = new javax.swing.JTextField();
        jTextStart_Date = new javax.swing.JTextField();
        jTextLevel = new javax.swing.JTextField();
        jTextTeam_Info = new javax.swing.JTextField();
        jTextPosition_Title = new javax.swing.JTextField();
        jTextCell_Phone_Number = new javax.swing.JTextField();
        jTextEmail_Address = new javax.swing.JTextField();
        jSave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jUpload = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Employee ID");

        jTitle.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTitle.setText("CREATE");
        jTitle.setToolTipText("");

        jName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jName.setText("Name:");

        jEmployee_ID.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jEmployee_ID.setText("Employee ID:");

        jAge.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jAge.setText("Age:");

        jGender.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jGender.setText("Gender:");

        jStart_Date.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jStart_Date.setText("Start Date:");

        jLevel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLevel.setText("Level:");

        jTeam_Info.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTeam_Info.setText("Team Info:");

        jPosition_Title.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPosition_Title.setText("Position Title:");

        jContact_Info.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jContact_Info.setText("Contact Info:");

        jCell_Phone_Number.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jCell_Phone_Number.setText("Cell Phone Number:");

        jEmail_Address.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jEmail_Address.setText("Email Address:");

        jTextName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNameActionPerformed(evt);
            }
        });

        jTextPosition_Title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPosition_TitleActionPerformed(evt);
            }
        });

        jTextCell_Phone_Number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCell_Phone_NumberActionPerformed(evt);
            }
        });

        jSave.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jSave.setText("SAVE");
        jSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Photo:");

        jUpload.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jUpload.setText("Upload");
        jUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUploadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSave)
                .addGap(356, 356, 356))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jContact_Info)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPosition_Title)
                                    .addComponent(jTeam_Info)
                                    .addComponent(jLevel)
                                    .addComponent(jStart_Date)
                                    .addComponent(jGender)
                                    .addComponent(jAge)
                                    .addComponent(jEmployee_ID)
                                    .addComponent(jName))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextTeam_Info, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextLevel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextStart_Date, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextGender, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextAge, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextEmployee_ID, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextPosition_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jCell_Phone_Number)
                                    .addComponent(jEmail_Address))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextEmail_Address, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(jTextCell_Phone_Number)
                                    .addComponent(jUpload))))))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jTitle)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jName)
                    .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEmployee_ID)
                    .addComponent(jTextEmployee_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jAge)
                    .addComponent(jTextAge, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jGender)
                    .addComponent(jTextGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jStart_Date)
                    .addComponent(jTextStart_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLevel)
                    .addComponent(jTextLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextTeam_Info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTeam_Info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPosition_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPosition_Title))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jContact_Info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCell_Phone_Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCell_Phone_Number))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextEmail_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEmail_Address))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jUpload))
                .addGap(38, 38, 38)
                .addComponent(jSave)
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextPosition_TitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPosition_TitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPosition_TitleActionPerformed

    private void jTextCell_Phone_NumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCell_Phone_NumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCell_Phone_NumberActionPerformed

    private void jTextNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNameActionPerformed

    private void jSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveActionPerformed
        // TODO add your handling code here:
        JTextField[] VARIABLE_CONSTANTS = {jTextName,jTextEmployee_ID,jTextAge,jTextGender,jTextStart_Date,jTextLevel,
        jTextTeam_Info,jTextPosition_Title,jTextCell_Phone_Number,jTextEmail_Address};
        boolean validated = false;
        for(JTextField field: VARIABLE_CONSTANTS){
            if(!validateData(field)){
                validated = false;
                break;
            }
            else{
                validated = true;
               
            }
        }
        
        if(validated){
        
        int Age = Integer.parseInt(jTextAge.getText());
            
        historyArrayList.getHistoryArrayList().add(productdetails);
        productdetails.setName(jTextName.getText());
        productdetails.setEmployee_ID(jTextEmployee_ID.getText());
        productdetails.setGender(jTextGender.getText());
        productdetails.setLevel(jTextLevel.getText());
        productdetails.setAge(Age);
        productdetails.setPosition_Title(jTextPosition_Title.getText());
        productdetails.setStart_Date(jTextStart_Date.getText());
        productdetails.setTeam_info(jTextTeam_Info.getText());
        productdetails.setPhone_Number(jTextCell_Phone_Number.getText());
        productdetails.setEmail(jTextEmail_Address.getText());
        System.out.println(historyArrayList.getHistoryArrayList().size());
        JOptionPane.showMessageDialog(this, "New Employee added");
        JOptionPane.showMessageDialog(this, "Press Create again to enter a New Employee");
      
        }
        
    }//GEN-LAST:event_jSaveActionPerformed

    private void jUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUploadActionPerformed
        // TODO add your handling code here:
         JFileChooser fileUploader = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "JPG & GIF Images", "jpg", "gif");
        fileUploader.setFileFilter(filter);
        fileUploader.setDialogTitle("Choose Your Photo");
        fileUploader.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnval = fileUploader.showOpenDialog(this);
        if (returnval == JFileChooser.APPROVE_OPTION)
        {
            File uploadedFile = fileUploader.getSelectedFile();
            BufferedImage bufferedImageObj;
            try {
                bufferedImageObj = ImageIO.read(uploadedFile);
                ByteArrayOutputStream byteArrayOs = new ByteArrayOutputStream();
                ImageIO.write(bufferedImageObj, "jpg", byteArrayOs);
                byte[] photoBytes = byteArrayOs.toByteArray();
                productdetails.setPhoto(photoBytes);
               // historyArrayList.getHistoryArrayList().add(productdetails);
                JOptionPane.showMessageDialog(fileUploader, "Photo Uploaded Successfully");
            } catch(IOException e) {
               e.printStackTrace();
               JOptionPane.showMessageDialog(fileUploader, "Error while uploading Photo");
            }
        }
        
    }//GEN-LAST:event_jUploadActionPerformed
public boolean validateData(JComponent input) 
{       
        String x = input.getName();
        String Merror="";
        boolean raiseError = false;
        String tex = ((JTextField) input).getText().trim();
        if (tex == null || tex.isEmpty()) 
        {
            raiseError = true;
            Merror = String.format("Please enter a value. The value for %s cannot be empty", x);
        }
        else
        {
            switch (x) {
                case "Name":
                    if(!tex.matches("^[a-z ,.'-]+$")){
                        /*^[a-zA-z]+$*/
                        raiseError = true;
                        Merror = String.format("Please enter valid values for %s", x);
                    }   break;
                case "Phone_Number":
                    
                    for (ProductDetails productdetails : historyArrayList.getHistoryArrayList())
                  {
                   if (String.valueOf(productdetails.getPhone_Number()).equals(tex))
                  {
                   raiseError = true;
                    Merror = String.format("Already exists. Enter a new one", x);
                     }
                    if(!tex.matches("^[0-9]{10}")){
                        raiseError = true;
                        Merror = String.format("Please enter a valid %s", x);
                    }}
                     
                    break;
                case "Start_Date":
                    if(!tex.matches("^((0[0-9]||1[0-2])/[0-2][0-9]||3[0-1])/([0-9][0-9])?[0-9][0-9]$")){
                        raiseError = true;
                        Merror = String.format("Please enter a valid %s with the format MM/DD/YYYY", x);
                    }   break;
                case "Email":
                    if(!tex.matches("^(.+)@(.+)$")){
                        raiseError = true;
                        Merror = String.format("Please enter a valid %s", x);
                    }   break;
                   
                default:
                    break;
            }
        }
        if (raiseError){
            JOptionPane.showMessageDialog(this, Merror);
            return false;
        }
        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAge;
    private javax.swing.JLabel jCell_Phone_Number;
    private javax.swing.JLabel jContact_Info;
    private javax.swing.JLabel jEmail_Address;
    private javax.swing.JLabel jEmployee_ID;
    private javax.swing.JLabel jGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLevel;
    private javax.swing.JLabel jName;
    private javax.swing.JLabel jPosition_Title;
    private javax.swing.JButton jSave;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel jStart_Date;
    private javax.swing.JLabel jTeam_Info;
    private javax.swing.JTextField jTextAge;
    private javax.swing.JTextField jTextCell_Phone_Number;
    private javax.swing.JTextField jTextEmail_Address;
    private javax.swing.JTextField jTextEmployee_ID;
    private javax.swing.JTextField jTextGender;
    private javax.swing.JTextField jTextLevel;
    private javax.swing.JTextField jTextName;
    private javax.swing.JTextField jTextPosition_Title;
    private javax.swing.JTextField jTextStart_Date;
    private javax.swing.JTextField jTextTeam_Info;
    private javax.swing.JLabel jTitle;
    private javax.swing.JButton jUpload;
    // End of variables declaration//GEN-END:variables
}
