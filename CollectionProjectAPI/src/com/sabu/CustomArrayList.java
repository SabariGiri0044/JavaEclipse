package com.sabu;

import java.util.ArrayList;
import java.util.Iterator;

class Stu{
	int Rno;
	String StuName;
	float fees;
	
	public Stu(int i, String string, int j) {
		// TODO Auto-generated constructor stub
		Rno = i;
		StuName = string;
		fees = j;
	}
	
}

public class CustomArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stu ob1= new Stu(18,"Giri",26000);
		Stu ob2= new Stu(19,"Sabu",30000);
		ArrayList<Stu>a1=new ArrayList<>();
		a1.add(ob1);
		a1.add(ob2);
		System.out.println(a1);
		Iterator it = a1.iterator();
		while(it.hasNext()) {
			Stu ob=(Stu) it.next();
			System.out.println("RNo:"+ob.Rno);
			System.out.println("NAME:"+ob.StuName);
			System.out.println("FEES:"+ob.fees);
		}
  
	}

}
