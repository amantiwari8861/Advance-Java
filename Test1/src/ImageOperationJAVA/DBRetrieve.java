/*
 * package ImageOperationJAVA;
 * 
 * import java.io.*; import java.sql.*;
 * 
 * public class DBRetrieve { public static void main(String args[]) { try {
 * Class.forName("com.mysql.cj.jdbc.Driver"); Connection con =
 * DriverManager.getConnection("jdbc:mysql://localhost/jdbc", "root", "1234");
 * File file = new File("profile.png"); FileOutputStream fos = new
 * FileOutputStream(file); byte b[]; Blob blob; PreparedStatement ps =
 * con.prepareStatement("select Data from images"); ResultSet rs =
 * ps.executeQuery(); while (rs.next()) { blob = rs.getBlob("Data"); b =
 * blob.getBytes(1, (int) blob.length()); fos.write(b); } ps.close();
 * fos.close(); con.close(); } catch (Exception e) { e.printStackTrace(); } } }
 */