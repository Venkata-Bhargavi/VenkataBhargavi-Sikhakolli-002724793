/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalresourcemanagement;

import java.util.ArrayList;

/**
 *
 * @author Krishnakanth Naik Jarapala
 */
public class Patient  extends Person{
    int patientID;
    private static int count = 1;
    String username;
    String password;
    String city;
    String community;
    
    ArrayList<Encounter> encounterlist;
    
    public Patient(){
        this.patientID = count;
        this.encounterlist = new ArrayList<Encounter>();
        count++;
    }

    public ArrayList<Encounter> getEncounterlist() {
        return encounterlist;
    }

    public void setEncounterlist(ArrayList<Encounter> encounterlist) {
        this.encounterlist = encounterlist;
    }

    public Encounter addNewEncounter(){
        Encounter enc = new Encounter();
        encounterlist.add(enc);
        return enc;
    }
    
    public void deleteEncounter(Encounter h){
        encounterlist.remove(h);
    }
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }
    
    

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
