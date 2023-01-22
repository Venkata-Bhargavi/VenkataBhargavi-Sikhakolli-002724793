/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalresourcemanagement;

import java.time.LocalDateTime;

/**
 *
 * @author Krishnakanth Naik Jarapala
 */
public class Encounter extends VitalSigns {
    LocalDateTime encounter_time; 
    private static int count = 0;
    int encounter_id;
    String hospital_name;
    String doctor_name;
    
    public Encounter(){
            this.encounter_id = count;
            count++;
        }

    public String getHospital_name() {
        return hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        this.hospital_name = hospital_name;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }
    
    public LocalDateTime getEncounter_time() {
        return encounter_time;
    }

    public void setEncounter_time(LocalDateTime encounter_time) {
        this.encounter_time = encounter_time;
    }

    public int getEncounter_id() {
        return encounter_id;
    }

    public void setEncounter_id(int encounter_id) {
        this.encounter_id = encounter_id;
    }


   
    
}
