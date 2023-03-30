package accounting_project;

public abstract class Employee {
    String name;
    String type;
    double salary =15;

    public int salaryForSalesManager(){return 0;}
    public int salaryForManager(){return 0;}

    public Employee(String name, String type, double salary) {
        this.name = name;
        this.type = type;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }


    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", salary=" + salary +
                '}';
    }
    /*
    * 1. Общие переменные в абстрактном классе
    * 2.Методы для подсчета зарплаты у двух видов сотрудников
    * 3.*/

}
