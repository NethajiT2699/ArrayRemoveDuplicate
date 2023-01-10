package interviewQuestionProgram;
// take int value 1-200 print divisible by 9 without using condition
public class Question8 {

	public static void main(String[] args) {
		int x=0;
		while(x<200) {
		   for(int i=1;i<=9;i++) {
			  x++;
		   }
		System.out.println(x);
	    }
	
	}
}
