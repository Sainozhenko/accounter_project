package accounting_project;

public class Manager extends Employee{
    int hours;

    public Manager(String name, String type, double salary,int hours) {
        super(name, type, salary);
        this.hours = hours;
    }


    //    public Manager(String name, String type, int hours, double salary) {
//        super(name, type, hours, salary);
//    }
    public int salaryForManager(int hour,double salary){
        int result = (int) (hour*salary);
        return result;
    }

}

