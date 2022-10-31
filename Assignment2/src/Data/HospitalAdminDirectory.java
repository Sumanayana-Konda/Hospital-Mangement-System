/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.HashMap;

/**
 *
 * @author sumanayanakonda
 */
public class HospitalAdminDirectory {
     private static HashMap<String,String> passwordManager;

    public HospitalAdminDirectory() {
        passwordManager = new HashMap<String,String>();
     //   passwordManager.put("sysadmin", "sysadmin");
    }

    public HashMap<String, String> getPasswordManager() {
        return passwordManager;
    }

    public void setPasswordManager(HashMap<String, String> passwordManager) {
        this.passwordManager = passwordManager;
    }
    public HashMap<String, String> addPasswordManager(String a, String b) {
         passwordManager.put(b, a);
         return passwordManager;
    }
}
