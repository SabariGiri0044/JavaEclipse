package Thread;

class WaitChild extends ThreadClass {
	int total;
	public void run(){
		synchronized(this) {
		
		for(int i=0;i<=10;i++) {
			total+=i;
		}
		notify();
}
}
}
public class WaitAndNotify 
{
	public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread());
		WaitChild no=new WaitChild();
	System.out.println("bef start");
	no.start();
	synchronized (no) {
		
		System.out.println("wait 4 res.....");
	no.wait();
	System.out.println("Sum="+no.total);
	}
}
}


