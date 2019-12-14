package com.cpg.thread.creatingThread;

public class TestPVR {

	public static void main(String[] args) {
		System.out.println("main started...");
		PVR p=new PVR();
		
		User u1=new User(p);
		u1.start();
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		p.leaveMe();
		System.out.println("main ended...");
	}

}
