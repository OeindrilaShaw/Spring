package com.pack.Controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.pack.Model.User;
import com.pack.Service.UserService;

public class UserController extends SimpleFormController{
	private UserService userservice;
protected ModelAndView onSubmit(Object command) throws Exception{
	User u=(User)command;
	userservice.add(u);
	return new ModelAndView("userSucces","user",u);
}
UserController(){
	setCommandClass(User.class);
	setCommandName("user");
}
public UserService getUserservice() {
	return userservice;
}
public void setUserservice(UserService userservice) {
	this.userservice = userservice;
}

}
