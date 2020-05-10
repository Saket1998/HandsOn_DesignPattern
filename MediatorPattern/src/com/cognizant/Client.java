package com.cognizant;

public class Client {
	public static void main(String[] args) {
		IChatMediator c = new ChatMediator();
		IUser u1 = new BasicUser(c, "user1");
		IUser u2 = new BasicUser(c, "user2");
		IUser u3 = new PremiumUser(c, "user3");
		IUser u4 = new PremiumUser(c, "user4");
		System.out.println("------User1 Broadcast--------");
		u1.sendMessage("This is user1");
		System.out.println("------User2 Broadcast--------");
		u2.sendMessage("This is user2");
		System.out.println("------User3 Broadcast--------");
		u3.sendMessage("This is user3");
		System.out.println("------User4 Broadcast--------");
		u4.sendMessage("This is user4");
	}

}
