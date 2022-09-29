package tech.reliab.course.gorodovss.bank.entity;

/** Содержит информацию о дате и выводит:
 * день
 * месяц
 * год
 * **/
public class Date {
    int day;
    int month;
    int year;
    /** Конструкторы **/
    public Date(int day, int month, int year){
        setDay(day);
        setMonth(month);
        setYear(year);
    }
    /** Сеттеры **/
    public void setDay(int day){
        this.day = day;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setYear(int year){
        this.year = year;
    }
    /** Геттеры **/
    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }
    /** Вывод основных данных об объекте класса на экран **/
    public void fullDate(){
        System.out.printf("%d.%d.%d \n", getDay(), getMonth(), getYear());
    }
}