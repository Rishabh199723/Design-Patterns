package ChainOfResponsibility;

public interface DoctorActions {

    public String checkSeverity(String symptom);

    public void checkPatient(String name, String symptom);

}
