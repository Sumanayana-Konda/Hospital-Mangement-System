/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Community;


import java.util.ArrayList;

/**
 *
 * @author sumanayanakonda
 */
public class Community_History {
    
    private ArrayList<Community> CommunityhistoryArrayList;
    public Community_History(){
        this.CommunityhistoryArrayList = new ArrayList<Community>();
        
    }

    public ArrayList<Community> getCommunityHistoryArrayList() {
        return CommunityhistoryArrayList;
    }

    public void setCommunityHistoryArrayList(ArrayList<Community> historyArrayList) {
        this.CommunityhistoryArrayList = CommunityhistoryArrayList;
    }
    public Community addNewCommunity(Community doctor){
       // ProductDetails newEmployee = new ProductDetails();
        CommunityhistoryArrayList.add(doctor);
        return doctor;
    }
    public int sizeCommunityArraylist(){
        return CommunityhistoryArrayList.size();
    }
    
    public void eraseCommunity(int i){
        CommunityhistoryArrayList.remove(i);
        
    }
    
}

