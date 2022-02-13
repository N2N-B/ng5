package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CoursesController {
	@RequestMapping("/coursesofedureka")
	public String courses(HttpServletRequest httpServletRequest ) {
		HttpSession httpSession = httpServletRequest.getSession();
		String cname = httpServletRequest.getParameter("cname");
		System.out.println("The course name is: " + cname);
		httpSession.setAttribute("cname", cname);
		return "coursesofedureka";
	}

}
