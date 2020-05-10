package com.cognizant.chain;

public class Program {
	public static void main(String[] args) {
		ILeaveRequestHandler i1 = new Supervisor();
		ILeaveRequestHandler i2 = new ProjectManager();
		ILeaveRequestHandler i3 = new HR();

		i1.nextHandler(i2);
		i2.nextHandler(i3);

		LeaveRequest l0 = new LeaveRequest("Saket", 1);
		i1.HandelRequest(l0);
		LeaveRequest l1 = new LeaveRequest("Ram", 3);
		i1.HandelRequest(l1);
		LeaveRequest l2 = new LeaveRequest("Shyam", 6);
		i1.HandelRequest(l2);
	}
}
