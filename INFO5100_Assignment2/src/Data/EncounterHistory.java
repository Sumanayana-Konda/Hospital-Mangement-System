/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;
import Model.Encounter;
import java.util.*;
/**
 *
 * @author sujithkaluva
 */
public class EncounterHistory {
    
    private ArrayList<Encounter> encounterHistory;

    public EncounterHistory() {
        this.encounterHistory = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    public void addEncounter(Encounter eObj){
        this.encounterHistory.add(eObj);
    }
    
}
