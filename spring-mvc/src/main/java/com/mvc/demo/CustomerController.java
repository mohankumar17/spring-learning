package com.mvc.demo;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@RequestMapping("/showForm")
	public String customerRegForm(Model theModel) {
		theModel.addAttribute("customer", new Customer());
		return "customer-form";
	}

	@RequestMapping("/processForm")
	public String customerConfirmForm(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult bindingResult) {
		
		System.out.println("Customer: " + theCustomer.getFirstName() + " " + theCustomer.getLastName());
		
		if (bindingResult.hasErrors()) {
            return "customer-form";
        } else {
            return "customer";
        }
	}
}
