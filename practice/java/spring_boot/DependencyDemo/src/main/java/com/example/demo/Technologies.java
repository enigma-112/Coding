package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Technologies {
	private int techid;
	private int techname;
	
	public int getTechid() {
		return techid;
	}
	public void setTechid(int techid) {
		this.techid = techid;
	}
	public int getTechname() {
		return techname;
	}
	public void setTechname(int techname) {
		this.techname = techname;
	}
	public void tech() {
		System.out.println("completed technologies !! ");
	}
	
}
