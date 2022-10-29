/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encounter;

import java.util.ArrayList;

/**
 *
 * @author sumanayanakonda
 */
public class Encounter_History {
    
     private ArrayList<Encounter> EncounterhistoryArrayList;
    public Encounter_History(){
        this.EncounterhistoryArrayList = new ArrayList<Encounter>();
        
    }

    public ArrayList<Encounter> getEncounterHistoryArrayList() {
        return EncounterhistoryArrayList;
    }

    public void setEncounterHistoryArrayList(ArrayList<Encounter> EncounterhistoryArrayList) {
        this.EncounterhistoryArrayList = EncounterhistoryArrayList;
    }
    public Encounter addNewEncounter(Encounter encounter){
        EncounterhistoryArrayList.add(encounter);
        return encounter;
    }
    public int sizeEncounterArraylist(){
        return EncounterhistoryArrayList.size();
    }
    
    public void eraseEncounter(int i){
        EncounterhistoryArrayList.remove(i);
        
    }
    
}
