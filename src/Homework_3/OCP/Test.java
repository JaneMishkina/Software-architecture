package Homework_3.OCP;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static void mainOcp(){
        Vehicle car = new Car(123);
        car.calculateAllowedSpeed();
        Vehicle bus = new Bus(60);

    }

}
