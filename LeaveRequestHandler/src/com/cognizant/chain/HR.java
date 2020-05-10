package com.cognizant.chain;

public class HR implements ILeaveRequestHandler {
	private ILeaveRequestHandler iLeaveRequestHandler;

	@Override
	public void nextHandler(ILeaveRequestHandler handelReq) {
		iLeaveRequestHandler = handelReq;
	}

	@Override
	public void HandelRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.getLeaveDays() > 5) {
			System.out.println("Approved for : " + leaveRequest.getEmployee().toUpperCase() + " with "
					+ leaveRequest.getLeaveDays() + " days of leaves by the HR");
		} else {
			System.out.println("Rejected.");
		}
	}
}
