package io.altar.jseproject.controllers;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import io.altar.jseproject.model.Shelf;
import io.altar.jseproject.services.ShelfService;

@Path("shelves")
@RequestScoped
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
	@Path("{entityId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Shelf getEntity(@PathParam("entityId") int entityId) {
		return ss.getEntity(entityId);
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void updateShelf(Shelf s) {
		ss.editEntity(s);
	}

	@DELETE
	@Path("{entityId}")
	public void deleteShelf(@PathParam("entityId") int entityId) {
		ss.removeEntity(entityId);
	}
}
