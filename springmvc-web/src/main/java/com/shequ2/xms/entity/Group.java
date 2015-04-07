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

/**
 * Project:eLearning-core
 * Package:com.dyr.xms.test.model
 * FileName:Group.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-3-27 下午4:29:07
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
@Entity
@Table(name="tb_group")
public class Group extends BaseEntity{

	private String name;
	private String descr;

	/**
	 * Author XuMaoSen
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Author XuMaoSen
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Author XuMaoSen
	 * @return the descr
	 */
	public String getDescr() {
		return descr;
	}
	/**
	 * Author XuMaoSen
	 * @param descr the descr to set
	 */
	public void setDescr(String descr) {
		this.descr = descr;
	}
}
