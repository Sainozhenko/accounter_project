package project;
public class SalesManager extends Employee {
    //за единицу проданного товара
    private static double salaryPerSale = 200.00;
    //сколько сделал продажи за месяц
    protected int salesMade;
    double minSalary = 1200.00;

    public SalesManager(String firstName, String lastName, int salesMade) {
        super(firstName, lastName);
        this.salesMade = salesMade;
    }

    public int getSalesMade() {
        return salesMade;
    }

    @Override
    public double calculateSalary() {
        //зп =
        double salary = salaryPerSale * salesMade;

        if (salary < minSalary) {
            return minSalary;
        }

        return salary;
    }

    @Override
    public String getPosition() {
        return "Manager";
    }
}
