package interviewQuestionProgram;
//iterate the for loop from 1 to 20 if the number is divisible by 3 it should print 'FIZZ' if the number is divisible 6 it should print 
//'BUZZ' if the number is divisible by both 3 and 6 it should print 'FIZZ BUZZ'
public class Question28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=20;
		for(int i=1;i<=num;i++) {
			if(i%3==0 && i%6==0) {
				System.out.println(i+": FIZZ BUZZ");
			}
			else if(i%6==0) {
				System.out.println(i+": BUZZ");
			}
			else if(i%3==0) {
				System.out.println(i+": FIZZ");
			}
			else {
				
			}
		}
//	  for(int i=1;i<=num;i++) {
//		  if(i%3==0) {
//			  System.out.println(i+": FIZZ");
//			  if(i%6==0) {
//				  System.out.println(i+": BUZZ");
//				  System.out.println(i+": FIZZ BUZZ");
//			  }
//		  }
//	  }
	}

}
