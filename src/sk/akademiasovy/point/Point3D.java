package sk.akademiasovy.point;

import java.util.Random;

public class Point3D extends Point2D {
    private int z;

    public int getZ() {
        return z;
    }

    public Point3D(){
        z = 0;
    }

    public Point3D(int x, int y, int z){
        super(x,y); //vola konstruktor rodica a posiela mu 2 parametre
        this.z = z;
    }

    @Override
    public double getDistance() {
        return Math.sqrt(getX()*getX()+getY()*getY()+z*z);
    }

    @Override
    public void randomCoord() {
        Random random = new Random();
        this.z = random.nextInt(41)-20;
        super.randomCoord();
    }

    public double getDistanceFromOtherPoint(Point3D other){
        return Math.sqrt(Math.pow(getX() - other.getX(), 2) + Math.pow(getY() - other.getY(), 2) + Math.pow(getZ() - other.getZ(),2));
    }

    @Override
    public void pointInfo() {
        System.out.println("Point2D: [" + getX() + "][" + getY() + "][" + z + "] | Dist: " + getDistance());
    }
}