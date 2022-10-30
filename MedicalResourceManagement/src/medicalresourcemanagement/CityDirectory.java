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
public class CityDirectory {
    
    ArrayList<City> cityHistory ;
    
    public CityDirectory(){
        this.cityHistory = new ArrayList<City>();

    }

    public ArrayList<City> getCitylist() {
        return cityHistory;
    }

    public void setCitylist(ArrayList<City> citylist) {
        this.cityHistory = citylist;
    }
    
    
    public void addNewCity(String cityName){
        City newCity = new City();
        newCity.setCityName(cityName);
        cityHistory.add(newCity);
//        return newCity;
        
    } 
      
    
    
    public City searchCity(String cityName){
        for(City city: cityHistory){
            if(city.getCityName().equals(cityName)){
                return city;
            }
        }
        return null;
    }
    
    public boolean isCityExist(String cityName){
        for(City city: cityHistory){
            if(city.getCityName().equals(cityName)){
                return true;
            }
        }
        return false;
    }

    
}
