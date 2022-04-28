package AccessSpecifier;


class AccessSpecifiers {
     private int StuId;
     String StuName; //default
     protected float StuFees;
     public String CollName;
    public AccessSpecifiers(int StuId, String StuName, float StuFees, String CollName) {
	this.StuId=StuId;
	this.StuName=StuName;
	this.StuFees=StuFees;
	
    }
	
	public static void main(String[] args) {
		

	}

}
 
/* package accesspwithpack;

import accessspecifierpack1.EmployeeAnotherPack; //user defined package

class AccessSpecofiers{
	private int id; //private
	String name; //default
	protected float fees;  //protected
	public String cname;
	public AccessSpecofiers(int id, String name, float fees, String cname) {
		
		this.id = id;
		this.name = name;
		this.fees = fees;
		this.cname = cname;
	}
	
	}

class Company extends EmployeeAnotherPack{
Company() {
		super();
		// TODO Auto-generated constructor stub
	}

void display() {
	//System.out.println("Private id="+eid);//error
	System.out.println("public compname="+compname);
	//System.out.println("default salary="+salary);//default becomes private one pack to anorhers
	System.out.println("protected ename="+ename);
	
}
}
public class AccessSpecifiersWithPackagae {

	public static void main(String[] args) {
		AccessSpecofiers ob = new AccessSpecofiers(1,"Kiran",8761.56f,"MSRIT");
		//System.out.println("id ="+ob.id);//error id is private cannot be accessed another class
		System.out.println("name ="+ob.name);//default 
		System.out.println("cname="+ob.cname);
		System.out.println("Fees="+ob.fees);
		
		EmployeeAnotherPack eob=new EmployeeAnotherPack(23,"Ramesh",89761.98f,"Edubridge");
		//System.out.println("Emp name="+eob.ename);//protected error
		System.out.println("Comp name="+eob.compname); //public access
		//System.out.println("Emp id="+eob.eid);//private 
		//System.out.println("Salary="+eob.salary);//default error cannot be accessed
		
	}

} */