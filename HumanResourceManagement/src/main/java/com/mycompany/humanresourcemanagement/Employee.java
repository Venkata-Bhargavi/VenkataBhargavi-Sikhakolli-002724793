/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.humanresourcemanagement;

import java.io.*;
/**
 *
 * @author bhargavi
 */
public class Employee {
    private String employeeID;
    private String name;
    private int age;
    private String gender;
    private int phone;
//    private photo;
    private JobDetails jobDetails;

    // creating a constructor
    public Employee(String employeeID, String name, int age, String gender, int phone, JobDetails jobDetails) {
        this.employeeID = employeeID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.jobDetails = jobDetails;
    }

    // getter and setters
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public JobDetails getJobDetails() {
        return jobDetails;
    }

    public void setJobDetails(JobDetails jobDetails) {
        this.jobDetails = jobDetails;
    }
    
}
