package BridgePattern;

public abstract class Programmer {

    BackendTech backendTech;

    public Programmer(BackendTech backendTech) {
        this.backendTech = backendTech;
    }

    public void runBackend() {
        this.backendTech.runBackend();
    }

    public abstract void runUITask();

    public void runProgram() {
        runUITask();
        runBackend();
    }

}
