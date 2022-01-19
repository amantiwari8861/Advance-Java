/*
 * package ImageOperationJAVA;
 * 
 * import java.sql.*; import java.io.*;
 * 
 * public class DatabaseImageExample { public static void main(String args[]) {
 * try { Class.forName("com.mysql.cj.jdbc.Driver"); Connection con =
 * DriverManager.getConnection("jdbc:mysql://localhost/jdbc", "root", "1234");
 * File file = new File("F:\\docs\\profile.jpg"); FileInputStream fis = new
 * FileInputStream(file); PreparedStatement ps =
 * con.prepareStatement("insert into images(Data) values(?)");
 * ps.setBinaryStream(1, fis, (int) file.length()); ps.executeUpdate();
 * 
 * ps.close(); fis.close(); con.close(); } catch (Exception e) {
 * e.printStackTrace(); } } }
 */