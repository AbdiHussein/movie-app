package com.qa.integration;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.qa.business.service.IMovieService;

@Path("/movie")
public class MovieEndpoint {
	@Inject
	private IMovieService service;
	
	@GET
	@Path("/json")
	@Produces(("application/json"))
	public String getAllMovies() {
		return service.getAllMovies();
	}
	

}