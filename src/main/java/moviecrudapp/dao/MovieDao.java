package moviecrudapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import moviecrudapp.model.Movie;

@Component
public class MovieDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
		@Transactional
		public void createMovie(Movie movie) {
			this.hibernateTemplate.saveOrUpdate(movie);
		}

		
		public List<Movie> getMovies() {
			List<Movie> movies = this.hibernateTemplate.loadAll(Movie.class);
			return movies;
		}

		
		@Transactional
		public void deleteMovie(int movieId) {
			Movie movie = this.hibernateTemplate.load(Movie.class, movieId);
			this.hibernateTemplate.delete(movie);
		}

		
		public Movie getMovie(int movieId) {
			return this.hibernateTemplate.get(Movie.class, movieId);
		}
		
		
		@Transactional
		public void deleteAllMovies() {
			this.hibernateTemplate.deleteAll(getMovies());
		}
	
	
}
