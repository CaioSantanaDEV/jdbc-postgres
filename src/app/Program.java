package app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import entities.Product;
import db.DB;

public class Program {

	public static void main(String[] args) throws SQLException {
		
		Product p = new Product();
		
		Connection conn = DB.getConnection();
	
		Statement st = conn.createStatement();
			
		ResultSet rs = st.executeQuery("select * from tb_product");
			
		while (rs.next()) {
			
			 p = instantiateProduct(rs);
			
			System.out.println(p);
		}
	}
	
	private static Product instantiateProduct (ResultSet rs) throws SQLException {
		
		Product p = new Product();
		
		p.setId(rs.getLong("id"));
		p.setName(rs.getString("name"));
		p.setImageUrl(rs.getString("image_uri"));
		p.setDescription(rs.getString("description"));
		p.setPrice(rs.getDouble("price"));
		return p;
		
		
	}
	
}
