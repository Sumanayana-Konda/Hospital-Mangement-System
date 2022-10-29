/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import Encounter.Encounter;
import java.util.ArrayList;
import Person.Person;

/**
 *
 * @author sumanayanakonda
 */
public class PatientHistory {
    
    private ArrayList<Patients> patients = new ArrayList<>();

    public void addPatients(Patients patient) {
        patients.add(patient);
    }

    public ArrayList<Patients> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patients> patients) {
        this.patients = patients;
    }

    

    public void deletePatient(int id) {
        for (Patients v : patients) {

            if (v.getId() == id) {
                patients.remove(v);
                return;
            }
        }
    }

    public Patients searchPatient(int txtId) {

        for (Patients v : patients) {
            if (v.getId() == txtId) {
                return v;
            }
        }
        return null;

    }
}
