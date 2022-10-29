/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor;


import java.util.ArrayList;


/**
 *
 * @author sumanayanakonda
 */
public class DoctorHistory {
    
    private ArrayList<Doctors> DoctorhistoryArrayList;
    public DoctorHistory(){
        this.DoctorhistoryArrayList = new ArrayList<Doctors>();
        
    }

    public ArrayList<Doctors> getDoctorHistoryArrayList() {
        return DoctorhistoryArrayList;
    }

    public void setDoctorHistoryArrayList(ArrayList<Doctors> historyArrayList) {
        this.DoctorhistoryArrayList = DoctorhistoryArrayList;
    }
    public Doctors addNewDoctor(Doctors doctor){
       // ProductDetails newEmployee = new ProductDetails();
        DoctorhistoryArrayList.add(doctor);
        return doctor;
    }
    public int sizeDoctorArraylist(){
        return DoctorhistoryArrayList.size();
    }
    
    public void eraseDoctor(int i){
        DoctorhistoryArrayList.remove(i);
        
    }
    
}
