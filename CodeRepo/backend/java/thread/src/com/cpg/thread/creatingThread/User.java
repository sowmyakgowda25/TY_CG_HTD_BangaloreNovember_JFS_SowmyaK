package com.cpg.thread.creatingThread;

public class User extends Thread {
	PVR p;
	public User(PVR p){
		this.p=p;
	}
	public void run() {
		p.confirmTicket();
	}
}
