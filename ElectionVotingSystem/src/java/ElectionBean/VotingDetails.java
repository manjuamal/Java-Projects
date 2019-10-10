/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElectionBean;

import java.io.Serializable;

/**
 *
 * @author Manjuvijay
 * This class is used to create  VotingDetails objects from database table VotingDetails
 * It implements Serializable interface.
 */
public class VotingDetails implements Serializable{
    private int ballotId;
    private int canId;
/**
 * Default constructor
 * 
 */
    public VotingDetails() {
    }
/**
 * Constructs a VotingDetails object with the give data ballotId and canId
 * @param ballotId---ballotId of a candidate
 * @param canId -- candidate id of a candidate
 * 
 */
    public VotingDetails(int ballotId, int canId) {
        this.ballotId = ballotId;
        this.canId = canId;
    }
/**
 * To set Ballot Id
 * @param ballotId -- sets the value of the ballotId retrieved from the table of column Ballot_id
 * 
 */
    public void setBallotId(int ballotId) {
        this.ballotId = ballotId;
    }
/**
 * To set canId that is candidate id
 * @param canId -- sets the value of the candidate Id retrieved from the table of column Cand_ID
 * 
 */
    public void setCanId(int canId) {
        this.canId = canId;
    }
/**
 * To get ballot id retrieved from the table
 * @return ballotId -- returns  the value of the ballotId
 * 
 */
    public int getBallotId() {
        return ballotId;
    }
/**
 * To get the candidate Id
 * @return canId --returns the value of the canId
 */
    public int getCanId() {
        return canId;
    }
    
    
}
