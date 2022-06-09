package Lesson2.homework.task2;

public class WorkStation extends LapTop {
    private Dockstation dockstation;

    public WorkStation() {
    }

    public WorkStation(Dockstation dockstation) {
        this.dockstation = dockstation;
    }

    public WorkStation(String cpu, String monitor, int ram, Boolean touchPad, Dockstation dockstation) {
        super(cpu, monitor, ram, touchPad);
        this.dockstation = dockstation;
    }

    public Dockstation getDockstation() {
        return dockstation;
    }

    public void setDockstation(Dockstation dockstation) {
        this.dockstation = dockstation;
    }

    @Override
    public String toString() {
        return "WorkStation{" +
                "dockstation=" + dockstation +
                '}';
    }

    public void start() {
        this.dockstation.start();
    }
}
