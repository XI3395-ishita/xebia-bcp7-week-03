package practice.threads;

 public class ex2 implements Runnable {
	 public void run() {
		 System.out.println("Thread is running using runnable interface");
	 }

	public static void main(String[] args) {
		ex2 obj=new ex2();
		Thread t1=new Thread(obj);
		t1.start();

	}

}
