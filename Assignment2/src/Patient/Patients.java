/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;
import Community.House;
import Encounter.Encounter;
import Person.Person;
import Encounter.Encounter_History;
import java.util.Date;

/**
 *
 * @author sumanayanakonda
 */
public class Patients extends Person{
    
   

    public Patients(String Username, String Password, String fullName, House residence, String gender, Date dob, String phone, int id) {
        super(Username, Password,"Patient" ,fullName, residence, gender, dob, id, phone);
      
        
    }
    
    

    
    
    
    
}
