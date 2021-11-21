package BridgePattern;

public class Client {

    public static void main(String[] args) {
        Programmer program = new AngularProgram(new JavaProgram());
        program.runProgram();
    }
}
