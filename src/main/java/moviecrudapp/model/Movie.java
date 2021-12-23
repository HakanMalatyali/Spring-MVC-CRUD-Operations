package moviecrudapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String movieName;
	private String director;
	private int visionDate;
	
	public Movie(int id, String movieName, String director, int visionDate) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.director = director;
		this.visionDate = visionDate;
	}

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String toString() {
		return "Movie [id=" + id + ", movieName=" + movieName + ", director=" + director + ", visionDate=" + visionDate
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getVisionDate() {
		return visionDate;
	}

	public void setVisionDate(int visionDate) {
		this.visionDate = visionDate;
	}
	
	
	
	

	

}
