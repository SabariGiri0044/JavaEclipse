package ExceptionHandling;

public class Arithmetic {

	public static void main(String[] args) {
		try {
			int a=10/0;
			int ar[]=new int[4];
			ar[7]=56;
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
	/*	{
			catch(Exception e) {
				e.printStackTrace();
			}
		}

			
		
			try {
				int a=10/0;
				int ar[]=new int[4];
				ar[7]=56;
				
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException |Exception e ) {
			e.printStackTrace();
		}*/



	}

}
