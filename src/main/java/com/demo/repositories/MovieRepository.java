package com.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.entities.Movie;

@Repository("movieRepository")
public interface MovieRepository extends JpaRepository<Movie,Integer>{
	
@Query("select m.name, m.rating from Movie m ORDER BY rating DESC")
 public List<Object> findName();

@Query("select m.id, m.name, m.dateOfRelease from Movie m")
public List<Object> findShows();

 public List<Movie> findByName(String name);
 
 public List<Movie> findByLanguage(String language);
 
 public List<Movie> findByGenre(String genre);
}
