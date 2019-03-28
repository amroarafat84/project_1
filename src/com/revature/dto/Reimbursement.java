package com.revature.dto;

import java.sql.Date;

public class Reimbursement {
	
	private int reimbId;
	private int reimbAmount;
	private Date reimbSubmitted;
	private Date reimbResolved;
	private String reimbDescription;
	private int reimbAuthor;
	private int reimbResolver;
	private String reimbType;
	
	
	public Reimbursement() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Reimbursement(int reimbId, int reimbAmount, Date reimbSubmitted, Date reimbResolved, String reimbDescription,
			int reimbAuthor, int reimbResolver, String reimbType) {
		super();
		this.reimbId = reimbId;
		this.reimbAmount = reimbAmount;
		this.reimbSubmitted = reimbSubmitted;
		this.reimbResolved = reimbResolved;
		this.reimbDescription = reimbDescription;
		this.reimbAuthor = reimbAuthor;
		this.reimbResolver = reimbResolver;
		this.reimbType = reimbType;
	}


	public int getReimbId() {
		return reimbId;
	}


	public void setReimbId(int reimbId) {
		this.reimbId = reimbId;
	}


	public int getReimbAmount() {
		return reimbAmount;
	}


	public void setReimbAmount(int reimbAmount) {
		this.reimbAmount = reimbAmount;
	}


	public Date getReimbSubmitted() {
		return reimbSubmitted;
	}


	public void setReimbSubmitted(Date reimbSubmitted) {
		this.reimbSubmitted = reimbSubmitted;
	}


	public Date getReimbResolved() {
		return reimbResolved;
	}


	public void setReimbResolved(Date reimbResolved) {
		this.reimbResolved = reimbResolved;
	}


	public String getReimbDescription() {
		return reimbDescription;
	}


	public void setReimbDescription(String reimbDescription) {
		this.reimbDescription = reimbDescription;
	}


	public int getReimbAuthor() {
		return reimbAuthor;
	}


	public void setReimbAuthor(int reimbAuthor) {
		this.reimbAuthor = reimbAuthor;
	}


	public int getReimbResolver() {
		return reimbResolver;
	}


	public void setReimbResolver(int reimbResolver) {
		this.reimbResolver = reimbResolver;
	}


	public String getReimbType() {
		return reimbType;
	}


	public void setReimbType(String reimbType) {
		this.reimbType = reimbType;
	}


	@Override
	public String toString() {
		return "Reimbursement [reimbId=" + reimbId + ", reimbAmount=" + reimbAmount + ", reimbSubmitted="
				+ reimbSubmitted + ", reimbResolved=" + reimbResolved + ", reimbDescription=" + reimbDescription
				+ ", reimbAuthor=" + reimbAuthor + ", reimbResolver=" + reimbResolver + ", reimbType=" + reimbType
				+ "]";
	}
	
	
	
	
	
	
	

}
