package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Movie;
import com.demo.repositories.MovieRepository;

@Service("movieService")
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	@Override
	public Iterable<Movie> findAll() {
		// TODO Auto-generated method stub
		return movieRepository.findAll();
	}

	@Override
	public Movie find(int id) {
		// TODO Auto-generated method stub
		return movieRepository.findById(id).get();
	}

	@Override
	public List<Movie> findByOne(String name) {
		// TODO Auto-generated method stub
		return movieRepository.findByName(name);
	}

	@Override
	public Movie save(Movie movie) {
		// TODO Auto-generated method stub
		return movieRepository.save(movie);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		movieRepository.deleteById(id);
	}

	@Override
	public List<Movie> findByLang(String language) {
		// TODO Auto-generated method stub
		return movieRepository.findByLanguage(language);
	}

	@Override
	public List<Movie> findByGen(String genre) {
		// TODO Auto-generated method stub
		return movieRepository.findByGenre(genre);
	}

	@Override
	public List<Object> findName() {
		// TODO Auto-generated method stub
		return movieRepository.findName();
	}

	@Override
	public List<Object> findMovieShows() {
		// TODO Auto-generated method stub
		return movieRepository.findShows();
	}

}
