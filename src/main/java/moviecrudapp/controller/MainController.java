package moviecrudapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import moviecrudapp.dao.MovieDao;
import moviecrudapp.model.Movie;

@Controller
public class MainController {
	
	@Autowired
	private MovieDao movieDao;
	
	
	@RequestMapping("/")
	public String home(Model model) {
		
		List<Movie> movies = movieDao.getMovies();
		model.addAttribute("movies", movies);
		return "index";
	}
	
	@RequestMapping("/add-movie")
	public String addMovie(Model model) {
		model.addAttribute("title", "Add Movie");
		return "add_movie_form";
	}
	
	@RequestMapping(value="/handle-movie",method = RequestMethod.POST)
	public RedirectView handleMovie(@ModelAttribute Movie movie,HttpServletRequest request) {
		movieDao.createMovie(movie);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}
	
	@RequestMapping(value="/delete/{movieId}")
	public RedirectView deleteMovie(@PathVariable("movieId") int movieId,HttpServletRequest request) {
		movieDao.deleteMovie(movieId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}
	
	@RequestMapping(value="/update/{movieId}")
	public String updateForm(@PathVariable("movieId") int movieId,Model model) {
		Movie movie = movieDao.getMovie(movieId);
		model.addAttribute("movie",movie);
		return "update_form";
	}
	
	@RequestMapping(value="/deleteAll")
	public RedirectView deleteAllMovies(@ModelAttribute Movie movie,HttpServletRequest request) {
		movieDao.deleteAllMovies();
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
		
	}
	
	
	
}
