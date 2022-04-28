package MrSabuOOPs;


class FunctionOverload{
	void display(){
		  System.out.println("No argument");
		}

		void display(int i){
		   System.out.println("One  int argument");
		}
		void display(int i, int j){
		   System.out.println("two argument");
		}
		void display(float f){
		   System.out.println("one arg float argument");
		}
		void display(float i, float j){
		  System.out.println("two arg float argument");

		}

		void display(int i, float j){ //overloading by changing the order of argument
			System.out.println("two arg int float");
		}
		void display(float i, int j){
			System.out.println("two arg float int");
		}

}
public class OverLoading {

	public static void main(String[] args) {
		FunctionOverload ob = new FunctionOverload();
		ob.display();//no arg
		ob.display(5);//int one arg
		ob.display(6.7f); //one arg float
		ob.display(8.9f, 3.4f);//two arg float
		ob.display(4, 8);//two arg int int
		ob.display(6.7f,8);//float and int
		ob.display(7,7.4f);//int float
		
	}

}