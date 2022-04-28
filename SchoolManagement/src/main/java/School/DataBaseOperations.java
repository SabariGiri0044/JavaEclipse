package School;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseOperations {
	static Connection conn;
	static PreparedStatement pst;
	static ResultSet rs;
	int sd;
	String sn;
	 void insetRecord() throws  IOException, SQLException {
		 try {
		conn=DataBaseUtilityClass.getConnection();
		
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	   System.out.println("Enter school name");
	   sn=br.readLine();
	   System.out.println("School id");
	   sd=Integer.parseInt(br.readLine());
	   
		String sel="select * from school where sid=?";
		
		pst=conn.prepareStatement(sel);
		pst.setInt(1, sd);
		rs=pst.executeQuery();
		
		//check record exists
		if(!rs.next()) {
			String ins="insert into school values(?,?)";
			pst=conn.prepareStatement(ins);
			pst.setInt(1, sd);
			pst.setString(2, sn);
			int i=pst.executeUpdate();
			if(i>0) {
				System.out.println("Record added successfully");
			}else
			{
				System.out.println("Record not added ");
			}
			
		}else {
			System.out.println("Schoo id "+sd +" exists");
		}
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		finally {
			pst.close();
			rs.close();
			conn.close();
		}
		
	}
	 
	 //update record
	 void updateRecord() throws IOException, SQLException {
		 try {
		 conn = DataBaseUtilityClass.getConnection();
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		   System.out.println("Enter school name");
		   sn=br.readLine();
		   System.out.println("School id");
		   sd=Integer.parseInt(br.readLine());
		   
			String sel="select * from school where sid=?";
			
			pst=conn.prepareStatement(sel);
			pst.setInt(1, sd);
			rs=pst.executeQuery();
			//for update record record should exists
			if(rs.next()) {
				String upr="update school set sname=? where sid=?";
				pst=conn.prepareStatement(upr);
				pst.setString(1, sn);
				pst.setInt(2, sd);
				int i=pst.executeUpdate();
				if(i>0) {
					System.out.println("Record updated");
				}else {
					System.out.println("Not updated");
				}
				
				
			}else {
				System.out.println("Record not exists");
			}
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 finally {
				pst.close();
				rs.close();
				conn.close();
			}
			
		 
	 }
	 
	 void deleteRecord() throws NumberFormatException, IOException, SQLException {
		 try {
		 conn = DataBaseUtilityClass.getConnection();
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		   System.out.println("School id");
		   sd=Integer.parseInt(br.readLine());
		   
			String sel="select * from school where sid=?";
			
			pst=conn.prepareStatement(sel);
			pst.setInt(1, sd);
			rs=pst.executeQuery();
			//for update record record should exists
			if(rs.next()) {
				String delr="delete from school where sid=?";
				pst=conn.prepareStatement(delr);
				
				pst.setInt(1, sd);
				int i=pst.executeUpdate();
				if(i>0) {
					System.out.println("Record deleted");
				}else {
					System.out.println("Not deleted");
				}
				
				
			}else {
				System.out.println("Record not exists");
			}
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		finally {
			pst.close();
			rs.close();
			conn.close();
		}
		 
	 }
	 
	 void displayAllRecord() throws SQLException {
		 try {
			 conn = DataBaseUtilityClass.getConnection();
			 String sel="select * from school";
			 pst=conn.prepareStatement(sel);
			 
			 ResultSet rs=pst.executeQuery();
			 System.out.println("SID\tSNAME");
			 while(rs.next()) {
				 System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
			 }
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 finally {
				pst.close();
				if(rs!=null) {
				rs.close();
				}
				conn.close();
			}
			 
		}
	 
	 void displayParticlarRecord() throws SQLException {
		 try {
			 conn = DataBaseUtilityClass.getConnection();
			 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
			   System.out.println("School id");
			   sd=Integer.parseInt(br.readLine());
			 String sel="select * from school where sid=?";
			 pst=conn.prepareStatement(sel);
			 pst.setInt(1, sd);
			 ResultSet rs=pst.executeQuery();
			 System.out.println("SID\tSNAME");
			 if(rs.next()) {
				 System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
			 }
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 finally {
				pst.close();
				if(rs!=null) {
				rs.close();
				}
				conn.close();
			}
			 
		}
}