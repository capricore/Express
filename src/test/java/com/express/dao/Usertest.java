package com.express.dao;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.express.bean.User;

public class Usertest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:/applicationContext.xml");

		UserDao userDao = (UserDao) context.getBean("userDao");

		User user = new User();
		user.setUserid("19");
		user.setUsername("2");
		user.setCompid("2");
		user.setPasswd("2");
		user.setPhone("2");
		user.setEmail("2");
		user.setLevel(2);
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		user.setRestime(timestamp);

		userDao.addUser(user);
	

		System.out.println("获得全查询列表");
		List<User> result = new ArrayList<User>();

		result = userDao.getUserList();

		for (Iterator<User> iter = result.iterator(); iter.hasNext();) {

			User element = (User) iter.next();

			System.out.println(element.getUsername());
		}
	}

}
