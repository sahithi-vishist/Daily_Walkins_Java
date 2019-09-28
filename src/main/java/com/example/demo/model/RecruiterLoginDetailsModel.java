package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="RECRUITERLOGINDETAILS")
public class RecruiterLoginDetailsModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "RECRUITERID")
	private int recruiterID;
	
	@Column(name="LASTACTIVE")
	private Date lastActive;
	
	@Column(name="LASTLOGIN")
	private Date lastLogin;
	
	@Column(name="LASTLOGOUT")
	private Date lastLogout;

	public RecruiterLoginDetailsModel() {
		super();
	}

	public int getRecruiterID() {
		return recruiterID;
	}

	public void setRecruiterID(int recruiterID) {
		this.recruiterID = recruiterID;
	}

	public Date getLastActive() {
		return lastActive;
	}

	public void setLastActive(Date lastActive) {
		this.lastActive = lastActive;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Date getLastLogout() {
		return lastLogout;
	}

	public void setLastLogout(Date lastLogout) {
		this.lastLogout = lastLogout;
	}

	@Override
	public String toString() {
		return "RecruiterLoginDetailsModel [recruiterID=" + recruiterID + ", lastActive=" + lastActive + ", lastLogin="
				+ lastLogin + ", lastLogout=" + lastLogout + "]";
	}
	
}
