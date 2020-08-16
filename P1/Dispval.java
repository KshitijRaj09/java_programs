//Write a JAVA program to create a package named pl create an interface dispval inside the package 
//create a method display() inside interface,includes this package pl in ex1 class, 
//use method display() to display a name, rollno and class of the student.

//package P1;
public interface Dispval
{
	void Display();
}
class Exx1 implements Dispval
{
	public void Display()
	{
		System.out.println("Ashish");
		System.out.println("6194591");
		System.out.println("MCA-2nd");
	}
	public static void main(String[] args)
	{
		Exx1 obj=new Exx1();
		obj.Display();
	}
}