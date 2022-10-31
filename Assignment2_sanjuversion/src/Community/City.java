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
public class City {
    
    private String cityName;
    private ArrayList<Community> comm;

    public ArrayList<Community> getComm() {
        return comm;
    }

    public void setComm(ArrayList<Community> comm) {
        this.comm = comm;
    }
    
    public City(String c ){
        cityName = c;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    
}
