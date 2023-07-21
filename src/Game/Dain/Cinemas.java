package Game.Dain;

public class Cinemas {

	private String Movie;
	private int year;
	private String name;
	private String artist;
	private String path;


	public Cinemas(String movie, int year, String name, String artist, String path) {
		super();
		Movie = movie;
		this.year = year;
		this.name = name;
		this.artist = artist;
		this.path = path;
	}

	public String getMoive() {
		return Movie;
	}

	public void setMoive(String moive) {
		this.Movie = moive;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
