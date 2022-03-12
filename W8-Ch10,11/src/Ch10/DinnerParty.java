package Ch10;

public class DinnerParty extends Party
{


	private int dinnerChoice;
	
	public int getDinnerChoice() {
		return dinnerChoice;
	}
	public void setDinnerChoice(int choice)
	{
		dinnerChoice = choice; 
	}
	
	public DinnerParty(int no, int choice) {
		super(no);
		dinnerChoice = choice;
		// TODO Auto-generated constructor stub
	}
	
	@Override // annotation informs compiler of intention to override superclass method. Compiler issues error if your child overriden method does not match 
	//parent
	public void displayInvite()
	{
		super.displayInvite();
		System.out.print("It will be lit!");
	}

}
