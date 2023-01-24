package java_practice;

class parent3
{
	void exercise()
	{
		System.out.println("Parent : I can walk");
	}
}

class child3 extends parent3
{
	void exercise()
	{
		super.exercise();
		System.out.println("Child : I can walk and run");
	}
}


public class prblm30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent3 a=new child3();
		a.exercise();
		

	}

}
