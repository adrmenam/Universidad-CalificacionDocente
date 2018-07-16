/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.organizacion.restService.service;

import ec.edu.espe.model.EvaRespuestaPregunta;
import ec.edu.espe.services.EvaRespuestaPreguntaService;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author jolube
 */
@Stateless
@Path("/respuestapregunta")
public class EvaRespuestaPreguntaFacadeREST  {

   @Inject
   EvaRespuestaPreguntaService respuestaPreguntaService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(EvaRespuestaPregunta entity) {
        respuestaPreguntaService.crear(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void edit(@PathParam("id") Integer id, EvaRespuestaPregunta entity) {
        respuestaPreguntaService.modificar(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        respuestaPreguntaService.eliminar(id);
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public EvaRespuestaPregunta find(@PathParam("id") Integer id) {
        return respuestaPreguntaService.obtenerPorId(id);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<EvaRespuestaPregunta> findAll() {
        return respuestaPreguntaService.obtenerTodos();
    }
    
}
