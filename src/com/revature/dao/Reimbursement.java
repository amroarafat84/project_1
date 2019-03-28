package com.revature.dao;

import java.util.List;

public interface Reimbursement {
	
	// Retrieve all Reimbursements from Reimbursement table 
	public List<Reimbursement> getReimbursement();
	
	// Retrieve a Reimbursement by id from Reimbursement table
	public Reimbursement getReimbursement(int id);
	
	
	// retrieve a Reimbursement by name from Reimbursement table
	public Reimbursement getReimbursement(String name);
	
	
	// insert a Reimbursement into Reimbursement table
	public void insertReimbursement(Reimbursement reimbursement);
	
	
	// update Reimbursement info
	public void update(Reimbursement reimbursement);
	
	
	// delete Reimbursement using a Reimbursement id
	public void delete(int id);

}
