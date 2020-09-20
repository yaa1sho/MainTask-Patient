package eban;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
    public ArrayPatient getPatientsWithMedCardInRange(final int from, final int before){

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayPatient that = (ArrayPatient) o;
        return Objects.equals(patients, that.patients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patients);
    }
}
