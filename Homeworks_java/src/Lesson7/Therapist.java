package Lesson7;

public class Therapist extends Doctors {
    @Override
    public void heal() {
        System.out.println("A therapist treats");
    }

    public void appointADoctor(Patient patient) {
        if (patient.getTreatmentPlan() == 1) {
            System.out.println("You have been assigned a surgeon");
            patient.setDoctor(new Surgeon());

            Surgeon surgeon = new Surgeon();
            surgeon.heal();
        }

        if (patient.getTreatmentPlan() == 2) {
            System.out.println("You have been assigned a dentist");
            patient.setDoctor(new Dentist());
            Dentist dentist = new Dentist();
            dentist.heal();
        }
        if (patient.getTreatmentPlan() != 1 && patient.getTreatmentPlan() != 2) {
            System.out.println("You have been assigned a therapist");
            patient.setDoctor(new Therapist());
            Therapist therapist = new Therapist();
            therapist.heal();
        }
        Doctors doctor = patient.getDoctor();

    }
}

