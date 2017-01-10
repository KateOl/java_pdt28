import org.testng.annotations.Test;

public class PointTest {

    @Test
    public void pointT(){

      Point p3 = new Point (25.3, 15.2);
      Point p5 = new Point (10, 10.3);



      assert Point.distance(p3, p5) == 29.51491148555252;

    }
}
