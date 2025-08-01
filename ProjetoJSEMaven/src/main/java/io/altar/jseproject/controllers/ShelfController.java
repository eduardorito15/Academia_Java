package io.altar.jseproject.controllers;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import io.altar.jseproject.model.Shelf;
import io.altar.jseproject.services.ShelfService;

@Path("shelves")
public class ShelfController {
	ShelfService ss = new ShelfService();
	@Context
	protected UriInfo context;

	@GET
	@Path("status")
	@Produces(MediaType.TEXT_PLAIN)
	public String status() {
		return context.getRequestUri().toString() + " is ok";
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public int addShelf(Shelf s) {
		return ss.addEntity(s);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Shelf getEntity(int entityId) {
		return ss.getEntity(entityId);
	}
}
