
package interviewQuestionProgram;
// print fibonacci series 0,1,1,2,3,5,8,13...
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int a=0;
		int b=1;
		System.out.print(a+","+b+",");
		for(int i=1;i<=x-2;i++) {
		int c=a+b;
		System.out.print(c+",");
		a=b;
		b=c;
		}

		
	}

}
