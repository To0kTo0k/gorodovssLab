package tech.reliab.course.gorodovss.bank.entity;

public class Bank {
    private int id;
    private String name;
    private int officeNum = 0;
    private int atmNum = 0;
    private int empNum = 0;
    private int clientNum = 0;
    private byte bRate;
    private double cashNum;
    private float iRate;
    {
        this.bRate = (byte) (Math.random() * 100);
        this.cashNum = (int) (Math.random() * 1000000);
        this.iRate = 20 - (float) (bRate * 0.2);
    }
    public Bank(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String Name){
        this.name = name;
    }
    public void setOfficeNum(int officeNum){
        this.officeNum = officeNum;
    }
    public void setAtmNum(int atmNum){
        this.atmNum = atmNum;
    }
    public void setEmpNum(int empNum){
        this.empNum = empNum;
    }
    public void setClientNum(int clientNum){
        this.clientNum = clientNum;
    }
    public void setBRate(byte bRate){
        this.bRate = bRate;
    }
    public void setIRate(float iRate){
        this.iRate = iRate;
    }
    public void setCashNum(double cashNum){
        this.cashNum = cashNum;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getOfficeNum(){
        return this.officeNum;
    }
    public int getAtmNum(){
        return this.atmNum;
    }
    public int getEmpNum(){
        return this.empNum;
    }
    public int getClientNum(){
        return this.clientNum;
    }
    public byte getBRate(){
        return this.bRate;
    }
    public double getCashNum(){
        return this.cashNum;
    }
    public float getIRate(){
        return this.iRate;
    }

}