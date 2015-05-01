package windowHandleExample;

public class CallingNonStaticMethodFromStaticMethod {

	
	public static void MyStaticMethod(){
		System.out.println("In non static method");
		CallingNonStaticMethodFromStaticMethod sm = new CallingNonStaticMethodFromStaticMethod();
		sm.MyNonStaticMethod();
	}
	
	public void MyNonStaticMethod(){
		MyStaticMethod();
		System.out.println("in statis method");
	}
}
