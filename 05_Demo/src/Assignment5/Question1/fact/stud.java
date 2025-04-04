package Assignment5.Question1.fact;

public class stud{
	private int Maths;
	private int Science;
	private int English;
	private int Hindi;
	private int SocialStudies;
	public stud(int maths, int science, int english, int hindi, int socialStudies) {
		Maths = maths;
		Science = science;
		English = english;
		Hindi = hindi;
		SocialStudies = socialStudies;
	}
	public int getStudentMarks() {
		int result = (this.Maths + this.English + this.Hindi + this.Science + this.SocialStudies)/5;
		return result;
	}
	
}