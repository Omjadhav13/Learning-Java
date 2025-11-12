package demo_MultiThreading;

public class MyThread extends Thread{

	@Override
	public void run() {
		Thread c=Thread.currentThread();
		System.out.println("In run()"+c.getName());
		System.out.println(c.getPriority());
	}
	
	public static void main(String [] args) {
		MyThread t=new MyThread();
		t.setName("hello");
		t.start();
		
		MyThread t1=new MyThread();
		t1.setName("hi");
		t1.start();
		System.out.println(Thread.currentThread().getName());
	}
}
