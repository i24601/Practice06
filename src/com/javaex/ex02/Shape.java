package com.javaex.ex02;

public class Shape {
	private String fillCollor, lineCollor;

	public Shape() {
		System.out.println("생성자 Shape(0) 실행");
	}

	public Shape(String fillCollor, String lineCollor) {
		this.fillCollor = fillCollor;
		this.lineCollor = lineCollor;
		System.out.println("생성자 Shape(2) 실행");
	}

}

