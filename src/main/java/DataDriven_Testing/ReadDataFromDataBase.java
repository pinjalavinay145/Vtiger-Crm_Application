package DataDriven_Testing;

import com.mysql.jdbc.Driver;

import java.io.IOException;
import java.sql.*;

public class ReadDataFromDataBase {
    public void readingDataFromExcel() throws SQLException {
        Connection connect = null;
        try {
            Driver driverRef = new Driver();
            DriverManager.registerDriver(driverRef);
            //step 2:connect to databasez
            connect = DriverManager.getConnection("jdbc:mysql://106.51.90.215:3333/projects", "root@%", "root");
            System.out.println("-----Done----");
            //step 3:create sql statement
            Statement statemnt = connect.createStatement();
            //step4:Execute select query(ms or mysql )
            ResultSet resultset = statemnt.executeQuery("select * from project");
            // int resultset1 = statemnt.executeUpdate("insert into project values('TY_PROJ_2001','Deepak')");
            while (resultset.next()) {
                System.out.println(resultset.getString(1) + "\t" + resultset.getString(2) + "\t" + resultset.getString(3));
            }
        } catch (SQLException e) {

        } finally {
            //step5:close the connection
            try {
                connect.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

