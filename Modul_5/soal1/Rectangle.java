package soal1;

public class Rectangle extends Shape
{
    private double length; //lenght in feet
    private double width; //width in feet
    
    //----------------------------------
    // Constructor: Sets up the rectangle.
    //----------------------------------
    public Rectangle(double l, double w)
    {
        length = l;
        width = w;
    }
    //-----------------------------------------
    // Returns the surface area of the rectangle.
    //-----------------------------------------
    public double area()
    {
        return length*width;
    }
    //-----------------------------------
    // Returns the sphere as a String.
    //-----------------------------------
    public String toString()
    {
        return super.toString("Rectangle") + " shape with length " + length + " and width " + width;
    }
}