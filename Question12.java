package interviewQuestionProgram;

import java.util.Arrays;

//rearrange the String "abcfde" into abcdef 
public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word="abcfed";
		char[] Oarr=word.toCharArray();
		Arrays.sort(Oarr);
		Oarr.toString();
		System.out.println(Oarr);
		//using regex
		String a="tn17a1234";
		String[]  b=a.split("[0-9]");
		System.out.println(Arrays.toString(b));
	}

}
