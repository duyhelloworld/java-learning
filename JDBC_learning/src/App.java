import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
// import java.sql.Statement;


public class App {
    // Write to function for allow apps can run contemporally
    public static Connection getConnect(String url, String username, String passwd){
        // Class.forName must be in try catch
        try {
            // Load Driver
            // MySQL driver : com.mysql.jdbc.Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, username, passwd);            
        } catch (Exception e) {
            return null;
        }
    };
    public static void main(String[] args) throws Exception {
        Connection con = getConnect("jdbc:mysql://localhost:3306/DEMO?createIfNotExist", "duyaiti", "12345678");
        if (con == null) {
            System.out.println("Loi, thao tac lai");
        }
        else{
            System.out.println("Ok! Database connected");
        // + 2 ways to execute querries
        // > Statement (cant insert data to the command)
            // String command = "SELECT * FROM `Category`";
            // Statement statement = null;
            // statement = con.createStatement();
                // return a PrepareStatement Object
            // ResultSet resultSet = statement.executeQuery(command);
                // return like its name : resultSet is default Object of JDBC return
            // while (resultSet.next()) {
                // System.out.println(resultSet + "\n" + resultSet.toString());
                // Location of resultSet
            //     int id = resultSet.getInt("ID");
            //     String name = resultSet.getString("Name");
            //     String code = resultSet.getString("Code");
            //     Date date = resultSet.getDate("create_date");
            //     System.out.println(id + "\t|\t" + name + "\t|\t" + code + "\t|\t" + date); 
            // }


            // ! Get data by hard code
            // String command2 = "SELECT * FROM `Category` WHERE code = 10293";

            // ResultSet resultSet2 = statement.executeQuery(command2);
            // while (resultSet2.next()) {
            //     int id = resultSet2.getInt("ID");
            //     String name = resultSet2.getString("Name");
            //     String code = resultSet2.getString("Code");
            //     Date date = resultSet2.getDate("create_date");
            //     System.out.println(id + "\t|\t" + name + "\t|\t" + code + "\t|\t" + date); 
            // }

            String tableName = "`Category`";
            String cmd = "SELECT * FROM " + tableName;
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = con.prepareStatement(cmd);
                ResultSet set = preparedStatement.executeQuery();
                while (set.next()) { // check if exist Object in 'set'
                    int id = set.getInt("ID");
                    // get + type + "column name"
                    String name = set.getString("Name");
                    String code = set.getString("Code");
                    Date date = set.getDate("create_date");
                    System.out.println(id + "\t|\t" + name + "\t|\t" + code + "\t|\t" + date); 
                }
                // Why must close it ? One connection for one statement slows down the speed of your application.
                if (set != null) {
                    set.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (con != null) {
                    con.commit();
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
