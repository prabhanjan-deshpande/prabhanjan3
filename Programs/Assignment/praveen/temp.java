package praveen;

public class temp {

	public static void main(String[] args) {
		temp t = new temp();
		t.synched();
		t.synched2();
	}
	public synchronized void synched(){
		System.out.println("this method is synchronized.");
	}

	public void synched2(){
		synchronized(this){
			System.out.println("this method is synchronized.");
		}
	}

}
