package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.MysqlDataSource;


public class DataReader {

	void read() {
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
			String url="jdbc:derby://localhost:1527/D:/Databases/Baza Adama";
			String url1="jdbc:mysql://localhost:3306?allowPublicKeyRetrieval=true&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			String user=	"Adam";
			String password ="1234";
			
			
			try {
				MysqlDataSource dataSource = new MysqlDataSource();
				dataSource.setUseSSL( false );
				dataSource.setServerTimezone("UTC");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
	        	

		try (Connection conn = DriverManager.getConnection(url1, "root", "Programista15k"); Statement ent = conn.createStatement();
				) 
		
				{
			
			ResultSet result = ent.executeQuery("SELECT*FROM baza_adama.CARDATA");
			ResultSetMetaData as = result.getMetaData();
			int colNo = as.getColumnCount();
			while (result.next()) {
				try {
					for (int i = 1; i <= colNo; i++)
						System.out.println(i + ". " + as.getColumnLabel(i) + ": " + result.getString(i));
				} catch (SQLException e) {
				}
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		new DataReader().read();

	}

}
