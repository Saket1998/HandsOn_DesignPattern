package com.cognizant.chain;

public interface ILeaveRequestHandler {
	public void nextHandler(ILeaveRequestHandler handelReq);

	public void HandelRequest(LeaveRequest leaveRequest);
}
