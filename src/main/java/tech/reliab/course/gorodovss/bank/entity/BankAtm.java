package tech.reliab.course.gorodovss.bank.entity;

public class BankAtm {
    private int id;
    private String name;
    private int isWork;
    private String position;
    private Employee serviceEmp;
    private boolean isMoneyGive;
    private boolean isMoneyGet;
    private double serviceCost;
    private BankOffice office;
    public BankAtm(int id, String name, BankOffice office, int isWork, String position, Employee serviceEmp, boolean isMoneyGive, boolean isMoneyGet, double serviceCost){
        this.id = id;
        this.name = name;
        this.office = office;
        this.isWork = isWork;
        this.position = position;
        this.serviceEmp = serviceEmp;
        this.isMoneyGive = isMoneyGive;
        this.isMoneyGet = isMoneyGet;
        this.serviceCost = serviceCost;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String atmName){
        this.name = name;
    }
    public void setOffice(BankOffice office){
        this.office = office;
    }
    public void setIsWork(int isWork){
        this.isWork = isWork;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public void setServiceEmp(Employee serviceEmp){
        this.serviceEmp = serviceEmp;
    }
    public void setIsMoneyGive(boolean isMoneyGive){
        this.isMoneyGive = isMoneyGive;
    }
    public void setIsMoneyGet(boolean isMoneyGet){
        this.isMoneyGet = isMoneyGet;
    }
    public void setServiceCost(double serviceCost){
        this.serviceCost = serviceCost;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public BankOffice getOffice(){
        return this.office;
    }
    public int getIsWork(){
        return this.isWork;
    }
    public String getPosition(){
        return this.position;
    }
    public Employee getServiceEmp(){
        return this.serviceEmp;
    }
    public boolean getIsMoneyGive(){
        return this.isMoneyGive;
    }
    public boolean getIsMoneyGet(){
        return this.isMoneyGet;
    }
    public double getServiceCost(){
        return this.serviceCost;
    }
}


