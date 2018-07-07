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
       
    public List<EvaPregunta> cargarCuestionario(String codRol, String codEvaluacion)
    {
        return this.evaPreguntaFacade.cargarCuestionario(codRol, codEvaluacion);
    }
    
    public List<EvaPregunta> todas()
    {
        return this.evaPreguntaFacade.findAll();
    }
    
    
    
}
