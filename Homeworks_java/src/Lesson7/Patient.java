package Lesson7;

public class Patient {


    private Doctors doctor;
    private int treatmentPlan;

    public Patient(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public Doctors getDoctor() {
        return doctor;
    }

    public Patient(Doctors doctor) {
        this.doctor = doctor;
    }

    public void setDoctor(Doctors doctor) {
        this.doctor = doctor;
    }

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }


}
