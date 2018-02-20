import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

import by.gsu.pms.ConvertToBYN;
import by.gsu.pms.Purchase;
import by.gsu.pms.WeekDay;



public class Runner {

	public static void main(String[] args) {

				Scanner sc = null;    
       
				try {
					int costOnMonday=0;
					WeekDay dayOfMaxCost=null;
					int totalCost=0;
					double maxCost=0;
					double meanCost=0.0;
					
					System.out.println("Purchase name= "+Purchase.COMMODITY_NAME);
					System.out.println("Purchase price= "+ConvertToBYN.convertToByn(Purchase.COMMODITY_PRICE,	100, 2));										
					sc = new Scanner(new FileReader("src/in.txt"));
					sc.useLocale(Locale.ENGLISH); 
					final int PURCHASES_NUMBER=sc.nextInt();
					final Purchase[] purchases=new Purchase[PURCHASES_NUMBER];
						
					
					for (int i = 0; i < PURCHASES_NUMBER; i++) {
						purchases[i] = new Purchase(sc.nextInt(), sc.nextInt());
						System.out.println(purchases[i]);
					}
					
				System.out.println("====================");
					
					for (Purchase purchase : purchases) {
						
							totalCost+=purchase.getCost();
							if(purchase.getWeekDay()==WeekDay.MONDAY) {
								costOnMonday+=purchase.getCost();
								
							}
							if(maxCost<purchase.getCost()) {
							
								maxCost=purchase.getCost();
								dayOfMaxCost=purchase.getWeekDay();
							}
					}
					
					if(purchases.length > 0) {
				        meanCost = (double) totalCost/purchases.length;
				    }
					
					Arrays.sort(purchases);
					for (Purchase purchase : purchases) {
						System.out.println(purchase);
					}
					System.out.println("====================");
					System.out.printf("Mean cost= %.3f%n",meanCost/100);
					System.out.println("The total cost on Monday= "+ConvertToBYN.convertToByn(costOnMonday, 100, 2));
					System.out.println("The day with the maximum cost purchase is "+dayOfMaxCost);
					
					
					
					
					
					int index = Arrays.binarySearch(purchases,new Purchase(5, 0));
					System.out.println(index<0? "Required purchase is not found":"Find some purchase with number equaled to "+purchases[index]);
					
														
				} 
				catch (NoSuchElementException e) {
					System.err.println("Array of unacceptable length");
				}
				catch (NegativeArraySizeException e) {
					System.err.println("Array of unacceptable length");
				}
				catch (ArrayIndexOutOfBoundsException e) {
					System.err.println("Invalid WeekDay in array");
				}
				catch (FileNotFoundException e) {
					System.err.println("Input file is not found");
				} 
				
				
				 finally {
					if(sc != null) {
						sc.close();
			}
		}
	}

}
