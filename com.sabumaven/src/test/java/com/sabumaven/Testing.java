//package com.sabumaven;
//
//import static org.junit.Assert.*;
//
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//
//public class Testing {
//
//	@Test
//	public void test() {
//		int a,b;
//		a=2;
//		
//		//b=a++
//		//b=++a
//		b=++a + a++;
//		assertEquals(a,4);
//		System.out.println(a+" is passed");
//		System.out.println(b);
//	}
//	@Test
//	public void add() {
//		int a=12,b=11;
//		int c=a+b;
//		assertEquals(c,23);
//		System.out.println(c+" is passed");
//	}
//	@Test
//	public void sub() {
//		int a=12,b=11;
//		int c=a-b;
//		assertEquals(c,1);
//		System.out.println(c+" is passed");
//	}
//	@Test
//	public void mul() {
//		int a=6,b=2;
//		int c=a*b;
//		assertEquals(c,12);
//		System.out.println(c+" is passed");
//	}
//	@Test
//	public void div() {
//		int a=6,b=2;
//		int c=a/b;
//		assertEquals(c,3);
//		System.out.println(c+" is passed");
//	}
//	@BeforeClass
//	public static void beforeClassMethod() {
//		System.out.println("Before Class Method(connect DB)");
//		}
//		@AfterClass
//		public static void afterClassMethod() {
//			System.out.println("Before Class Method (Disconnect DB)");
//			
//		}
//		@Before
//		public void beforeMethod() {//before method should not be static
//			System.out.println("Before annotation Method  (in web page refresh page)");
//}
//		@After
//		public  void afterMethod() {////after method should not be static
//			System.out.println("After annotation Method (refresh webpage)");
//}
//}
/*public class Junit4_Annotation_Examples {
	@Test
	public void test1() {
		System.out.println("test1 method");
	}
	@Ignore(" not yet implemented")
	@Test
	public void test2() {
		System.out.println("test2 method");
	}
	@BeforeClass
	public static void beforeClassMethod() {
		System.out.println("Before Class Method(connect DB)");
		//rear time connect DB
		
		
	}
	@AfterClass
	public static void afterClassMethod() {
		System.out.println("Before Class Method (Disconnect DB)");
		
	}
	
	@After
	public  void afterMethod() {////after method should not be static
		System.out.println("After annotation Method (refresh webpage)");
		
	}
	@Before
	public void beforeMethod() {//before method should not be static
		System.out.println("Before annotation Method  (in web page refresh page)");
		
	}
	@Test(expected =ArithmeticException.class)
	public void testException() {
		int a=10/0;
	}
	@Test(timeout=500)
	public void timeOut() {
		int a=0;
	}
}*/

