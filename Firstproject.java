import java.util.Scanner;

public class Firstproject {

	public static void main(String[] args) {
		
				greeting();
				calculations();
				input();
	}
	
	public static void greeting() {
		// Welcome Message 
		System.out.println("Welcome to viewer watcher!");
		
		System.out.println();
		
		//How to use this program
		System.out.println("This program will calculte the amount of viewers during a given day or week.");
	}
	
	public static void calculations() {
		//First I would start taking the average amount of viewers for a  specific game for day/week
		
		int viewersmonday = 500;
		int dayhours = 24;
		int avgmonday = (viewersmonday /dayhours);
		
		System.out.println();
		
		System.out.println("The average amount of viewers throughtout Monday was " +avgmonday +" every hour.");
		
		System.out.println();

		int weeklyviews = 4000;
		int days = 7;
		int avgweekly = (weeklyviews / days);
		
		
		System.out.println("There were about " + avgweekly + " people watching this stream a day this week.");
	}
	public static void input() { 
		System.out.println(" Which category do you prefer: FPS, Sports, MOBA Chatting?  ");
		String category = "FPS";
		
		Scanner scanner = new Scanner(System.in);
		String userinput= scanner.nextLine();
		
		int weeklyviews = 4000;
		int days = 7;
		int avgweekly = (weeklyviews / days);
		
		System.out.println(category.contentEquals(userinput));
		if(category.contentEquals(userinput)) {
			
			System.out.println("The average viewer for this catergory is " + avgweekly + " a day this week.");
		}
		
		System.out.println();
		
		System.out.println("Would you like to know the average views for a Monday? ");
		String reply = "yes";
		String userreply = scanner.nextLine();
		int viewersmonday = 500;
		
		while(!userreply.equals(reply)) {
			System.out.println("Are you sure? ): ");
			userreply = scanner.nextLine();
			
			
		}
		System.out.println("About " + viewersmonday + " people watch this stream on a Monday.");
		scanner.close();
	}
	//I would like to display the data using a 2D array if I can below. 
	//Using the 2D array, I would like to ask the user to pick a category of their choice to find out views. 
}
