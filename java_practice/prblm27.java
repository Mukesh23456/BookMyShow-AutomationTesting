package java_practice;


class parent1 {
	void eating()
	{
		System.out.println("I am eating briyani");
	}
}

class child1 extends parent1
{
	
	void drinking()
	{
		System.out.println("I am drinking juice");
	}
}



public class prblm27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent1 a=new child1();
		
		a.eating();
		//a.drinking();

	}

}
