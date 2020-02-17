package com.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.Cast;
import com.demo.entities.Movie;
import com.demo.services.CastService;

@RestController
public class CastController {

	@Autowired
	private CastService castService; 
	

	@GetMapping("/movies/casts")
public Iterable<Cast> getCast(){
		return castService.findAll();
	}
	
	@GetMapping("/movies/casts/{id}")
	public ResponseEntity<?> getCast(@PathVariable("id") int movieId){
		List<Cast> cast=castService.findByAll(movieId);
	    if(cast==null) {
	    	return new ResponseEntity<String>("No movie found for ID"+movieId,HttpStatus.OK);
	    }
	    return new ResponseEntity<List<Cast>>(cast,HttpStatus.OK);
	}
}
