package Forms;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import connectDatabase.koneksi;

public class Menuboba 
{
	Connection connection;
	public Menuboba()
	{
		try {
			initconnection();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
		
		public void initconnection() throws SQLException 
		{
			connection = koneksi.connect();
			
			if (connection==null) 
			{
				throw new SQLException("connection");
			}
		}
		
		public ArrayList<ArrayList<String>> getData() 
		{
			  ArrayList<ArrayList<String>> data = new ArrayList<>();
			  try 
			  {
			    Statement stmt = connection.createStatement();
			    String sql = "SELECT * FROM menuboba";
			    ResultSet rs = stmt.executeQuery(sql);
			    while(rs.next()) {
				ArrayList<String> row = new ArrayList<>();
			    row.add(rs.getString(1));
			    row.add(rs.getString(2));
			    row.add(rs.getString(3));
			    row.add(rs.getString(4));
			    data.add(row);
			   }
			  } catch (SQLException e) 
			  {
			   e.printStackTrace();
			  }
			 return data;
		}
		public void Insert(String Kode, String Nama, String Harga, String Stok) 
		{
			  try {
			   Statement stmt = connection.createStatement();
			   String sql = "Insert Boba ('"+ Kode +"', '"+ Nama +"', '"+ Harga +"', '"+ Stok +"')";
			   stmt.executeUpdate(sql);
			  } catch (SQLException e) 
			  {
			   e.printStackTrace();
			}

		 }
		 public void Update(String Kode, String Harga, String Stok) 
		 {
			  try 
			  {
			   Statement stmt = connection.createStatement();
			   String sql = "Update Price='" + Harga + "', stock='" + Stok + "' where menuCode='" + Kode + "'";
			   stmt.executeUpdate(sql);
			  } catch (SQLException e) 
			  {
			   e.printStackTrace();
			 }
		  }
		 public void Delete(String Kode) 
		 {
			  try {
			   Statement stmt = connection.createStatement();
			   String sql = "Delete Code='" + Kode + "'";
			   stmt.executeUpdate(sql);
			  } catch (SQLException e) 
			  {
			   e.printStackTrace();
			  }
		 }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Menuboba();
	}

}
