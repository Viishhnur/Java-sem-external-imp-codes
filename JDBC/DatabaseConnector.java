import java.sql.*;

public class DatabaseConnector {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://127.0.0.1:3306/Smartphone";
        String username = "root";
        String password = "1234";  

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create a statement
            Statement statement = connection.createStatement();     

            // Execute a query
            String q1 = "SELECT COUNT(*) AS total_smartphones FROM smartphones";
            String q2 = "SELECT * FROM smartphones";
            String q3 = "SELECT * FROM smartphones WHERE BRAND='Samsung'";
            String q4 = "SELECT * FROM smartphones WHERE Final Price = (SELECT MIN(Final Price) FROM smartphones WHERE BRAND='Nothing')";
            String q5 = "SELECT * FROM smartphones ORDER BY Final Price";
            ResultSet resultSet = statement.executeQuery(q1);

            // Process the result set
            while (resultSet.next()) {
                //System.out.println("smartphone: " + resultSet.getString("Smartphone"));
                //System.out.println("Column2: " + resultSet.getInt("column2"));

                //Qno. 1
                int totalSmartphones = resultSet.getInt("total_smartphones");
                System.out.println("Total number of smartphones: " + totalSmartphones);

                //Qno. 2
                // System.out.println("PhoneName: "+ resultSet.getString("Smartphone"));
                // System.out.println("Model: "+resultSet.getString("Model"));

                // Qno. 3
                //System.out.println("Phones with Brand samsung: "+ resultSet.getString("Smartphone"));

                //Qno.4
                //System.out.println("The cheapest phone from brand Nothing is: "+ resultSet.getFloat("Final Price"));

                //Qno.5
                // System.out.println(resultSet.getString("Smartphone"));
            }

            // Close connections
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}