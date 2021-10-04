package extending_thread_demo;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Thread t=Thread.currentThread();
		t.setName("anshu");
		t.setPriority(7);
		System.out.println(t);
		MyThread m1=new MyThread();
		m1.setName("my-1");
		//m1.setDaemon(true);
		m1.start();
		System.out.println("main ends here");

	}

}
