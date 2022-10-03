/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemodel;

import java.util.ArrayList;

/**
 *
 * @author Venkata Bhargavi
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

    /**
     * deletes a selected profile from ArrayList of employee profiles.
     * return : nothing
     * @param selectedEntry 
     */
    public void deleteProfile(EmployeeProfile ep) {
        
        profileHistory.remove(ep); 
    }
}
