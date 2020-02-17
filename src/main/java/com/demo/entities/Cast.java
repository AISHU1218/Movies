package com.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cast")
public class Cast {



	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="movie_Id")
	private int movieId;


	private String name;
	private String role;


	@ManyToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinTable(name="movie")
	@JoinColumn(name="id",referencedColumnName="id",nullable=false,insertable=false,updatable=false)
	private Movie movie;



	public void setId(int id) {
		this.id = id;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public Cast() {
		super();
	}




}
