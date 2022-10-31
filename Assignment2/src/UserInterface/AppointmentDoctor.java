/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import Data.Ecosystem;
import Model.Doctor;
import Model.Encounter;
import Model.VitalSigns;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sreej
 */
public class AppointmentDoctor extends javax.swing.JPanel {

    /**
     * Creates new form EncounterDoctor
     */
    public AppointmentDoctor() {
        initComponents();
    }
     Ecosystem ecoSystem = Ecosystem.getInstance();
    Doctor d;
    AppointmentDoctor(Doctor d) {
        initComponents();
        this.d=d;
        populateTable();
        bodytemp.setText("Temperature");
        bp.setText("Blood Pressure");
        diagnosis.setText("Diagnosis");
        oxy.setText("Oxygen Saturation");
        pulse.setText("Pulse Rate");
        weight.setText("Weight");
        height.setText("Height");
        resrate.setText("Respiratory Rate");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        encounter_history = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        bp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        oxy = new javax.swing.JTextField();
        weight = new javax.swing.JTextField();
        height = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        diagnosis = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bodytemp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pulse = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        resrate = new javax.swing.JTextField();
        fetch = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jScrollPane2.setBackground(new java.awt.Color(153, 153, 255));

        encounter_history.setBackground(new java.awt.Color(153, 153, 255));
        encounter_history.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        encounter_history.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Encounter ID", "Encounter Date", "Doctor Name", "Patient Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(encounter_history);

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jButton1.setText("Add/Update Encounter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel7.setText("Weight");

        bp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel8.setText("Height");

        height.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel1.setText("Diagnosis");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel2.setText("Body Temperature");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel3.setText("Pulse Rate");

        diagnosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagnosisActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel4.setText("Respiratory Rate");

        bodytemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bodytempActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel5.setText("Blood Pressure");

        pulse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulseActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel6.setText("Oxygen Saturation");

        fetch.setBackground(new java.awt.Color(153, 153, 255));
        fetch.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        fetch.setText("Fetch");
        fetch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fetchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(fetch))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resrate)
                            .addComponent(bodytemp)
                            .addComponent(diagnosis)
                            .addComponent(pulse, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(75, 75, 75)
                                    .addComponent(jLabel5))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jLabel8)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(weight)
                                    .addComponent(bp)
                                    .addComponent(oxy, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(293, 293, 293))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fetch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(bp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bodytemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(oxy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(resrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(51, 51, 51))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean validated = false;
        boolean validatedOtherFields = false;
        
        JTextField[] VARIABLE_CONSTANTS = {weight, height, diagnosis, bp, bodytemp, oxy, pulse, resrate};
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
        int c=encounter_history.getSelectedRow();
        for(Encounter e:ecoSystem.getEncounterHistory().getEncounterHistory()){
            if(e.getEncounter_ID()== encounter_history.getValueAt(c, 0)){
                e.setDiagnosis(diagnosis.getText());
        VitalSigns vt=new VitalSigns(Integer.parseInt(bodytemp.getText()),Integer.parseInt(pulse.getText()),Integer.parseInt(resrate.getText()),Integer.parseInt(bp.getText()),Integer.parseInt(oxy.getText()),Integer.parseInt(weight.getText()),Integer.parseInt(height.getText()));
        e.setVitalSign(vt);
            }
        }
         JOptionPane.showMessageDialog(this, "Encounter Added");
         
                bodytemp.setText("");
                pulse.setText("");
                resrate.setText("");
                bp.setText("");
                oxy.setText("");
                weight.setText("");
                height.setText("");
         
        
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bpActionPerformed

    private void diagnosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagnosisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diagnosisActionPerformed

    private void bodytempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bodytempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bodytempActionPerformed

    private void pulseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pulseActionPerformed

    private void fetchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fetchActionPerformed
        // TODO add your handling code here:
        int s=encounter_history.getSelectedRow();
        for(Encounter e:ecoSystem.getEncounterHistory().getEncounterHistory()){
            
            if(e.getEncounter_ID()== encounter_history.getValueAt(s, 0)){
                diagnosis.setText(e.getDiagnosis());
                bodytemp.setText(String.valueOf(e.getVitalSign().getBodyTemp()));
                pulse.setText(String.valueOf(e.getVitalSign().getPulseRate()));
                resrate.setText(String.valueOf(e.getVitalSign().getRespiratoryRate()));
                bp.setText(String.valueOf(e.getVitalSign().getBloodPressure()));
                oxy.setText(String.valueOf(e.getVitalSign().getOxygenSaturation()));
                weight.setText(String.valueOf(e.getVitalSign().getWeight()));
                height.setText(String.valueOf(e.getVitalSign().getHeight()));
                         
                
            }
        }
            
    }//GEN-LAST:event_fetchActionPerformed

    private void heightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bodytemp;
    private javax.swing.JTextField bp;
    private javax.swing.JTextField diagnosis;
    private javax.swing.JTable encounter_history;
    private javax.swing.JButton fetch;
    private javax.swing.JTextField height;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField oxy;
    private javax.swing.JTextField pulse;
    private javax.swing.JTextField resrate;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) encounter_history.getModel();
        model.setRowCount(0);
        for(Encounter en : ecoSystem.getEncounterHistory().getEncounterHistory())
             
            {
                if(d.getEmailId().equals(en.getDoctor().getEmailId()))
           {
                
            Object[] row = new Object[6];
            row[0] = en.getEncounter_ID();
            row[1] = en.getEncounterDate();
            row[2] = en.getDoctor().getFirstName()+""+en.getDoctor().getLastName();
            row[3] = en.getPatient().getFirstName()+""+en.getPatient().getLastName();
            model.addRow(row);
            }}
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
                case "Temperature":
                    if (!text.matches("^[0-9]")) {
                        raiseError = true;
                        errorMsg = String.format("Please enter valid values for %s", name);
                    }
                    break;
                case "Oxygen Saturation":
                    if (!text.matches("^[0-9]")) {
                        raiseError = true;
                        errorMsg = String.format("Please enter valid values for %s", name);
                    }
                    break;
                case "Blood Pressure":
                    if (!text.matches("^[0-9]")) {
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s", name);
                    }
                    break;
                case "Pulse Rate":
                    if (!text.matches("^[0-9]")) {
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s", name);
                    }
                    break;
                 case "Weight":
                    if (!text.matches("^[0-9]")) {
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s", name);
                    }
                    break;
                 case "Height":
                    if (!text.matches("^[0-9]")) {
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s", name);
                    }
                    break;
                 case "Respiratory Rate":
                    if (!text.matches("^[0-9]")) {
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
}
