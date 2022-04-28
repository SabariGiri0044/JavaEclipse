package com.sabu;

import java.util.HashMap;
import java.util.Map;
class Student1{
	int sid;
	String name;
	float fees;
	public Student1(int sid, String name, float fees) {
		super();
		this.sid = sid;
		this.name = name;
		this.fees = fees;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	
}

public class HashMapUserObject {

	public static void main(String[] args) {
		HashMap<Integer,Student1> hb=new HashMap<>();
         Student1 s1=new Student1(1,"Manoj",45632.4f);
         Student1 s2=new Student1(2,"Ravi",55632.4f);
         Student1 s3=new Student1(7,"Mohini",65632.4f);
         
         hb.put(1, s1);
         hb.put(2, s2);
         hb.put(3, s3);
         
         for(Map.Entry<Integer,Student1> m:hb.entrySet()) {
        	 int i=m.getKey();
        	//Student1 s=m.getValue();
        	 System.out.println(m.getValue().fees+" "+m.getValue().name+" "+m.getValue().sid);
         }
	}

}
