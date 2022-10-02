/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sumanayanakonda
 */
public class ProductDetails {
 
    private String Name;
    private String Employee_ID;
    private int Age;
    private String Gender;
   private String Start_Date;
    private String Level;
    private String Team_info;
    private String Position_Title;
    private String Phone_Number;
    private String Email;
    private byte[] Photo;

    public byte[] getPhoto() {
        return Photo;
    }

    public void setPhoto(byte[] Photo) {
        this.Photo = Photo;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmployee_ID() {
        return Employee_ID;
    }

    public void setEmployee_ID(String Employee_ID) {
        this.Employee_ID = Employee_ID;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

   public String getStart_Date() {
        return Start_Date;
    }

    public void setStart_Date(String Start_Date) {
        this.Start_Date = Start_Date;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }

    public String getTeam_info() {
        return Team_info;
    }

    public void setTeam_info(String Team_info) {
        this.Team_info = Team_info;
    }

    public String getPosition_Title() {
        return Position_Title;
    }

    public void setPosition_Title(String Position_Title) {
        this.Position_Title = Position_Title;
    }

    public String getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(String Phone_Number) {
        this.Phone_Number = Phone_Number;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
}
