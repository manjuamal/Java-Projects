/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElectionDetailsDAO;

import ElectionBean.CandidateInfo;
import ElectionBean.VotingDetails;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Manjuvijay
 * Displays the candidate information stored in  the  CandidateInfo table
 */
public class ElectionDAO {
    /**
     * Retrieves candidate information from the CadidateInfo table
     * @return cand--ArrayList of CandidateInfo is returned
     * try and catch block is used to handle sSQLException
     */
   public static ArrayList<CandidateInfo> getCandidateInfo()
   {
       Connection conn = DBConnector.getConnection();
       ArrayList<CandidateInfo> cand = new ArrayList();
       String sqlQuery ="select * from CandidateInfo  ";
        PreparedStatement ps = null;
        ResultSet rs= null;
        try{
        ps=conn.prepareStatement(sqlQuery); 
        
         }catch(SQLException ex)
         {
         //Logger.getLogger(UserDAO.class.getName()).log(Level.SEVER,null,ex);
         }
        try{ 
        rs=ps.executeQuery();
        while (rs.next())
        {
        CandidateInfo can = new CandidateInfo();
        can.setFirstName(rs.getString(2));
        can.setLastName(rs.getString(3));
        can.setCandid(rs.getInt(1));
        can.setEmail(rs.getString(4));
        can.setPhone(rs.getString(6));
        can.setAddress(rs.getString(5));
         cand.add(can);
        }
        }
        catch(SQLException ex){
        System.err.println("PrepareStatement error code:"+ex.getMessage());  
        }
         finally{
         // DBConnector.closeJDBCObjects(conn, ps, rs);
        }
        return cand;  
   }
}
