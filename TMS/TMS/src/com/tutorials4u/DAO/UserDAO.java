package com.tutorials4u.DAO;

import java.util.List;

import com.tutorials4u.bean.User;

public interface UserDAO {

	public void saveOrUpdateUser(User user);
	public List<User> listUser();
	public User listUserById(Long userId);
	public void deleteUser(Long userId);
}
