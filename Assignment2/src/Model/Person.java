/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Data.*;
import java.util.*;

/**
 *
 * @author sujithkaluva
 */
public class Person {
    
    public static int personCounter = 1;
    private String personId;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String emailId;
    private String gender;
    private long phoneNumber;
    private House house;
    private String password;
    Ecosystem ecoSystem = Ecosystem.getInstance();

    public Person() {
        
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person(String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber, House house, String password) {
        //this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.emailId = emailId;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.house = house;
        this.password = password;
        this.personId = "person"+this.getPersonCounter();
        personCounter++;
        ecoSystem.getPersonDirectory().addPerson(this);
        //Ecosystem.personDirectory.addPerson(this);
        //eco.getPersonDirectory().addPerson(this);
        
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public String getPersonId() {
        return personId;
    }

    public static int getPersonCounter() {
        return personCounter;
    }

    public void setPersonId() {
        this.personId = "person"+this.getPersonCounter();
        personCounter++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}
