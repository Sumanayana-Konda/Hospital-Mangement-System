/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Data.Ecosystem;
import java.util.Date;

/**
 *
 * @author sumanayana
 */
public class Patient extends Person {
    
    private static int patientCounter = 1;
    private String patientId;
    Ecosystem ecoSystem = Ecosystem.getInstance();

    public static int getPatientCounter() {
        return patientCounter;
    }

    public static void setPatientCounter(int patientCounter) {
        Patient.patientCounter = patientCounter;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public Ecosystem getEcoSystem() {
        return ecoSystem;
    }

    public void setEcoSystem(Ecosystem ecoSystem) {
        this.ecoSystem = ecoSystem;
    }

    public Patient(String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber, House house,String password) {
        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber, house, password);
        this.patientId = "patient"+patientCounter;
        patientCounter++;
        ecoSystem.getPatientDirectory().addPatient(this);
    }
    
}
