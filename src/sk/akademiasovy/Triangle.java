package sk.akademiasovy;

import sk.akademiasovy.point.Point2D;

public class Triangle implements InterfaceTriangle {
    private Point2D a;
    private Point2D b;
    private Point2D c;

    public Triangle(Point2D a, Point2D b, Point2D c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSideA(){
        return b.getDistanceFromOtherPoint(c);
    }
    public double getSideB(){
        return a.getDistanceFromOtherPoint(c);
    }
    public double getSideC(){
        return a.getDistanceFromOtherPoint(b);
    }

    public double getPerimeter(){
        return getSideA()+getSideB()+getSideC();
    }

    public double getArea(){
        double s = getPerimeter()/2;
        return Math.sqrt(s*(s-getSideA())*(s-getSideB())*(s-getSideC()));
    }

    @Override
    public boolean isIsosceles() {
        return getSideA()== getSideB() || getSideB() == getSideC() || getSideC() == getSideA();
    }

    @Override
    public boolean isEquilateral() {
        return getSideA() == getSideB() && getSideB() == getSideC() && getSideA() == getSideC();
    }

    @Override
    public boolean isRectangular() {
        if(getSideA()*getSideA()+getSideB()*getSideB()==getSideC()*getSideC())
            return true;
        else if(getSideA()*getSideA()+getSideC()*getSideC()==getSideB()*getSideB())
            return true;
        else if(getSideB()*getSideB()+getSideC()*getSideC()==getSideA()*getSideA())
            return true;
        else
            return false;
    }
}
