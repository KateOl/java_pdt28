public class MyFirstClass {



	public static double distance (Point p1, Point p2){
        return Math.sqrt(Math.pow((p1.getX() - p2.getX()), 2) + Math.pow((p1.getY() - p2.getY()), 2));
	} //point

	public static void main(String[] args) {
		Point point1 = new Point();
        Point point2 = new Point(2.3, 4.5);

		System.out.println(distance(point1, point2));
        System.out.println(point1.distance(point2));


	} //main

} //class