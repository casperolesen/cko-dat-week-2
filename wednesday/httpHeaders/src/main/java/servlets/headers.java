/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Casper Kruse Olesen
 */
@WebServlet(name = "headers", urlPatterns = {"/headers"})
public class headers extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet headers</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet headers at " + request.getContextPath() + "</h1>");
            out.println("<table border=1>");
            out.println("<thead>"); // header
            out.println("<th>Header</th>");
            out.println("<th>Value</th>");
            out.println("</thead>");
            out.println("<tbody>"); // body
            out.println("<tr><td>host</td><td>" +request.getHeader("host")+ "</td></tr>");
            out.println("<tr><td>connection</td><td>" +request.getHeader("connection")+ "</td></tr>");
            out.println("<tr><td>cache-control</td><td>" +request.getHeader("cache-control")+ "</td></tr>");
            out.println("<tr><td>accept</td><td>" +request.getHeader("accept")+ "</td></tr>");
            out.println("<tr><td>user-agent</td><td>" +request.getHeader("user-agent")+ "</td></tr>");
            out.println("<tr><td>accept-encoding</td><td>" +request.getHeader("accept-encoding")+ "</td></tr>");
            out.println("<tr><td>accept-language</td><td>" +request.getHeader("accept-language")+ "</td></tr>");
            out.println("</tbody>");
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
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
     *
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
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
