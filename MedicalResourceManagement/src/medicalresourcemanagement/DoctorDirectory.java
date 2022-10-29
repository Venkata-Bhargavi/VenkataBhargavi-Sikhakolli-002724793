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
public class DoctorDirectory {
    
    private ArrayList<Doctor> doctorHistory; // declaration
    
    
    public DoctorDirectory(){
        this.doctorHistory = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getDoctorHistory() {
        return doctorHistory;
    }

    public void setDoctorHistory(ArrayList<Doctor> doctorHistory) {
        this.doctorHistory = doctorHistory;
    }
    
     public Doctor addNewDoctor(){
        Doctor d = new Doctor(); // object p stores the  address of  a new object of a class
        doctorHistory.add(d);  // stores the address ref into array list
        return d; // returns address 
    }
    public void deleteDoctor(Doctor d){
    doctorHistory.remove(d);
}
}
