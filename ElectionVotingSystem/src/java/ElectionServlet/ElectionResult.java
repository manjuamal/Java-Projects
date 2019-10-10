/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElectionServlet;

import ElectionBean.Election;
import ElectionDetailsDAO.DBConnector;
import ElectionDetailsDAO.VoteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Manjuvijay
 */
public class ElectionResult extends HttpServlet {

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
       // response.setContentType("text/html;charset=UTF-8");
       
    }
public void init()
    {
        ServletContext sc = this.getServletContext();
        String driver = sc.getInitParameter("driver");
        String database = sc.getInitParameter("database");
        String username = sc.getInitParameter("dbusername");
        String password = sc.getInitParameter("dbpassword");
        String url = sc.getInitParameter("url"); 
        DBConnector.createConnection(driver,url,database,username,password);
    }
    
    /**
     * Handles the HTTP <code>GET</code> method.
     *In doGet method election results are retrieved from the table and 
     * stored in request and displayed in JSP election result page
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
   ArrayList<Election> eresult = VoteDAO.ElectionResult();
    request.setAttribute("electionresult",eresult );
   request.getRequestDispatcher("ElectionResult.jsp").forward(request, response);
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
       // processRequest(request, response);
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
