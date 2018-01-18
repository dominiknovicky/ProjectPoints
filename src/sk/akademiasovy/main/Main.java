package sk.akademiasovy.main;

import sk.akademiasovy.point.Point2D;
import sk.akademiasovy.point.Point3D;

public class Main {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(-1,-5);
        System.out.println("Point2D p1 is in "+p1.getQuadrant()+" quadrant");
        Point2D p2 = new Point2D();
        p2.randomCoord();
        System.out.println("Point2D p2 is in "+p2.getQuadrant()+" quadrant");
        System.out.println(p2.getDistance());
        System.out.println(p2.getDistanceFromOtherPoint(p1));
        p2.pointInfo();
        p2.doAxialSymetric('y');
        p2.pointInfo();

        Point3D p3 = new Point3D();
        Point3D p4 = new Point3D();

        p3.randomCoord();
        p4.randomCoord();
        p3.pointInfo();
        p4.pointInfo();
        System.out.println("Distance from p3 to p4 is " +p3.getDistanceFromOtherPoint(p4));
    }

}
