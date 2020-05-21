package com.javaex.ex05;

public class Depart extends Employee{
	private String department;

	public Depart() {
	}

	public Depart(String name, int salart, String department) {
		super(name,salart);
		this.department = department;
	}
	
	public void showInformation() {
        System.out.printf("이름:%s\t연봉:%d\t부서:%s",super.getName(),super.getSalary(),department);
    }
	
}
