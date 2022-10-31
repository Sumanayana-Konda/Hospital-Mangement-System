package Ecosystem;
import Community.City;
import Community.Community;
import Community.House;
import Doctor.Doctors;
import Encounter.Encounter;
import Encounter.Encounter_History;
import Encounter.Vital_Signs;
import Hospital.Hospital;
import Patient.Patients;
import Person.Person;
import java.util.ArrayList;
import java.util.Date;
import Patient.PatientHistory;

/**
 *
 * @author sumanayanakonda
 */
public class ConfigureASystem {
    
    public static Ecosystem configure(){
        
        Ecosystem system = Ecosystem.getInstance();
        Community com = new Community("Roxbury");
        Community com1 = new Community("Jamaica Plain");
        Date d = new Date(01,02,1990);
        Date d1 = new Date(01,02,1993);
        Date d2 = new Date(01,10,2010);
        City city = new City("Boston");
        Date d3  = new Date(10,10,2013);
        House h = new House("75 saint alphonsus", "307", "MA", com, city, 02120);
        House h1 = new House("95 saint peters", "300", "MA", com1, city, 02120);
        Person p = new Person("Taylor", "Taylor","Doctor", "Dr Taylor", h, "Female",d, 1, "2222222222");
        Person p1 = new Person("Swift", "Swift","Doctor", "Dr Swift", h1, "Male",d1, 2, "4444444444");
        Person p2 = new Person("Harshini", "Harshini","Patient", "Harshini Konda", h, "Female", d2, 3, "0000000000");
        Person p3 = new Person("Vihas", "Vihas","Patient", "Vihas Rathna", h1, "Male", d3, 4, "1111111111");
        Hospital hn=new Hospital("Boston Hospital", com);
        Hospital hn1 = new Hospital("Jamaica Hospital", com1);
        PatientHistory pa = new PatientHistory();
        PatientHistory pa1 = new PatientHistory();
        Vital_Signs vt = new Vital_Signs(108, 100, 50, 180, 84);
        Patients pat = new Patients("Harshini", "Harshini", "Harshini konda", h, "Female", d2, "0000000000", 3);
        Patients pat1 = new Patients("Vihas", "Vihas", "Vihas Rathna", h1, "Male", d3,"1111111111", 4);
        pa.getPatients().add(pat);
        pa1.getPatients().add(pat1);
        Doctors s = new Doctors("Taylor", "Taylor", "Dr Taylor", h, "Female",d, 1,"2222222222" ,"Cardiologist", "MBBS", 15, pa, hn);
        Doctors s1 = new Doctors("Swift", "Swift", "Dr Swift", h1, "Male",d1, 2,"4444444444" ,"Neurologist", "MBBS", 10, pa1, hn1);
        Encounter en = new Encounter(vt, d1, "Amnesia", pat, s, "1");
        Encounter en1 = new Encounter(vt, d2, "Heart Attack", pat1, s1, "2");
        system.getDoctorhistory().addNewDoctor(s);
        system.getDoctorhistory().addNewDoctor(s1);
        system.getPersonhistory().addPerson(p);
        system.getPersonhistory().addPerson(p1);
        system.getPersonhistory().addPerson(p2);
        system.getPersonhistory().addPerson(p3);
        system.getPatienthistory().addPatients(pat1);
        system.getPatienthistory().addPatients(pat);
        system.getCommunityhistory().addNewCommunity(com);
        system.getCommunityhistory().addNewCommunity(com1);
        system.getHospitalhistory().addNewHospital(hn);
        system.getHospitalhistory().addNewHospital(hn1);
        system.getEncounterhistory().addNewEncounter(en1);
        system.getEncounterhistory().addNewEncounter(en);
        return system;
    }
    
}
