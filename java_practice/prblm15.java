package java_practice;

import java.util.Scanner;

public class prblm15 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char x;
	x=sc.next().charAt(0);
	char y=Character.toUpperCase(x);
	if(y<='Z' && y>='A')
	{
		System.out.println("Given character is a Alphabet");
	}
	else
	{
		System.out.println("Given Character is not a Alphabet");
	}
	
	}
}
