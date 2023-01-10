package interviewQuestionProgram;

import java.util.Arrays;

// find second largest number in array
public class Question25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {23,11,7,32,14,57,6,29};
		Arrays.sort(arr);
		System.out.println("second largest num is "+arr[arr.length-2]);

	}

}
