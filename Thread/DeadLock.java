package Thread;
class ThreadA implements Runnable{
	  private Object obj1;
	  private Object obj2;
	  ThreadA(Object obj1, Object obj2){
	    this.obj1 = obj1;
	    this.obj2 = obj2;
	  }
	  @Override
	  public void run() {
	    synchronized(obj1){
	      System.out.println(Thread.currentThread().getName() + " acquired " + "obj1 lock");
	      synchronized(obj2){
	        System.out.println(Thread.currentThread().getName() + " acquired " + "obj2 lock");
	      }
	    }       
	  }  
	}

class ThreadB implements Runnable{
	  private Object obj1;
	  private Object obj2;
	  ThreadB(Object obj1, Object obj2){
	    this.obj1 = obj1;
	    this.obj2 = obj2;
	  }
	  @Override
	  public void run() {
	    synchronized(obj2){
	      System.out.println(Thread.currentThread().getName() + " acquired " + "obj2 lock");
	      synchronized(obj1){
	        System.out.println(Thread.currentThread().getName() + " acquired " + "obj1 lock");
	      }
	    }   
	  }
}


public class DeadLock {

public static void main(String[] args) {
	
	  Object obj1 = new Object();
	      Object obj2 = new Object();
	      Thread t1 = new Thread(new ThreadA(obj1, obj2));
	      Thread t2 = new Thread(new ThreadB(obj1, obj2));
	      t1.start();
	      t2.start();
	    }
	  }


