

public class Point {

    private double x1,y1;  // p1
    private double x2,y2; // p2

    // Gettery settery

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }


    // Constructors

    public  Point (){}

    public Point (double x1, double y1){

        this.x1 = x1;
        this.y1 = y1;

    }

    // main

    public static void main(String[] args) {

       Point p1 = new Point(25.3, 15.2);
        Point p2 = new Point(10, 10.3);


        System.out.println(distance(p1, p2));



        } //main


    // Functions

    public static double distance (Point p1, Point p2) {

      double res = 0;

       res = Math.sqrt(Math.pow((p1.x1-p2.x2), 2) + Math.pow((p1.y1-p2.y2), 2));


        return res;

    }


} //class
