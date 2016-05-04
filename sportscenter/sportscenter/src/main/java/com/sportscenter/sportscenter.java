package com.sportscenter;
import org.springframework.stereotype.Controller;
import org.springframework.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;
 
@Controller
public class sportscenter
{
	
	 
	@RequestMapping("/")
	public String showMessage() 
	{
			return "index";
	}
	 
		@RequestMapping("/regis")
		public String showNextMessage() 
		{
				return "regis";
		}
		
		@RequestMapping("/back")
		public String showNextMessage1() 
		{
				return "index";
		}
		
		
		
		/*@RequestMapping("/LandingPage")
		public String showLandingPageMessage() 
		{
				return "LandingPage";
		}*/
}