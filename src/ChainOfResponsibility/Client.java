package ChainOfResponsibility;

public class Client {

    public static void main(String[] args) {
        ChiefDoctor chiefDoctor = new ChiefDoctor();
        SeniorDoctor seniorDoctor = new SeniorDoctor(chiefDoctor);
        JuniorDoctor juniorDoctor = new JuniorDoctor(seniorDoctor);
        juniorDoctor.checkPatient("Ram" , "cough, heart attack");
        juniorDoctor.checkPatient("Shyam" , "heart attack");

    }
}
