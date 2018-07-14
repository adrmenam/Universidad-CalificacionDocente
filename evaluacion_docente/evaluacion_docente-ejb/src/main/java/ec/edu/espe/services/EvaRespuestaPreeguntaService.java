/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.services;


import ec.edu.espe.dao.EvaRespuestaPreguntaFacade;
import ec.edu.espe.model.EvaRespuestaPregunta;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author js_cm
 */
@Stateless
@LocalBean
public class EvaRespuestaPreeguntaService {

    @EJB
    private EvaRespuestaPreguntaFacade evaRespuestaPreeguntaFacade;
    
    public List<EvaRespuestaPregunta> obtenerTodos() {
        return this.evaRespuestaPreeguntaFacade.findAll();
    }
    
     public EvaRespuestaPregunta obtenerPorId(String id) {
        return this.evaRespuestaPreeguntaFacade.find(id);
    }
     
    public void crear(EvaRespuestaPregunta respPreg){
        this.evaRespuestaPreeguntaFacade.create(respPreg);
    }

    public void modificar(EvaRespuestaPregunta respPreg) {
        evaRespuestaPreeguntaFacade.edit(respPreg);
    }
     
    public void eliminar(String id) {
        EvaRespuestaPregunta cuest = this.evaRespuestaPreeguntaFacade.find(id);
        this.evaRespuestaPreeguntaFacade.remove(cuest);
    }

}
