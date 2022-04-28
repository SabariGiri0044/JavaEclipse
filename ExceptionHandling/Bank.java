package ExceptionHandling;

public class Bank {

	class exp extends Exception
	{
		exp(String s)
		{
			super(s);
		}
	}
	class bank{
		int[] acno = {1001,1002,1003,1004,1005};
		String[]acnm = {"ava","ani","Ana","Ash","Aacbalnu"};
		double[]acbal = {10000.00,12000.00,560.0,999.00,1100.55};
		void show()
		{
			System.out.println(" ACCNO " + "\t" + " CUSTOMER " + "\t" + " BALANCE ");  ;
		for(int i=0;i<5;i++)
		{
			try {
				if(acbal[i]<1000)
					throw new exp(acnm[i]+ " "+" balance is less than 1000 ");
				System.out.println(acno[i]+ " \t " +acnm[i]+ " \t \t " +acbal[i]);
				
			}
			catch(exp e)
			{
				//e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
		}
	}
		
		

	public class Bankkk {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	bank b1 = new bank();
	b1.show();
		}

	}
	
	