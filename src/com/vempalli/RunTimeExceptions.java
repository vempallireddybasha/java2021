package com.vempalli;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

class ParentTest {
	   String parentName;
	   ParentTest(String n1){
	      parentName = n1;
	   }
	   public void display() {
	      System.out.println(parentName);
	   }
	}
	class ChildTest extends ParentTest {
	   String childName;
	   ChildTest(String n2) {
	      super(n2);
	      childName = n2;
	   }
	   public void display() {
	      System.out.println(childName);
	   }
	}
	
	  

public class RunTimeExceptions 
{
   public static void main(String[] args) {
	 
		/*
		 *  Class Cast Exception
		 *  
		 * ChildTest ct1 = new ChildTest("Jai"); ParentTest pt1 = new
		 * ParentTest("Adithya"); pt1 = ct1; pt1.display();
		 * 
		 * ParentTest pt2 = new ParentTest("Sai"); ChildTest ct2 = (ChildTest)pt2;
		 * 
		 */
	   
           // "akki" is not a number
		/*
		 * Number Format Exception
		 * int num = Integer.parseInt ("akki6") ;
		 * 
		 * System.out.println(num);
		 */
	   
	   //File Not Found Exception
		/*
		 * File file = new File("E:\file.txt");
		 * 
		 * try { FileReader fr = new FileReader(file); } catch (FileNotFoundException e)
		 * { // TODO Auto-generated catch block e.printStackTrace(); }
		 */
		      
		     /*  java.util.ConcurrentModificationException
		      
		      * List<Integer> integers = new ArrayList();
		    		  integers.add(1);
		    		  integers.add(1);
		    		  integers.add(698);
		    		  integers.add(1);
		    		  

		      for (Integer integer : integers) {
		    	 
		          integers.remove(1);
		          System.out.println(integer);
		      }
    */
	   
}
}
   

