package interviewQuestionProgram;

import java.util.ArrayList;
import java.util.HashMap;

//how to iterate list-set-map
public class Question20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,4,17,32,21,14};

		ArrayList<Integer> al=new ArrayList<> ();
		al.add(1);
		al.add(17);
		al.add(7);
		al.add(32);
		al.add(21);
		al.forEach(x->{System.out.println(x);});
		
		HashMap<Integer,String> num=new HashMap<>();
		num.put(1,"one");
		num.put(2,"two");
		num.put(3,"three");
		num.put(4,"four");
		num.forEach((x,y)->{System.out.println(x+" "+y);});
		
	}

}
