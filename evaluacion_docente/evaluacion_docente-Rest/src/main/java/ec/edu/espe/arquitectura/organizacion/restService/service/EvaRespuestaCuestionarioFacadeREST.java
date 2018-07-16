/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.organizacion.restService.service;

import ec.edu.espe.model.EvaRespuestaCuestionario;
import ec.edu.espe.model.EvaRespuestaCuestionarioPK;
import ec.edu.espe.services.EvaRespuestaCuestionarioService;
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
@Path("/respuestacuestionario")
public class EvaRespuestaCuestionarioFacadeREST {

    private EvaRespuestaCuestionarioPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;codPersona=codPersonaValue;codEvaluacion=codEvaluacionValue;codCuestionario=codCuestionarioValue;codNrc=codNrcValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        ec.edu.espe.model.EvaRespuestaCuestionarioPK key = new ec.edu.espe.model.EvaRespuestaCuestionarioPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> codPersona = map.get("codPersona");
        if (codPersona != null && !codPersona.isEmpty()) {
            key.setCodPersona(codPersona.get(0));
        }
        java.util.List<String> codEvaluacion = map.get("codEvaluacion");
        if (codEvaluacion != null && !codEvaluacion.isEmpty()) {
            key.setCodEvaluacion(codEvaluacion.get(0));
        }
        java.util.List<String> codCuestionario = map.get("codCuestionario");
        if (codCuestionario != null && !codCuestionario.isEmpty()) {
            key.setCodCuestionario(codCuestionario.get(0));
        }
        java.util.List<String> codNrc = map.get("codNrc");
        if (codNrc != null && !codNrc.isEmpty()) {
            key.setCodNrc(codNrc.get(0));
        }
        return key;
    }

    @Inject
    EvaRespuestaCuestionarioService respuestaCuestionarioService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(EvaRespuestaCuestionario entity) {
        respuestaCuestionarioService.crear(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void edit(@PathParam("id") PathSegment id, EvaRespuestaCuestionario entity) {
        respuestaCuestionarioService.modificar(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        EvaRespuestaCuestionarioPK key = getPrimaryKey(id);
        respuestaCuestionarioService.eliminar(key);
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public EvaRespuestaCuestionario find(@PathParam("id") PathSegment id) {
        EvaRespuestaCuestionarioPK key = getPrimaryKey(id);
        return respuestaCuestionarioService.obtenerPorId(key);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<EvaRespuestaCuestionario> findAll() {
        return respuestaCuestionarioService.obtenerTodas();
    }

}
