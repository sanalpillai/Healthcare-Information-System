/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sanal
 */
public class ProductPatient {
    
    private String patientid;
    private String primarydoctor;
    private String lastvisit;
    private String nextappointment;
    private String allergies;
    private String onmedication;
    private String insurancecoverage;

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getPrimarydoctor() {
        return primarydoctor;
    }

    public void setPrimarydoctor(String primarydoctor) {
        this.primarydoctor = primarydoctor;
    }

    public String getLastvisit() {
        return lastvisit;
    }

    public void setLastvisit(String lastvisit) {
        this.lastvisit = lastvisit;
    }

    public String getNextappointment() {
        return nextappointment;
    }

    public void setNextappointment(String nextappointment) {
        this.nextappointment = nextappointment;
    }

   public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getOnmedication() {
        return onmedication;
    }

    public void setOnmedication(String onmedication) {
        this.onmedication = onmedication;
    }

    public String getInsurancecoverage() {
        return insurancecoverage;
    }

    public void setInsurancecoverage(String insurancecoverage) {
        this.insurancecoverage = insurancecoverage;
    }
    
    
}