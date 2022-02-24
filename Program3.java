import java.util.*;
import java.io.*;
class Program3
{
	public static int fact(int number)
	{
		int factorial = 1;
		for(int i= number;i>0;i--)
		{
			factorial*=i;
		}
		return factorial;
	}
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number:");
		int n = Integer.parseInt(br.readLine());
		System.out.println("Factorial of "+n+" is "+fact(n));
	}
}