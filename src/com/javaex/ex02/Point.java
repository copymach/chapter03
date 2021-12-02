package com.javaex.ex02;

public class Point {

	private int x;
	private int y;
	
	
	
	public Point() {
		super();
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {

//		여기에 써야 할 내용은 원본과 비교대상이 같은가 a.x==b.x && a.y==b.y 
		
		
		return super.equals(obj);
	}	

	
	
	

}
