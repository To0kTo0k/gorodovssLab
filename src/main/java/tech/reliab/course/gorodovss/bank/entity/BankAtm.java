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

    public BankAtm(int id, String name, int isWork, String position, Employee serviceEmployee, boolean isMoneyGet, boolean isMoneyPut, double serviceCost) {
        this.id = id;
        this.name = name;
        this.isWork = isWork;
        this.position = position;
        this.serviceEmployee = serviceEmployee;
        this.isMoneyGet = isMoneyGet;
        this.isMoneyPut = isMoneyPut;
        this.serviceCost = serviceCost;
        this.serviceEmployee.setAtm(this);
        this.serviceEmployee.getOffice().setAtmCount(this.serviceEmployee.getOffice().getAtmCount() + 1);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String atmName) {
        this.name = name;
    }

    public void setIsWork(int isWork) {
        this.isWork = isWork;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setServiceEmployee(Employee serviceEmployee) {
        this.serviceEmployee = serviceEmployee;
    }

    public void setIsMoneyGet(boolean isMoneyGet) {
        this.isMoneyGet = isMoneyGet;
    }

    public void setIsMoneyPut(boolean isMoneyPut) {
        this.isMoneyPut = isMoneyPut;
    }

    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getIsWork() {
        return this.isWork;
    }

    public String getPosition() {
        return this.position;
    }

    public Employee getServiceEmployee() {
        return this.serviceEmployee;
    }

    public boolean getIsMoneyGet() {
        return this.isMoneyGet;
    }

    public boolean getIsMoneyPut() {
        return this.isMoneyPut;
    }

    public double getServiceCost() {
        return this.serviceCost;
    }

    @Override
    public String toString() {
        return "\n\n\t\t\tBankAtm" +
                "\n\t\t\tid=" + id +
                "\n\t\t\tname='" + name + '\'' +
                "\n\t\t\tisWork=" + isWork +
                "\n\t\t\tposition='" + position + '\'' +
                "\n\t\t\tserviceEmployee=" + serviceEmployee.getId() +
                "\n\t\t\tisMoneyGet=" + isMoneyGet +
                "\n\t\t\tisMoneyPut=" + isMoneyPut +
                "\n\t\t\tserviceCost=" + serviceCost;
    }
}


