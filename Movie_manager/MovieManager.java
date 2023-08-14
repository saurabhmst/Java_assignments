package Movie;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class MovieManager {
	
	private List<Movie> movies;
    private static final String FilePath = "D:\\Java_development_training\\assignment\\structuralDesign\\input.txt";

    public MovieManager() {
    	super();
        movies = new ArrayList<>();
       
    }

    public void addMovie(String id, String name, int year, String genre) {
        Movie m = new Movie(id, name, year, genre);
        movies.add(m);
    }

    public void clearMovies() {
        movies.clear();
    }

    public List<Movie> getMovies() {
        return new ArrayList<>(movies);
    }

    public Movie getMovieById(String string) {
        for (Movie mov : movies) {
            if (mov.getId().equals(string)) {
                return mov;
            }
        }
        return null;
    }

    public void saveMovies() {
    
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FilePath))) {
            outputStream.writeObject(movies);
            System.out.println("Movies saved successfully.");
        } catch (IOException e) {
            System.err.println("Error while saving movies: " + e.getMessage());
        }
    }

    public void loadMovies()  {
    	
		try
		{
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FilePath));
			movies = (List<Movie>) ois.readObject();
		}
		    
       catch (FileNotFoundException e) {
            movies = new ArrayList<>();
        } catch (IOException | ClassNotFoundException e ) {
            System.err.println("Error while loading movies: " + e.getMessage());
        }
        
    }

    public void deleteAllMovies() {
        movies.clear();
        saveMovies(); // After deleting all movies, save the empty list
    }
}



