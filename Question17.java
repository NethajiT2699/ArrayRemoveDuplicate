package interviewQuestionProgram;



import java.util.ArrayList;

//convert Array to ArrayList and viceversa
public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array= {1,2,3,4,5,6};
		//Array to Arraylist
		ArrayList<Integer> arrayList =new ArrayList<> ();
		for(int x:array) {
			arrayList.add(x);
		}
		System.out.println(arrayList);
		
		//Arraylist to Array
 	    Object[] arr=arrayList.toArray();
 	    System.out.println(arr[0]);
 		
		
	}

}
