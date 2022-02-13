package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customers {
 private int id;
 
 
 @Autowired
 private Technologies techdetails;
 public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCoursename() {
	return coursename;
}
public void setCoursename(String coursename) {
	this.coursename = coursename;
}
private String name;
 private String coursename;
 
 public void show() {
	 System.out.println("Customers object returned successfully");
	 techdetails.techdetail();
	 
 }
}
