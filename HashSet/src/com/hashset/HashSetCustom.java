package com.hashset;

public class HashSetCustom<K>
{
	private HashMapCustom<K, Object> hashMapCustom;
	 
  public HashSetCustom()
  {
      hashMapCustom=new HashMapCustom<>();
  }
  
  public void add(K value)
  {
      hashMapCustom.put(value, null);
  }

  public boolean contains(K obj)
  {
      return hashMapCustom.contains(obj) !=null ? true :false;
  }
  
  public void print()
  {
    hashMapCustom.printSet();
  }

 public boolean remove(K obj)
 {
    return hashMapCustom.remove(obj);
 } 
}