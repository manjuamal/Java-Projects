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
 *  This class is used to create objects of CandidateInfo from the database table CandidateInfo
 * It implements Serializable interface
 * 
 */
public class CandidateInfo implements Serializable{
    private int candid;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String phone;
/**
 * Defaults constructor
 */
    public CandidateInfo() {
    }
/**
 * Constructs objects with given data like candid,firstName,lastName,address,email and phone
 * @param candid--candidate id of candidate 
 * @param firstName--first name of candidate
 * @param lastName--last name of candidate
 * @param address--address of candidate
 * @param email--email address of candidate
 * @param phone-- phone of candidate
 * 
 */
    public CandidateInfo(int candid, String firstName, String lastName, String address, String email, String phone) {
        this.candid = candid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }
/**
 * To set the value of candidate id
 * @param candid --candidate value retrieved from the table CandidateInfo of column cand_id
 * 
 */
    public void setCandid(int candid) {
        this.candid = candid;
    }
/**
 * To set first name of the candidate
 * @param firstName --first name of the candidate from the table CandidateInfo of column First_Name
 */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
/**
 * To set the last name of the candidate of  from table CandidateInfo of column Last_Name
 * @param lastName --last name of the candidate
 * 
 */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
/**
 * To set address 
 * @param address ---address of the candidate retrieved from the table CandidateInfo of column Address
 */
    public void setAddress(String address) {
        this.address = address;
    }
/**
 * To set email of candidate
 * @param email --- email of the candidate retrieved from the table CandidateInfo of column Email
 */
    public void setEmail(String email) {
        this.email = email;
    }
/**
 * To set phone number
 * @param phone --phone number of the candidate retrieved from 
 * the table CandidateInfo of column Phone
 * 
 */
    public void setPhone(String phone) {
        this.phone = phone;
    }
/**
 * To get the candidate Id
 * @return candid --- returns candidate id
 */
    public int getCandid() {
        return candid;
    }
/**
 * To get first name of the candidate
 * @return firstName--returns first name
 */
    public String getFirstName() {
        return firstName;
    }
/**
 * To get last name of the candidate
 * @return lastName---returns lastName
 */
    public String getLastName() {
        return lastName;
    }
/**
 * To get address of the candidate
 * @return address--returns address of the candidate
 */
    public String getAddress() {
        return address;
    }
/**
 * To get email of the candidate
 * @return email---returns email of candidate
 */
    public String getEmail() {
        return email;
    }
/**
 * To get phone number of candidate
 * @return phone---returns phone number of candidate
 */
    public String getPhone() {
        return phone;
    }
    
}

