package eban;

import java.util.ArrayList;
import java.util.List;

public class ArrayPatient {
    private List<Patient> arr;

    ArrayPatient(){
        arr = new ArrayList<>();
    }

    public ArrayPatient(List<Patient> arr) {
        this.arr = arr;
    }

    public ArrayPatient(ArrayPatient arrayPatient){ this.arr = arrayPatient.arr; }

    public ArrayPatient findByDiagnosis(String diagnosis){
        List<Patient> newArr = new ArrayList<>();
        for (Patient j : arr)
            if (j.getDiagnosis().contains(diagnosis)) newArr.add(j);

        return new ArrayPatient(newArr);
    }
    public ArrayPatient findByMedCard(final int fNumMedCard, int sNumMedCard){

        List<Patient> newArr = new ArrayList<>();
        for (Patient a : arr)
            if (a.getMedCardNum() > fNumMedCard &&
                    a.getMedCardNum() < sNumMedCard) newArr.add(a);

        return new ArrayPatient(newArr);
    }

    public void showPatient(){
        for (Patient j:
             arr) {
            System.out.println(j.toString());
        }
    }

}
