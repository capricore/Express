package com.express.daoImp;

import java.util.List;

import com.express.bean.User;
import com.express.dao.BaseDao;
import com.express.dao.UserDao;

public class UserDaoImp extends BaseDao implements UserDao{
	
	@SuppressWarnings("unchecked")
	public List<User> getUserList() {
		List<User> users = null;
		try {
			users = getSqlMapClientTemplate().queryForList("getUserList");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;  
	}

	public User getByUserName(String username) {
		User user = null;
		try {
			user = (User) getSqlMapClientTemplate().queryForObject("getUserByUserName",username);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;  
	}

	public User getByUserId(String userid) {
		User user = null;
		try {
			user = (User) getSqlMapClientTemplate().queryForObject("getUserByUserName",userid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;   
	}

	public boolean addUser(User user) {
		String object = null;
		boolean flag = false;
		try {
			object =(String) getSqlMapClientTemplate().insert("addUser", user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (object != null) {
			flag = true;
		}
		return flag;
	}
	
	
}
