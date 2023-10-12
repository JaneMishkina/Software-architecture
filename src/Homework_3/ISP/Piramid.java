package Homework_3.ISP;

public class Piramid implements iShape3d{
    Triangle triangleBase;
    int height;

    public Piramid(Triangle triangleBase, int height) {
        this.triangleBase = triangleBase;
        this.height = height;
    }

    @Override
    public double volume() {
        return triangleBase.area() * height / 3;
    }
}
