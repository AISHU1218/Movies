package com.demo.services;

import java.util.List;

import com.demo.entities.Cast;
import com.demo.entities.Movie;

public interface CastService {
	
public Iterable<Cast> findAll();
	
	public List<Cast> findByAll(int movieId);
			
	public Cast save(Cast cast);
	
	public void delete(int id);

}
