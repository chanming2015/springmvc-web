/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.shequ2.xms.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Project:eLearning-core
 * Package:com.dyr.xms.test.model
 * FileName:UserRole.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-3-27 下午4:31:33
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
@Entity
@Table(name="tb_user_role")
public class UserRole extends BaseEntity{
	
	private User user;
	private Role role;

	/**
	 * Author XuMaoSen
	 * @return the user
	 */
	@ManyToOne
	@JoinColumn(name="u_id")
	public User getUser() {
		return user;
	}
	/**
	 * Author XuMaoSen
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	/**
	 * Author XuMaoSen
	 * @return the role
	 */
	@ManyToOne
	@JoinColumn(name="r_id")
	public Role getRole() {
		return role;
	}
	/**
	 * Author XuMaoSen
	 * @param role the role to set
	 */
	public void setRole(Role role) {
		this.role = role;
	}

}
