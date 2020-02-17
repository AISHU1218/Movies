package com.demo.controllers;

import java.util.List;
import com.demo.entities.Movie;
import com.demo.services.MovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class MovieController {

	 Logger logger = LoggerFactory.getLogger(MovieController.class);
	 
	
	@Autowired
	private MovieService movieService;
	
	//All movies along all fields
	@GetMapping("/movies/all")
	public Iterable<Movie> getMovie(){
		 logger.info("JSON value of all movie details");
		return movieService.findAll();
	}
	
	//Highly rated movie name and ratingsl
	@GetMapping("/movies")
	public List<Object> getAllMovie(){
		List<Object> movie=movieService.findName();
		return movie;
	}
	
	
	//Movie Details of particular IDs
	@GetMapping("/movies/{id}")
	public ResponseEntity<?> getMovie(@PathVariable("id") int id){
		Movie movie=movieService.find(id);
	    if(movie==null) {
	    	return new ResponseEntity<String>("No movie found for ID"+id,HttpStatus.OK);
	    }
	    return new ResponseEntity<Movie>(movie,HttpStatus.OK);
	}
	
	
	/*
	 * //Search by movie name
	 * 
	 * @GetMapping("/movies/search/{name}") public ResponseEntity<?>
	 * getMovieName(@PathVariable("name")String name,ModelMap modelMap){ List<Movie>
	 * movie=movieService.findByOne(name); //List<Movie> m=movieService.fin
	 * modelMap.put("movies",movieService.findByOne(name));
	 * 
	 * 
	 * //int id= movie.get(index) if(movie==null) { return new
	 * ResponseEntity<String>("No movie found for ID"+name,HttpStatus.OK); }
	 * logger.info("JSON data of particular movie detail"); return new
	 * ResponseEntity<List<Movie>>(movie,HttpStatus.OK); }
	 */
	
	
	/*
	 * //Filter by language
	 * 
	 * @GetMapping("/movies/filterbylanguage/{language}") public ResponseEntity<?>
	 * getMovieLang(@PathVariable("language")String language){ List<Movie>
	 * movie=movieService.findByLang(language);
	 * 
	 * if(movie==null) { return new
	 * ResponseEntity<String>("No movie found for ID"+language,HttpStatus.OK); }
	 * return new ResponseEntity<List<Movie>>(movie,HttpStatus.OK); }
	 */
	
	//Filter by genre
	/*
	 * @GetMapping("/movies/filterbygenre/{genre}") public ResponseEntity<?>
	 * getMovieGenre(@PathVariable("genre")String genre){ List<Movie>
	 * movie=movieService.findByGen(genre); if(movie==null) { return new
	 * ResponseEntity<String>("No movie found for ID"+genre,HttpStatus.OK); } return
	 * new ResponseEntity<List<Movie>>(movie,HttpStatus.OK); }
	 */
	
	@PostMapping("/movies/shows")
	public List<Object> getAllShowMovie(){
		List<Object> movie=movieService.findMovieShows();
		return movie;
	}
	
	@PostMapping("/movies")
	Movie newMovie(@RequestBody Movie movie) {
		return movieService.save(movie);
	}
	
	
}
