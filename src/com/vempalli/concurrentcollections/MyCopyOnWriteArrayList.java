package com.vempalli.concurrentcollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyCopyOnWriteArrayList 
{
	public static void main(String[] args) {
		//		ArrayList<Integer> al=new ArrayList();
		//		al.add(12);
		//		al.add(67);
		//		al.add(673);
		//		al.add(4);
		//		for(Integer i:al) {
		//			if (i==12) {
		//			al.remove(i);} //
		//		}
		//		System.out.println(al);
		//				Iterator<Integer> i=al.iterator();
		//				while(i.hasNext()) {
		//					if((Integer)i.next()==12) {
		//						i.remove();
		//					}
		//				}
		//				System.out.println(al);
		//				
		System.out.println("=========================================");

		//    Here  when we use ArrayList with Iterator we wont get any UnsupportedOperationException
		//		ArrayList<Integer> a=new ArrayList<>();
		//		a.add(12);
		//		a.add(67);
		//		a.add(673);
		//		a.add(4);
		//		System.out.println(a);
		//		Iterator<Integer> i=a.iterator();
		//		while(i.hasNext()) {
		//			Integer i1=(Integer)i.next();
		//			if(i1==12) {
		//				i.remove();
		//			}
		//		}
		//		System.out.println(a);
		//	}

		// Here we will get UnsupportedOperationException
		CopyOnWriteArrayList<Integer> a=new CopyOnWriteArrayList<>();
		a.add(12);
		a.add(67);
		a.add(673);
		a.add(4);
		System.out.println(a);
		Iterator<Integer> i=a.iterator();
		while(i.hasNext()) {
			Integer i1=(Integer)i.next();
			if(i1==12) {
				i.remove();// this line will give  UnsupportedOperationException
			}
		}
		System.out.println(a);
	}
}

