package com.shijing.action;

import com.opensymphony.xwork2.ActionSupport;
import com.shijing.bean.Myuser;
import com.shijing.service.UserManager;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private Myuser user;
	private UserManager userManager;
	public Myuser getUser() {
		return user;
	}
	public void setUser(Myuser user) {
		this.user = user;
	}
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
	
	private static final long serialVersionUID = 1L;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(userManager.userLogin(user))
		   return "success";
		else 
			return "error";
		
	}
	
}
