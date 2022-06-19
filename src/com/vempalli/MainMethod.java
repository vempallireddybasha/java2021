package com.vempalli;

public class MainMethod 
{
	//JVM will always call String[] args  
	static public synchronized strictfp final void main(String[] args)
	{
     System.out.println("i am in main method with string[] args");
	}
	public static void main(int[] args)
	{
		System.out.println("i am in main method with int[] args");
	}
	
}
/*
 * class Child extends MainMethod { public static void main(String[] args) {
 * System.out.println("i am in child method with string[] args"); } public
 * static void main(int[] args) {
 * System.out.println("i am in child method with int[] args"); } }
 */