import java.util.*;
import java.io.*;
class Program8{

	public static boolean checkMirrorInverse(int[] array)
	{
		int [] newarr = new int[array.length];
		for(int i=0;i<array.length;i++)
		{
			if(array[i] < array.length)
						newarr[array[i]] = i;
		}
		return Arrays.equals(array,newarr);
	}
	public static void main(String args[])
	{
		int[] arr = {3,4,2,0,1};
		if(checkMirrorInverse(arr)){
			System.out.println("Yes, the array is mirror inverse");
		}else{
			System.out.println("No, the array is not mirror inverse");
		}
	}
}