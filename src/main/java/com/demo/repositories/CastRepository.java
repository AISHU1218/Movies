package com.demo.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.entities.Cast;
import com.demo.entities.Movie;

@Repository("castRepository")
public interface CastRepository extends CrudRepository<Cast,Integer>{

	@Transactional
	@Modifying
	@Query("delete  from Cast  where movieId=:movieId")
	public void deleteByMovieId(@Param("movieId") int movieId);
	
	 public List<Cast> findByMovieId(int movieId);

}
//@Query("select c from cast c where c.id=?1")
/*
 * @Query("select c,m from Cast c, Movie m where c.movieId=?1") public
 * List<Cast> findByMovieId(int movieId);
 */
