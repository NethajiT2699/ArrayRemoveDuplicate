package interviewQuestionProgram;
// find largest element in array
public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {17,6,52,23,39,11,3,43};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			if(temp<arr[i]) {
				temp=arr[i];
			}
		}
		System.out.println("maximum value in array is "+temp);

	}

}
