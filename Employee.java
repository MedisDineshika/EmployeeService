package com.example.demo;




import org.springframework.stereotype.Component;

@Component
public class Employee {

	private String name ;
	
	private int marks ;

	
	
	
	public Employee() {
		
	}

	public Employee(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

public static List<Employee> getAllEmployees(List<Employee> employees){
		
		
		
		Employee emp1 = new Employee();
		emp1.setName("nimal");
		emp1.setMarks(35);
		
			
		Employee emp2 = new Employee();
		emp2.setName("Sema");
		emp2.setMarks(45);
		employees.add(0, emp1);
		employees.add(1, emp2);
		
		
		
		return empolyees ;
		
		
	
	
	
		
		
		
	

}
	
}
