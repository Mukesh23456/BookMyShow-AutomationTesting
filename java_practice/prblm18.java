package java_practice;

import java.util.Scanner;

public class prblm18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x;
		Scanner sc=new Scanner(System.in);
		x=sc.nextLine();
		int m=0,n=0;
		x=x.toUpperCase();
		for(int i=0;i<x.length();i++)
		{
			char y=x.charAt(i);
			if(y>='A' && y<='Z')
			{
				if(y=='A' || y=='E' || y=='I' || y=='O' || y=='U')
				{
					m++;
				}
				else
				{
					n++;
				}
			}
		}
		System.out.println("No of Vowels = "+m);
		System.out.println("No of Consonents = "+n);
	

	}

}
