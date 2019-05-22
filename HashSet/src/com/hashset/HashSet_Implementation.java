package com.hashset;

public class HashSet_Implementation 
{
	public static void main(String[] args)
	{
		HashSetCustom<Integer> hs = new HashSetCustom<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(4);
		hs.add(5);
		
		hs.print();
		hs.remove(5);
		System.out.println();
		hs.print();
	}
}