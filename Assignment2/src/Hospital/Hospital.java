/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;
import Doctor.DoctorHistory;
import Community.Community;
/**
 *
 * @author sumanayanakonda
 */
public class Hospital {
    private Community community;

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }
    private String Hospital_Name;
    public Hospital (String h, Community community)
    {
    this.community = community;
    this.Hospital_Name = h;
    }
    public Hospital(String h){
    Hospital_Name = h;
    }

    public String getHospital_Name() {
        return Hospital_Name;
    }

    public void setHospital_Name(String Hospital_Name) {
        this.Hospital_Name = Hospital_Name;
    }
    
}
