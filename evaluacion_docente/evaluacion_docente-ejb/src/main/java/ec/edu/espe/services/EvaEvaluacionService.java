/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.services;

import ec.edu.espe.dao.EvaEvaluacionFacade;
import ec.edu.espe.model.EvaEvaluacion;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Andrés
 */
@Stateless
@LocalBean
public class EvaEvaluacionService {

    @EJB
    private EvaEvaluacionFacade evaEvaluacionFacade;

    public List<EvaEvaluacion> obtenerTodas() {
        return this.evaEvaluacionFacade.findAll();
    }

    public EvaEvaluacion obtenerPorId(String id) {
        return this.evaEvaluacionFacade.find(id);
    }

    public void crear(EvaEvaluacion eval) {
        this.evaEvaluacionFacade.create(eval);
    }
    
    public void modificar(EvaEvaluacion eval) {
        this.evaEvaluacionFacade.edit(eval);
    }
     
    public void eliminar(String id) {
        EvaEvaluacion eval = evaEvaluacionFacade.find(id);
        this.evaEvaluacionFacade.remove(eval);
    }

}
