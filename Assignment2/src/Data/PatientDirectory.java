/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;
import Model.Patient;
import java.util.*;
/**
 *
 * @author sumanayana
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientList;
    private HashMap<String,String> passwordManager;
    private HashMap<String,Patient> patientMap;

    public HashMap<String, Patient> getPatientMap() {
        return patientMap;
    }

    public void setPatientMap(HashMap<String, Patient> patientMap) {
        this.patientMap = patientMap;
    }
    
    public PatientDirectory(){
        this.patientList = new ArrayList<Patient>();
        this.passwordManager = new HashMap<String,String>();
        this.patientMap = new HashMap<String,Patient>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public HashMap<String, String> getPasswordManager() {
        return passwordManager;
    }

    public void setPasswordManager(HashMap<String, String> passwordManager) {
        this.passwordManager = passwordManager;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
    public void addPatient(Patient pObj){
        this.patientList.add(pObj);
        this.passwordManager.put(pObj.getEmailId(), pObj.getPassword());
        this.patientMap.put(pObj.getEmailId(),pObj);
    }
    
    public boolean isUsernameAvailable(String username){
        if(passwordManager.containsKey(username)) return false;
        else return true;
    }
    
            
}
