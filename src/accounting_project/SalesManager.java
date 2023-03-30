package accounting_project;

public class SalesManager extends Employee {
    private int salesVolume = 0;

    public SalesManager(String name, String type, double salary,int salesVolume) {
        super(name, type, salary);
        this.salesVolume = salesVolume;
    }


    public int salaryForSalesManager(int salesVolume,int hours, double salary) {
        int result = (int) (salesVolume*hours + salary);
        return 0;}

//    public SalesManager(String name, String type, int hoursOfMonth, double salary, int salesVolume) {
//        super(name, type, hoursOfMonth);
//        this.salesVolume = salesVolume;
//
//    }

//    int countingSalary(int hours, double salary) {
//
//        return c;
//    }


    public int getSalesVolume() {
        return salesVolume;
    }

    @Override
    public String toString() {
        return "SalesManager{" +
                "salesVolume=" + salesVolume +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", salary=" + salary +
                '}';
    }
}

