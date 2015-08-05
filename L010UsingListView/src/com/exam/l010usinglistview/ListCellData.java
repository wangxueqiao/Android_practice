package com.exam.l010usinglistview;

public class ListCellData {
	private String UserName;
	private String sex;
	private int age;
	public ListCellData(String UserName,String sex,int age) {
		this.UserName=UserName;
		this.sex=sex;
		this.age=age;
	}
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return getUserName();
	}

}
