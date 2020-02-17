package com.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Cast;
import com.demo.entities.Movie;
import com.demo.repositories.CastRepository;

@Service("castService")
public class CastServiceImpl implements CastService{

	@Autowired
	private CastRepository castRepository;
	
	@Override
	public Iterable<Cast> findAll() {
		// TODO Auto-generated method stub
		return castRepository.findAll();
	}

	
	 

	@Override
	public Cast save(Cast cast) {
		// TODO Auto-generated method stub
		return castRepository.save(cast);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		castRepository.deleteById(id);
	}

	@Override
	public List<Cast> findByAll(int movieId) {
		// TODO Auto-generated method stub
		return castRepository.findByMovieId(movieId);
	}

}
