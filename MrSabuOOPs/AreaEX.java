package MrSabuOOPs;


Class Area{

	   void SquareArea() throws NumberFromatException, IOException{
	     //input and display here
		  System.out.println("Enter the side of square");
		  BufferedReader br = new BufferReader(new InputStreamReader(system.in));
		  int side = Integer.parseInt(br.readLine());
		  int area = side * side;
		  System.out.println("Area of square = "+area);
	   }		   
	   float circleArea(float radius) {
		   float area = (float)(Math.PI * radius * radius);
		   return area;
	}
	  int rectangleArea(int l,int b){
		  int area =1 * b;
		  
	    //do only calculation and return area
		  return area;
	}
	}

	MainClass{
	   create an object Area
	   and call the functions
	   //input data from user use bufferedreader class



public class AreaEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
