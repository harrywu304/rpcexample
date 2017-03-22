package org.pub.hello.bean;

import java.io.Serializable;

public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2808076612626496230L;

	public String name; 
	
//	public int sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
//	public int getSex() {
//		return sex;
//	}
//
//	public void setSex(int sex) {
//		this.sex = sex;
//	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}
	

}
