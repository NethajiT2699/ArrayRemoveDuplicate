package interviewQuestionProgram;

public class PassVPassR {
	int a=20;
	public void add(PassVPassR x) {
	    x.a=x.a+10;
	   
	}
	

	public static void main(String[] args) {
		
		PassVPassR p=new PassVPassR();
        p.add(p);
        System.out.println(p.a);
	}

}
