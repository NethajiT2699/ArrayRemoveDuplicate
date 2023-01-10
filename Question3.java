package interviewQuestionProgram;
//find max age in emp data
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {33,21,34,31,29,27,26};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			if(temp<=arr[i]) {
				temp=arr[i];
			}
		}
		System.out.println("maximum age in the emp data:"+temp);

	}

}
