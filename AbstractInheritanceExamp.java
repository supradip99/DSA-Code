package sample;

abstract class Shape
{
	
	abstract void calculatedArea();
}

class Rectangle extends Shape
{
	double width;
	double height;
	
	public Rectangle(double width,double height)
	{
		this.width=width;
		this.height=height;
	}

	public void calculatedArea()
	{
		System.out.println("area is :"+width*height);
	}
	
}
class Circle extends Shape
{
	double radius;
	
	public Circle(double radius)
	{
		this.radius=radius;
	}
	
	public void calculatedArea()
	{
		System.out.println("area is :"+3.14*radius*radius);
	}
}

class Triangle extends Shape
{
	double t1;
	double t2;
	double t3;
	
	public Triangle(double t1,double t2,double t3)
	{
		this.t1=t1;
		this.t2=t2;
		this.t3=t3;
	}
	
	public void calculatedArea()
	{
		double s=(t1+t2+t3)/2;
		System.out.println("area is :"+Math.sqrt(s*(s-t1)*(s-t2)*(s-t3)));
	}
}



public class AbstractInheritanceExamp {

	public static void main(String[] args) {
		Shape sh=new Circle(5);
		sh.calculatedArea();
		Shape sh1=new Triangle(5,6,7);
		sh1.calculatedArea();
		Shape sh2=new Rectangle(5,6);
		sh2.calculatedArea();
		
		

	}

}
