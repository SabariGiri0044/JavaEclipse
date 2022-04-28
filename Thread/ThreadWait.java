package Thread;

class MyClass extends Thread{
	int total;
	public void run() {
		synchronized (this) {
			
		for(int i=1;i<=100;i++) {
			total+=i;
			
			
		}
		notify();
		
	}
}
}

public class ThreadWait {

	public static void main(String[] args) throws InterruptedException {
		MyClass t=new MyClass(); 
		t.start();
		synchronized (t) {
			
			 System.out.println("Waiting for Total");
		          t.wait();//
		          System.out.println("Total "+t.total);
		     }
    }
}



