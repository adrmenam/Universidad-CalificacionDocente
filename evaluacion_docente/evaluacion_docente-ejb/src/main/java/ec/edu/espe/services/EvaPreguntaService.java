/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.services;

import ec.edu.espe.dao.EvaPreguntaFacade;
import ec.edu.espe.model.EvaPregunta;
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
public class EvaPreguntaService {

    @EJB
    private EvaPreguntaFacade evaPreguntaFacade;

    public List<EvaPregunta> obtenerTodas() {
        return this.evaPreguntaFacade.findAll();
    }

    public EvaPregunta obtenerPorId(Integer id) {
        return this.evaPreguntaFacade.find(id);
    }
    
    public List<EvaPregunta> obtenerPorIdCuestionario(String codCuestionario) {
        return this.evaPreguntaFacade.getPreguntaPorCuestionario(codCuestionario);
    }

    public void crear(EvaPregunta preg) {
        this.evaPreguntaFacade.create(preg);
    }

    public void modificar(EvaPregunta preg) {
        this.evaPreguntaFacade.edit(preg);
    }

    public void eliminar(Integer id) {
        EvaPregunta preg = this.evaPreguntaFacade.find(id);
        this.evaPreguntaFacade.remove(preg);
    }

}
