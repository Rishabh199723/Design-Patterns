package Composite;

public class Client {

    public static void main(String[] args) {
        IndividualEmployee dev1 = new IndividualEmployee("Ram Dev");
        dev1.setCost(10000L);
        IndividualEmployee dev2 = new IndividualEmployee("Shyam Dev");
        dev2.setCost(20000L);
        IndividualEmployee ui1 = new IndividualEmployee("Ritest ui");
        ui1.setCost(15000L);
        IndividualEmployee ui2 = new IndividualEmployee("Sarthak ui");
        ui2.setCost(16000L);
        IndividualEmployee qa1 = new IndividualEmployee("Hema qa");
        qa1.setCost(5000L);
        IndividualEmployee qa2 = new IndividualEmployee("Rohit qa");
        qa2.setCost(3000L);
        EmployeeTeam devTeam = new EmployeeTeam("Dev team");
        devTeam.add(dev1);
        devTeam.add(dev2);
        EmployeeTeam uiTeam = new EmployeeTeam("UI Team");
        uiTeam.add(ui1);
        uiTeam.add(ui2);
        EmployeeTeam appTeam = new EmployeeTeam("App team");
        appTeam.add(devTeam);
        appTeam.add(uiTeam);
        EmployeeTeam qaTeam = new EmployeeTeam("QA team");
        qaTeam.add(qa1);
        qaTeam.add(qa2);
        EmployeeTeam engTeam = new EmployeeTeam("Eng Team");
        engTeam.add(appTeam);
        engTeam.add(qaTeam);
        System.out.println("Total cost: "+engTeam.getCost());
    }
}
