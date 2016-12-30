

public class Point {

    private double x1,y1;
    private double x2,y2;
    private double c=(x1-x2);
    private double d=(y1-y2);
    private double a; // points
    private double b;

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

    public static void main(String[] args) {

       Point p = new Point();

        p.setX1(25.3);
        p.setX2(10);
        p.setY1(15.2);
        p.setY2(10.3);


        System.out.println(Math.sqrt(Math.pow(p.c, 2) + Math.pow(p.d, 2)));

        } //main


} //class
