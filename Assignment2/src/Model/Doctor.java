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
public class Doctor extends Person{

    
    private Person person;
    private static int doctorCounter = 1;
    private String doctorId;
    private String specialisation;
    private String degree;
    private int experience;
    private Hospital hospital;

    public Doctor(String specialisation, String degree, int experience, Hospital hospital, String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber, House house, String password) {
        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber, house, password);
        this.specialisation = specialisation;
        this.degree = degree;
        this.experience = experience;
        this.hospital = hospital;
        this.doctorId = "doctor"+doctorCounter;
        doctorCounter++;
    }
    
    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public static int getDoctorCounter() {
        return doctorCounter;
    }

    public static void setDoctorCounter(int doctorCounter) {
        Doctor.doctorCounter = doctorCounter;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    
    
}
