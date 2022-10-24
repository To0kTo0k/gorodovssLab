package tech.reliab.course.gorodovss.bank.entity.common;

public class FullName {
    private String firstName;
    private String secondName;
    private String surname;
    public FullName(String firstName, String secondName, String surname) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.surname = surname;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public String getSurname() {
        return surname;
    }

    public String getFullName() {
        return "ФИО{" +
                "имя='" + firstName + '\'' +
                ", отчество='" + secondName + '\'' +
                ", фамилия='" + surname + '\'' +
                '}';
    }
}





