package soal1;

public class PaintThings
{
    //-----------------------------------------
    // Creates some shapes and a Paint object
    // and prints the amount of paint needed
    // to paint each shape.
    //-----------------------------------------
    public static void main (String[] args)
    {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);
        
        // Instantiate the three shapes to paint
        final double length = 20;
        final double width = 30;
        final double sphereRadius = 15;
        final double cylinderRadius = 10;
        final double height = 30;
        Rectangle deck = new Rectangle(length, width);
        Sphere bigBall = new Sphere(sphereRadius);
        Cylinder tank = new Cylinder(cylinderRadius, height);
        
        // Compute the amount of paint needed for each shape
        double deckAmt = paint.amount(deck);
        double ballAmt = paint.amount(bigBall);
        double tankAmt = paint.amount(tank);
        
        // Print the amount of paint for each.
        System.out.println ("\nNumber of gallons of paint needed...");
        System.out.println (deck.toString() + " of deck is " + deckAmt);
        System.out.println (bigBall.toString() + " of big ball is " + ballAmt);
        System.out.println (tank.toString() + " of tank is " + tankAmt);
    }
}
