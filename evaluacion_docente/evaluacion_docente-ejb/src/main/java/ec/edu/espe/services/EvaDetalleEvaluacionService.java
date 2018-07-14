/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.services;

import ec.edu.espe.dao.EvaDetalleEvaluacionFacade;
import ec.edu.espe.model.EvaDetalleEvaluacion;
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
public class EvaDetalleEvaluacionService {

    @EJB
    private EvaDetalleEvaluacionFacade evaDetEva;

    public List<EvaDetalleEvaluacion> obtenerTodas() {
        return this.evaDetEva.findAll();
    }

    public EvaDetalleEvaluacion obtenerPorId(String id) {
        return this.evaDetEva.find(id);
    }

    public void crear(EvaDetalleEvaluacion eval) {
        this.evaDetEva.create(eval);
    }

    public void modificar(EvaDetalleEvaluacion eval) {
        this.evaDetEva.edit(eval);
    }

    public void eliminar(String id) {
        EvaDetalleEvaluacion evalDet = this.evaDetEva.find(id);
        this.evaDetEva.remove(evalDet);
    }

}
