/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import Hospital.Hospital;
import java.util.ArrayList;

/**
 *
 * @author sumanayanakonda
 */
public class Hospital_History {
    
     private ArrayList<Hospital> HospitalhistoryArrayList;
    public Hospital_History(){
        this.HospitalhistoryArrayList = new ArrayList<Hospital>();
        
    }

    public ArrayList<Hospital> getHospitalHistoryArrayList() {
        return HospitalhistoryArrayList;
    }

    public void setHospitalHistoryArrayList(ArrayList<Hospital> HospitalhistoryArrayList) {
        this.HospitalhistoryArrayList = HospitalhistoryArrayList;
    }
    public Hospital addNewHospital(Hospital hospital){
        HospitalhistoryArrayList.add(hospital);
        return hospital;
    }
    public int sizeHospitalArraylist(){
        return HospitalhistoryArrayList.size();
    }
    
    public void eraseHospital(int i){
        HospitalhistoryArrayList.remove(i);
        
    }
    
}
