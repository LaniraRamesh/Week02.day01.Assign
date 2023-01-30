package week02.day01;

public class EmployeeDetails {
	public void empName(String a,int b) {
		System.out.println("Emp Name : "+a+"\nEmp ID : "+b);
	}

	public void empAddress(String e,String f) {
		String g= e+f;
		System.out.println("Emp Address : "+g);	
	}
	public void empSalary(double h) {
		System.out.println("Emp Salary : "+h);
	}

	public void empMob(long i) {
		System.out.println("Emp Mob No : "+i);
	}
	public static void main(String []args) {
		EmployeeDetails k=new EmployeeDetails();
		k.empName("Lanira",545441);
		k.empAddress("36/2"," Testleaf Chennai");
		k.empSalary(30000);
		k.empMob(9684756726l);
	}



}
