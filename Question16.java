package interviewQuestionProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// how to reverse Arraylist without using built in method
public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<> ();
		al.add(5);
		al.add(4);
		al.add(3);
		al.add(2);
		al.add(1);
//		Collections.reverse(al);
//		System.out.println(al);
		//with using temp list
		ArrayList<Integer> ral=new ArrayList<> ();
		for(int i=al.size()-1;i>=0;i--) {
			ral.add(al.get(i));
		}
		System.out.println(ral);
		
		// make the list read-only
//		List<Integer> ul = Collections.unmodifiableList(ral);
//		ul.add(6);
		
		//with out using temp list 
		for(int i=0;i<ral.size()/2;i++) {
			int temp=ral.get(i);
			ral.set(i,ral.get(ral.size()-1-i));
			ral.set(ral.size()-1-i,temp);
		}
		System.out.println(ral);

	}

}
