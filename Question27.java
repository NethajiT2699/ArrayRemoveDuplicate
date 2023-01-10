package interviewQuestionProgram;
// find sum of numbers in int array
public class Question27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("sum of numbers in given array is "+sum);

	}

}
