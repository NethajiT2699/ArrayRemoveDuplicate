package interviewQuestionProgram;

public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="lEvEl";
		int flag=0;
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			
			if(ch == 'a'|| ch=='A' || ch == 'e'|| ch=='E' || ch=='i' ||ch=='I'|| ch=='o'||ch=='O' || ch=='u'||ch=='U') {
				flag=1;
				break;
			}
			else {
				flag=0;
			}
		}
		if(flag==1) {
			System.out.println("vowel present");
		}
		else {
			System.out.println("vowel not present");
		}

	}

}
