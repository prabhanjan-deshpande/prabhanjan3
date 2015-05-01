package comcastProgram;

import java.util.Scanner;

public class CalculateTotalCost {

	public static void main(String[] args) {
		CalculateTotalCost tax = new CalculateTotalCost();
		tax.calculateTaxPrice(4000);
	}

	public void calculateTaxPrice(int priceForTax){
		@SuppressWarnings("resource")
		Scanner scan = new Scanner( System.in );
		Items theItem = new Items();

		int number;
		String Name = "";

		System.out.print("How many items are there in cart :  ");
		number = scan.nextInt();
		scan.nextLine();

		Items[]inv = new Items[number];

		for(int count = 0; count < inv.length; ++count)
		{
			System.out.print("\nWhat is item " +(count +1) + "'s name?:  ");
			Name = scan.nextLine();
			theItem.setName(Name);

			System.out.print("Enter " + Name + "'s product number:  ");
			double pNumber = scan.nextDouble();
			theItem.setpNumber(pNumber);

			System.out.print("How many " + Name + "s are there in inventory?:  ");
			double Units = scan.nextDouble();
			theItem.setUnits(Units);

			System.out.print(Name + "'s cost: ");
			double Price = scan.nextDouble();
			theItem.setPrice (Price);

			inv[count] = new Items(Name, Price, Units, pNumber);
			scan.nextLine();
			
			System.out.println("Total : "+theItem.printTotal());
		}

	}
}
