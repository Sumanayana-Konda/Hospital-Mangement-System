/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Model.Doctor;
import java.util.*;

/**
 *
 * @author sujithkaluva
 */
public class DoctorDirectory {

    private ArrayList<Doctor> doctorList;
    private HashMap<String, String> passwordManager;
    private HashMap<String, Doctor> doctorMap;

    public DoctorDirectory() {
        this.doctorList = new ArrayList<Doctor>();
        this.passwordManager = new HashMap<String, String>();
        this.doctorMap = new HashMap<String, Doctor>();
    }

    public HashMap<String, String> getPasswordManager() {
        return passwordManager;
    }

    public void setPasswordManager(HashMap<String, String> passwordManager) {
        this.passwordManager = passwordManager;
    }

    public HashMap<String, Doctor> getDoctorMap() {
        return doctorMap;
    }

    public void setDoctorMap(HashMap<String, Doctor> doctorMap) {
        this.doctorMap = doctorMap;
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    public void addDoctor(Doctor pObj) {
        this.doctorList.add(pObj);
        this.passwordManager.put(pObj.getEmailId(), pObj.getPassword());
        this.doctorMap.put(pObj.getEmailId(), pObj);
    }
    
    public void deleteDoctor(Doctor dObj){
        this.doctorList.remove(dObj);
        this.passwordManager.remove(dObj.getEmailId());
        this.doctorMap.remove(dObj.getEmailId());
    }

    public boolean isUsernameAvailable(String username) {
        if (passwordManager.containsKey(username)) {
            return false;
        } else {
            return true;
        }
    }

}
