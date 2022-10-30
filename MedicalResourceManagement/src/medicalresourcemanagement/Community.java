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
public class Community{
    
    String communityName;
    ArrayList<House> houselist;

    public Community() {
        this.houselist = new ArrayList<House>();
    }
    
    public ArrayList<House> getHouselist() {
        return houselist;
    }

    public void setHouselist(ArrayList<House> houselist) {
        this.houselist = houselist;
    }
       
    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String CommunityName) {
        this.communityName = CommunityName;
    }
    
    public void addNewHouse(String ha){
        House newHA = new House();
        newHA.setHouseAddress(ha);
        houselist.add(newHA);
    }
    
    
    public boolean isHouseExist(String ha){
        for(House hadd: houselist){
            if(hadd.getHouseAddress().equals(ha)){
                return true;
            }
        }
        return false;
    }
 
}
