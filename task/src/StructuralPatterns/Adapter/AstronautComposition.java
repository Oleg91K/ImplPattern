package StructuralPatterns.Adapter;

public class AstronautComposition implements InterfaceStation {
    private final Station station;

    public AstronautComposition(Station station) {
        this.station = station;
    }

    @Override
    public void sayStation() {
        station.say();
    }
}
