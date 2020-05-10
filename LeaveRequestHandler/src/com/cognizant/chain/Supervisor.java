package com.cognizant.chain;

public class Supervisor implements ILeaveRequestHandler {
	private ILeaveRequestHandler iLeaveRequestHandler;

	@Override
	public void nextHandler(ILeaveRequestHandler handelReq) {
		iLeaveRequestHandler = handelReq;
	}

	@Override
	public void HandelRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.getLeaveDays() >= 1 && leaveRequest.getLeaveDays() < 3) {
			System.out.println("Approved for : " + leaveRequest.getEmployee().toUpperCase() + " with "
					+ leaveRequest.getLeaveDays() + " days of leaves by the Supervisor");
		} else {
			iLeaveRequestHandler.HandelRequest(leaveRequest);
		}
	}
}
