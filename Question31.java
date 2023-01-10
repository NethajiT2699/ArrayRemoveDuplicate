package interviewQuestionProgram;
//recursion
public class Question31 {
	public static int findFac(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n*findFac(n-1);
		}
	}
	public static void printFibo(int a,int b,int num) {
		if(num>0) {
		int c=a+b;
		System.out.print(c+",");
		a=b;
		b=c;
		num--;
		printFibo(a,b,num);
		}
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=10;
		System.out.println(findFac(5));
		System.out.print(0+","+1+",");
		printFibo(0,1,num-2);
	}

}
