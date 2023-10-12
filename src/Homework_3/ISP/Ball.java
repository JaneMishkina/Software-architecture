package Homework_3.ISP;

public class Ball implements iShape3d {
    int radius;

    public Ball(int radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return 4 / 3 * Math.PI * Math.pow(this.radius, 3);
    }
}
