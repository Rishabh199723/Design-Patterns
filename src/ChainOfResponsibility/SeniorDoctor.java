package ChainOfResponsibility;

import javax.print.Doc;

public class SeniorDoctor extends Doctor {

    SeniorDoctor(Doctor doctor) {
        this.successorDoctor = doctor;
    }

    @Override
    public String checkSeverity(String symptom) {
        if(symptom.contains("bp") || symptom.contains("congession") ||symptom.contains("depression") ) return "high";
        else return "critical";
    }

    @Override
    public void checkPatient(String name, String symptom) {
        String severity = checkSeverity(symptom);
        if(severity.equals("high")) {
            System.out.println(name+" treated by senior doctor....");
        } else {
            System.out.println("Transferring patient to Chief doctor consultation ...");
            this.successorDoctor.checkPatient(name, symptom);
        }
    }
}
