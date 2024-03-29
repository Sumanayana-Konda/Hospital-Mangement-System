/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.*;

/**
 *
 * @author sumanayana
 */
public class Encounter {
    private String Encounter_ID;
    private Date encounterDate;
    private String diagnosis;
    private Patient patient;
    private VitalSigns vitalSign;
    private Doctor doctor;

    public Encounter(String Encounter_ID,Date encounterDate, String diagnosis, Patient patient, VitalSigns vitalSign, Doctor doctor) {
       this.Encounter_ID = Encounter_ID;
        this.encounterDate = encounterDate;
        this.diagnosis = diagnosis;
        this.patient = patient;
        this.vitalSign = vitalSign;
        this.doctor = doctor;
    }

    public String getEncounter_ID() {
        return Encounter_ID;
    }

    public void setEncounter_ID(String Encounter_ID) {
        this.Encounter_ID = Encounter_ID;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate(Date encounterDate) {
        this.encounterDate = encounterDate;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public VitalSigns getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSigns vitalSign) {
        this.vitalSign = vitalSign;
    }
    
    
    
}
