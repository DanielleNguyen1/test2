package Ch10;
import java.util.*;
public class Party {
	private int guests;
	
	public int getGuests()
	{
		return guests;
	}
	public void setGuests(int numGuests)
	{
		guests = numGuests;
	}
	
	public Party(int no)
	{
		guests = no;
	}
	
	public void displayInvite()
	{
		System.out.print("Please come to my party!");
	}

}
