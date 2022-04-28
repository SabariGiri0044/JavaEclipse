package School;
//DataBaseUtility Class
import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseUtilityClass {
  static  Connection conn=null;
  static final String URL="jdbc:mysql://localhost:3306/schoolmanagement";
  static final String UN="root";
  static final String PASS="Root123@";
  static String DB="com.mysql.cj.jdbc.Driver";
  
  public static Connection getConnection() {
  	try {
  		//load the driver
  		Class.forName(DB);
  		conn = DriverManager.getConnection(URL, UN, PASS);
  		
  		if(conn!=null) {
  			System.out.println("Connected");
  		}else {
  			System.out.println("Not connected");
  		}
  	}catch(Exception e) {
  		e.printStackTrace();
  	}

  	return conn;
  	
  	 }
  
}