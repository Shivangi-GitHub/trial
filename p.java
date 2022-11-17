import java.util.Scanner;
class Member{
		String name;
		int age;
		int phone;
		String address;
		int salary;
		
	void printsalary()
	{
		System.out.println(salary);
	}
	}
	class Employee extends Member
	{
		String specialization;
	}
	class Manager extends Member{
		String department;
	}
	
 class Demo2{
	 public static void main(String args[])
	 {
		 Scanner sc= new Scanner(System.in);
		 Employee e= new Employee();
		 Manager m=new Manager();
		 System.out.println("enter ");
		 e.name=sc.next();
		 m.name=sc.next();
		 e.age=sc.nextInt();
		 m.age=sc.nextInt();
		 
		 System.out.println(e.name);
		  System.out.println(e.age);
		   System.out.println(m.name);
		    System.out.println(m.age);
	 }
 }
		