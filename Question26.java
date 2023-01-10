package interviewQuestionProgram;
//find repeated values in the given array
public class Question26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {7,5,6,4,7,9,5};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[j]);
				}
			}
			
		}

	}

}
