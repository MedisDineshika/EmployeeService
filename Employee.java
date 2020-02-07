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


	
}
