package com.mvc.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/service")
public class HelloWorldController {
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processFormA() {
		return "helloworld";
	}

	@RequestMapping("/processForm2")
	public String processFormB(HttpServletRequest request, Model model) {
		// read the request parameter from the HTML form
		String theName = request.getParameter("employeeName");

		// convert the data to all caps
		theName = theName.toUpperCase();

		// create the message
		String result = "Hello " + theName;

		// add message to the model
		model.addAttribute("message", result);

		return "helloworld";
	}
	
	@RequestMapping("/processForm3")
	public String processFormC(@RequestParam("employeeName") String theName, Model model) {

		// convert the data to all caps
		theName = theName.toUpperCase();

		// create the message
		String result = "Hello " + theName;

		// add message to the model
		model.addAttribute("message", result);

		return "helloworld";
	}
}
