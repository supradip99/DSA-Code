package sample;
interface Drawable
{
	public void draw();
}

class Circle1 implements Drawable
{
	public void draw()
	{
		System.out.println("Circle Draw");
	}
}
class Rectangle1 implements Drawable
{
	public void draw()
	{
		System.out.println("Rectangle Draw");
	}
}

public class InterfaceExamp {

	public static void main(String[] args) {
		Drawable d=new Circle1();
		d.draw();
		Drawable d1=new Rectangle1();
		d1.draw();

	}

}
