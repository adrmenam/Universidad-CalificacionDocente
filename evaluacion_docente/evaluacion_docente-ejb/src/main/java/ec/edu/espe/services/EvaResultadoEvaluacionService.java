/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.services;

import ec.edu.espe.dao.EvaResultadoEvaluacionFacade;
import ec.edu.espe.model.EvaResultadoEvaluacion;
import ec.edu.espe.model.EvaResultadoEvaluacionPK;
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
public class EvaResultadoEvaluacionService {

    @EJB
    private EvaResultadoEvaluacionFacade resultadoEvaluacionFacade;

    public List<EvaResultadoEvaluacion> obtenerTodas() {
        return this.resultadoEvaluacionFacade.findAll();
    }

    public EvaResultadoEvaluacion obtenerPorId(EvaResultadoEvaluacionPK id) {
        return this.resultadoEvaluacionFacade.find(id);
    }

    public void crear(EvaResultadoEvaluacion resul) {
        this.resultadoEvaluacionFacade.create(resul);
    }

    public void modificar(EvaResultadoEvaluacion resul) {
        this.resultadoEvaluacionFacade.edit(resul);
    }

    public void eliminar(EvaResultadoEvaluacionPK id) {
        EvaResultadoEvaluacion resul = this.resultadoEvaluacionFacade.find(id);
        this.resultadoEvaluacionFacade.remove(resul);
    }

}
