/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalresourcemanagement;

/**
 *
 * @author bhargavi
 */
public class Doctor{
     private int DoctorId;
    private static int count = 0;

    public int getDoctorId() {
        return DoctorId;
    }

    public void setDoctorId(int DoctorId) {
        this.DoctorId = DoctorId;
    }

    
    
    public Doctor()  // this happens along with intializing 
    {
        this.DoctorId = count;
        count++;
    }
    
}
