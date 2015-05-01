package windowHandleExample;

public class StaticOverloadingExample {
	public static void foo() {
        System.out.println("Test.foo() called from parent ");
    }
    public static void foo(int a) { 
        System.out.println("Test.foo(int) called from parent");
    }
    public static void main(String args[])
    { 
    	StaticOverloadingExample.foo();
    	StaticOverloadingExample.foo(10);
    }

}
