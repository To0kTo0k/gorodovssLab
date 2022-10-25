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
        String str = "Банкомат{" + '\n' +
                '\t' + "id=" + this.id + ',' + '\n' +
                '\t' + "название='" + this.name + '\'' + ',' + '\n' +
                '\t' + "адрес офиса='" + this.office.getAddress() + '\'' + ',' + '\n';
        switch(this.isWork) {
            case 0-> str += '\t' + "банкомат работает" + ',' + '\n';
            case 1-> str += '\t' + "банкомат не работает" + ',' + '\n';
            case 2-> str += '\t' + "нет денег" + ',' + '\n';
        }
        str += '\t' + "название банка='" + this.office.getBank().getName() + '\'' + ',' + '\n' +
                '\t' + "расположение='" + this.position + '\'' + ',' + '\n' +
                '\t' + "обслуживающий сотрудник='" + this.serviceEmployee.getFullName() + '\'' + ',' + '\n';
        str += (this.isMoneyGet) ? '\t' + "работает на выдачу денег" + ',' + '\n' : '\t' + "не работает на выдачу денег" + ',' + '\n';
        str += (this.isMoneyPut) ? '\t' + "работает на прием денег" + ',' + '\n' : '\t' + "не работает на прием денег" + ',' + '\n';
        str += '\t' + "количество денег в банке=" + this.office.getBank().getMoney() + ',' + '\n' +
                '\t' + "стоимость сервисного обслуживания=" + this.serviceCost + ',' + '\n' +
                '}' + '\n';
        return str;
    }
}


