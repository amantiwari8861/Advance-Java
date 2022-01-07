/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exoticatravels;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Karuna.Sadh
 */
public class NewUserServlet extends HttpServlet {

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
        String Uid=request.getParameter("t1");
        String Pwd=request.getParameter("t2");
        PrintWriter out = response.getWriter();
        try {
              out.println("<html>");
            out.println("<head>");
            out.println("<title>HomePage</title>");
            out.println("</head>");
            out.println("<body>");
           out.println("<table border='0' bgcolor='#808080' align='top' width='100%' style='height:100px'>");
           out.println("<tr>");
           out.println("<td bgcolor='#000080' align='center'>");
           out.println("<font style='font-family: 'Arial Rounded MT Bold', Gadget, sans-serif;' size='+4' color='#FFE4B5'>Exotica Travels</font>");
            out.println("</td>");
                out.println("<td bgcolor='666699' align='left' width='180'>");
                out.println("<img src='Images/Uni.jpg' width='180' height='120' align='right'/>");
             out.println("</td>");
           out.println("</tr>");
           out.println("</table>");
//               out.println("<table>");
//            out.println("<tr>");
//               out.println("<td><font style='Arial Bold' color='darkblue' size='+1'><a href='a.html'>Domestic Flights</a></td>");
//               out.println("<td><font color='darkblue' size='+1'><a href='a.html'>International Flights</a></td>");
//               out.println("<td><font color='darkblue' size='+1'><a href='a.html'>Hotels</a></td>");
//               out.println("<td><font color='darkblue' size='+1'><a href='a.html'>Car Rentals</a></td>");
//               out.println("<td><font color='darkblue' size='+1'><a href='a.html'>Tour Packages</a></td>");
//               out.println("</tr>");
//                  out.println("</table>");
                  out.println("<form method='Post' action='submitservlet'>");
                     out.println("<table cellspacing='10' align='center'>");
               out.println("<tr>");
              out.println("<td><font color='darkblue' size='+2'>New User Registration Form");
              out.println("</tr>");
                out.println("</td>");
                  out.println("</table>");
                    out.println("<table cellspacing='10' align='center'border='2' bordercolor='black'>");
             out.println("<tr><td bordercolor='white'>User Name:<td COLSPAN='2'bordercolor='white'><input type='text' name='tt1'>");
             out.println("<tr><td bordercolor='white'>User Id:<td COLSPAN='2'bordercolor='white'>");
             out.println("<input type='text' name='tt2'>");
             out.println("</tr>");
       out.println("<tr><td bordercolor='white'>Password:<td COLSPAN='2'bordercolor='white'>");
       out.println("<input type='password' name='tt3'>");
         out.println("</tr>");
             out.println("<tr><td bordercolor='white'>Re-enter Password:<td COLSPAN='2' bordercolor='white'><input type='password' name='tt4'>");
         out.println("<tr><td bordercolor='white'>Address:<td COLSPAN='2' bordercolor='white'><input type='textArea' name='tt5'>");
             out.println("<tr><td bordercolor='white'>State:<td COLSPAN='2' bordercolor='white'><input type='text' name='tt6'>");
     out.println("<tr><td bordercolor='white'>Country:<td COLSPAN='2' bordercolor='white'><input type='text' name='tt7'>");
        out.println("<tr><td bordercolor='white'></br>");
     out.println("<tr><td bordercolor='white'><input type='Submit'value='Submit'>");
     out.println("<td bordercolor='white'><input type='RESET'text='Reset'>");

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