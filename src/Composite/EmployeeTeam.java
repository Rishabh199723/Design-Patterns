package Composite;

public class EmployeeTeam extends Employee {

    EmployeeTeam(String name) {
        this.name = name;
    }
    @Override
    public void add(Employee employee) {
        this.employees.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        this.employees.remove(employee);
    }

    @Override
    public Long getCost() {
        Long cost = 0L;
        if(this.employees!=null) {
            for(Employee e: employees) {
                if(e instanceof IndividualEmployee) {
                    System.out.println("Name :"+e.name);
                    System.out.println("Salary :"+e.getCost());
                }
                cost+=e.getCost();
            }
        }
        return cost;
    }
}
