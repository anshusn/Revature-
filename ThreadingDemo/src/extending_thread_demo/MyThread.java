package extending_thread_demo;

public class MyThread extends Thread {

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("printing from thread: "+Thread.currentThread().getName()+"value of i: "+i);
		}
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
