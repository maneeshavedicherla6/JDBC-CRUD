package jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDataDynamically {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
		PreparedStatement ps = con.prepareStatement("update employee set name=? where id=?");
		System.out.println("enter new name");
		Scanner scn=new Scanner(System.in);
		String name=scn.next();
		System.out.println("enter id");
		int id=scn.nextInt();
		
		
		
		ps.setString(1, name);
		ps.setInt(2, id);
		ps.execute();
		System.out.println("values updated");
		

	}

}