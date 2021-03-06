package com.example.medicationbox;

public class Perscription {
    private String doctorName;
    private String patientName;
    private int patientAge;
    private String doctorAddress;
    private String patientAddress;
    private String medName;
    private int refill;
    private String dose;
    private String quantity;

    public Perscription(String doctorName, String patientName, int patientAge,
                        String doctorAddress, String patientAddress, String medName, int refill,
                        String dose, String quantity) {
        this.doctorName = doctorName;
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.doctorAddress = doctorAddress;
        this.patientAddress = patientAddress;
        this.medName = medName;
        this.refill = refill;
        this.dose = dose;
        this.quantity = quantity;
    }

    public Perscription(String prescriptionText) {
        this.doctorName = prescriptionText;
        this.patientName = "";
        this.patientAge = 0;
        this.doctorAddress = "";
        this.patientAddress = "";
        this.medName = "";
        this.refill = 0;
        this.dose = "";
        this.quantity = "";
    }

    public String getQuantity() { return quantity; }

    public void setQuantity(String quantity) { this.quantity = quantity; }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public void setDoctorAddress(String doctorAddress) {
        this.doctorAddress = doctorAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public void setRefill(int refill) {
        this.refill = refill;
    }

    public void setDose(String dose) { this.dose = dose; }

    public String getDoctorName() {
        return doctorName;
    }

    public String getPatientName() {
        return patientName;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public String getDoctorAddress() {
        return doctorAddress;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public String getMedName() {
        return medName;
    }

    public int getRefill() {
        return refill;
    }

    public String getDose() { return dose; }
}
