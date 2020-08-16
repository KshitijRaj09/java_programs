//Create a abstract class vehicle create method fuel,speed and 
//Create another class Vehicle type  to inherit the vehicle class

abstract class Vehicle
{
	abstract void fuel();
	abstract void speed();
}

class VehicleType
{
	void fuel()
	{
		System.out.println("Fuel is Full");
	}
	void speed()
	{
		System.out.println("Speed is 50KM/Hr");
	}
	public static void main(String args[])
	{
		VehicleType obj= new VehicleType();
		obj.fuel();
		obj.speed();
	}
}