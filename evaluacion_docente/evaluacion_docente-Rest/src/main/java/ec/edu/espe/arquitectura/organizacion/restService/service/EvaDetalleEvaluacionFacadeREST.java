/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.organizacion.restService.service;

import ec.edu.espe.model.EvaDetalleEvaluacion;
import ec.edu.espe.model.EvaDetalleEvaluacionPK;
import ec.edu.espe.services.EvaDetalleEvaluacionService;
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
import javax.ws.rs.core.PathSegment;

/**
 *
 * @author jolube
 */
@Stateless
@Path("/detalleevaluacion")
public class EvaDetalleEvaluacionFacadeREST  {

    @Inject
    EvaDetalleEvaluacionService detalleEvaluacionService;
    
    private EvaDetalleEvaluacionPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;codEvaluacion=codEvaluacionValue;codCuestionario=codCuestionarioValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        ec.edu.espe.model.EvaDetalleEvaluacionPK key = new ec.edu.espe.model.EvaDetalleEvaluacionPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> codEvaluacion = map.get("codEvaluacion");
        if (codEvaluacion != null && !codEvaluacion.isEmpty()) {
            key.setCodEvaluacion(codEvaluacion.get(0));
        }
        java.util.List<String> codCuestionario = map.get("codCuestionario");
        if (codCuestionario != null && !codCuestionario.isEmpty()) {
            key.setCodCuestionario(codCuestionario.get(0));
        }
        return key;
    }

    @POST
    @Consumes( MediaType.APPLICATION_JSON)
    public void create(EvaDetalleEvaluacion entity) {
        detalleEvaluacionService.crear(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes( MediaType.APPLICATION_JSON)
    public void edit(@PathParam("id") PathSegment id, EvaDetalleEvaluacion entity) {
        detalleEvaluacionService.modificar(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        EvaDetalleEvaluacionPK key = getPrimaryKey(id);
        detalleEvaluacionService.eliminar(key);
    }

    @GET
    @Path("{id}")
    @Produces( MediaType.APPLICATION_JSON)
    public EvaDetalleEvaluacion find(@PathParam("id") PathSegment id) {
        EvaDetalleEvaluacionPK key = getPrimaryKey(id);
        return detalleEvaluacionService.obtenerPorId(key);
    }

    @GET
    @Produces( MediaType.APPLICATION_JSON)
    public List<EvaDetalleEvaluacion> findAll() {
        return detalleEvaluacionService.obtenerTodas();
    }

}
