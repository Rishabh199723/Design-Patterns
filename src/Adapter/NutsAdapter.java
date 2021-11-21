package Adapter;

public class NutsAdapter extends Nuts{

    SachinNuts sachinNuts;
    public NutsAdapter(SachinNuts sachinNuts) {
        this.sachinNuts = sachinNuts;
    }

    @Override
    public String getName() {
        return sachinNuts.getNutsName();
    }

    @Override
    public Long getQuantity() {
        return sachinNuts.getNutsQuantity();
    }

    @Override
    public String toString() {
        return sachinNuts.toString();
    }
}
