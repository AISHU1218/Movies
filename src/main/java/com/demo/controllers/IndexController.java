package com.demo.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.entities.Cast;
import com.demo.entities.Movie;
import com.demo.repositories.CastRepository;
import com.demo.repositories.MovieRepository;
import com.demo.services.CastService;
import com.demo.services.MovieService;

@Controller
@RequestMapping(value= {"","movie"})
public class IndexController {
	Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	
    @RequestMapping("/")
    public String index(ModelMap modelMap) {
        modelMap.put("movies",movieService.findAll());
        logger.info("In Movie page");
        return "movie/index";
    }
    
    @RequestMapping(value="/moviehome")
    public String moviehome(ModelMap modelMap) {
        modelMap.put("movies",movieService.findAll());
        logger.info("In Movie home page");
        return "movie/moviehome";
    }
    
    @RequestMapping("/movies/search/{name}/{id}")
    public String movielist(ModelMap modelMap, @PathVariable("name") String name ,@PathVariable("id") String movieId) {
        modelMap.put("movies",movieService.findByOne(name));
        int id=Integer.parseInt(movieId);
        modelMap.put("casts", castService.findByAll(id));
        logger.info("Particular movie details");
        return "movie/movielist";
    }

	
	  @GetMapping("/movies/filterbylanguage/{language}") 
	  public String  index(ModelMap modelMap,@PathVariable("language")String language){
	  modelMap.put("movies",movieService.findByLang(language)); 
	 // int  id=Integer.parseInt(); 
	//  modelMap.put("casts", castService.findByAll(id));
	  logger.info("Filtering by language");
	  
	  return "movie/index"; }
	 
	//Filter by genre
	  @RequestMapping("/movies/filterbygenre/{genre}") 
	  public String	index(@PathVariable("genre")String genre,ModelMap modelMap){
		  modelMap.put("movies",movieService.findByGen(genre)); 
	 // int  id=Integer.parseInt(); 
	//  modelMap.put("casts", castService.findByAll(id));
	  logger.info("Filtering by genre");
	  
	  return "movie/index"; }
    
    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private CastRepository castRepository;

    @Autowired
    private MovieService movieService;

    @Autowired
    private CastService castService;


    @RequestMapping(value="moviedetails",method=RequestMethod.GET)
    public String moviedetails(ModelMap modelMap) {
        modelMap.put("movie",new Movie());
        modelMap.put("cast", new Cast());
        logger.info("Enter movie details");
        return "movie/moviedetails";
    }

    @RequestMapping(value="moviedetails",method=RequestMethod.POST)
    public String moviedetails(@ModelAttribute("movie") Movie movie) {
        //castRepository.saveAll(movie.getCast());
        movieService.save(movie);
        //castService.save(movie.getCast());
        logger.info("Storing  movie details into database");
        return "redirect:/movie/moviehome";
    }

    @RequestMapping(value="castdetails/{id}",method=RequestMethod.GET)
    public String castdetails(ModelMap modelMap, @PathVariable("id") String movieId) {
        modelMap.put("cast",new Cast());
        logger.info("Enter cast details");
        int id=Integer.parseInt(movieId);
        modelMap.addAttribute("id",id);
        return "movie/castdetails";
    }

    @RequestMapping(value="castdetails/{id}",method=RequestMethod.POST)
    public String castdetails(@ModelAttribute("cast") Cast cast, @PathVariable("id") String movieId) {
        //castRepository.saveAll(cast.getCast());
        castService.save(cast);
        logger.info("Storing  cast details into database");
        return "movie/castdetails";
    }

    @RequestMapping(value="delete/{id}",method=RequestMethod.GET)
    public String delete(@PathVariable("id") int id) {
        //castRepository.saveAll(movie.getCast());
        //castService.deleteByMovie(id);
    	 logger.info("Deleting movie and cast details of particular id database");
        movieService.delete(id);

        //System.out.print
        return "redirect:/movie/moviehome";
    }

}
