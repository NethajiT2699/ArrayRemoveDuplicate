package interviewQuestionProgram;

public class Question1 {
    //if String a="name" and String b=new String(a) if check using == and === what it will show
	public static void main(String[] args) {
	String a="name";
	String b= new String(a);
	if(a.equals(b)) {
		System.out.println("both are equal by equals()");
	}
	else if(a==b.intern()) {
		System.out.println("both are equal by '==' function ");
	}
	else {
		System.out.println("both are doesn't equal");
	}
  }
}

// '===' is not a function in java. it throws compile time exception
// '==' is for address comparison,anyway both the values are equal but declared by using new keyword those two values have 
// separate memory address. if we need to avoid address comparison so we have 'intern()' method.