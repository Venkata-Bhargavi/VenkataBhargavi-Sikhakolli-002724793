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
public class PersonDirectory {
   private ArrayList<Person> personHistory; 
   public PersonDirectory(){
       this.personHistory = new ArrayList<Person>();
   }

    public ArrayList<Person> getPersonHistory() {
        return personHistory;
    }

    public void setPersonHistory(ArrayList<Person> personHistory) {
        this.personHistory = personHistory;
    }

    
    
    
    /**
     * 
     * @return 
     */
    public Person addPerson(){
        
        Person credentials = new Person();
        personHistory.add(credentials);
        return credentials;
    }
   /**
    * deletes selected credentials from array list
    * @param cred 
    */
    public void deletePerson(Person cred) {
        
        personHistory.remove(cred); 
    }
}
