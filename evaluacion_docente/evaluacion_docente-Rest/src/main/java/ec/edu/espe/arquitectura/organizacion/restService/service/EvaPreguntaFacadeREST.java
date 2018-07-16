/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.organizacion.restService.service;

import ec.edu.espe.model.EvaPregunta;
import ec.edu.espe.services.EvaPreguntaService;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
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
@Path("/pregunta")
public class EvaPreguntaFacadeREST  {

    @Inject
    EvaPreguntaService preguntaService;

    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(EvaPregunta entity) {
        preguntaService.crear(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, EvaPregunta entity) {
        preguntaService.modificar(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        preguntaService.eliminar(id);
    }

//    @GET
//    @Path("{id}")
//    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
//    public EvaPregunta find(@PathParam("id") Integer id) {
//        return preguntaService.obtenerPorId(id);
//    }
    
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<EvaPregunta> find(@PathParam("id") String codCuestionario) {
        return preguntaService.obtenerPorIdCuestionario(codCuestionario);
    }

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<EvaPregunta> findAll() {
        return preguntaService.obtenerTodas();
    }

}
