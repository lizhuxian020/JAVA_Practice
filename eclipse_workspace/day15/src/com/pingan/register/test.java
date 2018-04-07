package com.pingan.register;

import java.util.Scanner;

class User {
	private String userName;
	private String password;

	/**
	 * @param userName
	 * @param password
	 */
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	public User() {
		
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}

public class test {

	public static void main(String[] args) {
		System.out.println("请按提示输入: A(登录) B(注册)");
		Scanner scanner = new Scanner(System.in);
		
		String option = scanner.next();
		
		if ("a".equalsIgnoreCase(option)) {
			System.out.println("用户选择了登录");
		} else if ("b".equalsIgnoreCase(option)) {
			System.out.println("用户选择了注册");
		}
	}

}
