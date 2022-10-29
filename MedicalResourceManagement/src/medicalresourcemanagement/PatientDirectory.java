/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalresourcemanagement;

import java.util.ArrayList;

/**
 *
 * @author bhargavi
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientHistory; // declaration
    
    
    public PatientDirectory(){
        this.patientHistory = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientHistory() {
        return patientHistory;
    }

    public void setPatientHistory(ArrayList<Patient> personHistory) {
        this.patientHistory = personHistory;
    }
    
    public Patient addNewPatient(){
        Patient p = new Patient(); // object p stores the  address of  a new object of a class
        patientHistory.add(p);  // stores the address ref into array list
        return p; // returns address 
    }
    public void deletePatient(Person p){
    patientHistory.remove(p);
}
    
    public Patient searchPatient(int patientid)
    {
        for (Patient encounterPatient : patientHistory)
        {
            if (encounterPatient.getPatientId() == patientid)
            {
                return encounterPatient;
            }
        }
        return null;
    }
    
   
    
    
    
    
    
    
}
