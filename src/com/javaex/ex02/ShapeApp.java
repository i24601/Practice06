package com.javaex.ex02;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape s1 = new Shape("파랑", "파랑");
		System.out.println("================");
//shape2		
		Triangle t1 = new Triangle();
		System.out.println("================");
//shape0 triangle0
		Triangle t2 = new Triangle(3, 4);
		System.out.println("================");
//shape2 triangle2	
		Shape t3 = new Triangle("빨강", "빨강", 15, 15);
		System.out.println("================");
//shape2 triangle4
	}
//메모리에 triangle타입을 올릴때 부모클래스가 있다면 먼저 부모클래스를 처리한 후(shape) 다시 triangle을 올린다
//나머지는 생성자의 생성자의 인자에 따라 생각해보면 
}
