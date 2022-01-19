package servlet.image;

import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/UploadImage")
public class UploadImage extends HttpServlet {

	private static final long serialVersionUID = -337920480578240289L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try {
			String strpath = request.getParameter("image");
			System.out.println(strpath);
			String filepath = strpath.substring(strpath.lastIndexOf("\\") + 1);
			File imgfile = new File(strpath);
			FileInputStream fin = new FileInputStream(imgfile);
			Connection con = null;
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "1234");
			PreparedStatement pre = con.prepareStatement("insert into upload_image(image,image_name,image_length) values(?,?,?)");
			pre.setBinaryStream(1, fin, (int) imgfile.length());
			pre.setString(2, filepath);
			pre.setLong(3, imgfile.length());
			pre.executeUpdate();
			pre.close();
			String L_url1 = response.encodeRedirectURL("extra.txt");
			response.sendRedirect(L_url1);

		} catch (Exception ex) {
			System.out.println("Exception in InsertImage servlet" + ex.getMessage());
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}
}