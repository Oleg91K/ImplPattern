package StructuralPatterns.Adapter;

public class AstronautTwo extends Station implements InterfaceStation{
    @Override
    public void sayStation() {
        this.say();
    }
}
