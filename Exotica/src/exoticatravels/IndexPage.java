/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exoticatravels;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Karuna.Sadh
 */
public class IndexPage extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {

           out.println("<html>");
            out.println("<head>");
            out.println("<title>Index</title>");
            out.println("</head>");
            out.println("<body>");
           out.println("<table border='0' bgcolor='#808080' align='top' width='100%' style='height:100px'>");
           out.println("<tr>");
           out.println("<td bgcolor='#000080' align='center'>");
           out.println("<font style='font-family: 'Arial Rounded MT Bold', Gadget, sans-serif;' size='+4' color='#FFE4B5'>Exotica Travels</font>");
            out.println("</td>");
                out.println("<td bgcolor='666699' align='left' width='180'>");
                out.println("<img src='Images/Company Logo.jpg' width='180' height='120' align='right'/>");
             out.println("</td>");
           out.println("</tr>");
           out.println("</table>");
            out.println("<br/>");
            out.println("<center><B><I><font style='font-family: 'Brush Script MT Italics', Gadget, sans-serif;' size='+1' color='darkblue'>Exotica Travels is a travel management company established by Jordan Desilva in Colombo, Sri Lanka. Today under the chairmanship of Jim Henry, the company has spread across the country. It provides online air tickets booking. In addition, it provides hotel suite booking in various exotic locations all over the world. Moreover, it provides rental car bookings.Toel from a list of hotels for stay purposes. To avail the travel package services, kindly Login or SignUp.</B></I></center>");
            out.println("<br/>");
                  out.println("<form method='Post' action='SubmitServlet'>");
                     out.println("<table cellspacing='10' align='center'>");
               out.println("<tr>");
              out.println("<td><font color='darkblue' size='+2'>LOGIN AS:");
              out.println("</tr>");
                out.println("</td>");
                  out.println("</table>");
                    out.println("<table cellspacing='10' align='center'border='2' bordercolor='black'>");
               out.println("<tr><td bordercolor='white'><input type='Radio' value='existinguser' name='r2' CHECKED>Existing User");
     out.println("<tr><td bordercolor='white'><input type='Radio'value='newuser' name='r2'>New User");
     out.println("<tr><td bordercolor='white'><input type='Submit'value='Submit'>");
                      out.println("</table>");
                   out.println("</form>");
               out.println("</body>");
               out.println("</html>");

        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
