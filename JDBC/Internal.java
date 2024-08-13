import java.sql.*;

public class Internal {
    private static final String url = "jdbc:mysql://localhost:3306/exam";
    private static final String username = "root";
    private static final String passwd = "1234";

    private static void loadDrivers(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); // com.mysql.cj is a package which has jdbc driver
        }
        catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
            return;
        }
    }
    // private static void retrieveData(){

    // }
    public static void main(String[] args){
        
        // Step-1
        loadDrivers();  
        // Create a connection

        try{
            Connection connection = DriverManager.getConnection(url, username, passwd);
            Statement statement = connection.createStatement();

            // insert a single record using string.format
            // String insertQuery = String.format("INSERT INTO student(sid,sname,totalCredits) VALUES (%d,'%s',%d)",26,"Viishhnu",100);
            // int rowsAffected = statement.executeUpdate(insertQuery);
            // System.out.println((rowsAffected>0)?"Succesfull insertion":"Not successful");

            // Update the data
            String updateQuery = String.format("UPDATE student SET totalCredits = totalCredits + %d WHERE sid = %d", 100,26);
            int rowsAffected = statement.executeUpdate(updateQuery);
            System.out.println((rowsAffected>0)?"Succesfull updation":"Not successful");

            // Retrive the data 
            String query = "SELECT * FROM student";
            ResultSet rs = statement.executeQuery(query); // if select staement then use executeQuery 
            while(rs.next()){
                int id = rs.getInt("sid");
                String name = rs.getString("sname");
                int totalCredits = rs.getInt("totalCredits");
                System.out.println("ID : "+id);
                System.out.println("Name : "+name);
                System.out.println("Total Credits : "+totalCredits);

            }


        }catch(SQLException e){
                System.out.println(e.getMessage());
        }
    
    }
}
