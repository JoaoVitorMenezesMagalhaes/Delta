package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.List;

public class Playlist extends Collection{
	private String user;
	private List<Movie> movies;
	
	public Playlist(String title, String user) {
		super(title);
		this.user = user;
		this.movies = new ArrayList<>();
	}
	
	public String getUser() {
		return user;
	}
	
	public void addMovie(Movie movie){
		this.movies.add(movie);		
	}

}