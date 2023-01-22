/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalresourcemanagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Krishnakanth Naik Jarapala
 */
public class PatientDirectory {
    private ArrayList<Patient> patientlist;
    HashMap<String, String> patCredentialsMap; 
    Set<String> unique_communities = new HashSet<String>();

    public PatientDirectory(){
        this.patientlist = new ArrayList<Patient>();
        this.patCredentialsMap = new HashMap();
    }
    
    public Patient addNewEmployee(){
        Patient newEmployee = new Patient();
        patientlist.add(newEmployee);
        return newEmployee;    
    }

    public void deletePatient(Patient ei) {
        patientlist.remove(ei);
    }

    public ArrayList<Patient> getPatientlist() {
        return patientlist;
    }

    public void setPatientlist(ArrayList<Patient> patientlist) {
        this.patientlist = patientlist;
    }

    
    
    
    public Patient searchPatientId(int patientid) 
    {
        for (Patient encounterPatient : patientlist) 
        {
            if (encounterPatient.getPatientID() == patientid) 
            {
                return encounterPatient;
            }
        }
        return null;
    }
    
   
    
//    public HashMap<String, String> fetchPatientCredantials(){
//        
//        for (Patient patient : patientlist) 
//        {
//            credentialsMap.put(patient.getUsername(), patient.getPassword());
//        }
//        return credentialsMap;
//    }
    
    public boolean isUserNameExist(String username){
        for (Patient patient : patientlist) 
        {
            if(patient.getUsername() == username || patient.getUsername().equals(username)){
                return true;
            }
        }
        return false;
    }
    
    public Set fetchUniqueCommunities(){

        for(Patient patient: patientlist){
//                unique_communities.add(patient.getCommunityName());
        }
        return unique_communities;
    }
    
    public HashMap<String, String> getPatientCredentails(){
        patCredentialsMap.put("", "");
        for(Patient pat: patientlist){
            patCredentialsMap.put(pat.getUsername(), pat.getPassword());
        }
        return patCredentialsMap;
    }
                                                                                                                                                                                                                                                                    
}
