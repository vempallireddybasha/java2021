package com.vempalli;

public class ObjectLock
{
	public static void main(String[] args) 
	{
		ObjectLock obj=new ObjectLock();
		Thread1 t1=new Thread1(obj);
		Thread2 t2=new Thread2(obj);
		t1.start();
		t2.start();
	}
	synchronized public void m1()
	{
		System.out.println("inside m1 method:"+Thread.currentThread().getName());
	}
	synchronized public void m2()
	{
		System.out.println("inside m2 method : "+Thread.currentThread().getName());
	}
}
 class Thread1 extends Thread
{ 
	ObjectLock obj1;
	Thread1(ObjectLock object1)
	{
		this.obj1=object1;
	}

	@Override
	public void run()
	{
		obj1.m1();
		obj1.m2();
	}
}
class Thread2 extends Thread
{ 
	ObjectLock obj2;
	Thread2(ObjectLock object1)
	{
		this.obj2=object1;
	}

	@Override
	public void run()
	{
		obj2.m1();
		obj2.m2();
	}
}
