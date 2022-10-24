package tech.reliab.course.gorodovss.bank.entity;

public class BankAtm {
    private int id;
    private String name;
    private int isWork;
    private String position;
    private Employee serviceEmployee;
    private boolean isMoneyGet; //выдает деньги
    private boolean isMoneyPut; //принимает деньги
    private double serviceCost;
    private BankOffice office;
    public BankAtm(int id, String name, BankOffice office, int isWork, String position, Employee serviceEmployee, boolean isMoneyGet, boolean isMoneyPut, double serviceCost){
        this.id = id;
        this.name = name;
        this.office = office;
        this.isWork = isWork;
        this.position = position;
        this.serviceEmployee = serviceEmployee;
        this.isMoneyGet = isMoneyGet;
        this.isMoneyPut = isMoneyPut;
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
    public void setServiceEmployee(Employee serviceEmployee){
        this.serviceEmployee = serviceEmployee;
    }
    public void setIsMoneyGet(boolean isMoneyGet){
        this.isMoneyGet = isMoneyGet;
    }
    public void setIsMoneyPut(boolean isMoneyPut){
        this.isMoneyPut = isMoneyPut;
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
    public Employee getServiceEmployee(){
        return this.serviceEmployee;
    }
    public boolean getIsMoneyGet(){
        return this.isMoneyGet;
    }
    public boolean getIsMoneyPut(){
        return this.isMoneyPut;
    }
    public double getServiceCost(){
        return this.serviceCost;
    }
    @Override
    public String toString() {
        String str = "Банкомат{" +
                "id=" + this.id +
                ", название='" + this.name + '\'' +
                ", адрес офиса='" + this.office.getAddress() + '\'';
        switch(this.isWork) {
            case 0-> str += ", банкомат работает";
            case 1-> str += ", банкомат не работает";
            case 2-> str += ", нет денег";
        }
        str += ", название банка='" + this.office.getBank().getName() + '\'' +
                ", расположение='" + this.position + '\'' +
                ", обслуживающий сотрудник='" + this.serviceEmployee.getFullName() + '\'';
        str += (this.isMoneyGet) ? ", работает на выдачу денег" : ", не работает на выдачу денег";
        str += (this.isMoneyPut) ? ", работает на прием денег" : ", не работает на прием денег";
        str += ", количество денег в банке=" + this.office.getBank().getMoney() +
                ", стоимость сервисного обслуживания=" + this.serviceCost +
                '}';
        return str;
    }
}


