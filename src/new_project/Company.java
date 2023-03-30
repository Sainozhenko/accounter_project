package new_project;
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
 * -у сотрудника на почасовой оплате должно быть поле ставка за час. Метод
 * расчета его зарплаты должен
 * учитывать минимальный размер оплаты труда
 * -у менеджера по продажам нет фиксированной оплаты, его зарплата рассчитывается
 * как процент от обьема продаж
 * Но в его случае также должен учитываься минимальный размер оплаты труда
 */
public class Company {

    List<Employee> employeeList = new ArrayList<>();

    public Company() {
    }

    boolean addEmployee(Employee employee) {
        if (employeeList.size() > 3) {
            System.out.println("The company is full");
            return false;
        }

        employeeList.add(employee);
        return true;
    }

    boolean removeEmployee(Employee employee) {
        return employeeList.remove(employee);
    }

    void displayEmployees() {
        System.out.println("Employees:");
        for (Employee employee : employeeList) {
            System.out.println(employee.getFirstName() + "\t" + employee.getLastName() + "\t" + employee.getPosition() + "\t" + employee.calculateSalary());
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
