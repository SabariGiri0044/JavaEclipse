package School;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class SchoolManagementSystemMain {

	public static void main(String[] args) throws NumberFormatException, IOException, SQLException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		DataBaseOperations ob = new DataBaseOperations();
		while(true) {
			System.out.println("*****MENU***********");
			System.out.println("SCHOOL MANAGEMENT SYSTEM");
			System.out.println("1.Add School Data");
			System.out.println("2.update School Data");
			System.out.println("3.Delete School Data");
			System.out.println("4.Display School Data");
			System.out.println("5.Particular School Data");
			System.out.println("Enter the option");
			int ch=Integer.parseInt(br.readLine());
			switch(ch) {
			case 1:ob.insetRecord();
			        break;
			case 2:ob.updateRecord();
			        break;
			case 3: ob.deleteRecord();
			         break;
			case 4:ob.displayAllRecord();
			        break;
			case 5:ob.displayParticlarRecord();
			       break;
			   
			        
			}
			System.out.println("Do you want to continue Y/N");
			char choice=br.readLine().charAt(0);
			if(choice=='N' || choice=='n') {
				break;
			}
		}
		
	}

}
