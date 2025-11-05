package soal1;

public class Cylinder extends Shape
{
    private double radius; //radius in feet
    private double height; //height in feet
    //----------------------------------
    // Constructor: Sets up the Cylinder.
    //----------------------------------
    public Cylinder(double r, double h)
    {
        radius = r;
        height = h;
    }
    //-----------------------------------------
    // Returns the surface area of the Cylinder.
    //-----------------------------------------
    public double area()
    {
        return Math.PI*(radius*radius)*height;
    }
    //-----------------------------------
    // Returns the Cylinder as a String.
    //-----------------------------------
    public String toString()
    {
        return super.toString("Cylinder") + " shape with radius " + radius + " and height " + height;
    }
}