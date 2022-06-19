package com.vempalli;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashSetINternalWorking 
{
	public static void main(String[] args) {
		//	HashSet<String> hs=new HashSet<>();
		//	hs.add("Vempalli");
		//	hs.add("Haritha");
		//	hs.add("Vempallireddy");
		//	hs.add("Seetha");
		//	hs.add("jaanu");
		//	hs.stream().forEach(System.out::println);
		//	System.out.println("Vempalli".hashCode());

		//	LinkedHashSet<String> ls =new LinkedHashSet<>();
		//	ls.add("seetha");
		//	ls.add("Jaanu");
		//	ls.add("vempalli");
		//	ls.stream().forEach(System.out::println);

		//		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		//		hm.put("vempalli", 101);
		//		hm.put("haritha", 102);
		//		hm.put("seetha", 103);
		//		hm.put("Jaanu", 104);
		//		hm.put(null, 105);
		//		for(Map.Entry<String, Integer> s:hm.entrySet())
		//		{
		//			System.out.println(s);
		//		}
//
//				Hashtable<String, Integer> hm=new Hashtable<String, Integer>();
//				hm.put("vempalli", 101);
//				hm.put("haritha", 102);
//				hm.put("seetha", 103);
//				hm.put("Jaanu", 104);
//				for(Map.Entry<String, Integer> s:hm.entrySet())
//				{
//					System.out.println(s);
//				}

		for(int i=1;i<=100;i++) 
		{
			int count=0;
			for (int j = 1; j <=i; j++)
			{
				if(i%j==0) {
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}


	}
}
