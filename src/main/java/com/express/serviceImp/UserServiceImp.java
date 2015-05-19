package com.express.serviceImp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.express.bean.User;
import com.express.service.BaseService;
import com.express.service.UserService;

@Service
public class UserServiceImp extends BaseService implements UserService{

	@Override
	public List<User> getUserList() {
		return getUserDao().getUserList();
	}

	@Override
	public User getByUserName(String username) {
		return getUserDao().getByUserName(username);
	}

	@Override
	public User getByUserId(String userid) {
		return getUserDao().getByUserId(userid);
	}

	@Override
	public boolean addUser(User user) {
		return getUserDao().addUser(user);
	}

	@Override
	public boolean updateUser(User user) {
		return getUserDao().updateUser(user);
	}

	@Override
	public List<User> getMessageListbyUserId(String userid) {
		return getUserDao().getMessageListbyUserId(userid);
	}

	@Override
	public boolean deleteUser(String userid) {
		return getUserDao().deleteUser(userid);
	}
	
	

}
