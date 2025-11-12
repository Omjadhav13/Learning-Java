package demo_MultiThreading;

public class MyRunnable implements Runnable {

	@Override 
	public void run() {
		System.out.println("In run()"+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable r= new MyRunnable();
		Thread t =new Thread(r);
		t.start();
		
		Thread t1= new Thread(()->System.out.println("in lambda"+Thread.currentThread().getName()));
		t1.start();
		
		Thread t2=new Thread(() ->{ 
			for(int i=0;i<4;i++) {
				System.out.println(i);
			}
		});
		
		t2.start();
	}

}
