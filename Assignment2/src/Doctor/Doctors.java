/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor;
import Community.House;
import Encounter.Encounter;
import Encounter.Encounter_History;
import Hospital.Hospital;
import Patient.PatientHistory;
import java.util.Date;
import Person.Person;

/**
 *
 * @author sumanayanakonda
 */
public class Doctors extends Person {
    private PatientHistory patienthistory;
  
    private String Specialization;
    private String Degree;
    private int Experience;
    private Hospital hospital_Name;

    public Doctors(String Username, String Password, String fullName, House residence, String gender, Date dob, int id, String Phone,  String Specialization, 
            String Degree, int Experience, PatientHistory patienthistory, Hospital hospital) {
        super(Username, Password,"Doctor", fullName, residence, gender, dob, id, Phone);
        
        this.Specialization = Specialization;
        this.Experience = Experience;
        this.hospital_Name = hospital;
        this.Degree = Degree;
        this.patienthistory = patienthistory;
    }

    public PatientHistory getPatienthistory() {
        return patienthistory;
    }

    public void setPatienthistory(PatientHistory patienthistory) {
        this.patienthistory = patienthistory;
    }

    
    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }

    public String getDegree() {
        return Degree;
    }

    public void setDegree(String Degree) {
        this.Degree = Degree;
    }

    public int getExperience() {
        return Experience;
    }

    public void setExperience(int Experience) {
        this.Experience = Experience;
    }

    public Hospital getHospital_Name() {
        return hospital_Name;
    }

    public void setHospital_Name(Hospital hospital_Name) {
        this.hospital_Name = hospital_Name;
    }
    
   
    
    
}
