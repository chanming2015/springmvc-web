/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.shequ2.xms.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;

/**
 * Project:eLearning-core
 * Package:com.dyr.xms.test.model
 * FileName:User.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-3-27 下午4:23:12
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
@Entity
@Table(name="tb_user")
public class User extends BaseEntity{

	private String username;
	private String password;
	private String nickname;
	private String email;
	private String phone;
	private Integer status;
	
	/**
	 * Author XuMaoSen
	 * @return the username
	 */
	@NotNull(message="用户名不能为空")
	public String getUsername() {
		return username;
	}
	/**
	 * Author XuMaoSen
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * Author XuMaoSen
	 * @return the password
	 */
	@NotNull(message="密码不能为空")
	public String getPassword() {
		return password;
	}
	/**
	 * Author XuMaoSen
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * Author XuMaoSen
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * Author XuMaoSen
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * Author XuMaoSen
	 * @return the email
	 */
	@Email(message="邮箱格式不正确")
	public String getEmail() {
		return email;
	}
	/**
	 * Author XuMaoSen
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * Author XuMaoSen
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * Author XuMaoSen
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * Author XuMaoSen
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * Author XuMaoSen
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	
}
