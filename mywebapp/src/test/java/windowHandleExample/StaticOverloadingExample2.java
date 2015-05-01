package windowHandleExample;

public class StaticOverloadingExample2 extends StaticOverloadingExample {

	public static void foo(String name) {
        System.out.println("Test.foo() called from child "+name);
    }
	
	public static void main(String args[])
    { 
		StaticOverloadingExample2.foo("namrata");
		StaticOverloadingExample.foo(10);
    }
}
