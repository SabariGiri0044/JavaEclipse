package com.mrsabu;

@FunctionalInterface
interface Drawable{
	String draw(String s);
}
public class MainApp {
	public static void main(String[] args) {
		Drawable msd=(String s)->{ //Lambda expression with arguments
			System.out.println("Implementation of Draw Method");
			return "Hello "+s;
		};
		String r2=msd.draw("circle");
		System.out.println("after fun call"+r2);
		System.out.println("after fun call" +msd.draw("Square"));
		
		
		
//		//Implementing Runnable interface using Lambda Expression
//		Runnable r=()->{
//			System.out.println("Inside Run meth");
//		}
//	Drawable Dl=new Drawable() {
//		@Override
//		public void draw() {
//			System.out.println("Implementaton of Draw Method");		
//		}
};

//implementing Runnable interface using Lambda Expression

Runnable r=()->{
	System.out.println("Inside Run method");

};
//r.start(); not possible
Thread tob1=new Thread(r);
}


