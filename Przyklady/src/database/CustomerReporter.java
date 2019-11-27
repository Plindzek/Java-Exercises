package database;

import java.sql.*;

public class CustomerReporter {
	public static void main(String[] arguments) {
		String data = "jdbc:derby://localhost:1527/D:/Databases/sample";
		try (Connection conn = DriverManager.getConnection(data, "app", "app");
				Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {

			Class.forName("org.apache.derby.jdbc.ClientDriver");

			
			ResultSet rec = st.executeQuery("select *" + "from APP.CUSTOMER " + "order by CUSTOMER_ID");

			ResultSetMetaData as = rec.getMetaData();
			int colNo = as.getColumnCount();
			while (rec.next()) {
				try {
					for (int i = 1; i <= colNo; i++)
						System.out.println(i+". " + as.getColumnLabel(i)+": "+ rec.getString(i));
				} catch (SQLException e) {
				}
				System.out.println();
			}

			st.close();
		} catch (SQLException s) {
			System.out.println("B³¹d SQL: " + s.toString() + " " + s.getErrorCode() + " " + s.getSQLState());
		} catch (Exception e) {
			System.out.println("B³¹d: " + e.toString() + e.getMessage());
		}
	}
}
