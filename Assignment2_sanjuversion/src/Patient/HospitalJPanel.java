/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Patient;
import Community.City;
import Community.Community;
import Community.House;
import Doctor.Doctors;
import Doctor.DoctorHistory;
import Ecosystem.ConfigureASystem;
import Ecosystem.Ecosystem;
import Encounter.Encounter;
import Encounter.Encounter_History;
import Encounter.Vital_Signs;
import Hospital.Hospital;
import Hospital.Hospital_History;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import Patient.Patients;
import java.util.Date;
import javax.swing.JOptionPane;
import Patient.PatientHistory;
import Person.Person;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author sumanayanakonda
 */
public class HospitalJPanel extends javax.swing.JPanel {
Ecosystem e;
    /**
     * Creates new form HospitalJPanel
     */
    Patients pa;
    public HospitalJPanel(Ecosystem e, Patients pa) {
        initComponents();
        //e = ConfigureASystem.configure();
        this.e = e;
        this.pa = pa;
        TableFilling();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jHospital = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jDoctors = new javax.swing.JTable();
        jView = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        apt = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(204, 204, 255));

        jHospital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Hospitals"
            }
        ));
        jScrollPane1.setViewportView(jHospital);

        jDoctors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Specialization", "Degree", "Experience"
            }
        ));
        jScrollPane2.setViewportView(jDoctors);

        jView.setText("View Doctors");
        jView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jViewActionPerformed(evt);
            }
        });

        jLabel1.setText("DOCTORS");

        jButton1.setText("Select Date");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Book Appointment:");

        jLabel3.setText("Select a Date:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(apt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(202, 202, 202)
                            .addComponent(jView)
                            .addGap(153, 153, 153)
                            .addComponent(jLabel2))))
                .addContainerGap(119, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(279, 279, 279))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(383, 383, 383))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(221, 221, 221))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jView))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(apt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jViewActionPerformed
       int selectedRow = jHospital.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a Hospital");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jDoctors.getModel();
        model.setRowCount(0);
        //System.out.println("column count " + selectedRow);
        System.out.println(jHospital.getValueAt(selectedRow, 0));
        for (Doctors c : e.getDoctorhistory().getDoctorHistoryArrayList()) 
        {
            if (c.getHospital_Name().getHospital_Name().equals(jHospital.getValueAt(selectedRow, 0)))
            {
                 Object[] row = new Object[4];
                row[0] = c.getFullName();
                row[1] = c.getSpecialization();
                row[2]=c.getDegree();
                row[3]=c.getExperience();
                model.addRow(row);
               
            }

        }
    }//GEN-LAST:event_jViewActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jDoctors.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a Doctor");
            return;
    
        }
        else{
        for (Doctors d:e.getDoctorhistory().getDoctorHistoryArrayList()){
        
        if(d.getFullName().equals(jDoctors.getValueAt(selectedRow, 0))){
           for (Patients p : d.getPatienthistory().getPatients()){
        if(p.getUsername().equals(pa.getUsername()) && p.getPassword().equals(pa.getPassword())){
        Vital_Signs vt = new Vital_Signs(0, 0, 0, 0, 0);
        Encounter encounter = new Encounter(vt, apt.getDate(), "", p, d, "");
        e.getEncounterhistory().addNewEncounter(encounter);
        return;
        }
        else{
        d.getPatienthistory().addPatients(pa);
        Vital_Signs vt = new Vital_Signs(0, 0, 0, 0, 0);
        Encounter encounter = new Encounter(vt, apt.getDate(), "", p, d, "");
        e.getEncounterhistory().addNewEncounter(encounter);
        return;
        }
        
        }
            
        
        
        }
        } 
       
        } 
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser apt;
    private javax.swing.JButton jButton1;
    private javax.swing.JTable jDoctors;
    private javax.swing.JTable jHospital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jView;
    // End of variables declaration//GEN-END:variables

    private void TableFilling() {
        //  System.out.print("Entered Table Filling\n");
        DefaultTableModel model = (DefaultTableModel) jHospital.getModel();
        model.setRowCount(0);
                String com = pa.getResidence().getCommunity().getCommunity();
                for (Hospital hn : e.getHospitalhistory().getHospitalHistoryArrayList()) {
                    if (hn.getCommunity().getCommunity().equals(com)) {
                        Object[] lines = new Object[1];
                        lines[0] = hn.getHospital_Name();
                        model.addRow(lines);
                    }
                }
          
            
    }

    
   
}
