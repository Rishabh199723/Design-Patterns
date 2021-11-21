package Composite;

public class IndividualEmployee extends Employee {

    IndividualEmployee(String name) {
        this.name = name;
    }

    public void setCost(Long cost) {
        this.costToCompany = cost;
    }

    @Override
    public Long getCost() {
        return this.costToCompany;
    }
}
