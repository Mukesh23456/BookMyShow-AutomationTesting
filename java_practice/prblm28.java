package java_practice;


interface tamil{
	public void tamil();
}

interface english{
	public void english();
}

 class language implements tamil,english
{
	public void tamil()
	{
		System.out.println("I can speak tamil");
	}
	
	public void english()
	{
		System.out.println("I can speak english");
	}
}



public class prblm28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		language a=new language();
		a.tamil();
		a.english();

	}

}
