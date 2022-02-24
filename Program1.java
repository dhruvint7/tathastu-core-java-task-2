import java.util.*;
import java.io.*;
class Program1{
	public static int add(int no1,int no2){
			return no1+no2;
	}
	public static int sub(int no1,int no2){
			return no1-no2;
	}
	public static int mul(int no1,int no2){
			return no1*no2;
	}
	public static int div(int no1,int no2){
			try{
				return no1/no2;
			}catch(Exception e){
				System.out.println("Divide By Zero Error");
				return 0;
			}
	}
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number 1:");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter number 2:");
		int b = Integer.parseInt(br.readLine());
		while(true)
		{
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Exit");
			System.out.println("Enter your choice:");
			int ch = Integer.parseInt(br.readLine());

			switch(ch){
					case 1: System.out.println("Addition is "+add(a,b));
							break;
					case 2: System.out.println("Subtarction is "+sub(a,b));
							break;
					case 3: System.out.println("Multiplication is "+mul(a,b));
							break;
					case 4: System.out.println("Division is "+div(a,b));
							break;
					case 5 : System.exit(1); 
							break;
			}
		}
	}
}