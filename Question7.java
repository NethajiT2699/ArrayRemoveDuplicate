package interviewQuestionProgram;
// find highest salary employee in emp data
import java.util.ArrayList;

public class Question7 {
	int temp=0;
	public void fixMax(int x) {
	if(temp<x) {
		temp=x;
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<> ();
		al.add(7000);
		al.add(1000);
		al.add(5000);
		al.add(6000);
		al.add(9000);
		Question7 q=new Question7();
		al.stream().forEach(x-> q.fixMax(x));
		System.out.println(q.temp);
		

	}

}
