package servlet.image;

import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(urlPatterns = "/RetrieveImage")
public class RetrieveImage extends HttpServlet {
	private static final long serialVersionUID = 4593558495041379082L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ResultSet rs;
		InputStream sImage;

		try {

			String id = request.getParameter("Image_id");
			Connection con = null;
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "1234");
			Statement stmt = con.createStatement();
			String strSql = "select IMAGE from upload_image where image_id='" + id + "'";
			rs = stmt.executeQuery(strSql);
			if (rs.next()) {
				byte[] bytearray = new byte[1048576];
				int size = 0;
				sImage = rs.getBinaryStream(1);
				response.reset();
				response.setContentType("image/jpeg");
				while ((size = sImage.read(bytearray)) != -1) {
					response.getOutputStream().write(bytearray, 0, size);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/*
CREATE TABLE upload_image (
Image_id int NOT NULL AUTO_INCREMENT ,
IMAGE longblob NULL DEFAULT NULL ,
Image_name varchar(50) ,
image_length varchar(50),
PRIMARY KEY (Image_id));
*/


