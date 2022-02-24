import java.util.*;
import java.io.*;
class Program2
{
	public static void fibo(int n)
	{
		int a = 0,b=1,i=2;
		System.out.print(a+" ");
		System.out.print(b+" ");
		while(i<n){
				int c = a+b;
				System.out.print(c+" ");
				a = b;
				b = c;
				i++;
		}

	}
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number upto which fibonacci series is needed:");
		int n = Integer.parseInt(br.readLine());
		fibo(n);
	}
}