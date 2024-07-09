package springmvc.controller;
import java.time.LocalDateTime;
import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
@Controller
//@RequestMapping("/first")
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model){
		System.out.println("This is home method");
		model.addAttribute("name","Shiva Sharma");
		model.addAttribute("id",1);
		List<String> friends = new ArrayList<>();
		friends.add("Nishant");
		friends.add("Vishal");
		friends.add("Bharat");
		
		
		model.addAttribute("f",friends);
		
	return "home";
}
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("This is about method");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
//		creating ModelAndView object
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name","Shiva Sharma");
		modelAndView.addObject("roll_no",24);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time",now);
		List<Integer> marks = new ArrayList<>();
		marks.add(95);
		marks.add(96);
		marks.add(97);
		marks.add(98);
		modelAndView.addObject("marks",marks);
		modelAndView.setViewName("help");
		return modelAndView;
	}
	
}
