package interviewQuestionProgram;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

// convert between list-set-map
public class Question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<> ();
		hm.put(1,"one");
		hm.put(2,"two");
		hm.put(3,"three");
		hm.put(4,"four");
		hm.put(5,"five");
		List<String> li = hm.values().stream().collect(Collectors.toList());
		System.out.println(li);

	}

}
