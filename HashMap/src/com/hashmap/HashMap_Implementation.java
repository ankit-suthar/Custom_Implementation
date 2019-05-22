package com.hashmap;

public class HashMap_Implementation {

	public static void main(String[] args)
	{
		HashMapCustom<Integer,Integer> hm = new HashMapCustom<Integer,Integer>();
		hm.put(1, 3);
		hm.put(2, 6);
		hm.put(3, 9);
		hm.put(4, 12);
		hm.put(5, 15);
		hm.put(6, 18);
		
		hm.print();
		hm.remove(5);
		System.out.println();
		hm.print();
	}
}
