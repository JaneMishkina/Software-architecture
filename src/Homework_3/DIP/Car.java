package Homework_3.DIP;

public class Car {
    iEngine engine;

    public Car(iEngine engine) {
        this.engine = engine;
    }

    public void startEngine(){
        engine.start();
    }
}
