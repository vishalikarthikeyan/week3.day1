package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("name of the student is vishali");
	}
    public void studentDept() {
    	System.out.println("civil department");
    }
    public void studentId() {
    	System.out.println("new id card is provided");
    }
    
    
    public static void main(String[] args) {
    	
		Student obj = new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
		
		
		
		
		
	}
}

