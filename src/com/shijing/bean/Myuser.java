package com.shijing.bean;

/**
 * Myuser entity. @author MyEclipse Persistence Tools
 */

public class Myuser implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long userId;
	private String userName;
	private String password;

	// Constructors

	/** default constructor */
	public Myuser() {
	}

	/** minimal constructor */
	public Myuser(String userName) {
		this.userName = userName;
	}

	/** full constructor */
	public Myuser(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	// Property accessors

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}