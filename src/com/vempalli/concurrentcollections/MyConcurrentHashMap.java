package com.vempalli.concurrentcollections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MyConcurrentHashMap  extends Thread{
	static ConcurrentHashMap<Integer, String> chm=new ConcurrentHashMap<Integer, String>();
	//static HashMap<Integer, String> chm=new HashMap<Integer, String>();
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("child thread updating the map");
		chm.put(102,"vempalli");
	}
	public static void main(String[] args) {
		chm.put(101, "reddy");
		chm.put(103, "haritha");
		MyConcurrentHashMap m=new MyConcurrentHashMap();
		m.start();
		Set<Entry<Integer, String>> s=chm.entrySet();
		Iterator<Entry<Integer,String>> i=s.iterator();
		while(i.hasNext()) {
			System.out.println("Main thread iterating: "+chm.get(i.next().getKey()));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(chm);
	}
}
	//	public static void main(String[] args) throws InterruptedException {
	//		ConcurrentHashMap<Integer,String> concurrentHashMap=new ConcurrentHashMap<>();
	//		concurrentHashMap.putIfAbsent(102, "reddy");
	//		concurrentHashMap.putIfAbsent(102, "basha");
	//		concurrentHashMap.putIfAbsent(103, "haritha");
	//		concurrentHashMap.remove(102, "basha");
	//		concurrentHashMap.replace(102, "reddy", "vempallireddybasha");
	//
	//		for(Map.Entry<Integer, String> s:concurrentHashMap.entrySet()) {
	//			System.out.println(s);
	//         }
	//		}




