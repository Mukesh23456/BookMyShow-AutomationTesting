package java_practice;


abstract class vehicle{
	abstract void wheels();
}

class bike extends vehicle
{
	void wheels()
	{
		System.out.println("Bike has 2 wheels");
	}
}


public class prblm31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle a=new bike();
		a.wheels();
		
		

	}

}
