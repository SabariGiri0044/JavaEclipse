package interf;

interface Myinterface{
	int i = 10;
	void m1();
	void m2();
	void m3();
}
interface AnoterInterface extends MyInterface{
	void m4();
}
interface AnotherInterface1 extends AnotherInterface {
class C implements AnotherInterface{
	
	@Override
	public void m5() {
		
	}
}
class B implements AnoterInterface{

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}
	
}
class A implements Myinterface{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("implemented 1");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("implemented 2");
	}

	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("Implemented 3");
	}

}
public class Interface {
	

	public static void main(String[] args) {
       
	  // MyInterface ob = MyInterface();
	    A ob = new A();
	    ob.m1();
	    ob.m2();
	    ob.m3(); //class A method
	    
	    B ob1 = new B();
	    ob1.m4();
	    ob1.m4();
	    ob1.m4();
	    
	    
}
}
