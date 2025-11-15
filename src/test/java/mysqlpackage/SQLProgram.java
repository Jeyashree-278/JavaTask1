package mysqlpackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SQLProgram {
	
	

	    public static void main(String[] args) {
	        String url = "jdbc:mysql://localhost:3306/guvi";
	        String username = "root";
	        String password = "Iniya123@";

	        String query = "INSERT INTO employee (empcode, empname, empage, esalary) VALUES (?, ?, ?, ?)";

	        try {
	            // 1. Load driver
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // 2. Establish connection
	            Connection con = DriverManager.getConnection(url, username, password);

	            // 3. Prepare statement
	            PreparedStatement ps = con.prepareStatement(query);

	            // --- Insert Records ---
	            Object[][] data = {
	                {101, "Jenny",   25, 10000},
	                {102, "Jacky",   30, 20000},
	                {103, "Joe",     20, 40000},
	                {104, "John",    40, 80000},
	                {105, "Shameer", 25, 90000}
	            };

	            for (Object[] rec : data) {
	                ps.setInt(1, (Integer) rec[0]);
	                ps.setString(2, (String) rec[1]);
	                ps.setInt(3, (Integer) rec[2]);
	                ps.setInt(4, (Integer) rec[3]);
	                ps.executeUpdate();
	            }

	            System.out.println("Employee records inserted successfully!");

	            // 4. Close connection
	            con.close();
	        } catch (Exception e) {
	            System.out.println("Error: " + e);
	        }
	    }
	}


