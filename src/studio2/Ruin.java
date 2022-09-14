package studio2;

import java.util.random.*;

import org.w3c.dom.css.CSSImportRule;
import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startAmount = 10;
		double winChance = 0.5;
		int winLimit = 15;
		int run = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Days to Simulate: ");
		int days = in.nextInt() ;
		int ruins = 0;
		
		
		for ( int i = 1;  i <= days; i++)
		{
			System.out.println("Day: " + i);
			while (startAmount < 15 && startAmount > 5)
			{
			double r = Math.random();
			if (r > 0.5)
				{
				startAmount++;
			
				run++;
				}
			else
				{
				startAmount--;
				
				run++;
				}
			
			}
			
			if (startAmount == 5)
				ruins++;
			
			
			System.out.println("Number of Runs: " + run);
			System.out.println("Current Balance: " + startAmount );
			System.out.println();
			startAmount = 10;
			run = 0;
			
		}
		
		System.out.println("Number of Ruins: " + ruins);
		double rate = (double)ruins / days;
		System.out.println("Ruin Rate: " + rate);
		
		double expectedRuin;
		if (winChance == 0.5)
		{
			expectedRuin = 1 - (10/15);
		}
		else
		{
			double a = (1 - winChance) / winChance;
			
		}

	}
	

}
