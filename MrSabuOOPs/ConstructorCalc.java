package MrSabuOOPs;

/*class Addition{
void add(int i , int j){}
void add(float f, float j){}
void add(double i, double j){}
}*/

class Function {
	void add(int i,int j)
	{
		int c=(int) i+j;
		System.out.println("the addition of i and j is= " +c);
	}
	
	void add(float i,float j)
	
	{
		float c=(float) (i+j);
		System.out.println("the addition of i and j is= "+c);
	}
	void add(double i,double j)
	{
		 double c =(double) i+j;
		System.out.println("the addition of i and j is= "+c);
	}
	
	void add(short i,short j)
	{
		 short c =(short) (i+j);
		System.out.println("the addition of i and j is= "+c);
	}
	void add(byte i,byte j)
	{
		 short c =(byte) (i+j);
		System.out.println("the addition of i and j is= "+c);
	}
}

public class ConstructorCalc {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function ad = new Function();
		
		ad.add(4,6);//int int
		ad.add(5.6f,6.5f);//float f float j
		ad.add(7.6,9.4); //double i double j
        ad.add(7,7); //byte byte
        ad.add(8,8); //short byte
	}
}


