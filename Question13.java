package interviewQuestionProgram;
// sum of array elements 
public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,56,8,12,41,23,9,11};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("sum of Array elements="+sum);
	}

}
