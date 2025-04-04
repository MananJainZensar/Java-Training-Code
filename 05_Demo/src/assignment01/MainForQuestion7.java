package assignment01;

public class MainForQuestion7 {
	public static void main(String[] args) {
		Question7 a1 = new Question7("Manan Jain",1000,0.05);
		Question7 a2 = new Question7("Naman Jain",5000,0.45);
//		System.out.println(Question7.printTotalAccounts());
		Question7.printTotalAccounts();

		System.out.println(a2.getAccId());
	}
}
