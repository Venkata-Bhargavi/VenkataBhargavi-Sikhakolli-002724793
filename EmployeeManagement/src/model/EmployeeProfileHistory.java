/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author bhargavi
 */
public class EmployeeProfileHistory {
    
    private ArrayList<EmployeeProfile> profileHistory;
    
    public EmployeeProfileHistory(){
        this.profileHistory = new ArrayList<EmployeeProfile>();
    }

    public ArrayList<EmployeeProfile> getProfileHistory() {
        return profileHistory;
    }

    public void setProfileHistory(ArrayList<EmployeeProfile> profileHistory) {
        this.profileHistory = profileHistory;
    }
    
    /**
     * named addNewProfile
     * creates empty "newProfile"
     * 
     * @return 
     */
    public EmployeeProfile addNewProfile(){
        
        EmployeeProfile newProfile = new EmployeeProfile();
        profileHistory.add(newProfile);
        return newProfile;
    }
}
