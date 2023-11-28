package com.example.MoneyBank.login;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.example.MoneyBank.users.Users;

@Service
public class LoginDaoService {
	private static List<Users> users=new ArrayList<>();
	private static int idCounter=0;
	static {
		users.add(new Users("manojram", "manoj",++idCounter, "Customer"));
		users.add(new Users("manojram", "manojram",++idCounter, "Employee"));
		users.add(new Users("ammu", "ram",++idCounter, "Customer"));
		users.add(new Users("pops", "pops",++idCounter, "Customer"));
	}
	
	public String identifyUserType(String username,String password) {
		Predicate<? super Users> predicate = user->user.getUserName().equals(username)&&user.getPassword().equals(password);
		Users user=users.stream().filter(predicate).findFirst().get();
		return user.getType();
	}
	
	public void createUser(String username,String password,String type) {
		users.add(new Users(username,password,++idCounter,type));
	}
	
	public List<Users> returnAllUsers() {
		return users;
	}
}