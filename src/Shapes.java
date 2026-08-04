
import java.util.*; 


abstract class Shape
{
	public int x,y;

	public abstract void printArea();
	
}



class Rectangle extends Shape
{
	public void printArea()
	{
		float area; 
		area= x * y;
		System.out.println("Area of Rectangle is " +area);
	}
}

 

class Triangle extends Shape
{
	public void printArea()
	{
		float area;
		area= (x * y) / 2;
		System.out.println("Area of Triangle is " + area);
	}
}



class Circle extends Shape
{
	public void printArea()
	{
		float area;
		area=(22 * x * x) / 7; 
		System.out.println("Area of Circle is " + area);
	}
}

public class Shapes
{
 	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter X value : "); 
		int x1=scanner.nextInt();

		System.out.println("Enter Y value : "); 
		int y1=scanner.nextInt();

		Rectangle r = new Rectangle();
		r.x = x1; 
		r.y = y1; 
		r.printArea();
 

		Triangle t = new Triangle();
		t.x = x1; 
		t.y = y1; 
		t.printArea();

		Circle c = new Circle();
		c.x = x1;
		c.printArea();
	}
}


