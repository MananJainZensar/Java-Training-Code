package Cloning;

public class Student implements Cloneable {
	private int rollNo;
	private String name;
	private double percent;
	private Course course; // HAS-A
 
	public Student() {
		// TODO Auto-generated constructor stub
	}
 
	public Student(int rollNo, String name, double percent, Course course) {
		// TODO Auto-generated constructor stub
		this.rollNo = rollNo;
		this.name = name;
		this.percent = percent;
		this.course = course;
	}
 
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", percent=" + percent + ", course=" + course + "]";
	}
 
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
 
		Student clonned = (Student) super.clone();
		Course newCopy = (Course) this.course.clone(); // cloning the course
		clonned.setCourse(newCopy); // setting the cloned course to current object
		return clonned;
 
	}
 
	public Course getCourse() {
		return course;
	}
 
	public void setCourse(Course course) {
		this.course = course;
	}
}