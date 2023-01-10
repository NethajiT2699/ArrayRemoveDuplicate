package interviewQuestionProgram;

public class Question11 {
	public static void main(String[] args) {
		String s="abcabcabc";
		int a=0,b=0,c=0;
		for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='a') {
				a++;
		}
		else if(s.charAt(i)=='b') {
				b++;			
		}
		else if(s.charAt(i)=='c'){
			    c++;
		}
		else {
			// continue the condition for other characters
		}
	}
		System.out.println("character 'a' present & no.of count: "+a);
		System.out.println("character 'b' present & no.of count: "+b);
		System.out.println("character 'c' present & no.of count: "+c);

}
}
