package ChainOfResponsibility;

public class Client {

    public static void main(String[] args) {
        Doctor chiefDoctor = new ChiefDoctor();
        System.out.println("class---"+chiefDoctor.getClass().getName());
        Doctor seniorDoctor = new SeniorDoctor(chiefDoctor);
        Doctor juniorDoctor = new JuniorDoctor(seniorDoctor);
        juniorDoctor.checkPatient("Ram" , "cough, heart attack");
        juniorDoctor.checkPatient("Shyam" , "heart attack");

    }
}
