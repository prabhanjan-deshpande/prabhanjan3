package program;

public class star {

	public static void main(String[] args) {
		star s = new star();
		s.printStar(5);
	}
	
	public void printStar(int n){
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
