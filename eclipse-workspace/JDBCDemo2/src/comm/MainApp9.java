package comm;
//import java.sql.SQLException;



import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;



public class MainApp9 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
                try {
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver Loaded");
					
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","jewel","jewel");
				   System.out.println("Database Connected");
				  

					java.sql.Statement st=con.createStatement();
			    	ResultSet rset= st.executeQuery("select distinct address from employee ");
					

					 
					while(rset.next()) {
					
						System.out.println(" Address = " + rset.getString(1));
					}
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                
	}

}

