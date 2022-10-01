/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

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
import model.EmployeeHistory;
import model.ProductDetails;

/**
 *
 * @author sumanayanakonda
 */
public class DeleteJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DeleteJPanel
     */
    EmployeeHistory historyArrayList;
    ProductDetails productdetails = new ProductDetails();
    public DeleteJPanel(EmployeeHistory historyArrayList) {
        initComponents();
        this.historyArrayList = historyArrayList;
        jTextName1.setName("Name");
        jTextEmployee_ID1.setName("Employee_ID");
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
        jSearch = new javax.swing.JButton();
        jNameSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jAge = new javax.swing.JLabel();
        jGender = new javax.swing.JLabel();
        jTextGender = new javax.swing.JTextField();
        jTextAge = new javax.swing.JTextField();
        jStart_Date = new javax.swing.JLabel();
        jTextStart_Date = new javax.swing.JTextField();
        jLevel = new javax.swing.JLabel();
        jTextLevel = new javax.swing.JTextField();
        jTeam_Info = new javax.swing.JLabel();
        jTextTeam_Info = new javax.swing.JTextField();
        jPosition_Title = new javax.swing.JLabel();
        jTextPosition_Title = new javax.swing.JTextField();
        jContact_Info = new javax.swing.JLabel();
        jTextCell_Phone_Number = new javax.swing.JTextField();
        jName = new javax.swing.JLabel();
        jCell_Phone_Number = new javax.swing.JLabel();
        jEmployee_ID = new javax.swing.JLabel();
        jTextEmail_Address = new javax.swing.JTextField();
        jEmail_Address = new javax.swing.JLabel();
        jSave = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextName1 = new javax.swing.JTextField();
        jTextEmployee_ID1 = new javax.swing.JTextField();
        jView_Image = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Update");

        jSearch.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jSearch.setText("SEARCH PROFILE");
        jSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel2.setText("Phone Number to be Updated:");

        jAge.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jAge.setText("Age:");

        jGender.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jGender.setText("Gender:");

        jTextGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextGenderActionPerformed(evt);
            }
        });

        jStart_Date.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jStart_Date.setText("Start Date:");

        jLevel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLevel.setText("Level:");

        jTeam_Info.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTeam_Info.setText("Team Info:");

        jPosition_Title.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPosition_Title.setText("Position Title:");

        jTextPosition_Title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPosition_TitleActionPerformed(evt);
            }
        });

        jContact_Info.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jContact_Info.setText("Contact Info:");

        jTextCell_Phone_Number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCell_Phone_NumberActionPerformed(evt);
            }
        });

        jName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jName.setText("Name:");

        jCell_Phone_Number.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jCell_Phone_Number.setText("Cell Phone Number:");

        jEmployee_ID.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jEmployee_ID.setText("Employee ID:");

        jEmail_Address.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jEmail_Address.setText("Email Address:");

        jSave.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jSave.setText("UPDATE PROFILE");
        jSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel3.setText("Picture:");

        jTextName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextName1ActionPerformed(evt);
            }
        });

        jView_Image.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jView_Image.setText("Update Image");
        jView_Image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jView_ImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jEmployee_ID)
                            .addComponent(jName))
                        .addGap(1032, 1032, 1032))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSearch)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel1)))
                        .addGap(654, 654, 654))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCell_Phone_Number)
                                    .addComponent(jEmail_Address))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextEmail_Address)
                                    .addComponent(jTextCell_Phone_Number, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jContact_Info)
                                .addGap(298, 298, 298)))
                        .addGap(65, 65, 65)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jView_Image))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPosition_Title)
                            .addComponent(jTeam_Info)
                            .addComponent(jLevel)
                            .addComponent(jStart_Date)
                            .addComponent(jGender)
                            .addComponent(jAge))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextName1)
                            .addComponent(jTextTeam_Info, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                            .addComponent(jTextLevel)
                            .addComponent(jTextGender)
                            .addComponent(jTextStart_Date)
                            .addComponent(jTextPosition_Title)
                            .addComponent(jTextAge)
                            .addComponent(jTextEmployee_ID1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(401, 401, 401)
                .addComponent(jSave)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(168, 168, 168)
                    .addComponent(jLabel2)
                    .addGap(46, 46, 46)
                    .addComponent(jNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(419, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addGap(78, 78, 78)
                        .addComponent(jSearch)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextEmployee_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jEmployee_ID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jAge))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jGender))
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
                        .addGap(121, 121, 121))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jContact_Info)
                            .addComponent(jLabel3)
                            .addComponent(jView_Image))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCell_Phone_Number)
                            .addComponent(jTextCell_Phone_Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextEmail_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jEmail_Address))))
                .addGap(44, 44, 44)
                .addComponent(jSave)
                .addGap(117, 117, 117))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addContainerGap(593, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchActionPerformed
        // TODO add your handling code here:
        String Name_Searched = jNameSearch.getText();
        search_list(Name_Searched);

    }//GEN-LAST:event_jSearchActionPerformed

    private void jTextPosition_TitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPosition_TitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPosition_TitleActionPerformed

    private void jTextCell_Phone_NumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCell_Phone_NumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCell_Phone_NumberActionPerformed

    private void jSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveActionPerformed
        // TODO add your handling code here:
        //Product productdetails = historyArrayList.addNewEmployee();
        
        JTextField[] VARIABLE_CONSTANTS = {jTextName1,jTextEmployee_ID1,jTextAge,jTextGender,jTextStart_Date,jTextLevel,
            jTextTeam_Info,jTextPosition_Title,jTextCell_Phone_Number,jTextEmail_Address};
        boolean validated = false;
        for(JTextField field: VARIABLE_CONSTANTS){
           // System.out.println("Entered for loop in save");
            if(!validateData(field)){
                validated = false;
                break;
            }
            else{
                validated = true;
               
            }
        }
        
        if(validated){
        System.out.println("entered if Validated");
        String Name_Searched = jNameSearch.getText();
        for (ProductDetails productdetails : historyArrayList.getHistoryArrayList()){
           if (String.valueOf(productdetails.getPhone_Number()).equals(jNameSearch.getText()))
           {  
        int Age = Integer.parseInt(jTextAge.getText());
        productdetails.setName(jTextName1.getText());
        productdetails.setEmployee_ID(jTextEmployee_ID1.getText());
        productdetails.setGender(jTextGender.getText());
        productdetails.setLevel(jTextLevel.getText());
        productdetails.setAge(Age);
        productdetails.setPosition_Title(jTextPosition_Title.getText());
        productdetails.setStart_Date(jTextStart_Date.getText());
        productdetails.setTeam_info(jTextTeam_Info.getText());
        productdetails.setPhone_Number(jTextCell_Phone_Number.getText());
        productdetails.setEmail(jTextEmail_Address.getText());
        JOptionPane.showMessageDialog(this, "Successfully Updated");
        jTextName1.setText("");
        jTextEmployee_ID1.setText("");
        jTextGender.setText("");
        jTextLevel.setText("");
        jTextAge.setText("");
        jTextPosition_Title.setText("");
        jTextStart_Date.setText("");
        jTextTeam_Info.setText("");
        jTextCell_Phone_Number.setText("");
        jTextEmail_Address.setText("");
           }
           }
        }
    }//GEN-LAST:event_jSaveActionPerformed

    private void jTextName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextName1ActionPerformed

    private void jTextGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextGenderActionPerformed

    private void jView_ImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jView_ImageActionPerformed
        // TODO add your handling code here:
        
        for (ProductDetails productdetails : historyArrayList.getHistoryArrayList()){
           if (String.valueOf(productdetails.getPhone_Number()).equals(jNameSearch.getText()))
           { 
        
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
        }}
        }
    }//GEN-LAST:event_jView_ImageActionPerformed

    private void displayProduct(ProductDetails productdetails){
    
    jTextName1.setText(productdetails.getName());
    jTextEmployee_ID1.setText(productdetails.getEmployee_ID());
    jTextAge.setText(String.valueOf(productdetails.getAge()));
    jTextGender.setText(productdetails.getGender());
    jTextCell_Phone_Number.setText(productdetails.getPhone_Number());
    jTextEmail_Address.setText(productdetails.getEmail());
    jTextLevel.setText(productdetails.getLevel());
    jTextPosition_Title.setText(productdetails.getPosition_Title());
    jTextStart_Date.setText(productdetails.getStart_Date());
    jTextTeam_Info.setText(productdetails.getTeam_info());  
    
}

    private void search_list(String a) {
        boolean test = false;
       for (ProductDetails productdetails : historyArrayList.getHistoryArrayList()){
           if (String.valueOf(productdetails.getPhone_Number()).equals(a))
           {  
    displayProduct(productdetails);
    test = true;
           }
           }
        if (!test){
          JOptionPane.showMessageDialog(this, "Not Found");   
        }
           }
    
    public boolean validateData(JComponent input) 
{
    //System.out.println("Entered validate data");
        String x = input.getName();
        String error="";
        boolean raiseError = false;
        String tex = ((JTextField) input).getText().trim();
        if (tex == null || tex.isEmpty()) 
        {
            raiseError = true;
            error = String.format("Please enter a value. The value for %s cannot be empty", x);
        }
        else
        {
           // System.out.println("Entered else loop");
            switch (x) {
                case "Name":
                    if(!tex.matches("^[a-z ,.'-]+$")){
                        raiseError = true;
                        error = String.format("Please enter valid values for %s", x);
                    }   break;
                case "Phone_Number":
                    
                    if(!tex.matches("^[0-9]{10}")){
                        raiseError = true;
                        error = String.format("Please enter a valid %s", x);
                    }   
                    break;
                case "Start_Date":
                    if(!tex.matches("^((0[0-9]||1[0-2])/[0-2][0-9]||3[0-1])/([0-9][0-9])?[0-9][0-9]$")){
                        raiseError = true;
                        error = String.format("Please enter a valid %s with the format MM/DD/YYYY", x);
                    }   break;
                case "Email":
                    if(!tex.matches("^(.+)@(.+)$")){
                        raiseError = true;
                        error = String.format("Please enter a valid %s", x);
                    }   break;
                default:
                    break;
            }
        }
        if (raiseError){
            JOptionPane.showMessageDialog(this, error);
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLevel;
    private javax.swing.JLabel jName;
    private javax.swing.JTextField jNameSearch;
    private javax.swing.JLabel jPosition_Title;
    private javax.swing.JButton jSave;
    private javax.swing.JButton jSearch;
    private javax.swing.JLabel jStart_Date;
    private javax.swing.JLabel jTeam_Info;
    private javax.swing.JTextField jTextAge;
    private javax.swing.JTextField jTextCell_Phone_Number;
    private javax.swing.JTextField jTextEmail_Address;
    private javax.swing.JTextField jTextEmployee_ID1;
    private javax.swing.JTextField jTextGender;
    private javax.swing.JTextField jTextLevel;
    private javax.swing.JTextField jTextName1;
    private javax.swing.JTextField jTextPosition_Title;
    private javax.swing.JTextField jTextStart_Date;
    private javax.swing.JTextField jTextTeam_Info;
    private javax.swing.JButton jView_Image;
    // End of variables declaration//GEN-END:variables
}
