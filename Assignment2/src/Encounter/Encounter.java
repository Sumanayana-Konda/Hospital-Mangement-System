/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encounter;

import Doctor.Doctors;
import Patient.Patients;
import java.util.Date;

/**
 *
 * @author sumanayanakonda
 */
public class Encounter {
    private Vital_Signs vitalSign;
    private Date aptTime;
    private String diagnosis;
    private Patients patient;
    private Doctors doctor;

    public Encounter( Vital_Signs vitalSign,
            Date aptTime,
            String result, Patients patient, Doctors doctor){

        this.vitalSign =vitalSign;
        this.aptTime = aptTime;
        this.diagnosis = result;
        this.doctor = doctor;
        this.patient = patient;

    }

    public Patients getPatient() {
        return patient;
    }

    public void setPatient(Patients patient) {
        this.patient = patient;
    }

    public Doctors getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctors doctor) {
        this.doctor = doctor;
    }

    public Vital_Signs getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(Vital_Signs vitalSign) {
        this.vitalSign = vitalSign;
    }

    public Date getAptTime() {
        return aptTime;
    }

    public void setAptTime(Date aptTime) {
        this.aptTime = aptTime;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String result) {
        this.diagnosis = result;
    }

    void addEncounter(Encounter eh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
