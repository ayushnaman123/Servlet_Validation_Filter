package in.coder.util;

import java.sql.Connection;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class JdbcUtil {
     private JdbcUtil() {}
     
     static {
    	 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }
     
     public static Connection getJdbcConnection() throws SQLException {
        String file = "D:\\ineuron\\PracticeServlet\\ValidationFilterApp\\src\\main\\java\\in\\coder\\properties\\Application.properties";
        HikariConfig config = new HikariConfig(file);
        HikariDataSource dataSource = new HikariDataSource(config);
        return dataSource.getConnection();
     }
}
