/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import Data.Ecosystem;
import Model.Doctor;
import Model.Patient;
import Model.City;
import Model.House;
import Model.Community;
import Model.Hospital;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sujithkaluva
 */
public class SysAdminDoctorsPanel extends javax.swing.JPanel {

    /**
     * Creates new form SysAdminDoctorsPanel
     */
    Ecosystem ecoSystem = Ecosystem.getInstance();
    Doctor selectedDoctor;

    public SysAdminDoctorsPanel() {
        initComponents();
        DefaultComboBoxModel cityModelList = new DefaultComboBoxModel(ecoSystem.getCityListComboBox().toArray());
        city.setModel(cityModelList);
        city3.setModel(cityModelList);
        firstName.setName("patientFirstName");
        firstName1.setName("patientFirstName");
        lastName.setName("patientLastName");
        lastName1.setName("patientLastName");
        eMailId.setName("patientEmailId");
        eMailId1.setName("patientEmailId");
        dateOfBirth.setName("patientDOB");
        dateOfBirth1.setName("patientDOB");
        gender.setName("patientGender");
        gender1.setName("patientGender");
        phone.setName("patientPhone");
        phone1.setName("patientPhone");
        addressLine1.setName("addressLine1");
        addressLine11.setName("addressLine1");
        addressLine2.setName("addressLine2");
        addressLine21.setName("addressLine2");
        community.setName("patientCommunity");
        community1.setName("patientCommunity");
        city.setName("patientCity");
        city3.setName("patientCity");
        state.setName("patientState");
        state1.setName("patientState");
        zipCode.setName("patientZipCode");
        zipCode1.setName("patientZipCode");
        specialisation.setName("Specialization");
        specialisation1.setName("Specialization");
        degree.setName("Degree");
        degree1.setName("Degree");
        experience.setName("Experience");
        experience1.setName("Experience");
        hospital.setName("Hospital");
        hospital2.setName("Hospital");
        passWord.setName("password");
        passWord1.setName("password");
        populateDoctorDirectory();

    }

    public void populateDoctorDirectory() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy");
        DefaultTableModel model = (DefaultTableModel) doctorsTable.getModel();
        model.setRowCount(0);
        for (Doctor pObj : ecoSystem.getDoctorDirectory().getDoctorList()) {
            Object[] row = new Object[8];
            row[0] = pObj.getFirstName() + " " + pObj.getLastName();
            row[1] = pObj.getHospital().getHospitalName();
            row[2] = pObj.getExperience();
            row[3] = pObj.getSpecialisation();
            row[4] = pObj.getDegree();
            row[5] = pObj.getEmailId();
            row[6] = pObj.getPhoneNumber();
            row[7] = pObj.getDoctorId();
            model.addRow(row);
        }
    }

    public boolean validateData(JComponent input) {
        String name = input.getName();
        String errorMsg = "";
        boolean raiseError = false;
        String text = ((JTextField) input).getText().trim();
        if (text == null || text.isEmpty()) {
            raiseError = true;
            errorMsg = String.format("Please enter a value. The value for %s cannot be empty", name);
        } else {
            switch (name) {
                case "Experience":
                    if (!text.matches("^[0-9]{1}||[0-9]{2}||[0-9]{3}")) {
                        raiseError = true;
                        errorMsg = String.format("Please enter valid values for %s", name);
                    }
                    break;
                case "patientFirstName":
                    if (!text.matches("^[a-zA-z ]*$")) {
                        raiseError = true;
                        errorMsg = String.format("Please enter valid values for %s", name);
                    }
                    break;
                case "patientLastName":
                    if (!text.matches("^[a-zA-z ]*$")) {
                        raiseError = true;
                        errorMsg = String.format("Please enter valid values for %s", name);
                    }
                    break;
                case "patientPhone":
                    if (!text.matches("^[0-9]{10}")) {
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s", name);
                    }
                    break;
                case "patientEmailId":
                    if (!ecoSystem.getDoctorDirectory().isUsernameAvailable(text)) {
                        raiseError = true;
                        errorMsg = String.format("Email Id already exists, please enter a valid mail Id", name);
                        break;
                    }
                    if (!text.matches("^(.+)@(.+)$")) {
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s", name);
                    }
                    break;

                default:
                    break;
            }
        }
        if (raiseError) {
            JOptionPane.showMessageDialog(this, errorMsg);
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        doctorsTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        eMailId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dateOfBirth = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        zipCode = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        state = new javax.swing.JTextField();
        city = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        community = new javax.swing.JComboBox<>();
        addressLine2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        addressLine1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        passWord = new javax.swing.JTextField();
        createDoctor = new javax.swing.JButton();
        specialisation = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        degree = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        experience = new javax.swing.JTextField();
        hospital = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        passWord1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        specialisation1 = new javax.swing.JTextField();
        dateOfBirth1 = new com.toedter.calendar.JDateChooser();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        degree1 = new javax.swing.JTextField();
        gender1 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        phone1 = new javax.swing.JTextField();
        experience1 = new javax.swing.JTextField();
        zipCode1 = new javax.swing.JTextField();
        hospital2 = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        state1 = new javax.swing.JTextField();
        city3 = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        community1 = new javax.swing.JComboBox<>();
        addressLine21 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        firstName1 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        addressLine11 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        lastName1 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        eMailId1 = new javax.swing.JTextField();
        searchType = new javax.swing.JComboBox<>();
        searchDoctor = new javax.swing.JButton();
        searchText = new javax.swing.JTextField();
        updateDoctor = new javax.swing.JButton();
        deleteDoctor = new javax.swing.JButton();

        jTabbedPane1.setBackground(new java.awt.Color(153, 153, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        doctorsTable.setBackground(new java.awt.Color(153, 153, 255));
        doctorsTable.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        doctorsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Hospital", "Experience", "Specialization", "Degree", "Email", "Phone", "Doctor Id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(doctorsTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Doctor Directory", jPanel2);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel16.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        jLabel16.setText("Personal Information");

        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });

        jLabel1.setText("First Name :");

        jLabel2.setText("Last Name :");

        lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameActionPerformed(evt);
            }
        });

        jLabel4.setText("E-mail Id :");

        eMailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eMailIdActionPerformed(evt);
            }
        });

        jLabel3.setText("DOB :");

        jLabel5.setText("Gender :");

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        jLabel11.setText("Phone :");

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });

        zipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipCodeActionPerformed(evt);
            }
        });

        jLabel10.setText("Zip Code :");

        jLabel9.setText("State :");

        state.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateActionPerformed(evt);
            }
        });

        city.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cityItemStateChanged(evt);
            }
        });

        jLabel8.setText("City :");

        jLabel12.setText("Community :");

        community.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                communityItemStateChanged(evt);
            }
        });
        community.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityActionPerformed(evt);
            }
        });

        addressLine2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressLine2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Line 2 :");

        jLabel6.setText("Line 1 :");

        addressLine1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressLine1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        jLabel14.setText("Address Information");

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        jLabel13.setText("Password :");

        createDoctor.setBackground(new java.awt.Color(153, 153, 255));
        createDoctor.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        createDoctor.setText("Create");
        createDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDoctorActionPerformed(evt);
            }
        });

        specialisation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specialisationActionPerformed(evt);
            }
        });

        jLabel15.setText("Specialization :");

        degree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreeActionPerformed(evt);
            }
        });

        jLabel17.setText("Degree :");

        jLabel18.setText("Experience :");

        experience.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                experienceActionPerformed(evt);
            }
        });

        jLabel19.setText("Hospital :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(eMailId, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(dateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel16))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel14)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(community, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel19)
                                        .addComponent(hospital, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(addressLine2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(49, 49, 49)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel18)
                                        .addComponent(experience, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel17)
                                        .addComponent(degree, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15)
                                        .addComponent(specialisation, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(zipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(passWord, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(256, 256, 256)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(createDoctor)))
                        .addGap(0, 52, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(specialisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addressLine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(degree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eMailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(experience, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, 0)
                        .addComponent(dateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(community, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addComponent(createDoctor))
                    .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Create Doctor", jPanel1);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel20.setText("DOB :");

        specialisation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specialisation1ActionPerformed(evt);
            }
        });

        jLabel21.setText("Specialization :");

        jLabel22.setText("Gender :");

        degree1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degree1ActionPerformed(evt);
            }
        });

        gender1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        jLabel23.setText("Degree :");

        jLabel24.setText("Phone :");

        jLabel25.setText("Experience :");

        phone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone1ActionPerformed(evt);
            }
        });

        experience1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                experience1ActionPerformed(evt);
            }
        });

        zipCode1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipCode1ActionPerformed(evt);
            }
        });

        jLabel26.setText("Zip Code :");

        jLabel27.setText("Hospital :");

        jLabel28.setText("State :");

        state1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                state1ActionPerformed(evt);
            }
        });

        city3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                city3ItemStateChanged(evt);
            }
        });

        jLabel29.setText("City :");

        jLabel30.setText("Community :");

        community1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                community1ItemStateChanged(evt);
            }
        });
        community1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                community1ActionPerformed(evt);
            }
        });

        addressLine21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressLine21ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        jLabel31.setText("Personal Information");

        jLabel32.setText("Line 2 :");

        firstName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstName1ActionPerformed(evt);
            }
        });

        jLabel33.setText("Line 1 :");

        jLabel34.setText("First Name :");

        addressLine11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressLine11ActionPerformed(evt);
            }
        });

        jLabel35.setText("Last Name :");

        jLabel36.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        jLabel36.setText("Address Information");

        lastName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastName1ActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        jLabel37.setText("Password :");

        jLabel38.setText("E-mail Id :");

        eMailId1.setEnabled(false);
        eMailId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eMailId1ActionPerformed(evt);
            }
        });

        searchType.setForeground(new java.awt.Color(255, 255, 255));
        searchType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Email Id", "Name", "Doctor Id" }));

        searchDoctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/search.png"))); // NOI18N
        searchDoctor.setToolTipText("Search Doctor");
        searchDoctor.setBorder(null);
        searchDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDoctorActionPerformed(evt);
            }
        });

        searchText.setBackground(new java.awt.Color(153, 153, 255));
        searchText.setForeground(new java.awt.Color(255, 255, 255));
        searchText.setCaretColor(new java.awt.Color(255, 255, 255));

        updateDoctor.setBackground(new java.awt.Color(153, 153, 255));
        updateDoctor.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        updateDoctor.setText("Update");
        updateDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDoctorActionPerformed(evt);
            }
        });

        deleteDoctor.setBackground(new java.awt.Color(153, 153, 255));
        deleteDoctor.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        deleteDoctor.setText("Delete");
        deleteDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(searchType, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchDoctor)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(firstName1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastName1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38)
                            .addComponent(eMailId1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(dateOfBirth1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(gender1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(phone1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34)
                            .addComponent(jLabel31))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addressLine11, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel33)
                                        .addComponent(jLabel32)
                                        .addComponent(addressLine21, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel29)
                                            .addComponent(city3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(49, 49, 49)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel25)
                                        .addComponent(experience1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel23)
                                        .addComponent(degree1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel21)
                                        .addComponent(specialisation1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(jLabel36)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30)
                                    .addComponent(community1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28)
                                    .addComponent(state1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(zipCode1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel27)
                                        .addComponent(hospital2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel37)
                                        .addGap(138, 138, 138))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGap(22, 22, 22)
                                            .addComponent(updateDoctor)
                                            .addGap(18, 18, 18)
                                            .addComponent(deleteDoctor))
                                        .addComponent(passWord1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(searchDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchText)
                    .addComponent(searchType))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(jLabel33)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressLine11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(specialisation1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel32))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lastName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addressLine21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(degree1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eMailId1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(experience1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel29)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(city3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(0, 0, 0)
                        .addComponent(dateOfBirth1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gender1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(state1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zipCode1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hospital2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(community1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passWord1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateDoctor)
                            .addComponent(deleteDoctor))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Search Doctor", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void specialisationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specialisationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_specialisationActionPerformed

    private void createDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDoctorActionPerformed
//        // TODO add your handling code here:
        boolean validated = false;
        boolean validatedOtherFields = false;
        String selectedGender = gender.getSelectedItem().toString();
        String selectedCity = city.getSelectedItem().toString();
        String hos = hospital.getSelectedItem().toString();
        String selectedCommunity = community.getSelectedItem().toString();
        JDateChooser strtDt = dateOfBirth;
        if (!selectedCity.isEmpty() && !selectedCommunity.isEmpty() && !selectedGender.isEmpty() && strtDt != null && !specialisation.getText().isEmpty() && !degree.getText().isEmpty() && !experience.getText().isEmpty() && !hos.isEmpty()) {
            validatedOtherFields = true;
        } else {
            JOptionPane.showMessageDialog(this, "All Fields are Mandatory!");
        }
        JTextField[] VARIABLE_CONSTANTS = {firstName, lastName, eMailId, phone, addressLine1, addressLine2, state, zipCode,degree, experience, specialisation, passWord};
        for (JTextField field : VARIABLE_CONSTANTS) {
            if (!validateData(field)) {
                validated = false;
                break;
            } else {
                validated = true;
                System.out.println("Validated");
            }
        }

        if (validated && validatedOtherFields) {
            String cityName = city.getSelectedItem().toString();
            City city = new City(cityName);

            Community community = new Community();
            community.setCommunity(this.community.getSelectedItem().toString());
            community.setCity(city);
            Hospital h = new Hospital();
            h.setHospitalName(hospital.getSelectedItem().toString());

            House house = new House();
            house.setAddressLine1(addressLine1.getText());
            house.setAddressLine2(addressLine2.getText());
            house.setState(state.getText());
            house.setCity(city);
            house.setCommunity(community);
            house.setZipCode(Integer.valueOf(zipCode.getText()));
            //String specialisation, String degree, int experience, Hospital hospital, String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber, House house, String password
            Doctor d = new Doctor(specialisation.getText(), degree.getText(), Integer.parseInt(experience.getText()), h, firstName.getText(), lastName.getText(), dateOfBirth.getDate(), eMailId.getText(), gender.getSelectedItem().toString(), Long.parseLong(phone.getText()), house, passWord.getText());
            //System.out.println("Patient Size" + ecoSystem.getPatientDirectory().getPatientList().size());
            //System.out.println("Person Size" + ecoSystem.getPersonDirectory().getPersonList().size());
            ecoSystem.getDoctorDirectory().addDoctor(d);
            populateDoctorDirectory();
             JOptionPane.showMessageDialog(this, "Doctor added successfully!");
        }

    }//GEN-LAST:event_createDoctorActionPerformed

    private void addressLine1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressLine1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressLine1ActionPerformed

    private void addressLine2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressLine2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressLine2ActionPerformed

    private void stateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateActionPerformed

    private void zipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zipCodeActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void eMailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eMailIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eMailIdActionPerformed

    private void lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameActionPerformed

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameActionPerformed

    private void degreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_degreeActionPerformed

    private void experienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_experienceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_experienceActionPerformed

    private void communityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_communityItemStateChanged
        // TODO add your handling code here:
        String commName = community.getSelectedItem().toString();
        ArrayList<String> hospBoxList = new ArrayList<String>();
        for(Hospital c:ecoSystem.getHospitalhistory().getHospitalList()){
            if(c.getCommunity().getCommunity().equals(commName)){
                hospBoxList.add(c.getHospitalName());
            }
        }
        DefaultComboBoxModel hospModelList = new DefaultComboBoxModel(hospBoxList.toArray());
        hospital.setModel(hospModelList);
    }//GEN-LAST:event_communityItemStateChanged

    private void cityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cityItemStateChanged
        // TODO add your handling code here:
        String cityName = city.getSelectedItem().toString();
        ArrayList<String> communityBoxList = new ArrayList<String>();
        for(Community c:ecoSystem.getCommunityList()){
            if(c.getCity().getCity().equals(cityName)){
                communityBoxList.add(c.getCommunity());
            }
        }
        DefaultComboBoxModel communityModelList = new DefaultComboBoxModel(communityBoxList.toArray());
        community.setModel(communityModelList);
        communityItemStateChanged(null);
    }//GEN-LAST:event_cityItemStateChanged

    private void specialisation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specialisation1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_specialisation1ActionPerformed

    private void degree1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degree1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_degree1ActionPerformed

    private void phone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phone1ActionPerformed

    private void experience1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_experience1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_experience1ActionPerformed

    private void zipCode1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipCode1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zipCode1ActionPerformed

    private void state1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_state1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_state1ActionPerformed

    private void city3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_city3ItemStateChanged
        // TODO add your handling code here:
        String cityName = city3.getSelectedItem().toString();
        ArrayList<String> communityBoxList = new ArrayList<String>();
        for(Community c:ecoSystem.getCommunityList()){
            if(c.getCity().getCity().equals(cityName)){
                communityBoxList.add(c.getCommunity());
            }
        }
        DefaultComboBoxModel communityModelList = new DefaultComboBoxModel(communityBoxList.toArray());
        community1.setModel(communityModelList);
        community1ItemStateChanged(null);
    }//GEN-LAST:event_city3ItemStateChanged

    private void community1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_community1ItemStateChanged
        // TODO add your handling code here:
        
        String commName = community1.getSelectedItem().toString();
        ArrayList<String> hospBoxList = new ArrayList<String>();
        for(Hospital c:ecoSystem.getHospitalhistory().getHospitalList()){
            if(c.getCommunity().getCommunity().equals(commName)){
                hospBoxList.add(c.getHospitalName());
            }
        }
        DefaultComboBoxModel hospModelList = new DefaultComboBoxModel(hospBoxList.toArray());
        hospital2.setModel(hospModelList);
    }//GEN-LAST:event_community1ItemStateChanged

    private void addressLine21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressLine21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressLine21ActionPerformed

    private void firstName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstName1ActionPerformed

    private void addressLine11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressLine11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressLine11ActionPerformed

    private void lastName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastName1ActionPerformed

    private void eMailId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eMailId1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eMailId1ActionPerformed

    private void searchDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDoctorActionPerformed
        // TODO add your handling code here:
        String searchType = this.searchType.getSelectedItem().toString();
        String searchText = this.searchText.getText();
        boolean found = false;
        for(Doctor dObj:ecoSystem.getDoctorDirectory().getDoctorList()){
            String objVal;
            if(searchType == "Email Id"){
                objVal = dObj.getEmailId();
            }
            else if(searchType == "Doctor Id"){
                objVal = dObj.getDoctorId();
            }
            else{
                objVal = dObj.getFirstName()+ " " + dObj.getLastName();
            }
            
            if(objVal.contains(searchText)){
                selectedDoctor = dObj;
                firstName1.setText(dObj.getFirstName());
                lastName1.setText(dObj.getLastName());
                eMailId1.setText(dObj.getEmailId());
                dateOfBirth1.setDate(dObj.getDateOfBirth());
                gender1.setSelectedItem(dObj.getGender());
                phone1.setText(String.valueOf(dObj.getPhoneNumber()));
                addressLine11.setText(dObj.getHouse().getAddressLine1());
                addressLine21.setText(dObj.getHouse().getAddressLine2());
                community1.setSelectedItem(dObj.getHouse().getCommunity().getCommunity());
                city3.setSelectedItem(dObj.getHouse().getCity().getCity());
                state1.setText(dObj.getHouse().getState());
                zipCode1.setText(String.valueOf(dObj.getHouse().getZipCode()));
                specialisation1.setText(dObj.getSpecialisation());
                degree1.setText(dObj.getDegree());
                experience1.setText(String.valueOf(dObj.getExperience()));
                hospital2.setSelectedItem(dObj.getHospital().getHospitalName());
                passWord1.setText(dObj.getPassword());
                found = true;
                break;
            }
        }
        if(!found){
            JOptionPane.showMessageDialog(this, "Doctor Not Found!");
        }
    }//GEN-LAST:event_searchDoctorActionPerformed

    private void updateDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDoctorActionPerformed
        // TODO add your handling code here:
        
        boolean validated = false;
        boolean validatedOtherFields = false;
        String selectedGender = gender1.getSelectedItem().toString();
        String selectedCity = city3.getSelectedItem().toString();
        String hos = hospital2.getSelectedItem().toString();
        String selectedCommunity = community1.getSelectedItem().toString();
        JDateChooser strtDt = dateOfBirth1;
        if (!selectedCity.isEmpty() && !selectedCommunity.isEmpty() && !selectedGender.isEmpty() && strtDt != null && !specialisation1.getText().isEmpty() && !degree1.getText().isEmpty() && !experience1.getText().isEmpty() && !hos.isEmpty()) {
            validatedOtherFields = true;
        } else {
            JOptionPane.showMessageDialog(this, "All Fields are Mandatory!");
        }
        JTextField[] VARIABLE_CONSTANTS = {firstName1, lastName1, phone1, addressLine11, addressLine21, state1, zipCode1,degree1, experience1, specialisation1, passWord1};
        for (JTextField field : VARIABLE_CONSTANTS) {
            if (!validateData(field)) {
                validated = false;
                break;
            } else {
                validated = true;
                System.out.println("Validated");
            }
        }
         if (validated && validatedOtherFields) {
        if(selectedDoctor!=null){
            selectedDoctor.setFirstName(firstName1.getText());
            selectedDoctor.setLastName(lastName1.getText());
            selectedDoctor.setDateOfBirth(dateOfBirth1.getDate());
            selectedDoctor.setGender(gender1.getSelectedItem().toString());
            selectedDoctor.setPhoneNumber(Long.valueOf(phone1.getText()));
            selectedDoctor.getHouse().setAddressLine1(addressLine11.getText());
            selectedDoctor.getHouse().setAddressLine2(addressLine21.getText());
            selectedDoctor.getHouse().setZipCode(Integer.valueOf(zipCode1.getText()));
            selectedDoctor.getHouse().setState(state1.getText());
            selectedDoctor.setExperience(Integer.valueOf(experience1.getText()));
            selectedDoctor.setDegree(degree1.getText());
            selectedDoctor.setSpecialisation(specialisation1.getText());
            selectedDoctor.setPassword(passWord1.getText());
            Hospital selectedH;
            for(Hospital hObj:ecoSystem.getHospitalhistory().getHospitalList()){
                if(hObj.getHospitalName().equals(hospital2.getSelectedItem().toString())){
                    selectedH = hObj;
                    
                    selectedDoctor.getHouse().setCity(selectedH.getCity());
                    selectedDoctor.getHouse().setCommunity(selectedH.getCommunity());
                    selectedDoctor.setHospital(selectedH);
                    break;
                }
            }
            populateDoctorDirectory();
            JOptionPane.showMessageDialog(this, "Doctor updated successfully!");
            selectedDoctor = null;
            searchText.setText("");
            firstName1.setText("");
            lastName1.setText("");
            eMailId1.setText("");
            dateOfBirth1.setDate(null);
            gender1.setSelectedItem("");
            phone1.setText("");
            addressLine11.setText("");
            addressLine21.setText("");
            community1.setSelectedItem("");
            city3.setSelectedItem("");
            state1.setText("");
            zipCode1.setText("");
            specialisation1.setText("");
            degree1.setText("");
            experience1.setText("");
            hospital2.setSelectedItem("");
            passWord1.setText("");
        }
        else{
            JOptionPane.showMessageDialog(this, "Doctor Not Found!");
        }}
        
    }//GEN-LAST:event_updateDoctorActionPerformed

    private void deleteDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDoctorActionPerformed
        // TODO add your handling code here:
        if(selectedDoctor!=null){
            ecoSystem.getDoctorDirectory().deleteDoctor(selectedDoctor);
            populateDoctorDirectory();
            JOptionPane.showMessageDialog(this, "Doctor deleted successfully!");
            selectedDoctor = null;
            searchText.setText("");
            firstName1.setText("");
            lastName1.setText("");
            eMailId1.setText("");
            dateOfBirth1.setDate(null);
            gender1.setSelectedItem("");
            phone1.setText("");
            addressLine11.setText("");
            addressLine21.setText("");
            community1.setSelectedItem("");
            city3.setSelectedItem("");
            state1.setText("");
            zipCode1.setText("");
            specialisation1.setText("");
            degree1.setText("");
            experience1.setText("");
            hospital2.setSelectedItem("");
            passWord1.setText("");
        }
        else{
            JOptionPane.showMessageDialog(this, "Doctor Not Found!");
        }
    }//GEN-LAST:event_deleteDoctorActionPerformed

    private void communityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_communityActionPerformed

    private void community1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_community1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_community1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressLine1;
    private javax.swing.JTextField addressLine11;
    private javax.swing.JTextField addressLine2;
    private javax.swing.JTextField addressLine21;
    private javax.swing.JComboBox<String> city;
    private javax.swing.JComboBox<String> city3;
    private javax.swing.JComboBox<String> community;
    private javax.swing.JComboBox<String> community1;
    private javax.swing.JButton createDoctor;
    private com.toedter.calendar.JDateChooser dateOfBirth;
    private com.toedter.calendar.JDateChooser dateOfBirth1;
    private javax.swing.JTextField degree;
    private javax.swing.JTextField degree1;
    private javax.swing.JButton deleteDoctor;
    private javax.swing.JTable doctorsTable;
    private javax.swing.JTextField eMailId;
    private javax.swing.JTextField eMailId1;
    private javax.swing.JTextField experience;
    private javax.swing.JTextField experience1;
    private javax.swing.JTextField firstName;
    private javax.swing.JTextField firstName1;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JComboBox<String> gender1;
    private javax.swing.JComboBox<String> hospital;
    private javax.swing.JComboBox<String> hospital2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField lastName;
    private javax.swing.JTextField lastName1;
    private javax.swing.JTextField passWord;
    private javax.swing.JTextField passWord1;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField phone1;
    private javax.swing.JButton searchDoctor;
    private javax.swing.JTextField searchText;
    private javax.swing.JComboBox<String> searchType;
    private javax.swing.JTextField specialisation;
    private javax.swing.JTextField specialisation1;
    private javax.swing.JTextField state;
    private javax.swing.JTextField state1;
    private javax.swing.JButton updateDoctor;
    private javax.swing.JTextField zipCode;
    private javax.swing.JTextField zipCode1;
    // End of variables declaration//GEN-END:variables
}
