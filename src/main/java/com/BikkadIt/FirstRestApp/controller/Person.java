package com.BikkadIt.FirstRestApp.controller;

public class Person {

	private int pid;
	private String name;
	private String paddress;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", paddress=" + paddress + "]";
	}
	
	
}
