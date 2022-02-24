import java.util.*;
import java.io.*;
class Program4{
	public static boolean checkPal(String s)
	{
		StringBuilder sb = new StringBuilder(s);
		if(sb.reverse().toString().equals(s))
				return true;
		else
			return false;
	}
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string:");
		if(checkPal(br.readLine()))
		{
			System.out.println("The given string is palindrome");
		}else{
			System.out.println("The given string is not a palindrome");
		}
	}
}