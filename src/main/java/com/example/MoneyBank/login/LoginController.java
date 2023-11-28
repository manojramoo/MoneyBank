package com.example.MoneyBank.login;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.MoneyBank.users.Users;

@Controller
public class LoginController {
	private LoginDaoService login;
	
	
	public LoginController(LoginDaoService login) {
		super();
		this.login = login;
	}

	@RequestMapping(value = "login",method = RequestMethod.GET)
	public String loginPage() {
		return "loginPage";
	}
	
	@RequestMapping(value = "login",method = RequestMethod.POST)
	public String welcomePage(@RequestParam String username,@RequestParam String password,ModelMap model) {
		String userType= login.identifyUserType(username, password);
		if(userType.equals("Customer")) {
			return "customer";
		}
		if(userType.equals("Employee")) {
			List<Users> users=login.returnAllUsers();
			model.put("users", users);
			return "employee";
		}
		return "loginPage";
	}
	@RequestMapping(value="createUser",method = RequestMethod.GET)
	public String createUser() {
		return "createuser";
	}
	@RequestMapping(value="createUser",method = RequestMethod.POST)
	public String createUserintoDao(@RequestParam String username,@RequestParam String password,@RequestParam String type) {
		login.createUser(username, password, type);
		return "loginPage";
	}
}
