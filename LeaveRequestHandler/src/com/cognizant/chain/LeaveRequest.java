package com.cognizant.chain;

public class LeaveRequest {
	private String employee;
	private int leaveDays;

	public String getEmployee() {
		return employee;
	}

	public int getLeaveDays() {
		return leaveDays;
	}

	public LeaveRequest(String employee, int leaveDays) {
		this.employee = employee;
		this.leaveDays = leaveDays;
	}
}
