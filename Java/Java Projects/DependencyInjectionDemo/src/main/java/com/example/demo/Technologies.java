package com.example.demo;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Technologies {
	private int techid;
	private String techname;

	public int getTechid() {
		return techid;
	}
	public void setTechid(int techid) {
		this.techid = techid;
	}
	public String getTechname() {
		return techname;
	}
	public void setTechname(String techname) {
		this.techname = techname;
	}
	
	public void techdetail() {
		System.out.println("Dependency injection: Class Customers uses the functionality of class Technologies i.e.,techdetail() in Customers class using @Autowired annotation");
	}

}
