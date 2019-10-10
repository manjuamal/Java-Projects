/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElectionServlet;

import ElectionBean.CandidateInfo;
import ElectionDetailsDAO.DBConnector;
import ElectionDetailsDAO.ElectionDAO;
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
 * This Servlet is to
 */
public class ElectionServlet extends HttpServlet {

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
        }
    /**
     * Handles the HTTP <code>GET</code> method.
     *In do get method Candidate names and candidate id is retrieved from the database
     * and displayed to cast vote in Vote JSP page
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
    
     ArrayList<CandidateInfo> votelist = ElectionDAO.getCandidateInfo();
    request.setAttribute("vote",votelist);
    request.getRequestDispatcher("vote.jsp").forward(request, response);
    }
    /**
     *  
     * Connection to the database is created in this method
     * Initialize the parameters and passed to the DBConnector class to connect to database
     */
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
     * Handles the HTTP <code>POST</code> method.
     *In doPost method candidate id is retrieved from 
     * the request selected by the user and passed as input 
     * to vote method in VoteDAo class to insert into table to caste vote for the selected
     * candidate 
     * 
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
     
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      String [] cid =request.getParameterValues("candidate");
      int canid =Integer.parseInt(cid[0]);
      String output = VoteDAO.vote(canid);
      request.setAttribute("out",output);
      request.getRequestDispatcher("index.jsp").forward(request, response);
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
