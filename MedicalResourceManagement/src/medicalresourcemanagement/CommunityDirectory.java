/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalresourcemanagement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Krishnakanth Naik Jarapala
 */
public class CommunityDirectory {
    
    ArrayList<Community> communityHistory;
    
    public CommunityDirectory(){
        this.communityHistory = new ArrayList<Community>();
    }

    public ArrayList<Community> getCommunitylist() {
        return communityHistory;
    }

    public void setCommunitylist(ArrayList<Community> communitylist) {
        this.communityHistory = communitylist;
    }
    
    public void addNewCommunity(String commName){
        Community comm = new Community();
        comm.setCommunityName(commName);
        communityHistory.add(comm);
    }
    
    public void deleteCommunity(Community h){
    communityHistory.remove(h);
    }
    
    
    public Community searchCommunity(String comm){
        for(Community com: communityHistory){
            if(com.getCommunityName().equals(comm)){
                return com;
            }
        }
        return null;
    }
    
    public boolean isCommunityExist(String comm){
        for(Community com: communityHistory){
            if(com.getCommunityName().equals(comm)){
                return true;
            }
        }
        return false;
    }
    
//    public Set fetchUniqueCommunities(){
//
//        for(Community comm: communitylist){
//            unique_communities.add(comm.getCommunityName());
//        }
//        return unique_communities;
//    }
    
}
