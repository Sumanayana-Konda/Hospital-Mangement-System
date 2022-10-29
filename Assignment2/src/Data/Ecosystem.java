/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Model.City;
import Model.Community;
import java.util.*;

/**
 *
 * @author sujithkaluva
 */
public class Ecosystem {
    
    public static Ecosystem business;
    private PersonDirectory personDirectory;
    private PatientDirectory patientDirectory;
    private EncounterHistory encounterHistory;
    private DoctorDirectory doctorDirectory;
    private SystemAdminDirectory systemAdminDirectory;
    private ArrayList<City> cityList;    
    private ArrayList<Community> communityList;
    private ArrayList<String> cityListComboBox;
    private ArrayList<String> communityListComboBox;


    public Ecosystem(){
        personDirectory = new PersonDirectory();
        patientDirectory = new PatientDirectory();
        encounterHistory = new EncounterHistory();
        doctorDirectory = new DoctorDirectory();
        systemAdminDirectory = new SystemAdminDirectory();
        cityList = new ArrayList<City>();        
        communityList = new ArrayList<Community>();
        cityListComboBox = new ArrayList<String>();        
        communityListComboBox = new ArrayList<String>();
    }

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public ArrayList<String> getCommunityListComboBox() {
        return communityListComboBox;
    }
    
    public void addCommunity(Community commObj){
        this.communityList.add(commObj);
        this.communityListComboBox.add(commObj.getCommunity());
    }
    
    public void deleteCommunity(String commName){
        for(Community cObj:this.communityList){
            if(cObj.getCommunity().equals(commName)){
                this.communityList.remove(cObj);
                break;
            }
        }
        for(String comm:communityListComboBox){
            if(comm.equals(commName)){
                communityListComboBox.remove(comm);
                break;
            }
        }
    }

    public ArrayList<String> getCityListComboBox() {
        return cityListComboBox;
    }

    public ArrayList<City> getCityList() {
        return cityList;
    }

    public void addCity(City city) {
        this.cityList.add(city);
        this.cityListComboBox.add(city.getCity());
    }
    
    public void removeCity(String cityName){
        for(City c:cityList){
            if(c.getCity().equals(cityName)){
                cityList.remove(c);
                break;
            }
        }
        for(String c : cityListComboBox) {
            if (c.equals(cityName)) {
                cityListComboBox.remove(c);
                break;
            }
        }
    }

    public SystemAdminDirectory getSystemAdminDirectory() {
        return systemAdminDirectory;
    }

    public void setSystemAdminDirectory(SystemAdminDirectory systemAdminDirectory) {
        this.systemAdminDirectory = systemAdminDirectory;
    }
    
    public static Ecosystem getInstance() {
        if (business == null) {
            business = new Ecosystem();
        }
        return business;
    }
    
    public static Ecosystem getBusiness() {
        return business;
    }

    public static void setBusiness(Ecosystem business) {
        Ecosystem.business = business;
    }
    
    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
    
    
    
}
