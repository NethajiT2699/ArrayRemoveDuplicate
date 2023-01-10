package interviewQuestionProgram;
//how to reverse a String
public class Question21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="nethaji";
		StringBuffer buff=new StringBuffer(name);
		System.out.println(buff.reverse());
		
		System.out.println("***************");
		// without using in built methods 
		char[] Oarr= name.toCharArray();
		char[] Rarr=new char[name.length()];
		int size=name.length()-1;
		for(int i=0;i<Oarr.length;i++) {
			Rarr[i]=Oarr[size];
			size--;
		}
		System.out.println(Rarr);

	}

}
