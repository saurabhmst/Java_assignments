package Movie;

import java.io.Serializable;

public class Movie implements Serializable {
	
	private String id;
	private String name;
	private int year;
	private String genre;
	
	public Movie(String id, String name, int date, String genre) {
		super();
		this.id = id;
		this.name = name;
		this.year = date;
		this.genre = genre;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDate() {
		return year;
	}
	public void setDate(int date) {
		this.year = date;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Movie   id     " + id + "     name    " + name + "    date     "  +year + "   genre   " + genre ;
	}
	
	

}
