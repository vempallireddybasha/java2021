package com.vempalli;

class mythread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("seetha: "+i);
			try {
				Thread.sleep(2000);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
public class YiledAndJoinAndSleep  {
	public static void main(String[] args) {


		mythread mythread=new mythread();
		mythread.start();
		try {
			mythread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Thread.yield();
		for(int i=0;i<5;i++) {
			System.out.println("rama:"+i);
		}
	}
}
