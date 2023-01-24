package java_practice;


class parent {
	void eating()
	{
		System.out.println("I am eating briyani");
	}
}

class child extends parent
{
	
	void drinking()
	{
		System.out.println("I am drinking juice");
	}
}



public class prblm26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child a=new child();
		
		a.eating();
		a.drinking();
		


	}

}
