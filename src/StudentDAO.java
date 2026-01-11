import java.sql.*;

public class StudentDAO {

    public void addStudent(Student s) {
        try (Connection con = DBConnection.getConnection()) {
            String sql = "INSERT INTO students(name,email,course,percentage) VALUES(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getCourse());
            ps.setDouble(4, s.getPercentage());
            ps.executeUpdate();
            System.out.println("Student added successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewStudents() {
        try (Connection con = DBConnection.getConnection()) {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM students");

            System.out.println("\nID | Name | Email | Course | Percentage");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("email") + " | " +
                        rs.getString("course") + " | " +
                        rs.getDouble("percentage")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(int id, double percentage) {
        try (Connection con = DBConnection.getConnection()) {
            String sql = "UPDATE students SET percentage=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, percentage);
            ps.setInt(2, id);
            ps.executeUpdate();
            System.out.println("Student updated successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int id) {
        try (Connection con = DBConnection.getConnection()) {
            String sql = "DELETE FROM students WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Student deleted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
