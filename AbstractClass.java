//To write a java program to create  abstract class  shape  declare abstract method area() create subclasses circle, 
//rectangle define area() method in the subclasses  to find areas of circle and rectangle .
abstract class Shape
{
	abstract void area();
}
class Circle extends Shape
{
	int radius=6;
	void area()
	{
		System.out.println("Area of Circle: " +(3.14*radius*radius));
	}
}
class Rectangle extends Shape
{
	int length=4, breadth=5;
	void area()
	{
		System.out.println("Area of Rectangle: "+ length*breadth);
	}
}
class AbstractClass
{
	public static void main(String[] args)
	{
		Circle obj=new Circle();
		obj.area();
		Rectangle obj1=new Rectangle();
		obj1.area();
	}
}