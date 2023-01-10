package interviewQuestionProgram;
// remove duplicate from list and preserve the order
import java.util.ArrayList;
import java.util.Collections;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<> ();
		al.add(21);
		al.add(7);
		al.add(11);
		al.add(7);
		al.add(18);
		al.add(3);
		al.add(11);
		for(int i=0;i<al.size();i++) {
			for(int j=i+1;j<al.size();j++) {
			if(al.get(i)==al.get(j)) {
				al.remove(j);
			}
				
			}
			}

		System.out.println(al);
		}

}
