package eban;

public class Person {

    protected String surname;
    protected String name;
    protected String patronymic;

    public Person()
    {
        surname = null;
        name = null;
        patronymic = null;
    }

    public Person(String surname, String name, String patronymic)
    {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return "Person{" + "\n" +
                "surname = " + surname + "\n" +
                ", name = " + name + "\n" +
                ", patronymic = " + patronymic + "\n" +
                '}';
    }
}
