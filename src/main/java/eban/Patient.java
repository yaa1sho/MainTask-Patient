package eban;

import java.util.HashSet;

public class Patient extends Person{

    private int id;
    private String address;
    private String phoneNumber;
    private int medCardNum;
    private HashSet<String> diagnosis;

    public Patient(){

        super();
        id = 0;
        address = null;
        phoneNumber = null;
        medCardNum = 0;
        diagnosis = new HashSet<String>();
    }

    public Patient(String surname, String name, String patronymic, int id,
                   String address, String phoneNumber, int medCardNum, HashSet<String> diagnosis) {
        super(surname, name, patronymic);
        this.id = id;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.medCardNum = medCardNum;
        this.diagnosis = (HashSet<String>)diagnosis.clone();
    }

    public int getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public int getMedCardNum() {
        return medCardNum;
    }

    public HashSet<String> getDiagnosis() {
        return diagnosis;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setMedCardNum(int medCardNum) {
        this.medCardNum = medCardNum;
    }

    public void setDiagnosis(HashSet<String> diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        String res = "Patient{" + "\n" +
                surname + " " + name + " " + patronymic  +  " \n" +
                "id = " + id + "\n" +
                "address = " + address + "\n" +
                "phoneNumber = " + phoneNumber + "\n" +
                "medCardNum = " + medCardNum + "\n" +
                "diagnosis = { " + "\n";
        for(String j: diagnosis) res += " " + j + ",\n";

        res += " }\n}";
        return res;
    }

    public void addDiagnosis(String diagnosis){
        this.diagnosis.add(diagnosis);
    }

}
