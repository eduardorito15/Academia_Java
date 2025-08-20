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

import io.altar.jseproject.model.Product;
import io.altar.jseproject.services.ProductService;

@Path("products")
@RequestScoped
public class ProductController {
	//FIXME Change ShelfService for CDI injection
	ProductService ps = new ProductService();
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
	public int addProduct(Product p) {
		return ps.addEntity(p);
	}

	@GET
	@Path("{entityId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Product getEntity(@PathParam("entityId") int entityId) {
		return ps.getEntity(entityId);
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void updateProduct(Product p) {
		ps.editEntity(p);
	}

	@DELETE
	@Path("{entityId}")
	public void deleteProduct(@PathParam("entityId") int entityId) {
		ps.removeEntity(entityId);
	}
}
