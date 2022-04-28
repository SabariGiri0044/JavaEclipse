package Thread;

class Table1{
	synchronized void print(int n,String g) {
		for(int i=1;i<=10;i++) {
	}
}

public class ThreadTable1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table Tb = new Table();
		Thread t= new Thread() {
			public void run() {
				System.out.println("inside run");
				tb.print(8);
				
			}

	};
		t.start();
		Thread t1=new Thread() {
			public void run() {
				System.out.println("inside run");
				tb.print(4);		
			};
			t1.start();
		
			new Thread() {
				public void run() {
					tb.print(9);
				}
			}.start();
        Runnable r=new Runnable() {
	
	@Override
	public void run() {
		tb.print(11);
	}
		// TODO Auto-generated method stub
		
	};
Runnable r;
new Thread(r).start();
}
