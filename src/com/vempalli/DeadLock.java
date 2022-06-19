package com.vempalli;

public class DeadLock  extends Thread{


	A a=new A();
	B b=new B();

	public void m1() {
		this.start(); //this thread called by main thread
		a.d1(b);
	}
	public void run() {
		b.d2(a);// this thread called by child thread
	}
	public static void main(String[] args) {
		DeadLock deadLock=new DeadLock();
		deadLock.m1();
	}

}
class A
{
	public  synchronized void d1(B b) {
		System.out.println("inside d1 method of A");
		try {
			Thread.sleep(100);
		}
		catch (Exception e) {
			e.printStackTrace();
		} 
		System.out.println("thread 1 trying to call b's last method");
		b.last();
	}
	public  void last() {
		System.out.println("inside A's last method ");
	}
}

class B{
	public synchronized void d2(A a) {
		System.out.println("inside d2 method of B");
		try {
			Thread.sleep(100);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("thread 2 trying to call A's last method");
		a.last();
	}
	public  void last() {
		System.out.println("inside B's Last method ");
	}
}

/*
 * public static void main(String[] args) { final String s1="vempalli"; final
 * String s2="haritha"; Thread t1=new Thread(){ public void run() { synchronized
 * (s1) { System.out.println("t1 locked s1 "); try { Thread.sleep(100);
 * 
 * } catch (InterruptedException e) { e.printStackTrace(); } synchronized (s2) {
 * System.out.println("t1 locked s2"); } } }; }; Thread t2=new Thread(){ public
 * void run() { synchronized (s2) { System.out.println("t1 locked s1 "); try {
 * Thread.sleep(100);
 * 
 * } catch (InterruptedException e) { e.printStackTrace(); } synchronized (s1) {
 * System.out.println("t1 locked s2"); } } }; }; t1.start(); t2.start(); }
 */ 

