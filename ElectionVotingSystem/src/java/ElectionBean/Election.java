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
 * This class is used to create objects of  election results of  
 * each candidate information retrieved from the two tables VotingDetails and CandidateInfo.
 * It implements Serializable interface
 */
public class Election implements Serializable {
    private int count;
    private int candId;
    private String firstName;
    private String lastName;
/**
 * Default empty constructor
 */
    public Election() {
    }
/**
 * Constructs an election object with the given data like count,candId,firstName,lastName 
 * @param count -- count of votes each candidate got
 * @param candId --- candidate id
 * @param firstName ---first name of candidate
 * @param lastName -- last name of candidate
 */
    public Election(int count, int candId, String firstName, String lastName) {
        this.count = count;
        this.candId = candId;
        this.firstName = firstName;
        this.lastName = lastName;
    }
     /**
      * set the value of count to number of votes each candidate got
      * @param count --set the value of count
      */
    public void setCount(int count) {
        this.count = count;
    }
  /**
   *  To set the candidate id 
   * @param candId --candidate Id 
   */
    public void setCandId(int candId) {
        this.candId = candId;
    }
/**
 * To set first name candidate
 * @param firstName --first name of the candidate
 */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
/**
 * To set last name of candidate
 * @param lastName --last name of the candidate
 */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
/**
 * To get number of votes each candidate got
 * @return count--- number of votes
 */
    public int getCount() {
        return count;
    }
/**
 * To get the candidate id of the candidate
 * @return candId---candidate id of candidate
 */
    public int getCandId() {
        return candId;
    }
    /**
     * To get first name of  candidate
     * @return firstName -- first name of the candidate
     * 
     */
    public String getFirstName() {
        return firstName;
    }
/**
 * To get last name of candidate
 * @return lastName---last name of the candidate
 */
    public String getLastName() {
        return lastName;
    }
    
}
