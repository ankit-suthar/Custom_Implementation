package com.hashmap;

public class HashMapCustom<K,V>
{
	private Entry<K,V> table[];
	private int capacity=4;
	
	static class Entry<K,V>
	{
		K key;
		V value;
		Entry<K,V> next;
		
		public Entry(K key,V value, Entry<K,V> next)
		{
			this.key=key;
			this.value=value;
			this.next=next;
		}
	}
	
	public HashMapCustom()
	{
		table = new Entry[capacity];
	}
	
	public void put(K key,V value)
	{
		if(key==null)
			return;
		
		int hash = hashCode(key);
		
		Entry<K,V> ent = new Entry<K,V>(key,value,null);
		
		if(table[hash]==null)
			table[hash]=ent;
		else
		{
			Entry<K,V> prev = null;
			Entry<K,V> curr = table[hash];
			
			while(curr!=null)
			{
				if(curr.key.equals(key))
					if(prev==null)
					{
						ent.next=curr.next;
						table[hash]=ent;
						return;
					}
					else
					{
						ent.next=curr.next;
						prev.next=ent;
						return;
					}
				prev=curr;
				curr=curr.next;
			}
			prev.next=ent;
		}
	}
	
	public V get(K key)
	{
		int hash = hashCode(key);
		
		if(table[hash]==null)
		{
			return null;
		}
		else
		{
			Entry<K,V> temp = table[hash];
			while(temp!= null){
				if(temp.key.equals(key))
					return temp.value;
				temp=temp.next;
			}
			return null;
		}
	}
	
	public boolean remove(K deleteKey){
		
		int hash=hashCode(deleteKey);
		
		if(table[hash] == null)
		{
      return false;
		}
		else
		{
			Entry<K,V> prev = null;
      Entry<K,V> curr = table[hash];
      
      while(curr != null)
      {      	
      	 if(curr.key.equals(deleteKey))
      	 {  
      		 if(prev==null)
      		 {
      			 table[hash]=table[hash].next;
      			 return true;
      		 }
      		 else
      		 {
      			 prev.next=curr.next;
      			 return true;
      		 }
      	 }
      	prev=curr;
      	curr=curr.next;
      }
      return false;
		}
	}
	
	public void print()
	{	
		 for(int i=0;i<capacity;i++)
			 if(table[i]!=null)
			 {				 
				 Entry<K, V> entry=table[i];
				 
				 while(entry!=null)
				 {
           System.out.print("{"+entry.key+"="+entry.value+"}" +" ");
           entry=entry.next;
				 }
			 }	
	}
	
	private int hashCode(K key)
	{
    return Math.abs(key.hashCode()) % capacity;
	}
}