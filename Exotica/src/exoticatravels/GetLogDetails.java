/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exoticatravels;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Karuna.Sadh
 */
public class GetLogDetails extends HttpServlet {
   
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
//       FileInputStream fstream = new FileInputStream("log.txt");
//       InputStreamReader isr = new InputStreamReader(fstream);
//      BufferedReader reader = new BufferedReader(isr);
//      String line = null;
//
//        while ((line = reader.readLine()) != null)
//      {
//
//        out.println(line);
//
//      }
          
         File file = new File("log.txt");
         Scanner scanner = new Scanner(file);
       
        while (scanner.hasNext())
        {
            out.println(scanner.next());
            
        }
            scanner.close();

 
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
