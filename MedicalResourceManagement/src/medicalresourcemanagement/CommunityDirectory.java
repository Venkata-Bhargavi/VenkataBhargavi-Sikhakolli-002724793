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
public class CommunityDirectory {
        private ArrayList<Community> communityHistory; // declaration

    public ArrayList<Community> getCommunityHistory() {
        return communityHistory;
    }

    public void setCommunityHistory(ArrayList<Community> communityHistory) {
        this.communityHistory = communityHistory;
    }
    
    public CommunityDirectory(){
        this.communityHistory = new ArrayList<Community>();
    }
    
    
       public Community addNewCommunity(){
        Community d = new Community(); // object p stores the  address of  a new object of a class
        communityHistory.add(d);  // stores the address ref into array list
        return d; // returns address 
    }
    public void deleteCommunity(Community d){
    communityHistory.remove(d);
}
        
        

}
