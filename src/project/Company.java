package project;

import java.util.ArrayList;
import java.util.List;

/**
 * Тех задание:
 * Молодому рекламному агентству нужна новая бухгалтерская программа.
 * У заказчика следующие требования. Программа должна уметь:
 * -добавлять сотрудников в штат
 * -удалять сотрудников из штата
 * -рассчитывать зарплату для двух категорий сотрудников:
 * сотрудника с почасовой оплатой и менеджера по продажам
 * -выводить на экран список сотрудников
 * -суммировать зарплату всех сотрудников
 * -у сотрудника на почасовой оплате должно быть поле ставка за час. Метод расчета его зарплаты должен
 * учитывать минимальный размер оплаты труда
 * -у менеджера по продажам нет фиксированной оплаты, его зарплата рассчитывается как процент от обьема продаж
 * . Но в его случае также должен учитываься минимальный размер оплаты труда
 */
//public class Company {
//
//    public List<Employee> employeeList = new ArrayList<>();
//
//    public Company(List<Employee> employeeList) {
//        this.employeeList = employeeList;
//    }
//
//    public List<Employee> getEmployeeList() {
//        return employeeList;
//    }
//
//
//    public boolean addEmployee(Employee employee) {
//        if (employeeList.size() < 2) {
//            employeeList.add(employee);
//            return true;
//        } else {
//            System.out.println("Cannot add new employee - the company already has 10 employees.");
//            return false;
//        }
//    }
//
//    public void removeEmployee(Employee employee) {
//        if (employeeList.contains(employee)) {
//            employeeList.remove(employee);
//        } else {
//            System.out.println("Employee not found in the company.");
//        }
//    }
//
//    public void displayEmployees() {
//        System.out.println("Employees:");
//        for (Employee employee : employeeList) {
//            System.out.println(employee.getFirstName() +
//                    "\t" + employee.getLastName() + "\t"
//                    + employee.getPosition() + "\t"
//                    + employee.calculateSalary());
//        }
//    }
//
//
//    double calculateTotalSalary() {
//        double totalSalary = 0.0;
//        for (Employee employee : employeeList) {
//            totalSalary += employee.calculateSalary();
//        }
//        return totalSalary;
//    }
//}
public class Company {

    public List<Employee> employeeList = new ArrayList<>();

    public Company(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }


    public boolean addEmployee(Employee employee) {
        if (employeeList.size() < 3) {
            employeeList.add(employee);
            return true;
        } else {
            System.out.println("Company full");
            return false;
        }
    }

    public void removeEmployee(Employee employee) {
        if (employeeList.contains(employee)) {
            employeeList.remove(employee);
        } else {
            System.out.println("Employee not found in the company.");
        }
    }

    public void displayEmployees() {
        System.out.println("Employees:");
        for (Employee employee : employeeList) {
            System.out.println(employee.getFirstName() +
                    "\t" + employee.getLastName() + "\t"
                    + employee.getPosition() + "\t"
                    + employee.calculateSalary());
        }
    }


    double calculateTotalSalary() {
        double totalSalary = 0.0;
        for (Employee employee : employeeList) {
            totalSalary += employee.calculateSalary();
        }
        return totalSalary;
    }
}