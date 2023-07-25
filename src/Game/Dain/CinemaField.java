package Game.Dain;

public class CinemaField {

	private String movieNameKR;
	private String movieNameENG;
	private int year;
	private String movieSongName;
	private String movieSongArtist;
	private String movieSongFileName;

	public String getMovieNameKR() {
		return movieNameKR;
	}

	public void setMovieNameKR(String movieNameKR) {
		this.movieNameKR = movieNameKR;
	}

	public String getMovieNameENG() {
		return movieNameENG;
	}

	public void setMovieNameENG(String movieNameENG) {
		this.movieNameENG = movieNameENG;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMovieSongName() {
		return movieSongName;
	}

	public void setMovieSongName(String movieSongName) {
		this.movieSongName = movieSongName;
	}

	public String getMovieSongArtist() {
		return movieSongArtist;
	}

	public void setMovieSongArtist(String movieSongArtist) {
		this.movieSongArtist = movieSongArtist;
	}

	public String getMovieSongFileName() {
		return movieSongFileName;
	}

	public void setMovieSongFileName(String movieSongPath) {
		this.movieSongFileName = movieSongPath;
	}

	public CinemaField() {

	}
	public CinemaField(String movieNameKR, int year, String movieSongName, String movieSongArtist, String movieSongFileName) {
		this.movieNameKR = movieNameKR;
		this.year = year;
		this.movieSongName = movieSongName;
		this.movieSongArtist = movieSongArtist;
		this.movieSongFileName = movieSongFileName;

	}
	public CinemaField(String movieNameKR, String movieNameENG, int year, String movieSongName, String movieSongArtist, String movieSongFileName) {
		this.movieNameKR = movieNameKR;
		this.movieNameENG = movieNameENG;
		this.year = year;
		this.movieSongName = movieSongName;
		this.movieSongArtist = movieSongArtist;
		this.movieSongFileName = movieSongFileName;
	}
}
