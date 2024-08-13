import java.sql.*;

public class ScholarshipManager {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/exam";
        String user = "root";
        String password = "1234";

        Connection conn = null;
        Savepoint savepoint1 = null;

        try {
            conn = DriverManager.getConnection(url, user, password);
            conn.setAutoCommit(false); // Start transaction

            // Step 1: Insert new award record
            String insertAwardSQL = "INSERT INTO awards (awardID ,studentId, scholarshipId, awardDate) VALUES (?,?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertAwardSQL);
            pstmt.setInt(1,6); // awardId   
            pstmt.setInt(2, 6); // StudentID
            pstmt.setInt(3, 6); // ScholarshipID
            pstmt.setDate(4, Date.valueOf("2024-07-20")); // AwardDate
            pstmt.executeUpdate();

            // Get the scholarship amount
            String getScholarshipAmountSQL = "SELECT amount FROM scholarships WHERE scholarshipID = ?";
            pstmt = conn.prepareStatement(getScholarshipAmountSQL);
            pstmt.setInt(1, 1); // ScholarshipID
            ResultSet rs = pstmt.executeQuery();
            double scholarshipAmount = 0.0;
            if (rs.next()) {
                scholarshipAmount = rs.getDouble("amount");
            }

            // Step 2: Deduct the scholarship amount from the student's total credits
            String updateCreditsSQL = "UPDATE student SET totalCredits = totalCredits - ? WHERE sid = ?";
            pstmt = conn.prepareStatement(updateCreditsSQL);
            pstmt.setDouble(1, scholarshipAmount);
            pstmt.setInt(2, 2); // StudentID
            pstmt.executeUpdate();

            // Savepoint before checking total credits
            savepoint1 = conn.setSavepoint("Savepoint1");

            // Check if total credits are negative
            String checkCreditsSQL = "SELECT totalCredits FROM student WHERE sid = ?";
            pstmt = conn.prepareStatement(checkCreditsSQL);
            pstmt.setInt(1, 2); // StudentID
            rs = pstmt.executeQuery();
            int totalCredits = 0;
            if (rs.next()) {
                totalCredits = rs.getInt("totalCredits");
            }

            if (totalCredits < 0) {
                conn.rollback(savepoint1); // Rollback to savepoint if total credits are negative
                System.out.println("Transaction rolled back to savepoint due to negative total credits.");
            } else {
                // Step 3: Add the scholarship amount to the student's account
                String updateAccountSQL = "UPDATE account SET balance = balance + ? WHERE studentId = ?";
                pstmt = conn.prepareStatement(updateAccountSQL);
                pstmt.setDouble(1, scholarshipAmount);
                pstmt.setInt(2, 2); // StudentID
                pstmt.executeUpdate();

                conn.commit(); // Commit transaction
                System.out.println("Transaction committed successfully.");
            }
        } catch (SQLException e) {
            if (conn != null) {
                try {
                    conn.rollback(); // Rollback entire transaction if any operation fails
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.setAutoCommit(true); // Reset auto commit
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
