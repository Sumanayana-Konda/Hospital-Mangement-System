/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;

/**
 *
 * @author sumanayanakonda
 */
public class EmployeeHistory {
 
    private ArrayList<ProductDetails> historyArrayList;
    
    
    
    public EmployeeHistory(){
        this.historyArrayList = new ArrayList<ProductDetails>();
        
    }

    public ArrayList<ProductDetails> getHistoryArrayList() {
        return historyArrayList;
    }

    public void setHistoryArrayList(ArrayList<ProductDetails> historyArrayList) {
        this.historyArrayList = historyArrayList;
    }
    public ProductDetails addNewEmployee(ProductDetails productdetails){
       // ProductDetails newEmployee = new ProductDetails();
        historyArrayList.add(productdetails);
        return productdetails;
    }
    public int sizeArraylist(){
        return historyArrayList.size();
    }
    
    public void eraseElement(int i){
        historyArrayList.remove(i);
        
    }
    
}
