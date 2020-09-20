package eban;

import java.util.Objects;

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
        return  surname + " " +
                name + " " +
                patronymic + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(surname, person.surname) &&
                Objects.equals(name, person.name) &&
                Objects.equals(patronymic, person.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, patronymic);
    }
}
