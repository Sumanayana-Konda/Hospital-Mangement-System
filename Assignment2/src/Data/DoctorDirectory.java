/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;
import Model.Doctor;
import java.util.*;

/**
 *
 * @author sumanayana
 */
public class DoctorDirectory {
    
    private ArrayList<Doctor> doctorList;
    
    public DoctorDirectory(){
        this.doctorList = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
    
    
}
