import java.util.*;
import java.io.*;
class Program9{
	public static void main(String args[])
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.remove(1);
		list.remove(new Integer(7));
		System.out.println(list);
	}

}