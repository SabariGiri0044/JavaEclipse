package ExceptionHandling;

public class Exception {

		public static void main(String[] args) {
		int num=24,den=24;
		int ans=0;
		int a[]=new int[4];
		System.out.println("before division");
		try
		{
		a[2]=8;

		ans=num/den;
		}
		// instead this we can use catch (exception e );//
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
		e.printStackTrace();
		}

		finally
		{
		System.out.println("exception always");
		}
		System.out.println(ans);
		System.out.println("after division");
		}
		}
