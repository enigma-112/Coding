package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customers {
	private int custid;
	private int custname;
	private int coursename;
	@Autowired
	private Technologies t1;	
	
	public Technologies getT1() {
		return t1;
	}
	public void setT1(Technologies t1) {
		this.t1 = t1;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public int getCustname() {
		return custname;
	}
	public void setCustname(int custname) {
		this.custname = custname;
	}
	public int getCoursename() {
		return coursename;
	}
	public void setCoursename(int coursename) {
		this.coursename = coursename;
	}
	
	public void display() {
		System.out.println("Customers Object Returned Successfully !!");
		t1.tech();
	}
	
}
