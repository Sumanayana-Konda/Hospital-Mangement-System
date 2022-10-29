/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ecosystem;
import Doctor.DoctorHistory;
import Hospital.Hospital_History;
import Patient.PatientHistory;
import Person.PersonHistory;
import Community.Community_History;
import Encounter.Encounter_History;
import java.util.ArrayList;
/**
 *
 * @author sumanayanakonda
 */
public class Ecosystem {
    private static Ecosystem business;
    private DoctorHistory doctorhistory;
    private Hospital_History hospitalhistory;
    private PatientHistory patienthistory;
    private PersonHistory personhistory;
    private Community_History communityhistory;
    private Encounter_History encounterhistory;
    public Ecosystem( DoctorHistory doctorhistory, Hospital_History hospitalhistory, Encounter_History encounterhistory,
            PatientHistory patienthistory, PersonHistory personhistory, Community_History communityhistory) {

        this.doctorhistory = doctorhistory;
        this.communityhistory = communityhistory;
        this.hospitalhistory = hospitalhistory;
        this.personhistory = personhistory;
        this.patienthistory = patienthistory;
        this.encounterhistory = encounterhistory;
        
    }

    public Encounter_History getEncounterhistory() {
        return encounterhistory;
    }

    public void setEncounterhistory(Encounter_History encounterhistory) {
        this.encounterhistory = encounterhistory;
    }

    public static Ecosystem getBusiness() {
        return business;
    }

    public static void setBusiness(Ecosystem business) {
        Ecosystem.business = business;
    }

   

    public DoctorHistory getDoctorhistory() {
        return doctorhistory;
    }

    public void setDoctorhistory(DoctorHistory doctorhistory) {
        this.doctorhistory = doctorhistory;
    }


    public Hospital_History getHospitalhistory() {
        return hospitalhistory;
    }

    public void setHospitalhistory(Hospital_History hospitalhistory) {
        this.hospitalhistory = hospitalhistory;
    }

    public PatientHistory getPatienthistory() {
        return patienthistory;
    }

    public void setPatienthistory(PatientHistory patienthistory) {
        this.patienthistory = patienthistory;
    }

    public PersonHistory getPersonhistory() {
        return personhistory;
    }

    public void setPersonhistory(PersonHistory personhistory) {
        this.personhistory = personhistory;
    }

    public Community_History getCommunityhistory() {
        return communityhistory;
    }

    public void setCommunityhistory(Community_History communityhistory) {
        this.communityhistory = communityhistory;
    }
    public static Ecosystem getInstance(){
        if(business==null){
            business = new Ecosystem();
        }
        return business;
    }
    
    private Ecosystem(){
       patienthistory = new PatientHistory();
       personhistory = new PersonHistory();
       communityhistory = new Community_History();
       hospitalhistory = new Hospital_History();
       doctorhistory = new DoctorHistory();
       encounterhistory = new Encounter_History();
       
       
    }
    
}
