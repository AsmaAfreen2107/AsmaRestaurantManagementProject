package RestaurantProject;
import java.util.Scanner;
public class Main {
	public static Scanner input = new Scanner(System.in);
	public static int choice,Quantity=1;
	public static String again;
	public static double total=0,Pay;
	public static void menu() {
		System.out.println("-_-_-_-_-_-_-_");
		System.out.println("\tWELCOME to Asma Restaurant");
		System.out.println("\tRestaurant Menu :");
		System.out.println("\tl.Barger Rs: $60.00");
		System.out.println("\t2.Pizza Rs: $100.00");
		System.out.println("\t3.Coffee Rs: $5.00");
		System.out.println("\t4.Cancel ");
	}
	public static void order() {
		System.out.println("1 to Barger || 2 to Pizza || 3 to Coffee");
		System.out.println("Press if you want to order :");
		choice=input.nextInt();
		if(choice==1) {
			System.out.println("You have chosen Barger");
			System.out.println("How many Barger you want to order :");
			Quantity=input.nextInt();
			total=total+(Quantity*60);
			System.out.println("You want to buy Again :");
			System.out.println("Press Y for [Yess] and N for [No]:");
			again=input.next();
			if(again.equalsIgnoreCase("Y"))
			order();
			else { 
				System.out.println("Enter payment :");
				System.out.println("total="+total);
				total=Pay-total;
				System.out.println("Customer's return "+total+"tk");
			}	
		}
		if(choice==2) {
			System.out.println("You have chosen Pizza");
			System.out.println("How many Pizza you want to order :");
			Quantity=input.nextInt();
			total=total+(Quantity*100);
			System.out.println("Do You want to buy Again :");
			System.out.println("Press Y for [Yess] and N for [No]:");
			again=input.next();
			if(again.equalsIgnoreCase("Y"))
			order();
			else { 
				System.out.println("Enter payment :");
				System.out.println("total="+total);
				total=Pay-total;
				System.out.println("Customer's return "+total+"tk");
			}	
		}
		if(choice==3) {
			System.out.println("You have chosen Coffee");
			System.out.println("How many Cup of Coffee you want to order :");
			Quantity=input.nextInt();
			total=total+(Quantity*5);
			System.out.println("Do You want to buy Again :");
			System.out.println("Press Y for [Yess] and N for [No]:");
			again=input.next();
			if(again.equalsIgnoreCase("Y"))
			order();
			else { 
				System.out.println("Enter payment :");
				System.out.println("total="+total);
				total=Pay-total;
				System.out.println("Customer's return "+total+"tk");
			}	
		}
		else if (choice ==4) {
			System.exit(0);
			}
			else {
			System.out.println("Choose a Food in this items :");
			order();
			}
	}
	public static void main(String[] args) {
		menu();
		order();	
		// TODO Auto-generated method stub
	}
}

