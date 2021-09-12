import java.util.Scanner;


public class MovieDriver {

	public static void main(String[] args) 
	{
		
		String another = "y";
        while(another.equals("y"))
       {
    	   Scanner keyboard = new Scanner(System.in);
           Movie name = new Movie();
           
   		System.out.println("Enter the name of a movie: ");
   		String movie = keyboard.nextLine();
   		
   		name.setTitle(movie);
   		
   		System.out.println("Rating: ");
   		String rating = keyboard.nextLine();
   		
   		name.setRating(rating);
   		
   		System.out.println("How many tickets were sold: ");
   		int soldTickets = keyboard.nextInt();
   		
   		name.setSoldTickets(soldTickets);
   		
   		System.out.println(name.toString());
   		
   		
   		
   		System.out.println("Enter another movie (y or n)?");
   		another=keyboard.nextLine();
           another=keyboard.nextLine();
       }
      
		
	}

}
