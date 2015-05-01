package program;


	  import java.util.Scanner;
	    import java.util.Arrays;
	    public class arr {
	    	public static void main(String [] args){
	            Scanner input = new Scanner(System.in);

	            int [] a = new int[5];
	            System.out.println("Enter numbers for array: ");
	            for(int i = 0; i < a.length; i++){
	                a[i] = input.nextInt();
	            }
	            System.out.print("Output: " + Arrays.toString(add(a)));
	        }

	        public static int [] add(int [] array1){
	            array1 = new int [array1.length];
	            int [] array2 = new int[array1.length];

	            for(int i = 0; i < array1.length; i++){
	                array2[i] = array1[i] + 1;
	            }

	            return array2;
	        }
	    }

