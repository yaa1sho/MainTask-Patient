package eban;

import java.util.ArrayList;
import java.util.List;

public class ArrayPatient {
    private List<Patient> patients;

    public ArrayPatient(List<Patient> arr) {
        this.patients = arr;
    }

    public ArrayPatient(ArrayPatient arrayPatient){ this.patients = arrayPatient.patients; }

    public ArrayPatient getPatientsWithThisDiagnosis(String diagnosis){
        List<Patient> patientsWithThisDiagnosis = new ArrayList<>();
        for (Patient j : patients)
            if (j.getDiagnosis().contains(diagnosis)) patientsWithThisDiagnosis.add(j);

        return new ArrayPatient(patientsWithThisDiagnosis);
    }
    public ArrayPatient getPatientsWithMedCardInGivenRange(final int from, final int before){

        List<Patient> patientsWithMedCardInGivenRange = new ArrayList<>();
        for (Patient a : patients)
            if (a.getMedCardNum() > from &&
                    a.getMedCardNum() < before) patientsWithMedCardInGivenRange.add(a);

        return new ArrayPatient(patientsWithMedCardInGivenRange);
    }

    public void showPatients(){
        for (Patient j:
                patients) {
            System.out.println(j.toString());
        }
    }

}
