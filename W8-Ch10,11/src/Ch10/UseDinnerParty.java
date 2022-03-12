package Ch10;
import java.util.*;

public class UseDinnerParty {

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		
		//Prompt user for numGuest
		System.out.print("Enter number of guests: ");
		int guestNum = kb.nextInt();
		//obj.setGuests(guestNum);
		
		//prompt user for diner choice 
		System.out.print("Dinner choice: (1-beef or 2-chicken): ");
		int choice = kb.nextInt();
		while(choice != 1 && choice != 2)
		{
			System.out.print("Invalid choice. Dinner choice: (1-beef or 2-chicken): ");
			choice = kb.nextInt();

		}
		//obj.setDinnerChoice(choice);
		DinnerParty obj = new DinnerParty(guestNum,choice);

		if(choice == 1)
		{
			System.out.printf("Number of guests: %d \nDinner choice of BEEF will be served\n",obj.getGuests());
		}
			
		if(choice == 2)
		{
			System.out.printf("Number of guests: %d \nDinner choice of CHICKEN will be served\n",obj.getGuests());
		}
		obj.displayInvite();
		
		
		
	}
}
