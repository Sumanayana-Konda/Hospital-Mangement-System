/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Model.Doctor;
import Model.Hospital;
import java.util.ArrayList;

/**
 *
 * @author sumanayanakonda
 */
public class HospitalHistory {
    
  
    
    private ArrayList<Hospital> hospitalList;
    
    public HospitalHistory(){
        this.hospitalList = new ArrayList<Hospital>();
    }

    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(ArrayList<Hospital> doctorList) {
        this.hospitalList = doctorList;
    }
    
}
