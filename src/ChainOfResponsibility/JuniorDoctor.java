package ChainOfResponsibility;

public class JuniorDoctor extends Doctor {


    JuniorDoctor(Doctor doctor) {
        this.successorDoctor = doctor;
    }

    @Override
    public String checkSeverity(String symptom) {
        if(symptom.contains("fever") || symptom.contains("cough") ||symptom.contains("cold") ) return "low";
        else return "high";
    }

    @Override
    public void checkPatient(String name, String symptom) {
        String severity = checkSeverity(symptom);
        if(severity.equals("low")) {
            System.out.println(name+" treated by junior doctor....");
        } else {
            System.out.println("Transferring patient to Senior doctor consultation ...");
            this.successorDoctor.checkPatient(name, symptom);
        }
    }
}
