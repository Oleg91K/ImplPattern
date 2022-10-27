package StructuralPatterns.Adapter;

public class Astronaut {
    //Cпособ 1 - наследование. Вызов метода sayStation через интерфейс
    //Способ 2 - через создание нового класса и создание внутри обьекта
    //Нужно
    public static void main(String[] args) {
    InterfaceStation interfaceStation = new AstronautTwo();
    interfaceStation.sayStation();
    InterfaceStation interfaceStation1 = new AstronautComposition(new Station());
    interfaceStation1.sayStation();
    }
}
