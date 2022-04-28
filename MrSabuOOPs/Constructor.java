package MrSabuOOPs;

class MyConstructor {
          int i,j,k;
         MyConstructor(){
        	  //constructor with no argument
        	  System.out.println("Inside Constructor");
        	  i=0;
        	  j=0;
        	  
        	  System.out.println("i="+i+" and j="+j);
          }
          MyConstructor(int i,int j) {
        	  //constructor with 2 arg
        	  System.out.println("With two Arguments");
        	  this.i=i;
        	  this.j=j;
          }

 MyConstructor(int i, int j, int k) {
	 System.out.println("with three Arg");
	 this.i=i;
	 this.j=j;
	 this.k=k;
			
		}
public MyConstructor(MyConstructor ob2) {
	this.i=ob2.i;
	this.j=ob2.j;
	this.k=ob2.k;
	System.out.println("i="+this.i +"j=" +this.j +"k=" +this.k);
}
void largestNumber() {
int l=(i>j)?i:j;
System.out.println("Largest is ="+l);
}
void largestthree() {
	int l =(i>j && i>k)?i:k;
	System.out.println("Largest of three number is"+l);
}

}
public class Constructor {
	public static void main(String args[]) {
		MyConstructor ob = new MyConstructor();
		MyConstructor ob1 = new MyConstructor(1,2);
		MyConstructor ob2 = new MyConstructor(1,2,3);
		ob1.largestNumber();
		ob2.largestthree();
		MyConstructor ob3= new MyConstructor(ob2);

	}
	}

