/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.shequ2.xms.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import com.shequ2.xms.entity.User;

/**
 * Project:basic-hibernate
 * Package:com.dyr.xms.test.dao
 * FileName:UserDAO.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-3-24 下午5:30:22
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
//注入spring
@Repository("userDAO")
public class UserDAO extends BaseDAO<User> implements IUserDAO{

	public User selectUserByNameAndPass(String name, String pass){
		String hql = "from User u where u.username=:name and u.password=:pass";
		Map<String, Object> alias = new HashMap<String, Object>();
		alias.put("name", name);
		alias.put("pass", pass);
		return (User) queryObject(hql, null, alias);
	}
}
