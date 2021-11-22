package ChainOfResponsibility;

public class ChiefDoctor extends Doctor{

    public ChiefDoctor(Doctor doctor) {
        this.successorDoctor = doctor;
    }
    public ChiefDoctor() {}

    @Override
    public String checkSeverity(String symptom) {
        return symptom.contains("heart attack")||symptom.contains("cancer") ? "Incurable":"critical";
    }

    @Override
    public void checkPatient(String name, String symptom) {
        String severity = checkSeverity(symptom);
        if (severity.equals("critical")) {
            System.out.println(name+" treated by chief doctor");
        } else {
            System.out.println("Cannot be treated further");
        }
    }
}
