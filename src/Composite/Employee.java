package Composite;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
    String name;
    Long costToCompany;
    List<Employee> employees = new ArrayList<>();

    public abstract Long getCost();

    public String getName() {
        return this.name;
    }

    public void add(Employee employee) throws OperationNotSupportedException {
        throw new OperationNotSupportedException("Not authorized to add");
    }

    public void remove(Employee employee) throws OperationNotSupportedException {
        throw new OperationNotSupportedException("Not authorized to remove");
    }

}
