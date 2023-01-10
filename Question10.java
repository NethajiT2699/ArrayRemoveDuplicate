package interviewQuestionProgram;
// add two String without using concat() method
public class Question10 {
	static int x=10;
	public int add(int a,int b) {
		return a+b;
	}
	public static int addition(int a,int b) {
		return new Question10().add(a,b);
	}
	public static void main(String[] args) {
		String a="learn";
		String b="java";
		String c=a+b;
		System.out.println(c);
		System.out.println(Question10.addition(50,20));

	}

	
}
