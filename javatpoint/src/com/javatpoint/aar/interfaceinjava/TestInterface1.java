package com.javatpoint.aar.interfaceinjava;

//Interface declaration: by first user  
interface Drawable {
	void draw();
}

// Implementation: by second user
class Rectangle implements Drawable1 {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle implements Drawable1 {
	public void draw() {
		System.out.println("drawing circle");
	}
}

// Using interface: by third user
class TestInterface1 {

	public static void main(String[] args) {
		Drawable1 d = new Circle();// In real scenario, object is provided by
									// method e.g. getDrawable()
		d.draw();
	}

}
