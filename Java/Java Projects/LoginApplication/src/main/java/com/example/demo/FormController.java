package com.example.demo;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class FormController {
	 @GetMapping("getForm")
	    public String getForm() {
	        return "userFrom";
	    }
	    @PostMapping("/saveDetails")                     // it only support port method
	    public String saveDetails(@RequestParam("employeeName") String employeeName,
	                              @RequestParam("employeeEmail") String employeeEmail,
	                              ModelMap modelMap) {
	        // write your code to save details
	        modelMap.put("employeeName", employeeName);
	        modelMap.put("employeeEmail", employeeEmail);
	        return "viewDetails";           // welcome is view name. It will call welcome.jsp
	    }

}
