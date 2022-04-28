package Thread;

class Book {
	 
	 String title;
	 boolean isCompleted;
	 
	 public Book(String title) {
	  super();
	  this.title = title;
	 }
	 
	 public String getTitle() {
	  return title;
	 }
	 public void setTitle(String title) {
	  this.title = title;
	 }
	 public boolean isCompleted() {
	  return isCompleted;
	 }
	 public void setCompleted(boolean isCompleted) {
	  this.isCompleted = isCompleted;
	 }
	 
	}

class BookReader implements Runnable{
	 
	 Book book;
	 
	 public BookReader(Book book) {
	  super();
	  this.book = book;
	 }
	 
	 @Override
	 public void run() {
	  synchronized (book) {
	   System.out.println(Thread.currentThread().getName()+" is waiting for the book to be completed: "+book.getTitle());
	   try {
	    book.wait();
	   } catch (InterruptedException e) {    
	    e.printStackTrace();
	   }
	   System.out.println(Thread.currentThread().getName()+": Book has been completed now!! you can read it");
	  }
	 } 
	 
	}

class BookWriter implements Runnable{
	 
Book book;

public BookWriter(Book book) {
 super();
 this.book = book;
}

@Override
public void run() {
 synchronized (book) {
  System.out.println("Author is Starting book : " +book.getTitle() );
  try {
   Thread.sleep(1000);
  } catch (InterruptedException e) {
   e.printStackTrace();
  }
  book.setCompleted(true);
  System.out.println("Book has been completed now");

  book.notifyAll();
  System.out.println("notify one reader");

 } 
}
}

public class InterThreadCommunicationMain {
	 
public static void main(String args[])
{
 // Book object on which wait and notify method will be called
 Book book=new Book("The Alchemist");
 BookReader johnReader=new BookReader(book);
 BookReader arpitReader=new BookReader(book);

 // BookReader threads which will wait for completion of book
 Thread johnThread=new Thread(johnReader,"John");
 Thread arpitThread=new Thread(arpitReader,"Arpit");

 arpitThread.start();
 johnThread.start();

 // To ensure both readers started waiting for the book
 try {
  Thread.sleep(3000);
 } catch (InterruptedException e) {

  e.printStackTrace();
 }
 // BookWriter thread which will notify once book get completed
 BookWriter bookWriter=new BookWriter(book);
 Thread bookWriterThread=new Thread(bookWriter);
 bookWriterThread.start();



}
}
