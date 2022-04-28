package Thread;

class ThreadClass extends Thread{
	public void display() {
	//public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("Display () "+Thread.currentThread() +"i="+1);
		//System.out.println("run method () "+Thread.currentThread() +"i="+1);
		}
	}
}
public class ThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("JVM Thread" +Thread.currentThread());
	    ThreadClass ob1 = new ThreadClass();
	    ThreadClass ob2 = new ThreadClass();
	    //change the name of the thread
	    ob1.setName("1st thread");
	    ob2.setName("2nd thread");
	    ob1.start();
	    ob2.start();
	    
	}

}
