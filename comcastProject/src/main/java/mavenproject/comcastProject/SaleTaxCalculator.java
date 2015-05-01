package mavenproject.comcastProject;

import java.util.*;
import java.lang.*;
import java.io.*;


public class SaleTaxCalculator{

	public enum ItemType {BASIC, LUXURY};
	
	public static void main(String []args){
		SaleTaxCalculator saleTaxCalculator = new SaleTaxCalculator();
		Double finalPrice = saleTaxCalculator.calculateTotalPrice(1000, ItemType.LUXURY, 1);
		System.out.println("final price " + finalPrice );
	}

	public Double calculateTotalPrice(int basePrice,  ItemType itemType, int quantity){
		Double taxPercent = null;

		switch (itemType) {
		case BASIC:
			taxPercent = (double) 1;
			break;
		case LUXURY:
			taxPercent = (double) 9;
			break;
		}
		
		Double saleTax = basePrice * taxPercent / 100 ;
		Double TotalPrice = (double) (basePrice + saleTax);
		Double GrandTotal = quantity * TotalPrice;

		return GrandTotal;
	}
}