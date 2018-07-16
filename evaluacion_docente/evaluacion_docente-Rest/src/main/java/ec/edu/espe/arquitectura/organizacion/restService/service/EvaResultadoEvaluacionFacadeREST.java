/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.organizacion.restService.service;

import ec.edu.espe.model.EvaResultadoEvaluacion;
import ec.edu.espe.model.EvaResultadoEvaluacionPK;
import ec.edu.espe.services.EvaResultadoEvaluacionService;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.PathSegment;

/**
 *
 * @author jolube
 */
@Stateless
@Path("/evaresultadoevaluacion")
public class EvaResultadoEvaluacionFacadeREST  {

    private EvaResultadoEvaluacionPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;codEvaluacion=codEvaluacionValue;codNrc=codNrcValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        ec.edu.espe.model.EvaResultadoEvaluacionPK key = new ec.edu.espe.model.EvaResultadoEvaluacionPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> codEvaluacion = map.get("codEvaluacion");
        if (codEvaluacion != null && !codEvaluacion.isEmpty()) {
            key.setCodEvaluacion(codEvaluacion.get(0));
        }
        java.util.List<String> codNrc = map.get("codNrc");
        if (codNrc != null && !codNrc.isEmpty()) {
            key.setCodNrc(codNrc.get(0));
        }
        return key;
    }

    @Inject
    EvaResultadoEvaluacionService resultadoEvaluacionService;
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(EvaResultadoEvaluacion entity) {
        resultadoEvaluacionService.crear(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void edit(@PathParam("id") PathSegment id, EvaResultadoEvaluacion entity) {
        resultadoEvaluacionService.modificar(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        EvaResultadoEvaluacionPK key = getPrimaryKey(id);
        resultadoEvaluacionService.eliminar(key);
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public EvaResultadoEvaluacion find(@PathParam("id") PathSegment id) {
        EvaResultadoEvaluacionPK key = getPrimaryKey(id);
        return resultadoEvaluacionService.obtenerPorId(key);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<EvaResultadoEvaluacion> findAll() {
        return resultadoEvaluacionService.obtenerTodas();
    }
    
}
