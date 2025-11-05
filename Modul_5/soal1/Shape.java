package soal1;

abstract class Shape
{
	protected String shapeName;
	
	protected abstract double area();
	protected String toString(String shapeName){
	    return shapeName;
	}
}