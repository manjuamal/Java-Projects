/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElectionDetailsDAO;

import ElectionBean.CandidateInfo;
import ElectionBean.Election;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Manjuvijay
 * Inserts the selected candidate into the  appropriate table 
 * and also displays the election results
 */
public class VoteDAO {
    /**
     * creates and execute sqlQuery based on candidate selected by the user 
     * and inserts the selected candidate into the table and 
     * returns message if the data is inserted successfully inserted into the table.
     * used try and catch for exception handling
     * @param can_id is the candidate id of the selected candidate by the user
     * @return out a variable used to return the message if the data was saved successfully
     * 
     */
    static Connection conn = null; 
    static PreparedStatement ps = null;
    static ResultSet rs =null;
    public static String vote(int canid)
    {
     conn = DBConnector.getConnection();  
    String sqlQuery="insert into VotingDetails(cand_ID) values (?)";
     String out= null;
       try{
        ps =conn.prepareStatement(sqlQuery);
        ps.setInt(1, canid);
        
        int count = ps.executeUpdate();
        if(count>=1){
            out ="Sucessfully casted your vote !";
        }
       }
       catch (SQLException ex)
       {
           System.err.println("Prepare statement error code:"+ex.getErrorCode());
       }
   return out;
    }
    /**
     * Displays the results of the election ,the information about the candidate 
     * and the count of votes for each candidate.
     * 
      *@return ele-- ArrayList which contains the election results of  candidates 
     */
    public static ArrayList<Election> ElectionResult()
    {
     conn = DBConnector.getConnection();  
    String sqlQuery="select count(*) as 'count' , v.cand_id ,c.First_Name,c.Last_Name from VotingDetails v, CandidateInfo c\n" +
"where v.cand_id =c.cand_id\n" +
"group by cand_id ";
    ArrayList<Election> ele = new ArrayList();
        String out= null;
       // int canid =candidate;
       // stmt =conn.prepareStatement(sqlQuery);
       try{
        ps =conn.prepareStatement(sqlQuery);
       }
       catch (SQLException ex)
       {
       System.err.println("Prepare statement error code:"+ex.getErrorCode());
       }
       try{ 
        rs=ps.executeQuery();
      
        while (rs.next())
        {
        Election election = new Election();
        election.setCount(rs.getInt(1));
        election.setFirstName(rs.getString(3));
        election.setCandId(rs.getInt(1));
        election.setLastName(rs.getString(4));
        ele.add(election);
        }
        }
        catch(SQLException ex){
         System.err.println("PrepareStatement error code:"+ex.getMessage());  
        }
         finally{
         // DBConnector.closeJDBCObjects(conn, ps, rs);
        }
       return ele;
       }
    
}
