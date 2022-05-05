package week3.day1;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("the student id is " + id);
		}
    public void getStudentInfo(String name, int id) {
    	System.out.println("student name is " + name);
    	System.out.println("student id is " + id);
    }
    public void getStudentInfo(String email,long phoneNumber) {
    	System.out.println("the email is " + email);
    	System.out.println("students phonr number is " + phoneNumber);
    }
    public static void main(String[] args) {
		Students students = new Students();
    	students.getStudentInfo(103074);
    	students.getStudentInfo("vishali", 103074);
    	students.getStudentInfo("ammu34@gmail.com", 6754389765L);
    	
    	
    	
	}
    
    
}
