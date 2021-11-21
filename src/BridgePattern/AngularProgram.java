package BridgePattern;

public class AngularProgram extends Programmer {
    public AngularProgram(BackendTech backendTech) {
        super(backendTech);
    }

    @Override
    public void runUITask() {
        System.out.println("Running Angular");
    }
}
