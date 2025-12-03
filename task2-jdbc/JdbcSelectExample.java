import java.sql.*;

public class JdbcSelectExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/internship_demo?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String pass = "root";

        String query = "SELECT id, name, role, salary FROM employees";

        try (Connection conn = DriverManager.getConnection(url, user, pass);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            System.out.println("ID | Name | Role | Salary");
            System.out.println("----------------------------");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String role = rs.getString("role");
                double salary = rs.getDouble("salary");
                System.out.printf("%d | %s | %s | %.2f%n", id, name, role, salary);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
