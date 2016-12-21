package com.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.module.LoginDao;
import com.module.user.entity.User;

@Component
public class LoginBean {

	private LoginDao loginDao;

	@Autowired
	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	public boolean login() {
		List<User> list = loginDao.loadAll();
		User users = loginDao.get(Long.valueOf(2));
		users.setName("iiiiiii");
		loginDao.update(users);
		User user = new User();
		user.setName("ƒ„√√333gbgff");
		user.setOrders("hssdds");
		user.setAccount("yy");
		loginDao.save(user);
		return true;
	}
}