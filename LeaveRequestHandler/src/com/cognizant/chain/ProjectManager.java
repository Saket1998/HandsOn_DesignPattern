package com.cognizant.chain;

public class ProjectManager implements ILeaveRequestHandler {
	private ILeaveRequestHandler iLeaveRequestHandler;

	@Override
	public void nextHandler(ILeaveRequestHandler handelReq) {
		iLeaveRequestHandler = handelReq;
	}

	@Override
	public void HandelRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.getLeaveDays() >= 3 && leaveRequest.getLeaveDays() <= 5) {
			System.out.println("Approved for : " + leaveRequest.getEmployee().toUpperCase() + " with "
					+ leaveRequest.getLeaveDays() + " days of leaves by the Project Manager");
		} else {
			iLeaveRequestHandler.HandelRequest(leaveRequest);
		}
	}
}
