package Thread;

public class ThreadNew {

	class MyClass1 implements Runnable{

		public MyClass1(String string) {
			// TODO Auto-generated constructor stub
		}

		@Override
		public void run() {
			System.out.println("run method"+Thread.currentThread());
			
		}
	}
	public class MainRunnableInterface {
		public static void main(String[] args) {
			MyClass1 ob1 = new MyClass1 ("1st thread");
			Thread tob = new Thread(ob1);
			MyClass  ob2 = new MyClass ("2nd thread");
			Thread tob1 = new Thread(ob2);
			tob.setName("first");
			tob1.setName("second");
			tob.start();
			tob1.start();
		}
	}

	}


