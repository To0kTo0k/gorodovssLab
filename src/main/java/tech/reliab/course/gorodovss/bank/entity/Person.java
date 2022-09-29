package tech.reliab.course.gorodovss.bank.entity;

/** Содержит информацию о человеке и выводит:
 * имя
 * отчество
 * фамилию
 * **/
public class Person extends Date {
    private String firstName;
    private String secondName;
    private String surname;
    /** Конструкторы **/
    public Person(String firstName, String secondName, String surname, int day, int month, int year){
        super(day, month, year);
        setFirstName(firstName);
        setSecondName(secondName);
        setSurname(surname);
    }
    /** Сеттеры **/
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setSecondName(String secondName){
        this.secondName = secondName;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    /** Геттеры **/
    public String getFirstName(){
        return this.firstName;
    }
    public String getSecondName(){
        return this.secondName;
    }
    public String getSurname(){
        return this.surname;
    }
    /** Вывод основных данных об объекте класса в консоль **/
    public void fullName(){
        System.out.printf("%s %s %s \n", getFirstName(), getSecondName(), getSurname());
    }
}
