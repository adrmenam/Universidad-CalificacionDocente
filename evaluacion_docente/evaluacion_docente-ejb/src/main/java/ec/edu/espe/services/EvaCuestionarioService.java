/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.services;

import ec.edu.espe.dao.EvaCuestionarioFacade;
import ec.edu.espe.model.EvaCuestionario;
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
public class EvaCuestionarioService {

    @EJB
    private EvaCuestionarioFacade cuestionarioFacade;

    public List<EvaCuestionario> obtenerTodas() {
        return cuestionarioFacade.findAll();
    }

    public EvaCuestionario obtenerPorId(String id) {
        return cuestionarioFacade.find(id);
    }

    public void crear(EvaCuestionario cuest) {
        cuestionarioFacade.create(cuest);
    }
    
    public void modificar(EvaCuestionario cuest) {
        cuestionarioFacade.edit(cuest);
    }
     
    public void eliminar(String id) {
        EvaCuestionario cuest = cuestionarioFacade.find(id);
        cuestionarioFacade.remove(cuest);
    }

}
