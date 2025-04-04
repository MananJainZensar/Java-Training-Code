package Enum;

public class Student {
	private int studentID;
	private String StudentName;
	private Result result;
	
	public Student(int studentID, String StudentName, Result result) {
		this.studentID = studentID;
		this.StudentName = StudentName;
		this.result = result;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", StudentName=" + StudentName + ", result=" + result + "]";
	}
	public static void main(String[] args) {
		Student s1 = new Student(101,"Manan Jain",Result.PASS);
		Student s2 = new Student(102,"Vaishnavi Nambiar",Result.FAIL);
		System.out.println(s1);
		System.out.println(s2);
	}
	
}
