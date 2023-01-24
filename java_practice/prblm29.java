package java_practice;


class parent2
{
	void exercise()
	{
		System.out.println("I can walk");
	}
}

class child2 extends parent2
{
	void exercise()
	{
		System.out.println("I can walk and run");
	}
}


public class prblm29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent2 a=new child2();
		a.exercise();

	}

}
