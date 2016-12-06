

public class Point {

    private double x;
    private double y;

    Point(){
        setX(0);
        setY(0);
    }

    Point(double x, double y){
        setX(x);
        setY(y);
    }

    Point(Point point){
        setX(point.getX());
        setY(point.getY());
    }

    public void setX(double x){
        this.x = x;
    }

    public double getX(){
        return x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getY(){
        return y;
    }

    public double distance(Point point){
        return Math.sqrt(Math.pow((this.x - point.getX()), 2) + Math.pow((this.y - point.getY()), 2));
    }



} //class
