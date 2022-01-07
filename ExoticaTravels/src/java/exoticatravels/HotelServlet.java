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
 * @author Pradeep.Reddy
 */
public class HotelServlet extends HttpServlet {
   
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
            out.println("<title>HomePage</title>");
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
            out.println("<table>");
            out.println("<tr>");
            out.println("<td><font style='Arial Bold' color='darkblue' size='+1'><a href='FlightsServlet'>Domestic Flights</a></td>");
            out.println("<td><font color='darkblue' size='+1'><a href='FlightsServlet'>International Flights</a></td>");
            out.println("<td><font color='darkblue' size='+1'><a href='HotelServlet'>Hotels</a></td>");
            out.println("<td><font color='darkblue' size='+1'><a href='ConstructionServlet'>Car Rentals</a></td>");
            out.println("<td><font color='darkblue' size='+1'><a href='TourPackageServlet'>Tour Packages</a></td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("<br>");
            out.println("<font align='center' color='darkblue' size='+1'>Please select the hotel in which you would like to stay:");
            out.println("<form action='SessionServlet' name='MyForm' Method='POST'>");
            out.println("<table cellspacing='10' align='center'border='2' bordercolor='black'>");
            out.println("<tr>");
            out.println("<td bordercolor='white'>Select Hotel: </td>");
            out.println("<td bordercolor='white'>");
            out.println("<select name='HotelName'>");
            out.println("<option value='Sea View'>Hotel Sea View</option>");
            out.println("<option value='Sea Breeze'>Hotel Sea Breeze</option>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td bordercolor='white'>Number of days: </td>");
            out.println("<td bordercolor='white'><input type= 'text' name='numOfDays'</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td bordercolor='white'>");
            out.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type='submit' Value='Next'></input></a>");
            out.println("<input type='hidden' value='Hotels' name='PageName'/>");
            out.println("</td");
            out.println("</tr>");
            out.println("</table>");
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
