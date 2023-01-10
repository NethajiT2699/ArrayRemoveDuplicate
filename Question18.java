package interviewQuestionProgram;

import java.util.ArrayList;
import java.util.Collections;

// how to sort any list by descending order;
public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<> ();
		al.add(15);
		al.add(4);
		al.add(11);
		al.add(29);
		al.add(31);
		// by default sort() order by ascending
		Collections.sort(al);
		System.out.println(al);
		// we have reverse() to reverse ordered list
		Collections.reverse(al);
		System.out.println(al);

	}

}
