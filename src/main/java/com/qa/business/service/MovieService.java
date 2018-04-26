package com.qa.business.service;


import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qa.business.repository.IMovieRepository;
@Default
public class MovieService implements IMovieService {
	
	@Inject
	private IMovieRepository repo;
	
	@Override
	public String getAllMovies() {
		return repo.getAllMovies();
	}

	@Override
	public String getAMovie(Long id) {
		return repo.getAMovie(id);
	}

	@Override
	public String createMovie(String jsonMovie) {
		return repo.createMovie(jsonMovie);
	}

	@Override
	public String deleteMovie(Long id) {
		return repo.deleteMovie(id);
	}

	@Override
	public String updateMovie(Long id, String movieToUpdate) {
		return repo.updateMovie(id, movieToUpdate);
	}
	

}
