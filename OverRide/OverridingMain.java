package OverRide;

class Parent {
	int id1;
	public void display() {
		System.out.println("Parent class disply fun");
		
	}

}

class child extends Parent{
	
	public void display() {
		super.display();
		System.out.println("Child class display fun");
	}
}
public class OverridingMain {
	public static void main(String[] args) {
		child ob=new child();
		ob.display();

		System.out.println("id= "ob.id1 );
}
}