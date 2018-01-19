package sk.akademiasovy.main;

import sk.akademiasovy.Geometry;
import sk.akademiasovy.point.Point2D;
import sk.akademiasovy.point.Point3D;

import java.lang.reflect.Array;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(-1, -5);
        System.out.println("Point2D p1 is in " + p1.getQuadrant() + " quadrant");
        Point2D p2 = new Point2D();
        p2.randomCoord();
        System.out.println("Point2D p2 is in " + p2.getQuadrant() + " quadrant");
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
        System.out.println("Distance from p3 to p4 is " + p3.getDistanceFromOtherPoint(p4));

        Object o1 = new Point2D();
        Point2D p5 = new Point3D(2, 8, 7);
        System.out.println(p5.getDistance());
        Point3D p6 = (Point3D) p5; //pretypovanie
        System.out.println(p6.getDistance());

        Geometry g1 = new Point2D(5, -9);
        ((Point2D) g1).pointInfo();

        Geometry[] arr3 = new Geometry[10];
        for (int i = 0; i < 10; i++) {
            Point3D p = new Point3D();
            p.randomCoord();
            arr3[i] = p;
            System.out.println(p);
        }
        for (Geometry g :arr3) {
            ((Point3D)g).pointInfo();

        }
    }
}
