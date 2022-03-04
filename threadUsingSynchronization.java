package practice.threads;

 class fact {
	synchronized void display(int x) {
		int i;
		for(i=1;i<x;i++)
			System.out.println(i*i);
		
		try {
			Thread.sleep(400);
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
	
class newThread extends Thread{
	fact t;
	newThread(fact t){
		this.t=t;
	}
	
	public void run() {
		t.display(5);
	}
}

class nextThread extends Thread{
	fact t;
	nextThread(fact t){
		this.t=t;
	}
	
	public void run() {
		t.display(8);
	}
}

public class ex3{	
	public static void main(String[] args) {
		fact obj=new fact();
		newThread t1=new newThread(obj);
		nextThread t2=new nextThread(obj);
		t1.start();
		t2.start();
		

	}

}
