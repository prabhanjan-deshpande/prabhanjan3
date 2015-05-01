package mavenproject.comcastProject;

import mavenproject.comcastProject.SaleTaxCalculator.ItemType;
import org.testng.annotations.Test;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestSaleTaxFromUserInput {

	SaleTaxCalculator saleTaxCalculator = new SaleTaxCalculator();

	@Test
	public void testSaleTaxFromUserInput(){

		Scanner in = new Scanner(System.in);

		try{
			System.out.println("Enter the number of items you want to buy?");
			int iNoItems = in.nextInt();

			//Initial Validation
			if(iNoItems <= 0)
				System.out.println("Error! Zero or Negative value entered..");
			else{

				int[] arItem = new int[iNoItems];
				Double[] arItemCo = new Double[iNoItems];
				int iCho;

				for(int i = 0; i < iNoItems; i++){

					System.out.println("Enter the cost of item no " + (i+1) + " in cents");
					arItem[i] = in.nextInt();

					int iflag = 0;

					while(iflag == 0){
						System.out.println("Please tell if this item is luxury or a necessary.");
						System.out.println("Enter 1 - For luxury item");
						System.out.println("Enter 2 - For Necessary item");
						iCho = in.nextInt();

						if(iCho == 1){
							arItemCo[i] = saleTaxCalculator.calculateTotalPrice(1000, ItemType.LUXURY, 1);
							iflag = 1;
						}else if(iCho == 2){
							arItemCo[i] = saleTaxCalculator.calculateTotalPrice(1000, ItemType.BASIC, 1);
							iflag = 1;
						}else{
							System.out.println("Invalid input! Please enter either 1 or 2");
						}						
					}
				}

				Double totalPrice = 0.0;
				for(int i = 0 ; i < iNoItems; i++){
					System.out.println("The cost of item no. "+(i+1)+" is: " + arItemCo[i]);
					totalPrice = totalPrice + arItemCo[i];
				}

				System.out.println("The total cost of the items is: " + totalPrice);				
			}

		}catch(InputMismatchException e){
			System.out.println("Error! The input should be an integer. E.g. 1, 2, 10, 100..");

		}finally{
			in.close();
		}
	}
}