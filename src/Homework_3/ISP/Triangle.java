package Homework_3.ISP;

public class Triangle implements iShape{
    int sideA;
    int sideB;
    double angleAB;

    public Triangle(int sideA, int sideB, double angleAB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.angleAB = angleAB;
    }

    @Override
    public double area() {
        return sideA * sideB * Math.sin(angleAB) / 2;
    }
}
