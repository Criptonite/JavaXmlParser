package company;

import java.util.Date;
import java.util.List;

public class Manager extends Employee {

    private List<Employee> employees;

    public Manager() {
        super();
    }

    public Manager(String firstName, String secondName, String patronymic, Date birthDate, Date offerDate, List<Employee> employees) {
        super(firstName, secondName, patronymic, birthDate, offerDate);
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
