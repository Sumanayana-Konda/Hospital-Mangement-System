/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Model.City;
import Model.Community;
import Model.Doctor;
import Model.Encounter;
import Model.Hospital;
import Model.House;
import Model.Patient;
import Model.Person;
import Model.VitalSigns;
import java.util.*;
import java.util.Date;

/**
 *
 * @author sumanayana
 */
public class Ecosystem {
    
    public static Ecosystem system;
    private PersonDirectory personDirectory;
    private PatientDirectory patientDirectory;
    private EncounterHistory encounterHistory;
    private HospitalHistory hospitalhistory;
    private DoctorDirectory doctorDirectory;
    private SystemAdminDirectory systemAdminDirectory;
    private HospitalAdminDirectory hospitaladmindirectory;
    private CommunityAdminDirectory communityadmindirectory;
    private ArrayList<City> cityList;    
    private ArrayList<Community> communityList;
    private ArrayList<String> cityListComboBox;
    private ArrayList<String> communityListComboBox;


    public Ecosystem(){
        personDirectory = new PersonDirectory();
        patientDirectory = new PatientDirectory();
        encounterHistory = new EncounterHistory();
        doctorDirectory = new DoctorDirectory();
        hospitalhistory = new HospitalHistory();
        systemAdminDirectory = new SystemAdminDirectory();
        hospitaladmindirectory = new HospitalAdminDirectory();
        communityadmindirectory = new CommunityAdminDirectory();
        cityList = new ArrayList<City>();        
        communityList = new ArrayList<Community>();
        cityListComboBox = new ArrayList<String>();        
        communityListComboBox = new ArrayList<String>();
        Configure();
    }
public void Configure(){

City city1 = new City("Boston");
        City city2 = new City("New York");
        this.cityList.add(city1);
        this.cityListComboBox.add(city1.getCity());
        this.cityList.add(city2);
        this.cityListComboBox.add(city2.getCity());
        
        Community community1 = new Community();
        community1.setCity(city1);
        community1.setCommunity("Roxbury");
        Community community2 = new Community();
        community2.setCity(city1);
        community2.setCommunity("Jamaica Plain");
        Community community3 = new Community();
        community3.setCity(city2);
        community3.setCommunity("Worchester");
        Community community4 = new Community();
        community4.setCity(city2);
        community4.setCommunity("Times Square");
        this.addCommunity(community1);
        this.addCommunity(community2);
        this.addCommunity(community3);
        this.addCommunity(community4);
        this.getCommunityListComboBox().add(community1.getCommunity());
        this.getCommunityListComboBox().add(community2.getCommunity());
        this.getCommunityListComboBox().add(community3.getCommunity());
        this.getCommunityListComboBox().add(community4.getCommunity());
        
        Hospital hosp1 = new Hospital();
        hosp1.setHospitalName("Roxbury Public Hospital");
        hosp1.setPhoneNumber(9876543210l);
        hosp1.setCity(city1);
        hosp1.setCommunity(community1);
        hosp1.setAddress("Day Street, 1");
        this.hospitalhistory.getHospitalList().add(hosp1);
        //this.hospitalListComboBox.add(hosp1.getHospitalName());
        
        Hospital hosp2 = new Hospital();
        hosp2.setHospitalName("Northeastern Hospital");
        hosp2.setPhoneNumber(9876543211l);
        hosp2.setCity(city1);
        hosp2.setCommunity(community1);
        hosp2.setAddress("John Street, 1");
        this.hospitalhistory.getHospitalList().add(hosp2);
       // this.hospitalListComboBox.add(hosp2.getHospitalName());
        
        Hospital hosp3 = new Hospital();
        hosp3.setHospitalName("JP Hospital");
        hosp3.setPhoneNumber(9876543212l);
        hosp3.setCity(city1);
        hosp3.setCommunity(community2);
        hosp3.setAddress("Mike Street, 1");
        this.hospitalhistory.getHospitalList().add(hosp3);
        //this.hospitalListComboBox.add(hosp3.getHospitalName());
        
        Hospital hosp4 = new Hospital();
        hosp4.setHospitalName("George Hospital");
        hosp4.setPhoneNumber(9876543213l);
        hosp4.setCity(city2);
        hosp4.setCommunity(community3);
        hosp4.setAddress("Ray Street, 1");
        this.hospitalhistory.getHospitalList().add(hosp4);
        //this.hospitalListComboBox.add(hosp4.getHospitalName());
        
        
        House house1 = new House();
        house1.setAddressLine1("75 saint alphonsus");
        house1.setAddressLine2("307");
        house1.setState("MA");
        house1.setCity(city1);
        house1.setZipCode(02120);
        house1.setCommunity(community1);
        
        House house2 = new House();
        house2.setAddressLine1("95 saint peters");
        house2.setAddressLine2("300");
        house2.setState("MA");
        house2.setCity(city1);
        house2.setZipCode(02120);
        house2.setCommunity(community2);
        
        Date dateVal = new Date();
        
//       Patient pat = new Patient("Harshini", "Konda", dateVal, "harshini@gmail.com", "Female", 9876543211l, house1, "harshini");
//        Patient pat1 = new Patient("Vihas", "Rathna", dateVal, "vihas@gmail.com", "Male", 9111111111l, house2, "vihas");
//        patientDirectory.addPatient(pat1);
//        patientDirectory.addPatient(pat);
//        
//        Doctor s = new Doctor("Cardiologist", "MBBS", 15, hosp1, "Jonathan", "Smith", dateVal, "jonathan@gmail.com", "Male", 4444444444l, house1, "Jonathan");
//        Doctor s1 = new Doctor("Neurologist", "MBBS", 10, hosp2, "Taylor", "Swift", dateVal, "taylor@gmail.com", "Female", 1345678902l, house2, "Taylor");
//        doctorDirectory.getDoctorList().add(s);
//        doctorDirectory.getDoctorList().add(s1);

}

    public HospitalAdminDirectory getHospitaladmindirectory() {
        return hospitaladmindirectory;
    }

    public void setHospitaladmindirectory(HospitalAdminDirectory hospitaladmindirectory) {
        this.hospitaladmindirectory = hospitaladmindirectory;
    }

    public CommunityAdminDirectory getCommunityadmindirectory() {
        return communityadmindirectory;
    }

    public void setCommunityadmindirectory(CommunityAdminDirectory communityadmindirectory) {
        this.communityadmindirectory = communityadmindirectory;
    }

    public HospitalHistory getHospitalhistory() {
        return hospitalhistory;
    }

    public void setHospitalhistory(HospitalHistory hospitalhistory) {
        this.hospitalhistory = hospitalhistory;
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
        if (system == null) {
            system = new Ecosystem();
            City city1 = new City("Boston");
            City city2 = new City("New York");

            Community community1 = new Community();
            community1.setCity(city1);
            community1.setCommunity("Roxbury");
            Community community2 = new Community();
            community2.setCity(city1);
            community2.setCommunity("Jamaica Plain");
        Community community3 = new Community();
        community3.setCity(city2);
        community3.setCommunity("Worchester");
        Community community4 = new Community();
        community4.setCity(city2);
        community4.setCommunity("Times Square");
            Hospital hosp1 = new Hospital();
            hosp1.setHospitalName("Roxbury Public Hospital");
            hosp1.setPhoneNumber(9876543210l);
            hosp1.setCity(city1);
            hosp1.setCommunity(community1);
            hosp1.setAddress("Day Street, 1");

            Hospital hosp2 = new Hospital();
            hosp2.setHospitalName("Northeastern Hospital");
            hosp2.setPhoneNumber(9876543211l);
            hosp2.setCity(city1);
            hosp2.setCommunity(community2);
            hosp2.setAddress("John Street, 1");

            Hospital hosp3 = new Hospital();
        hosp3.setHospitalName("JP Hospital");
        hosp3.setPhoneNumber(9876543212l);
        hosp3.setCity(city1);
        hosp3.setCommunity(community3);
        hosp3.setAddress("Mike Street, 1");
       // this.hospitalhistory.getHospitalList().add(hosp3);
        //this.hospitalListComboBox.add(hosp3.getHospitalName());
        
        Hospital hosp4 = new Hospital();
        hosp4.setHospitalName("George Hospital");
        hosp4.setPhoneNumber(9876543213l);
        hosp4.setCity(city2);
        hosp4.setCommunity(community4);
        hosp4.setAddress("Ray Street, 1");
       // this.hospitalhistory.getHospitalList().add(hosp4);
        
            House house1 = new House();
            house1.setAddressLine1("75 saint alphonsus");
            house1.setAddressLine2("307");
            house1.setState("MA");
            house1.setCity(city1);
            house1.setZipCode(02120);
            house1.setCommunity(community1);

            House house2 = new House();
            house2.setAddressLine1("95 saint peters");
            house2.setAddressLine2("300");
            house2.setState("MA");
            house2.setCity(city1);
            house2.setZipCode(02120);
            house2.setCommunity(community2);

            Date dateVal = new Date();
            Person person = new Person("Sujith", "Kaluva", dateVal, "community@gmail.com", "Male", 9898989898l, house1, "community" );
           // system.personDirectory.addPerson(person);
            Person person1 = new Person("Sreeja", "Vangoori", dateVal, "hospital@gmail.com", "Female", 1234567890l, house2, "hospital");
           // system.personDirectory.addPerson(person1);
            system.communityadmindirectory.addPasswordManager("community@gmail.com", "community");
            system.hospitaladmindirectory.addPasswordManager("hospital@gmail.com", "hospital");

//            Person p = new Person("Taylor", "Swift", dateVal, "taylor@gmail.com", "Female", 1345678902l, house1, "Taylor");
//            Person p1 = new Person("Jonathan", "Smith", dateVal, "jonathan@gmail.com", "Male", 4444444444l, house1, "Jonathan");
//            Person p2 = new Person("Harshini", "Konda", dateVal, "harshini@gmail.com", "Female", 0000000000l, house2, "Harshini");
//            Person p3 = new Person("Vihas", "Rathna", dateVal, "vihas@gmail.com", "Male", 1111111111l, house2, "Vihas");
//            business.personDirectory.addPerson(p);
//            business.personDirectory.addPerson(p1);
//            business.personDirectory.addPerson(p2);
//            business.personDirectory.addPerson(p3);

            Patient pat = new Patient("Harshini", "Konda", dateVal, "harshini@gmail.com", "Female", 9876543211l, house1, "harshini");
            Patient pat1 = new Patient("Vihas", "Rathna", dateVal, "vihas@gmail.com", "Male", 9111111111l, house2, "vihas");


            Doctor s = new Doctor("Cardiologist", "MBBS", 15, hosp1, "Jonathan", "Smith", dateVal, "jonathan@gmail.com", "Male", 4444444444l, house1, "Jonathan");
            Doctor s1 = new Doctor("Neurologist", "MBBS", 10, hosp2, "Taylor", "Swift", dateVal, "taylor@gmail.com", "Female", 1345678902l, house2, "Taylor");
            Doctor s3 = new Doctor("Pediatrician", "MBBS", 10, hosp3, "Carl", "Jaden", dateVal, "carl@gmail.com", "Male", 1345678902l, house1, "Carl");
            Doctor s4 = new Doctor("Orthopedician", "MBBS", 10, hosp4, "JungKook", "Jeon", dateVal, "jungkook@gmail.com", "Male", 1345678902l, house2, "Jungkook");
            
            system.doctorDirectory.addDoctor(s);
            system.doctorDirectory.addDoctor(s1);
            system.doctorDirectory.addDoctor(s3);
            system.doctorDirectory.addDoctor(s4);
            VitalSigns vt = new VitalSigns(190, 180, 300, 200, 100, 230, 430);
            VitalSigns vr = new VitalSigns(180, 340, 530, 259, 78, 90, 123);
            Encounter en = new Encounter("1",dateVal, "Heart Attack", pat, vt, s);
            Encounter en1 = new Encounter("2",dateVal, "Amnesia", pat1, vr, s1);
            system.encounterHistory.addEncounter(en1);
            system.encounterHistory.addEncounter(en);
        }
        return system;
    }

    public static Ecosystem getSystem() {
        return system;
    }

    public static void setSystem(Ecosystem system) {
        Ecosystem.system = system;
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
