/*
 *www.shequ2.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.shequ2.xms.entity;

import java.sql.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Project:springmvc-web
 * Package:com.shequ2.xms.entity
 * FileName:BaseEntity.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-4-7 上午11:45:12
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
public class BaseEntity {
	
	private Long id;
	private Date createDate;
	private Boolean deleted;
	private Integer version;
	/**
	 * Author XuMaoSen
	 * @return the id
	 */
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	/**
	 * Author XuMaoSen
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * Author XuMaoSen
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}
	/**
	 * Author XuMaoSen
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	/**
	 * Author XuMaoSen
	 * @return the deleted
	 */
	public Boolean getDeleted() {
		return deleted;
	}
	/**
	 * Author XuMaoSen
	 * @param deleted the deleted to set
	 */
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	/**
	 * Author XuMaoSen
	 * @return the version
	 */
	public Integer getVersion() {
		return version;
	}
	/**
	 * Author XuMaoSen
	 * @param version the version to set
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}
	
}
