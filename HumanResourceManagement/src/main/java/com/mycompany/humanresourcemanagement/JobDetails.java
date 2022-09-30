/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.humanresourcemanagement;

/**
 *
 * @author bhargavi
 */
public class JobDetails {
    private String positionTitle;
    private String level;
//    private startDate;
    private String teamInfo;
    
    public JobDetails(String positionTitle,String level,String teamInfo){
        this.positionTitle = positionTitle;
        this.level = level;
        this.teamInfo = teamInfo;
    }

    public boolean equals(JobDetails jobDetails){
        return (this.level.equals(jobDetails.level) && 
                this.positionTitle.equals(jobDetails.positionTitle) && 
                this.teamInfo.equals(jobDetails.teamInfo));
    }
    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getTeamInfo() {
        return teamInfo;
    }

    public void setTeamInfo(String teamInfo) {
        this.teamInfo = teamInfo;
    }
    
}
