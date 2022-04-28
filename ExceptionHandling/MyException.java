package ExceptionHandling;

//Java program to demonstrate user defined exception

//This program throws an exception whenever balance
//amount is below Rs 1000
class MyException extends Exception
{
//store account information
int accno[] = {1001, 1002, 1003, 1004};
String name[] ={"Nish", "Shubh", "Sush", "Abhi", "Akash"};
double bal[] ={10000.00, 12000.00, 5600.0, 999.00, 1100.55};

void display() {
	System.out.println("ACCNO" + "\t" + "CUSTOMER" +"\t" + "BALANCE");

//display the actual account information
for (int i = 0; i < 5 ; i++) {
	try {
		if(acBal[i]<1000)
			throw new MySecException(acName[i]+ 's' +"Balance is less than 1000");
		System.out.println(accno[i] + "\t" + name[i] +"\t\t" + acBal[i]);
	}
	catch(MysecException e) {
		System.out.println(e.getMessage);
	}
}
public class SecondCustomException {
	public static void main(String[] args) {
		BankDetails bd = new BankDetails();
		bd.display();
	}
catch (MyException e) {
e.printStackTrace();
}
}
}

