package sk.akademiasovy;

import sk.akademiasovy.point.Point2D;

public class Line extends Point2D {
    private Point2D a;
    private Point2D b;

    public Line(Point2D a, Point2D b){
        this.a = a;
        this.b = b;
    }

    public Line(int xa, int ya, int xb, int yb){
        a = new Point2D(xa,ya);
        b = new Point2D(xb,yb);
    }

    public double getLength(){
        return a.getDistanceFromOtherPoint(b);
    }

    public Point2D getMiddleOfLine(){
        return new Point2D((a.getX()+b.getX())/2,(a.getY()+b.getY())/2);
    }

    public boolean isParallelToX(){
        return a.getY() == b.getY();
    }
    public boolean isParallelToY(){
        return a.getX() == b.getX();
    }
}
