
package Movie;


import java.util.*;


public class MovieControler{
	
	public static void main(String [] args)
	{
	
	 MovieManager manager = new MovieManager();
	
    System.out.println("Welcome to movie world please select your choice");
    while(true)
    {
    System.out.println("press 1 for add movie");
    System.out.println("press 2  show all movies");
    System.out.println("press 3 for getMovieById");
    System.out.println("press 4 delete all movie");
    System.out.println("press 5 load movies");
    System.out.println("press 6 for save movie");
    System.out.println("press 9 for exit");
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter your choice");
    
    int choice = scanner.nextInt();
    
    switch(choice)
    {
   
    
    case 1:
    	System.out.println("enter id, name , year and gener of movie");
    	String id = scanner.next();
    	String name =scanner.next();
    	int year=scanner.nextInt();
    	String genre = scanner.next();
    	manager.addMovie(id, name, year, genre);
    	break;
    	
    case 2:
    	System.out.println("movie list is--------------------------------------->");
    	manager.getMovies().stream().forEach((x)->System.out.println(x));
    	break;
    	
    case 3:
    	System.out.println("Enter movie id");
    	String movieId = scanner.next();
    	System.out.println(manager.getMovieById(movieId));
    	break;
    	
    case 4:
    	manager.deleteAllMovies();
    	System.out.println("delete all movies");
    	break;
    	
    case 5:
    	manager.loadMovies();
    	System.out.println("load movies");
    	break;
    	
    case 6:
    	manager.saveMovies();
    	break;
    	
    case 9:
    	System.exit(0);
    	break;
    
    
   default:
	   System.out.println("Invalide selection");
        
    }
    
   }
    
}
	
}


