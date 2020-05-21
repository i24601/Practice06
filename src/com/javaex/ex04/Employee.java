package com.javaex.ex04;

public class Employee extends User{

	private int salart;

	public Employee() {
	}

	public Employee(String id, String password, String name, int salart) {
		super(id, password, name);
		this.salart=salart;
	}

	public int getSalart() {
		return salart;
	}

	public void setSalart(int salart) {
		this.salart = salart;
	}

	public void showinfo() {
		System.out.printf("#아이디:%s, #패스워드:%s, #이름:%s, #월급:%d\n운영자의 월급은 %d원 입니다.",id,password,name,salart,salart);
	}

}
