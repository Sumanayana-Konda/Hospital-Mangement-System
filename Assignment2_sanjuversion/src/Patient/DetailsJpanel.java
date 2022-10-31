/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Patient;

import Hospital.Hospital;
import javax.swing.table.DefaultTableModel;
import Ecosystem.Ecosystem;
import Encounter.Encounter;

/**
 *
 * @author sumanayanakonda
 */
public class DetailsJpanel extends javax.swing.JPanel {
Ecosystem e;
Patients pas;
    /**
     * Creates new form DetailsJpanel
     */String user;
     String pass;
    public DetailsJpanel(Ecosystem e, String u, String p) {
        initComponents();
        this.e=e;
        this.pass = p;
        this.user = u;
        TableFilling();
        TableFilling2();
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
        jLabel23 = new javax.swing.JLabel();
        jName = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jPersonID = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jGender = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jDob = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jAddress = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jAptNum = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jCity = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPin = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jPNum = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jCommunity = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jState = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        encounter = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel1.setText("Sign In Patient");

        jLabel23.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel23.setText("Name:");

        jLabel27.setText("Person ID:");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel15.setText("Gender:");

        jLabel20.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel20.setText("Date of Birth:");

        jLabel24.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel24.setText("House:");

        jLabel25.setText("Address:");

        jLabel26.setText("Appartment Number:");

        jLabel18.setText("City:");

        jLabel16.setText("ZipCode:");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel21.setText("Phone Number:");

        jLabel19.setText("Community:");

        jLabel17.setText("State:");

        encounter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Temperature", "Blood Pressure", "Weight", "Height", "Pulse Rate", "Appointment time", "Diagnosis", "Doctor"
            }
        ));
        jScrollPane2.setViewportView(encounter);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25)
                            .addComponent(jLabel18)
                            .addComponent(jLabel16)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jAptNum, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCity, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPin, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPNum, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(249, 249, 249)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jState, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                    .addComponent(jCommunity))
                                .addGap(0, 75, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jGender, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDob, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPersonID)))
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(jPersonID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel19)
                    .addComponent(jAptNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(jState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jPNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
 
    private void TableFilling() {
       
        for (Patients p: e.getPatienthistory().getPatients())
        {
        
            if (p.getUsername().equals(user)&&p.getPassword().equals(pass)){
            jName.setText(p.getFullName());
            jGender.setText(p.getGender());
            jCommunity.setText(p.getResidence().getCommunity().getCommunity());
            jCity.setText(p.getResidence().getCity().getCityName());
            jDob.setText(p.getDob().toString());
            jAddress.setText(p.getResidence().getAddress());
            jAptNum.setText(p.getResidence().getAptNo());
            jState.setText(p.getResidence().getState());
            jPNum.setText(p.getPhone());
            jPin.setText(String.valueOf(p.getResidence().getPin()));
            jPersonID.setText(String.valueOf(p.getId()));
            }
            
        }
        
    }      
            
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable encounter;
    private javax.swing.JTextField jAddress;
    private javax.swing.JTextField jAptNum;
    private javax.swing.JTextField jCity;
    private javax.swing.JTextField jCommunity;
    private javax.swing.JTextField jDob;
    private javax.swing.JTextField jGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JTextField jName;
    private javax.swing.JTextField jPNum;
    private javax.swing.JTextField jPersonID;
    private javax.swing.JTextField jPin;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jState;
    // End of variables declaration//GEN-END:variables

    private void TableFilling2() {
        
        DefaultTableModel model = (DefaultTableModel) encounter.getModel();
        model.setRowCount(0);
             for (Patients p: e.getPatienthistory().getPatients())
        {
        
            if (p.getUsername().equals(user)&&p.getPassword().equals(pass)){   
                
                
         for(Encounter en : e.getEncounterhistory().getEncounterHistoryArrayList())
             
            {
                if(p.getUsername().equals(en.getPatient().getUsername())&&p.getPassword().equals(en.getPatient().getPassword()))
           {
                
            Object[] row = new Object[8];
            row[0] = en.getVitalSign().getTemperature();
            row[1] = en.getVitalSign().getBlood_Pressure();
            row[2] = en.getVitalSign().getWeight();
            row[3] = en.getVitalSign().getHeight();
            row[4] = en.getVitalSign().getPulse_Rate();
            row[5] = en.getAptTime();
            row[6] = en.getDiagnosis();
            row[7] = en.getDoctor().getFullName();
            model.addRow(row);
            }}
            }}
   }
}
