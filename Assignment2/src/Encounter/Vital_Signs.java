/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encounter;

import Doctor.Doctors;

/**
 *
 * @author sumanayanakonda
 */
public class Vital_Signs {
    
    private int Temperature;
    private int Blood_Pressure;
    private int Weight;
    private int Height;
    private int Pulse_Rate;
    
    public Vital_Signs(int temp, int bp, int w, int h, int pr){
        
        this.Temperature = temp;
        this.Blood_Pressure = bp;
        this.Weight = w;
        this.Height = h;
        this.Pulse_Rate = pr;
        
    }

    public int getTemperature() {
        return Temperature;
    }

    public void setTemperature(int Temperature) {
        this.Temperature = Temperature;
    }

    public int getBlood_Pressure() {
        return Blood_Pressure;
    }

    public void setBlood_Pressure(int Blood_Pressure) {
        this.Blood_Pressure = Blood_Pressure;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int Weight) {
        this.Weight = Weight;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int Height) {
        this.Height = Height;
    }

    public int getPulse_Rate() {
        return Pulse_Rate;
    }

    public void setPulse_Rate(int Pulse_Rate) {
        this.Pulse_Rate = Pulse_Rate;
    }
    
    
}
