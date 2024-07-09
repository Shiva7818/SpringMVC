package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class FormController {
	@RequestMapping("/form")
public String from()
{
	return "form";
}
	
	
	
	
	
	
	
	
	
	
//	RequestParm
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handForm(
			@RequestParam("email") String userEmail,
			@RequestParam("user") String userName,
			@RequestParam("pass") String password,Model model) 
	{   
		System.out.println("User mail = "+userEmail);
		System.out.println("User name = "+userName);
		System.out.println("User password = "+password);
		model.addAttribute("name",userName);
		model.addAttribute("email",userEmail);
		model.addAttribute("pass",password);
		return "success";
	}
	
	
	
	
	
	
	
	
	
//	@RequestMapping(path="/processform",method= RequestMethod.POST)
//	public String handleForm(HttpServletRequest request)
//	{   
//		String email = request.getParameter("email");
//		String userName = request.getParameter("user");
//		String pass = request.getParameter("pass");
//
//		System.out.println("User mail = "+email);
//		System.out.println("User name = "+userName);
//		System.out.println("User password = "+pass);
//		return "";
//	}
	
	
	
	
}
