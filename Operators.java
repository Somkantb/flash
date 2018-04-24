
package com.practice;
import java.util.Scanner;
import java.util.*;
public class Operators {
	double mealCost;
	double tipPercent;
	double taxPercent;
	double totalPrice;
	
	
	public static void main(String[] args) {
		Operators op = new Operators();
		Scanner f = new Scanner(System.in);
		System.out.println("Pls enter the value for Basic rate: ");
		op.mealCost = f.nextDouble();
		System.out.println("Pls enter the tip rate in integer: ");
		op.tipPercent = (f.nextDouble()/100)*op.mealCost;
		//op.tipPercent = .05*op.mealCost;
		System.out.println("Pls enter the tax rate in integer: ");
		op.taxPercent= (f.nextDouble()/100)*op.mealCost;
		op.totalPrice = op.mealCost+op.tipPercent+op.taxPercent;
		System.out.printf ("The cost of meal is :%.2f \n",op.mealCost);
		System.out.printf ("The tip :%.2f\n",op.tipPercent);
		System.out.printf ("The tax : %.2f\n",op.taxPercent);
		System.out.printf ("The total price of meal: %.2f ",op.totalPrice);
        f.close();
	}
}
