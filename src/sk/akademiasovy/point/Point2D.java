package sk.akademiasovy.point;

import sk.akademiasovy.Geometry;

import java.util.Random;

public class Point2D implements Geometry{
    private int x;
    private int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
        // x = y = 0;
        this(0, 0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getQuadrant() {
        if (x > 0 && y > 0)
            return 1;
        else if (x > 0 && y < 0)
            return 2;
        else if (x < 0 && y < 0)
            return 3;
        else if (x < 0 && y < 0)
            return 4;
        else
            return 0;
    }

    public void randomCoord() {
        Random random = new Random();
        this.x = random.nextInt(41) - 20;
        this.y = random.nextInt(41) - 20;
    }

    public double getDistance() {
        return Math.sqrt((x * x) + (y * y));
    }

    public void pointInfo() {
        System.out.println("Point2D: [" + x + "][" + y + "] | Q: " + getQuadrant() + " | Dist: " + getDistance());
    }

    public double getDistanceFromOtherPoint(Point2D other) {
        return Math.sqrt(Math.pow(x - other.getX(), 2) + Math.pow(y - other.getY(), 2));
    }

    public void doAxialSymetric(char type) {
        if (type == 'x' || type == 'X')
            y = y * (-1);
        else if (type == 'y' || type == 'Y')
            x = x * (-1);
        else
            System.out.println("wrong input");
    }

    public void doCentralSymetry(){
        x = x-(-1);
        y = y*(-1);
    }
}