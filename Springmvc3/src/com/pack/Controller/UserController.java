package com.pack.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pack.Model.User;
import com.pack.Service.UserService;

@Controller                               //used to indiacte a controller with annotation
@RequestMapping("/userRegistration.htm")  //matches with url pattern if its matches with the one defined in the xml file
@SessionAttributes("user")                // indicates the commanName
public class UserController{
	@Autowired
private UserService userService;
	@RequestMapping(method=RequestMethod.GET)
public String showForm(ModelMap model){
	User u=new User();
	model.addAttribute(u);
	return "userForm";
}
	@RequestMapping(method=RequestMethod.POST)
	public String onSubmit(@ModelAttribute("user")User u){   //here user is the commandName
		userService.add(u);
		return "userSuccess";
	}
}
