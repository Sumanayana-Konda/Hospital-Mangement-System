/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Model.Person;
import java.util.*;
/**
 *
 * @author sumanayana
 */
public class PersonDirectory {
    
    private ArrayList<Person> personList;

    public PersonDirectory() {
        this.personList = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public void addPerson(Person pObj){
        this.personList.add(pObj);
    }
    
}
